/*
  Copyright (C) 2004 Petra Malik
  This file is part of the czt project.

  The czt project contains free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The czt project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with czt; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.session;

import java.util.Set;
import java.util.logging.Level;

/**
 * <p>Provides information about sections.</p>
 *
 * <p>This interface provides a generic and extensible way
 * for applications to ask for all kinds of informations about
 * sections.  Sections are identified by its name, which should
 * be unique.  A SectionInfo object can provide a fixed set
 * of information, or can be generic in a way that classes
 * providing information about sections register there service.</p>
 *
 * <p>A SectionInfo object can cache the information provided,
 * but care should be taken when implementing such caches when
 * the information provided is mutable.</p>
 */
public interface SectionInfo 
{
  /**
   * Lookup a key.
   * It should never return <code>null</code>.
   *
   * @param <T> key type
   * @param key   The key to be looked up.
   * @return An instance of key.getType().   
   * @throws CommandException if the lookup was unseccessful.   
   */
  <T> T get(Key<T> key) throws CommandException;

  /**
   * <p>
   * Starts a transaction for key dependencies within the section manager. It is used by #get by all
   * non cached (e.g., new) keys. Commands responsible for calculating the result are also responsible
   * to end the transaction, so that the dependencies set within that computation is implicitly collected
   * through all #get methods called.
   * </p>
   * <p>
   * The previous protocol remains the same: the user don't need to start/end transactions, unless one
   * is writing new Command interfaces (e.g., code that could interfere with the section manager information).
   * It could also be used for complicated calculations to have overlapping transaction scopes (e.g., LatexMarkupFunction).
   * This needs to be done with great care
   * </p>
   * <p>
   * SectionInfoExceptions might be thrown if a transaction on the key has already started (e.g., we don't allow
   * overlapping transaction scopes on the same key). Another case is when it is called on a key already
   * cached in the section manager.
   * </p>
   *
   * @param <T> type of key involved
   * @param key key to start transaction over
   * @throws SectionInfoException duplicated transactions on same key; on cached keys
   */
  <T> void startTransaction(Key<T> key) throws SectionInfoException;

  /**
   * Checks whether the given key has a transaction and starts one if it doesn't
   * @param <T>
   * @param key transaction to check
   * @throws SectionInfoException
   */
  <T> void ensureTransaction(Key<T> key) throws SectionInfoException;

  /**
   * <p>
   * This is a convenience method: it calls #endTransaction(Key, T, Set) on an empty set of explicit dependencies.
   * </p>
   *
   * @param <T>
   * @param key
   * @param value
   * @throws SectionInfoException
   */
  <T> void endTransaction(Key<T> key, T value) throws SectionInfoException;

  /**
   * <p>
   * Ends the transaction for the given key and associates the calculated results to this key in the
   * managed database. All (implicit) dependencies are available on that key from this point. That is
   * all the keys dependants (e.g., downwards dependency) and dependencies (e.g., upwards dependency).
   * For instance, a parsed section bar with parent foo will add both foo and bar to the section manager.
   * Key ("foo", ZSect) will have bar as a dependant and prelude/toolkit as its dependencies. The set will
   * include all involved classes (e.g., OpTable, ThmTable, LatexMarkupFunction, ZSect, etc).
   * </p>
   * <p>
   * Extra explicit dependencies can be given by the user. This method is usually called at the end of
   * the corresponding command for the given key (e.g., it concludes the command calculation dependencies chain).
   * Explicit dependencies cannot be null, but might be empty. Value and key must not be null. Complex
   * or overlapping transaction scopes are possible, but need to be done with care, when mutual dependencies
   * could cause problems. See LatexMarkupFunctionCommand for an example. It depends on ParseUtils, which
   * depends on LatexMarkupFunctionCommand.
   * </p>
   * <p>
   * A SectionInfoException is thrown either if the transaction stack is empty or if there are no matching
   * transactions started for the given key. Otherwise, if there is a matching transaction for the key.
   * Implementations keeping track of implicit dependencies calculated throughout the transaction might
   * throw an exception in case the indexes/pointers for (sub-)dependencies within the transaction change
   * or are out of bounds. Before updating the managed database, a check that the key type T
   * matches / is an instance of the value type T is performed, where an exception is raise if they are
   * not compatible. Finally, if the key is already cached, an exception is also raised, given duplicates
   * or updates are not allowed in order to keep consistency checks straightforward (e.g., to update remove
   * than add the key again).
   * </p>
   *
   * @param <T>
   * @param key non null
   * @param value non null
   * @param explicitDependencies non null (possibly empty)
   * @throws SectionInfoException see above
   */
  <T> void endTransaction(Key<T> key, T value, Set<? extends Key<?>> explicitDependencies) throws SectionInfoException;

  /**
   * <p>
   * Transactions can be cancelled due to some problem encountered. The effect they have is to revert the
   * database to the point right before the start of the transaction. Nevertheless, any successful transactions
   * in between this one <bf>are not</bf> rolled back. This means a cancelled transaction might result in a
   * partially successful one, if it contains sub transactions within. This is the desired behaviour because we
   * want to avoid redoing the successful bits if possible (e.g., if dependencies allow us to do so).
   * </p>
   * <p>
   * For instance, for a section bar with type errors bar and type correct parent foo, we would parse both
   * sections, type check foo and fail to type check bar. If possible (e.g., programatically or via on-the-fly paras)
   * to correct the errors in bar, we would not need to type check foo, but just reparse bar. TODO: is this what we want?
   * </p>
   * <p>
   * The set of keys returned represent the implicit keys leading to the failure. These include dependencies from
   * the start of the calculation. That will include keys of successful transactions.
   *
   * TODO: shouldn't this result be only for the keys involved in unsuccessful transactions?
   * </p>
   * @param <T>
   * @param key non null key that must be the top of the stack
   * @return set of implicit dependencies calculated during this transaction, including successful ones.
   * @throws SectionInfoException see above and #endTransaction(Key, T, Set).
   */
  <T> Set<Key<?>> cancelTransaction(Key<T> key) throws SectionInfoException;
  
  /**
   * checks whether there is any ongoing transaction for the given key
   * @param key
   * @return true if there is a transaction for key, false otherwise
   */
  boolean hasTransaction(Key<?> key);

  /**
   * Add a mapping from the key to its corresponding value. A set of explicit
   * dependant keys of (possibly different) type is also given. These dependencies,
   * together with any implicit dependencies involved are iterated to create map of
   * dependencies in both directions (e.g., the ones the key depend on as well as
   * the ones that depend on this key).
   *
   * @param <T> key type
   * @param key   The key to be looked up.
   * @param value value to map.
   * @param explicitDependencies dependant keys (i.e., the set of keys the key being put depend on - e.g., parents, downward dependency)
   * @throws SectionInfoException
   * deprecated use start/end transaction instead
   */
  //Deprecated
  <T> void put(Key<T> key, T value, Set<? extends Key<?>> explicitDependencies) throws SectionInfoException;
  <T> void put(Key<T> key, T value) throws SectionInfoException;


  /**
   * Retrieve all the keys involving a given name (e.g., ZSect, Spec, Source, etc for given string name)
   * @param name
   * @return set of keys of all types with managed mappings
   */
  Set<Key<?>> keysOf(String name);

  /**
   * Retrieve all the keys involving a given class type
   * @param <T> type of key class
   * @param clsName
   * @return set of all keys of given type with managed mappings
   */
  <T> Set<Key<T>> keysOf(Class<T> clsName);

  boolean isPermanentKey(Key<?> key);

  void reset();
  
  //SectInfo clone();

  /**
   * Checks whether the given key is cached within the section information manager
   * @param <T> key type
   * @param key The key to be looked up.
   * @return whether the key is cached or not
   */
  <T> boolean isCached(Key<T> key);
  
  /**
   * Returns whether the given value has already been computed and is cached. It returns null if it hasn't.
   * Also, if the key queried is on an ongoing transaction this method  might throw an exception.
   * @param <T> returned key type
   * @param value value to search for key
   * @return value's associated key
   */  
  <T> Key<T> retrieveKey(T value);

  /**
   * <p>
   * Remove a given key and all its dependants. That is, if A parents B
   * B parents C and we remove B, it also removes C but not A. That is,
   * it removes all dependants of the given key.
   * </p>
   * <p>
   * An exception is thrown if the key being removed is part of any ongoing transaction.
   * In this case, nothing changes and the key and its dependants/dependencies is not removed.
   * </p>
   * 
   * @param key
   * @return if anything changed as a result of this call.
   * @throws SectionInfoException
   */
  boolean removeKey(Key<?> key) throws SectionInfoException;

  /**
   * <p>
   * Return all the elements that depend on the given key. That is,
   * A parents B, B parents C and the given key is for A, then the result
   * is B and C. This is the inverse (transitive) relation as parents.
   *</p>
   * <p>
   * An exception is thrown if the key being queried is part of any ongoing transaction.
   * </p>

   * @param key
   * @return
   * @throws SectionInfoException
   */
  Set<Key<?>> getDependants(Key<?> key) throws SectionInfoException;

  /**
   * <p>
   * Return all the elements that the given key depend on. That is,
   * A parents B, B parents C and the given key is for C, then the result
   * is A and B. This is the (transitive) relation of parents.
   *</p>
   * <p>
   * An exception is thrown if the key being queried is part of any ongoing transaction.
   * </p>
   * @param key
   * @return
   * @throws SectionInfoException
   */  
  Set<Key<?>> getDependencies(Key<?> key) throws SectionInfoException;

  /**
   * Set section management tracing on/off. Tracing information is useful for
   * debugging purposes of the get/put protocols involved. It is up to each
   * implementation how to achieve this. For instance, the <code>SectionManager</code>
   * uses a <code>ConsoleHandler</code> from the Java logging API.
   *
   * @param on flag to set it on or off
   * @param level
   * @return the previous value of tracing flag
   */
  boolean setTracing(boolean on, Level level);

  Level getTracingLevel();
}

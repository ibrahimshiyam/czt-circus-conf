/*
  Copyright (C) 2006 Tim Miller
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
package net.sourceforge.czt.typecheck.z.util;

import java.util.List;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.ZFactoryImpl;
import net.sourceforge.czt.z.util.ZString;

import static net.sourceforge.czt.typecheck.z.util.GlobalDefs.*;

import net.sourceforge.czt.typecheck.z.impl.*;

/**
 * This class is an abstract superclass for <code>TypeEnv</code> and
 * <code>SectTypeEnv</code>
 */
abstract public class AbstractTypeEnv
{
  /** A Factory. */
  protected Factory factory_;

  public AbstractTypeEnv()
  {
    this(new ZFactoryImpl());
  }

  public AbstractTypeEnv(ZFactory zFactory)
  {
    factory_ = new Factory(zFactory);
  }

  abstract public Type getType(ZName zName);

  /**
   * Lookup the base name of a delta or xi reference, returning the
   * parameter 'type' if the base name is not found, or is not a
   * schema
   */
  protected Type getDeltaXiType(ZName zName, Type type)
  {
    Type result = type;

    //if the type is unknown and the name starts with delta or xi, try
    //looking up the base name
    if (zName.getWord().startsWith(ZString.DELTA) ||
        zName.getWord().startsWith(ZString.XI)) {

      final int size = (ZString.DELTA).length();
      String baseWord = zName.getWord().substring(size);
      ZStrokeList strokes = factory_.getZFactory().createZStrokeList();
      strokes.addAll(zName.getZStrokeList());
      ZName baseName =
        factory_.createZRefName(baseWord, strokes, null);
      Type baseType = getType(baseName);

      //if this is a schema, determine and add the delta/xi type
      if (isSchema(baseType)) {
        PowerType powerType = (PowerType) unwrapType(baseType);
        SchemaType schemaType = (SchemaType) powerType.getType();
        Signature signature = schemaType.getSignature();

        List<NameTypePair> newPairs = factory_.list();
        for (NameTypePair pair : signature.getNameTypePair()) {
          ZName primedName = factory_.createZName(pair.getZName(), true);
          primedName.getZStrokeList().add(factory_.createNextStroke());
          NameTypePair newPair =
            factory_.createNameTypePair(primedName, pair.getType());
          newPairs.add(pair);
          newPairs.add(newPair);
        }

        //create the new type
        Signature newSignature = factory_.createSignature(newPairs);
        SchemaType newSchemaType = factory_.createSchemaType(newSignature);
        PowerType newPowerType = factory_.createPowerType(newSchemaType);

        if (baseType instanceof GenericType) {
          GenericType gType = (GenericType) baseType;
          result = factory_.createGenericType(gType.getNameList(),
                                              newPowerType,
                                              null);
        }
        else {
          result = newPowerType;
        }
        
        // Ensure that zName is linked to a ZName,
        // This is one of the postconditions of the typechecker, that
        // every ZName should be linked to some ZName.
        // For example, the unification in the rules package relies on this.
        // These Delta/Xi names are a special case, because there may
        // not be any corresponding ZName.  So if there is not,
        // we add a fixed (global) id.
        if (zName.getId() == null) zName.setId("deltaxi");
      }
    }
    return result;
  }

  protected boolean isSchema(Type type)
  {
    Type2 type2 = unwrapType(type);
    boolean result = (type2 instanceof PowerType) &&
      (powerType(type2).getType() instanceof SchemaType);
    return result;
  }
}

package net.sourceforge.czt.z2alloy.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public abstract class Sig extends Expr implements Iterable<Field> {

    public static final PrimSig UNIV = new PrimSig("univ");

    public static final PrimSig SIGINT = new PrimSig("Int");

    public static final PrimSig SEQIDX = new PrimSig("seq/Int");

    public static final PrimSig NONE = new PrimSig("none");

    private final boolean isAbstract;
    private final boolean isLone;
    private final boolean isOne;
    private final boolean isSome;
    
    private final String label;
    private Expr pred;
    
    private final List<Field> fields;

    public Sig(String label, Expr pred, boolean abs, boolean lone, boolean one, boolean some)  {
    	if (lone && one) throw new IllegalArgumentException("Cannot be both lone and one");
    	if (lone && some) throw new IllegalArgumentException("Cannot be both lone and some");
    	if (one && some) throw new IllegalArgumentException("Cannot be both one and some");
        this.isAbstract=abs;
        this.isLone=lone;
        this.isOne=one;
        this.isSome=some;
        this.label=label;
        this.pred = pred == null ? ExprConstant.TRUE : pred;
        this.fields = new ArrayList<Field>();
    }
    public Sig (String label, Expr pred) {
        this(label, pred, false, false, false, false);
    }
    
    public Sig (String label) {
    	this(label, ExprConstant.TRUE);
    }
    
    public void addField(Field field) {
    	fields.add(field);
    }
    
    public Iterator<Field> iterator() {
    	return fields.iterator();
    }
	public List<Field> getFields() {
		return Collections.unmodifiableList(fields);
	}
	
	public void addPred(Expr pred) {
		if (this.pred == ExprConstant.TRUE) {
			this.pred = pred;
		}
		else {
			this.pred.and(pred);
		}
	}
	
	public Expr pred() {
		return this.pred.copy();
	}
	public String label() {
		return label;
	}
	
	public abstract Sig copy();
	
	public boolean isAbstract() {return isAbstract;}

	public boolean isOne() {return isOne;}
	
	public boolean isSome() {return isSome;}
	
	public boolean isLone() {return isLone;}
	
	public List<Field> fields() {
		List<Field> fields = new ArrayList<Field>();
		for (Field field : this.fields) fields.add(field.copy());
		return fields;
	}
	
	public String toString() {
		return label;
	}
}

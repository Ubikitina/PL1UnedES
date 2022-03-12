package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolConstant.
 */

// TODO: Student work
//       Include properties to characterize constants

public class SymbolConstant
    extends SymbolBase
{
	
	private int num_value;
	private boolean bool_value;
    
    /**
     * Constructor for SymbolConstant.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolConstant (ScopeIF scope,
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    } 
    
    /*Constructor para enteros*/
    public SymbolConstant (ScopeIF scope, String name, boolean bool_value, TypeIF type) {
    	super (scope, name, type);
    	this.bool_value = bool_value;
    }
    
    /*Constructor para booleanos*/
    public SymbolConstant (ScopeIF scope, String name, int num_value, TypeIF type) {
    	super (scope, name, type);
    	this.num_value = num_value;
    }

    /*Getter para el valor numerico*/
	public int getNum_value() {
		return num_value;
	}

	/*Getter para el valor booleano*/
	public boolean isBool_value() {
		return bool_value;
	}
    
    
    
    
}

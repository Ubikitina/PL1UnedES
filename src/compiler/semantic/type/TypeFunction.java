package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Class for TypeFunction.
 */

public class TypeFunction extends TypeProcedure {   
	
	private String tipoRetorno;
    
    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope.
     */
    public TypeFunction (ScopeIF scope) {
        super (scope);
    }

    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope
     * @param name The name of the function.
     */
    public TypeFunction (ScopeIF scope, String name, String tipoRetorno) {
        super (scope, name);
        this.tipoRetorno = tipoRetorno;
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize () {
        // TODO: Student work
        return 1;
    }
    
    /*Getter para el tipoRetorno*/
	public String getTipoRetorno() {
		return tipoRetorno;
	}
}

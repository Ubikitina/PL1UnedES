package compiler.semantic.type;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.Selectorvalororeferencia;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeProcedure.
 */


public class TypeProcedure extends TypeBase {
	
	private ArrayList<Selectorvalororeferencia> listaParametros;
	
   /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope.
     */
    public TypeProcedure (ScopeIF scope) {
        super (scope);
    }

    /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope
     * @param name The name of the procedure.
     */
    public TypeProcedure (ScopeIF scope, String name) {
        super (scope, name);
    }
    
    
    /*Setter para lista de parametros*/
    public void setListaParametros(ArrayList<Selectorvalororeferencia> listaParametros) {
		this.listaParametros = listaParametros;
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
}

package compiler.semantic.type;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.Selectorvalororeferencia;
import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Class for TypeFunction.
 */

public class TypeFunction extends TypeProcedure {   
	
	private String tipoRetorno;
	private ArrayList<Selectorvalororeferencia> listaParametros;
    
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
     * @param listaParametros List of parameters on the functions header
     */
    public TypeFunction (ScopeIF scope, String name, String tipoRetorno, ArrayList<Selectorvalororeferencia> listaParametros) {
        super (scope, name);
        this.tipoRetorno = tipoRetorno;
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
    
    /*Getter para el tipoRetorno*/
	public String getTipoRetorno() {
		return tipoRetorno;
	}
	
	/*Getter para la lista de parametros*/
	public ArrayList<Selectorvalororeferencia> getListaParametros() {
		return listaParametros;
	}
}

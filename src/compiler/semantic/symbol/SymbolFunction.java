package compiler.semantic.symbol;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.Selectorvalororeferencia;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolFunction.
 */


public class SymbolFunction extends SymbolProcedure {
	
	private String tipoRetorno;
	private ArrayList<Selectorvalororeferencia> listaParametros;
      
    /**
     * Constructor for SymbolFunction.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolFunction (ScopeIF scope, String name, TypeIF type, String tipoRetorno, ArrayList<Selectorvalororeferencia> listaParametros) {
        super (scope, name, type);
        this.tipoRetorno = tipoRetorno;
        this.listaParametros = listaParametros;
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

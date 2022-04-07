package compiler.semantic.symbol;

import java.util.ArrayList;
import compiler.syntax.nonTerminal.Selectorvalororeferencia;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

public class SymbolProcedure extends SymbolBase {
	
	private ArrayList<Selectorvalororeferencia> listaParametros;
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, String name, TypeIF type) {
        super (scope, name, type);
    }
    
    /*Setter de lista de parametros*/
	public void setListaParametros(ArrayList<Selectorvalororeferencia> listaParametros) {
		this.listaParametros = listaParametros;
	} 
    
    
    
}

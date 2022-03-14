package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Defvariables extends NonTerminal {

	private ArrayList<Selectorvalororeferencia> listaV;
	private TypeIF tipo;
	
	HashMap<TypeIF, ArrayList<Selectorvalororeferencia>> variablesDeUnTipo;
	
	/*Constructor vacio*/
	public Defvariables() {
		super();
		variablesDeUnTipo = new HashMap<TypeIF, ArrayList<Selectorvalororeferencia>>();
	}
	
	/*Constructor pasandole un tipo y una lista de variables de ese tipo*/
	public Defvariables(TypeIF t, ArrayList<Selectorvalororeferencia> l) {
		super();
		variablesDeUnTipo = new HashMap<TypeIF, ArrayList<Selectorvalororeferencia>>();
		variablesDeUnTipo.put(t, l);
	}
	
	public void putParTipoVariable(TypeIF t, ArrayList<Selectorvalororeferencia> l) {
		variablesDeUnTipo.put(t, l);
	}

	public HashMap<TypeIF, ArrayList<Selectorvalororeferencia>> getVariablesDeUnTipo() {
		return variablesDeUnTipo;
	}

	@Override
	public String toString() {
		Iterator<TypeIF> it = variablesDeUnTipo.keySet().iterator();
		while(it.hasNext()){
			TypeIF next = it.next();
			System.out.println("# TIPO: "+next.toString());
			
			System.out.println("# VARIABLES: ");
			ArrayList<Selectorvalororeferencia> lista = variablesDeUnTipo.get(next);
			for(int i = 0; i < lista.size(); i++) {   
			    System.out.print(lista.get(i).toString());
			    System.out.println("   - salto linea -");
			} 
			//aqui
		}
		return "Defvariables [variablesDeUnTipo=" + variablesDeUnTipo + "]";
	}
	
	
	
	

}

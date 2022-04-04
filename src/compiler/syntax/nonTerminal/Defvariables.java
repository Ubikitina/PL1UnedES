package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Defvariables extends NonTerminal {
	
	ArrayList<Selectorvalororeferencia> listaVariablesConTipo;
	
	/*Constructor vacio*/
	public Defvariables() {
		super();
		listaVariablesConTipo = new ArrayList<Selectorvalororeferencia>();
	}
	
	/*Constructor pasandole un tipo y una lista de variables de ese tipo*/
	public Defvariables(TypeIF t, ArrayList<Selectorvalororeferencia> l) {
		super();
		
		listaVariablesConTipo = new ArrayList<Selectorvalororeferencia>();
		ArrayList<Selectorvalororeferencia> listaAux = l;
		// Recorro cada elemento de l añadiendo el tipo t
		for (int x = 0; x < listaAux.size(); x++) {
			Selectorvalororeferencia sl = listaAux.get(x);
			sl.setTipo(t);
			listaAux.set(x, sl);
		}
		listaVariablesConTipo = listaAux; // asigno el arraylist editado a la lista de variables con tipo
	}
	
	/*Metodo para añadir pares de tipo y variable a una lista ya existente*/
	public void putParTipoVariable(TypeIF t, ArrayList<Selectorvalororeferencia> l) {
		
		// Primero recorro cada elemento de l añadiendo el tipo t
		ArrayList<Selectorvalororeferencia> listaAux = l;
		for (int x = 0; x < listaAux.size(); x++) {
			Selectorvalororeferencia sl = listaAux.get(x);
			sl.setTipo(t);
			listaAux.set(x, sl);
		}
		// Ahora añado la lista con tipos a la lista global
		listaVariablesConTipo.addAll(listaAux);
	}

	
	/*Getter del arraylist*/
	public ArrayList<Selectorvalororeferencia> getListaVariablesConTipo() {
		return listaVariablesConTipo;
	}

	@Override
	public String toString() {
		/*Iterator<TypeIF> it = variablesDeUnTipo.keySet().iterator();
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
		}*/
		return "Defvariables [listaVariablesConTipo="+ listaVariablesConTipo +"]";
	}
	
	
	
	

}

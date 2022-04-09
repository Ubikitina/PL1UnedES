package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaSentenciasFuncion extends NonTerminal {
	
	private ArrayList<SentenciaDevolver> listaSentenciasDevolver;

	/*Constructor vacío*/
	public ListaSentenciasFuncion() {
		super();
		listaSentenciasDevolver = new ArrayList<SentenciaDevolver>();
	}

	/*Getter para la lista*/
	public ArrayList<SentenciaDevolver> getListaSentenciaFuncion() {
		return listaSentenciasDevolver;
	}
	
	/*Aniadir un elemento a la lista*/
	public void addElemento(SentenciaDevolver s) {
		listaSentenciasDevolver.add(s);
	}
	
	public void addAllLista(ArrayList<SentenciaDevolver> listaAdicional) {
		listaSentenciasDevolver.addAll(listaAdicional);
	}
	
	public boolean isEmptyListaSentenciaDeDevolver() {
		return listaSentenciasDevolver.isEmpty();
	}
	

}

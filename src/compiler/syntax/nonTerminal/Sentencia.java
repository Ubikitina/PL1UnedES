package compiler.syntax.nonTerminal;

import java.util.ArrayList;


public class Sentencia extends NonTerminal {
	
	//private boolean sentenciaForFuncion;
	//private boolean sentenciaIfFuncion;
	private ArrayList<SentenciaDevolver> listaSentenciasDevolver;

	/*Constructor vacío*/
	public Sentencia() {
		super();
		listaSentenciasDevolver = new ArrayList<SentenciaDevolver>();
	}

	/*Getter de listaSentencias*/
	public ArrayList<SentenciaDevolver> getListaSentencias() {
		return listaSentenciasDevolver;
	}

	/*Setter de listaSentencias*/
	public void setListaSentencias(ArrayList<SentenciaDevolver> listaSentenciasDevolver) {
		this.listaSentenciasDevolver = listaSentenciasDevolver;
	}
	
	public void addAllLista(ArrayList<SentenciaDevolver> listaAdicional) {
		listaSentenciasDevolver.addAll(listaAdicional);
	}
	
	public void addElemento(SentenciaDevolver s) {
		listaSentenciasDevolver.add(s);
	}
	
	/*Devuelve si tiene alguna sentencia de devolver en su lista*/
	public boolean isEmptyListaSentenciaDeDevolver() {		
		return listaSentenciasDevolver.isEmpty();
	}
	
	

}

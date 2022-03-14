package compiler.syntax.nonTerminal;
import java.util.ArrayList;

public class Listavariables extends NonTerminal {
	
	private ArrayList<Selectorvalororeferencia> listaV;

	/*Constructor vacio*/
	public Listavariables() {
		super();
		listaV = new ArrayList<Selectorvalororeferencia>();
	}

	/*Constructor pasando listaV*/
	public Listavariables(ArrayList<Selectorvalororeferencia> listaV) {
		super();
		this.listaV = listaV;
	}
	
	/*Constructor pasando un elemento*/
	public Listavariables(Selectorvalororeferencia s) {
		super();
		listaV = new ArrayList<Selectorvalororeferencia>();
		listaV.add(s);
	}

	/*Getter para listaV*/
	public ArrayList<Selectorvalororeferencia> getListaV() {
		return listaV;
	}

	/*Setter para listaV*/
	public void setListaV(ArrayList<Selectorvalororeferencia> listaV) {
		this.listaV = listaV;
	}
	
	/*Aniadir un elemento a la lista*/
	public void addElemento(Selectorvalororeferencia s) {
		listaV.add(s);
	}
	

}

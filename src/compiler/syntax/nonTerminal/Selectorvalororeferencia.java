package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Selectorvalororeferencia extends NonTerminal {
	
	private String id;
	private boolean esPorValor;
	private TypeIF tipo;

	

	/*Constructor vacio*/
	public Selectorvalororeferencia() {
		super();
		this.esPorValor = false;
	}
	
	/*Constructor id*/
	public Selectorvalororeferencia(String id, boolean esPorValor) {
		super();
		this.id = id;
		this.esPorValor = esPorValor;
	}

	/*Getter para id*/
	public String getId() {
		return id;
	}
	
	/*Getter para esIden*/
	public boolean isPorValor() {
		return esPorValor;
	}

	/*Getter para tipo*/
	public TypeIF getTipo() {
		return tipo;
	}

	/*Setter para tipo*/
	public void setTipo(TypeIF tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return "Selectorvalororeferencia [id=" + id + ", esPorValor=" + esPorValor + ", tipo=" + tipo +"]";
	}
	
	
	
	

}

package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Tipovector extends NonTerminal {
	
	private TypeIF tipo;
	private String nombre_tipo;

	/*Constructor vacío*/
	public Tipovector() {
		super();
	}
	
	/*Constructor pasando un tipo*/
	public Tipovector(TypeIF tipo, String nombre_tipo) {
		super();
		this.tipo = tipo;
		this.nombre_tipo = nombre_tipo;
	}

	/*Getter del nombre del tipo*/
	public String getNombre_tipo() {
		return nombre_tipo;
	}
	
	/*Getter del tipo*/
	public TypeIF getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Tipovector [tipo=" + tipo + ", nombre_tipo=" + nombre_tipo + "]";
	}
	

}

package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
	
	private String id;
	private TypeIF tipo;
	
	/*Constructor vacío*/
	public Expresion() {
		super();
	}
	
	/*Constructor utilizando id*/
	public Expresion(String id) {
		super();
		this.id = id;
	}

	/*Getter de id*/
	public String getId() {
		return id;
	}

	/*Getter de tipo*/
	public TypeIF getTipo() {
		return tipo;
	}

	/*Setter de tipo*/
	public void setTipo(TypeIF tipo) {
		this.tipo = tipo;
	}

	/*Metodo toString*/
	@Override
	public String toString() {
		return "Expresion [id=" + id + ", tipo=" + tipo + "]";
	}
	

	
	

}

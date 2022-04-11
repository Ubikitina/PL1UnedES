package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Miembrovector extends NonTerminal {
	
	private String id;
	private TypeIF tipo;

	/*Constructor using id*/
	public Miembrovector(String id) {
		super();
		this.id = id;
	}

	/*Getter for id*/
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
}

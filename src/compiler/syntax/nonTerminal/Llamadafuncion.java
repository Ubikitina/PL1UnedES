package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Llamadafuncion extends NonTerminal {
	
	private String id;
	private TypeIF tipo;


	/*Constructor vacío*/
	public Llamadafuncion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Constructor using id*/
	public Llamadafuncion(String id) {
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

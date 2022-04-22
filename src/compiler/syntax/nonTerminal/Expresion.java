package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
	
	private String id;
	private TypeIF tipo;
	private boolean valorBooleano;
	private int valorEntero;
	private boolean esValorConstante; // a ser utilizado si la expresion es una constante numerica o booleana
	
	/*Constructor vacío*/
	public Expresion() {
		super();
		esValorConstante = false;
		valorEntero = -1;
	}
	
	/*Constructor utilizando id*/
	public Expresion(String id) {
		super();
		this.id = id;
		esValorConstante = false;
		valorEntero = -1;
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

	
	
	/*Getter del valor booleano*/
	public boolean getValorBooleano() {
		return valorBooleano;
	}

	/*Setter del valor booleano*/
	public void setValorBooleano(boolean valorBooleano) {
		this.valorBooleano = valorBooleano;
	}
	
	

	/*Getter del valor entero*/
	public int getValorEntero() {
		return valorEntero;
	}

	/*Setter del valor entero*/
	public void setValorEntero(int valorEntero) {
		this.valorEntero = valorEntero;
	}
	
	
	
	/*Getter de si es valor constante*/
	public boolean isEsValorConstante() {
		return esValorConstante;
	}

	/*Setter de si es valor constante*/
	public void setEsValorConstante(boolean esValorConstante) {
		this.esValorConstante = esValorConstante;
	}

	
	/*Metodo toString*/
	@Override
	public String toString() {
		return "Expresion [id=" + id + ", tipo=" + tipo + ", valorBooleano=" + valorBooleano + ", valorEntero="
				+ valorEntero + ", esValorConstante=" + esValorConstante + "]";
	}
	

	
	

}

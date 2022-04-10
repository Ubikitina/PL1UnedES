package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentenciaDevolver extends NonTerminal {

	private boolean contieneSentenciaDevolver;
	
	/*Constructor vacío*/
	public SentenciaDevolver() {
		super();
		contieneSentenciaDevolver=true;
	}

	/*Getter contiene sentencia devolver*/
	public boolean isContieneSentenciaDevolver() {
		return contieneSentenciaDevolver;
	}
	
	

}

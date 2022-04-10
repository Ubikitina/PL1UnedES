package compiler.syntax.nonTerminal;

import java.util.ArrayList;


public class Sentencia extends NonTerminal {
	
	private boolean contieneSentenciaDevolver;

	/*Constructor vacío*/
	public Sentencia() {
		super();
		contieneSentenciaDevolver = false;
	}

	

	public boolean isContieneSentenciaDevolver() {
		return contieneSentenciaDevolver;
	}

	public void setContieneSentenciaDevolver(boolean contieneSentenciaDevolver) {
		this.contieneSentenciaDevolver = contieneSentenciaDevolver;
	}
	
	
	
	

}

package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaSentenciasFuncion extends NonTerminal {
	
	private boolean contieneSentenciaDevolver;
	private boolean esRellenoIfFuncion;

	/*Constructor vacío*/
	public ListaSentenciasFuncion() {
		super();
		contieneSentenciaDevolver = false;
		esRellenoIfFuncion = false;
	}

	public boolean isContieneSentenciaDevolver() {
		return contieneSentenciaDevolver;
	}

	public void setContieneSentenciaDevolver(boolean contieneSentenciaDevolver) {
		this.contieneSentenciaDevolver = contieneSentenciaDevolver;
	}

	public boolean isEsRellenoIfFuncion() {
		return esRellenoIfFuncion;
	}

	public void setEsRellenoIfFuncion(boolean esRellenoIfFuncion) {
		this.esRellenoIfFuncion = esRellenoIfFuncion;
	}
	
	

}

package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentenciaDevolver extends NonTerminal {

	private TypeIF tipoSenteciaDevolver;
	
	/*Constructor vacío*/
	public SentenciaDevolver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Getter tipoSentenciaDevolver*/
	public TypeIF getTipoSenteciaDevolver() {
		return tipoSenteciaDevolver;
	}

	/*Setter tipoSentenciaDevolver*/
	public void setTipoSenteciaDevolver(TypeIF tipoSenteciaDevolver) {
		this.tipoSenteciaDevolver = tipoSenteciaDevolver;
	}

}

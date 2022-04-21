package compiler.syntax.nonTerminal;

public class ParametroEscribir extends NonTerminal {
	
	private boolean esVacio;
	private boolean esNumero;
	private boolean esString;
	private String cadena;

	/*Constructor vacío*/
	public ParametroEscribir() {
		super();
		this.esVacio = false;
		this.esNumero = false;
		this.esString = false;
	}
	

	public boolean isEsVacio() {
		return esVacio;
	}

	public void setEsVacio(boolean esVacio) {
		this.esVacio = esVacio;
	}

	public boolean isEsNumero() {
		return esNumero;
	}

	public void setEsNumero(boolean esNumero) {
		this.esNumero = esNumero;
	}

	public boolean isEsString() {
		return esString;
	}

	public void setEsString(boolean esString) {
		this.esString = esString;
	}


	public String getCadena() {
		return cadena;
	}


	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	
	
	

}

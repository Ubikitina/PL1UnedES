package compiler.syntax.nonTerminal;

public class Selectorvalororeferencia extends NonTerminal {
	
	private String id;
	private boolean esPorValor;

	/*Constructor vacio*/
	public Selectorvalororeferencia() {
		super();
		this.esPorValor = false;
	}
	
	/*Constructor id*/
	public Selectorvalororeferencia(String id, boolean esPorValor) {
		super();
		this.id = id;
		this.esPorValor = esPorValor;
	}

	/*Getter para id*/
	public String getId() {
		return id;
	}
	
	/*Getter para esIden*/
	public boolean isPorValor() {
		return esPorValor;
	}

	@Override
	public String toString() {
		return "Selectorvalororeferencia [id=" + id + ", esPorValor=" + esPorValor + "]";
	}
	
	
	
	

}

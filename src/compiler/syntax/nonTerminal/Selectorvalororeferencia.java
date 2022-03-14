package compiler.syntax.nonTerminal;

public class Selectorvalororeferencia extends NonTerminal {
	
	String id;

	/*Constructor vacio*/
	public Selectorvalororeferencia() {
		super();
	}
	
	/*Constructor id*/
	public Selectorvalororeferencia(String id) {
		super();
		this.id = id;
	}

	/*Getter para id*/
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Selectorvalororeferencia [id=" + id + "]";
	}
	
	
	
	

}

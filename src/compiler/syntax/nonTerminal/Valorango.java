package compiler.syntax.nonTerminal;

public class Valorango extends NonTerminal {
	
	private Integer num;
	private String id;

	/*Constructor vacío*/
	public Valorango() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Constructor con numero*/
	public Valorango(Integer num) {
		super();
		this.num = num;
	}
	
	/*Constructor con identificador*/ // creo que se podra borrar
	public Valorango(String id) {
		super();
		this.id = id;
	}

	/*Getter del numero*/
	public Integer getNum() {
		return num;
	}

	/*Getter del identificador*/
	public String getId() {
		return id;
	}
	
	

}

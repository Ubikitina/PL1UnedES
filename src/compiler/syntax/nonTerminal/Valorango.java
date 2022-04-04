package compiler.syntax.nonTerminal;

public class Valorango extends NonTerminal {
	
	private Integer num;
	private String id;
	private boolean esNum;
	private boolean esIden;
	private boolean esMiembrovector;
	
	/*Constructor con numero*/
	public Valorango(Integer num) {
		super();
		this.num = num;
		this.esNum = true;
		this.esIden = false;
		this.esMiembrovector = false;
	}
	
	/*Constructor con identificador*/ // creo que se podra borrar
	public Valorango(String id, boolean esIden, boolean esMiembrovector) {
		super();
		this.id = id;
		this.esNum = false;
		this.esIden = esIden;
		this.esMiembrovector = esMiembrovector;
	}

	/*Getter del numero*/
	public Integer getNum() {
		return num;
	}

	/*Getter del identificador*/
	public String getId() {
		return id;
	}
	
	/*Getter esNum*/
	public boolean isNum() {
		return esNum;
	}

	/*Geter esIden*/
	public boolean isIden() {
		return esIden;
	}

	/*Getter esMiembrovector*/
	public boolean isMiembrovector() {
		return esMiembrovector;
	}
	
	
	

}

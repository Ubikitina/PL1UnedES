package compiler.syntax.nonTerminal;

public class Valorconstante extends NonTerminal {
	
	private Integer valor_num;
	private Boolean valor_bool;

	/*Constructor vacio*/
	public Valorconstante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Constructor con paso de parametros para enteros*/
	public Valorconstante(Integer v) {
		super();
		this.valor_num = v;
	}
	
	/*Constructor con paso de parametros para booleanos*/
	public Valorconstante(Boolean v) {
		super();
		this.valor_bool = v;
	}

	/*Getter para valor entero*/
	public Integer getValor_num() {
		return valor_num;
	}

	/*Setter para valor entero*/
	public void setValor_num(Integer valor_num) {
		this.valor_num = valor_num;
	}

	/*Getter para valor booleano*/
	public Boolean getValor_bool() {
		return valor_bool;
	}

	/*Setter para valor booleano*/
	public void setValor_bool(Boolean valor_bool) {
		this.valor_bool = valor_bool;
	}
	
	/*Metodo para comprobar si es booleano*/
	public boolean esNumero() {
		return valor_num != null;
	}
	

}

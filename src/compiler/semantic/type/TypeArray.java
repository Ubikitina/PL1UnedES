package compiler.semantic.type;

import compiler.syntax.nonTerminal.Tipovector;
//import compiler.syntax.nonTerminal.Valorango;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */

public class TypeArray extends TypeBase {   

	//private Valorango rangoInferior;
	//private Valorango rangoSuperior;
	private int rangoInferior;
	private int rangoSuperior;
	private Tipovector tipo;
	
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     * @param rangoInferior Min array range
     * @param rangoSuperior Max array range
     * @param tipo Type
     */
    public TypeArray (ScopeIF scope,  String name, int rangoInferior, int rangoSuperior, Tipovector tipo) {
        super (scope, name);
		this.rangoInferior = rangoInferior;
		this.rangoSuperior = rangoSuperior;
		this.tipo = tipo;
    }
    
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize () {
        return (rangoSuperior - rangoInferior + 1);
    }

    
	/*Getter for the min range*/
	public int getRangoInferior() {
		return rangoInferior;
	}

	/*Getter for the max range*/
	public int getRangoSuperior() {
		return rangoSuperior;
	}

	/*Getter for the type*/
	public Tipovector getTipo() {
		return tipo;
	}
	
	/*To print the information, since toString cannot be overwritten*/
	public String imprimir() {
		return "nombre_tipo=" + super.getName() + " rangoInferior=" + rangoInferior + " rangoSuperior=" + rangoSuperior + " tipo=" + tipo.getNombre_tipo();
	}
	
	
    
    
}

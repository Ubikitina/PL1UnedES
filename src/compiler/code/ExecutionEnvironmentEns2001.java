package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 implements ExecutionEnvironmentIF {
	
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        //TODO: Student work
    	
    	
    	
    	// Resta dos operando y guarda el valro en el registro acumulador que luego mueve al resultado
    	if(quadruple.getOperation().equals("ADD")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("ADD " + o1 + ", " + o2 + "\n"); //hace la suma y almacena el resultado en el registro acumulador
    		b.append("MOVE " + ".A" + ", " + r); // lee el contenido de .A (acumulador) y lo escribe en r (resultado)
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("AND")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("AND " + o1 + ", " + o2 + "\n"); //hace el y logico y almacena el resultado en el registro acumulador
    		b.append("MOVE " + ".A" + ", " + r); // lee el contenido de .A (acumulador) y lo escribe en r (resultado)
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("BR")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("BR " + "/" + r); //carga el PC con el valor contenido en r
    		return b.toString();
    	}
    	
    	if(quadruple.getOperation().equals("BRT")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("CMP " + r + ", " + "#1" + "\n"); // comparacion, resta el contenido de r y #1 para comprobar si es 0
    		b.append("BZ " + "/" + o1); //si cero, carga el PC con el valor contenido en o1
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("BRF")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("CMP " + r + ", " + "#0" + "\n"); // comparacion, resta el contenido de r y #0 para comprobar si es 0
    		b.append("BZ " + "/" + o1); //si cero, carga el PC con el valor contenido en o1
    		return b.toString();
    	}
    	
    	
    	
    	if(quadruple.getOperation().equals("CADENA")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append(o1 + ": " + "DATA " + r);
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("EQ")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		LabelFactory lf = new LabelFactory();
    		Label labelTrue = (Label) lf.create();
    		Label labelFalse = (Label) lf.create();
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("CMP " + o1 + ", " + o2 + "\n"); // comparacion, resta el contenido del operando 1 y el operando 2
    		b.append("BZ " + "/" + labelTrue + "\n"); //si cero, carga el PC con el valor contenido del operando 1
    		// si el resultado no es negativo, es false
    		b.append("MOVE #0, " + r + "\n");
    		b.append("BR " + "/" + labelFalse + "\n"); // bifurcacion incodicional
    		b.append(labelTrue + ": " + "MOVE #1, " + r + "\n");
    		b.append(labelFalse + ": NOP");
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("ESCRIBCA")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("WRSTR " + "/" + o1 + "\n");
    		b.append("WRCHAR #10"); //salto de linea
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("ESCRIBENT")) {
    		StringBuffer b = new StringBuffer(); 
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("WRINT " + r + "\n");
    		b.append("WRCHAR #10"); //salto de linea
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("ESCRIBLN")) {
    		StringBuffer b = new StringBuffer(); 
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("WRCHAR #10"); //salto de linea
    		return b.toString();
    	}
    	
    	
    	
    	if(quadruple.getOperation().equals("GR")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		LabelFactory lf = new LabelFactory();
    		Label labelTrue = (Label) lf.create();
    		Label labelFalse = (Label) lf.create();
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("CMP " + o2 + ", " + o1 + "\n"); // comparacion, resta el contenido de o1 y o2
    		b.append("BN " + "/" + labelTrue + "\n"); // si el resultado es negativo, o1 > o2, vamos a true
    		// si el resultado es positivo, es false
    		b.append("MOVE #0, " + r + "\n");
    		b.append("BR " + "/" + labelFalse + "\n"); // bifurcacion incodicional
    		b.append(labelTrue + ": " + "MOVE #1, " + r + "\n");
    		b.append(labelFalse + ": NOP\n");
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("HALT")) {
    		StringBuffer b = new StringBuffer(); 
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("HALT");
    		return b.toString();    		
    	}
    	
    	if(quadruple.getOperation().equals("INC")) {
    		StringBuffer b = new StringBuffer(); 
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("INC " + r); // Incrementa el contenido del operando en una unidad
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("INL")) {
    		StringBuffer b = new StringBuffer(); 
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append(r + ": NOP"); // ponemos la etiqueta y añadimos una instruccion de no operación, no modifica los biestables de estado
    		return b.toString();
    	}
    	
    	
    	
    	if(quadruple.getOperation().equals("LS")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		LabelFactory lf = new LabelFactory();
    		Label labelTrue = (Label) lf.create();
    		Label labelFalse = (Label) lf.create();
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("CMP " + o1 + ", " + o2 + "\n"); // comparacion, resta el contenido de o1 y o2
    		b.append("BN " + "/" + labelTrue + "\n"); // si el resultado es negativo, o1 < o2, vamos a true
    		// si el resultado no es negativo, es false
    		b.append("MOVE #0, " + r + "\n");
    		b.append("BR " + "/" + labelFalse + "\n"); // bifurcacion incodicional
    		b.append(labelTrue + ": " + "MOVE #1, " + r + "\n");
    		b.append(labelFalse + ": NOP\n");
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("MUL")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MUL " + o1 + ", " + o2 + "\n"); //multiplica y almacena el resultado en el registro acumulador
    		b.append("MOVE " + ".A" + ", " + r); // lee el contenido de .A (acumulador) y lo escribe en r (resultado)
    		return b.toString();
    	}
    	
    	
    	// Mueve el valor de una variable o temporal a otro
    	if(quadruple.getOperation().equals("MV")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    	}
    	
    	if(quadruple.getOperation().equals("MVA")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacionMVA(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("MVP")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("NEG")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("NOT " + o1 + "\n"); //hace la operacion no logica en o1
    		b.append("MOVE " + ".A" + ", " + r); // lee el not desde el acumulador y lo escribe en r (resultado)
    		return b.toString();
    	}
    	
    	
    	
    	
    	if(quadruple.getOperation().equals("STP")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + r  + ", " +  ".R1"  + "\n");
    		b.append("MOVE " + o1 + ", " + "[.R1]");
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("STPINVERT")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + o1  + ", " +  ".R1"  + "\n");
    		b.append("MOVE " + "[.R1]" + ", " + r);
    		return b.toString();
    	}
    	
    	
    	
    	if(quadruple.getOperation().equals("SUB")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("SUB " + o1 + ", " + o2 + "\n"); //hace la resta y almacena el resultado en el registro acumulador
    		b.append("MOVE " + ".A" + ", " + r); // lee el contenido de .A (acumulador) y lo escribe en r (resultado)
    		return b.toString();
    	}
    	
    	
    	if(quadruple.getOperation().equals("VARGLOBAL")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    	}
    	
        return quadruple.toString(); 
    }
    
    /*Metodo operacion*/
    private String operacion(OperandIF o) {
    	
    	if(o instanceof Variable) {
    		return "/" + ((Variable)o).getAddress();
    	}
    	
    	if(o instanceof Value) {
    		return "#" + ((Value)o).getValue();
    	}
    	
    	if(o instanceof Temporal) {
    		return "/" + ((Temporal)o).getAddress();
    	}
    	
    	if(o instanceof Label) {
    		return ((Label)o).getName();
    	}
    	
    	return null;
    }
    
    
    /*Metodo operacion para el caso del MVA*/
    private String operacionMVA(OperandIF o) {
    	
    	if(o instanceof Variable) {
    		return "#" + ((Variable)o).getAddress();
    	}
    	
    	if(o instanceof Value) {
    		return "/" + ((Value)o).getValue();
    	}
    	
    	if(o instanceof Temporal) {
    		return "#" + ((Temporal)o).getAddress();
    	}
    	
    	if(o instanceof Label) {
    		return ((Label)o).getName();
    	}
    	
    	return null;
    }
}

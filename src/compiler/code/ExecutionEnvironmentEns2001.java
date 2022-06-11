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
    		b.append("ADD " + o1 + ", " + o2 + "\n");
    		b.append("MOVE " + ".A" + ", " + r);
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
    	
    	
    	if(quadruple.getOperation().equals("ESCRIBCA")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("WRSTR " + "/" + o1 + "\n");
    		//b.append("WRCHAR #10"); //salto de linea
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
    	
    	
    	
    	if(quadruple.getOperation().equals("HALT")) {
    		StringBuffer b = new StringBuffer(); 
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("HALT");
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
    	
    	
    	if(quadruple.getOperation().equals("STP")) {
    		StringBuffer b = new StringBuffer(); 
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); // generar cuadrupla como un comentario
    		b.append("MOVE " + r  + ", " +  ".R1"  + "\n");
    		b.append("MOVE " + o1 + ", " + "[.R1]");
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

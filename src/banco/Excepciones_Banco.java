
package banco;

/**
 *
 * @author accel
 */
public class Excepciones_Banco extends Exception{
    //clase para implementar los mensajes de error
    
    public Excepciones_Banco(){//no recibo parametros
        
        super ("NO CUENTA CON SALDO SUFICIENTE");
        
    }
    public Excepciones_Banco(String msg){ //recibo parametros
        
        super (msg);
        
    }
    
}
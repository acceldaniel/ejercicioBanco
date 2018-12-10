
package banco;

/**
 *
 * @author accel
 */
public class CuentaAhorro extends Banco {
    //heredamos de la clase principal


    public CuentaAhorro(int cuenta, String nombre, double dinero, double balance) {
        //parametros del constructor de la clase principal
        super(cuenta, nombre, dinero, balance);
    }
    
    @Override
    public double Depositar(){ 
        
        balance = balance + dinero;
        return (balance);
    }
    @Override
    public double Retirar(){

        if (dinero > balance){
            //condicional que indica que no puede retirar mas dinero  de lo que tiene
            try {
                throw new Excepciones_Banco();
                //llamamos a la clase Excepcion_Cuenta
            } catch (Excepciones_Banco Excepciones_banco) {
                System.err.println(Excepciones_banco.getMessage());
                //imprimimos el mensaje de error escrito en la clase de Excepcion_Cuenta
            }
        } else {
            //calculamos el balance total
            balance = balance - dinero;
        }       
        return (balance);
    }
    
    @Override
    public double obtenerBalance() {
        
        return balance;
        
        
    }
    
    @Override
    public String toString(){
        Depositar();
        Retirar();
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: AHORRO\n"
                + "N° CUENTA == "+cuenta+"\n"
                + "NOMBRE DEL CLIENTE: "+nombre+"\n"
                
                + "INGRESE EL  DINERO QUE DESEA DEPOSITAR: $"+dinero+"\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $"+dinero+"\n"
                + "SU SUELDO ACTUAL ES DE: $"+obtenerBalance());
    }

    
}


    


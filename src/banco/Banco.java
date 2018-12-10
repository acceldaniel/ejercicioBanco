
package banco;

/**
 *
 * @author accel
 */
public abstract class Banco { //clase abstracta principal

     
    // atributos
    
    int cuenta;
    double balance, dinero;
    String nombre;

    /**
     * 
     * @param cuenta para el numero de cuenta
     * @param nombre para el nombre del usuario
     * @param dinero para el dinero a depositar o retirar
     * @param balance para indicar el balance actual
     */

    public Banco(int cuenta, String nombre, double dinero, double balance) {
        //constructor principal
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.dinero = dinero;
        this.balance = balance;
    }

    public abstract double Depositar();
    //metodo abstracto para el deposito de dinero

    public abstract double Retirar();
    //metodo abstracto para el retiro de dinero
    
    public abstract double obtenerBalance();
    //metodo abstracto para obtenerBalance 
}

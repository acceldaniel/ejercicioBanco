/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author accel
 */
public class CuentaPlatino extends Banco {
 //subclase que hereda de la clase principal
   

    public CuentaPlatino(int numCuenta, String nombre, int monto, double balance) {
        //constructor de la clase princiapl
        super(numCuenta, nombre, monto, balance);
    }  
            
    @Override
    public double Depositar(){

        
        balance = balance + dinero;
        return (balance);
    }
    @Override
    public double Retirar(){

        //calculamos el balance teniendo en cuenta que se adiciona 10% mas de interes
        balance = (balance - dinero) + 0.10;
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
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: PLATINO\n"
                + "N° CUENTA == "+cuenta+"\n"
                + "NOMBRE DEL CLIENTE: "+nombre+"\n"
                
                + "INGRESE EL  DINERO QUE DESEA DEPOSITAR: $"+dinero+"\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $"+dinero+"\n"
                + "SU SUELDO ACTUAL ES DE: $"+obtenerBalance());
    }
}

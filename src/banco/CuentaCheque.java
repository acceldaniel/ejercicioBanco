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
public class CuentaCheque extends Banco{
//heredaos de la clase principal

    public CuentaCheque(int cuenta, String nombre, double monto, double balance) {
        //parametros del constructor de la clase principal
        super(cuenta, nombre, monto, balance);
    }

    

    @Override
    public double Depositar() {


        balance = balance + dinero;
        return (balance);
    }

    @Override
    public double Retirar() {

        balance = balance - dinero;
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
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: CHEQUES\n"
                + "N° CUENTA == "+cuenta+"\n"
                + "NOMBRE DEL CLIENTE: "+nombre+"\n"
             
                + "INGRESE EL  DINERO QUE DESEA DEPOSITAR: $"+dinero+"\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $"+dinero+"\n"
                + "SU SUELDO ACTUAL ES DE: $"+obtenerBalance());
    }

    
}


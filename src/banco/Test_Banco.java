
package banco;

import java.util.ArrayList;

/**
 *
 * @author accel
 */
public class Test_Banco {
    
public static ArrayList<Banco> cuenta = new ArrayList<Banco>();
    //creamos un arreglo de objetos

    public static void main(String[] args) {
        Banco cuentaAhorros = new CuentaAhorro(12, "Juan Martin", 400 , 100);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Ahorros
        Banco cuentaCheques = new CuentaCheque(34, "Luis Espindola", 300 , 200);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Cheques
        Banco cuentaPlatino = new CuentaPlatino(156, "Luisa Cañizares", 30 , 300);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase Platino

        cuenta.add(cuentaAhorros);
        cuenta.add(cuentaCheques);
        cuenta.add(cuentaPlatino);

        for (Banco cuentas : cuenta) {
            System.out.println(cuentas);
        }
    }
}

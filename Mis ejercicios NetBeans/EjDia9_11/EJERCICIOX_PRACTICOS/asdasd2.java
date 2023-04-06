/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class asdasd2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
//--------------------------------------------------------------------------------------------------------
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(11);
        }
//--------------------------------------------------------------------------------------------------------       
        System.out.println("Ingrese un numero a buscar en el vector");
        int numABuscar = leer.nextInt();
//--------------------------------------------------------------------------------------------------------
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
//--------------------------------------------------------------------------------------------------------        
            if (vector[i] == numABuscar){            
                System.out.println("Se encontro el numero en la posicion " + i);
                contador++;
            }
//--------------------------------------------------------------------------------------------------------            
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Se encontro el numero " + contador + " veces repetido");
        System.out.println("");
    }

}

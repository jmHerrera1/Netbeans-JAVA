/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */
package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class sadasdasd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i]= i+1;

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println("");
    }

}

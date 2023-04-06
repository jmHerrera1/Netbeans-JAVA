/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ej1Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];

        //Llenamos el vector con los 100 primeros numeros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;

        }

        //Mostramos el vector en forma descendente
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + ", ");

        }
        System.out.println();
    }

}

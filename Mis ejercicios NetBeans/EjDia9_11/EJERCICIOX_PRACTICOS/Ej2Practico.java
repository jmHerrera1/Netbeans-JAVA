/*
 (1)Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y (2)le pida al usuario un número a buscar en el vector.
(3)El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ej2Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se agrega el Random, definido como "rnd"
        Random rnd = new Random();
        
        //Pide y lee el tamaño del vector
        System.out.print("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        
        //Se crea el vector y se le da el largo "N"
        int[] vector = new int[N];
        
        //(1)Llenamos el vector con números aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i]= rnd.nextInt(11);
            
        }
        //(2)Se pide el numero a buscar en el vector
        System.out.print("Ingrese el numero que quiere buscar en el vector:");
        int numAbuscar = leer.nextInt();
        
        //(3)Mostramos la posicion del numero y donde se encuentra repetido
        //Definir contador para ir contando las veces que se encontro el numero
        int contador = 0;
        //se recorre el vector, y se imprimen los numeros del mismo
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+", ");
        //Se busca el numero ingresado por el usuario en el vector    
            if (vector[i] == numAbuscar) {
                System.out.println("Se encontró el numero, en la posición: " + i);
                contador++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("El numero se encontro: " + contador+ " veces.");
        System.out.println("");
    }
}

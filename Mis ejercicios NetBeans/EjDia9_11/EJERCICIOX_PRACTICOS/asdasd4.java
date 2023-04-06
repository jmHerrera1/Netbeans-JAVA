/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class asdasd4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();

        int[][] matriz = new int[4][4];

        System.out.print("La matriz es: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rnd.nextInt(10);

            }

        }
        System.out.println("");
        imprimirMatriz(matriz);
        int[][] matrizTranspuesta = creaTranspuesta(matriz);
        System.out.println("La matriz transpuesta es: ");
        imprimirMatriz(matrizTranspuesta);
        System.out.println("");

    }

    public static int[][] creaTranspuesta(int[][] mat) {
        int matriz[][] = new int[4][];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[4];
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = mat[j][i];
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

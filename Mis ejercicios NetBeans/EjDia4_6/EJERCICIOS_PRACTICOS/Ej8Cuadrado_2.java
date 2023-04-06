/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.EjDia4_6.EJERCICIOS_PRACTICOS;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ej8Cuadrado_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int lado = sc.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {

                if ((i == 0) || (i == (lado - 1))) {
                    System.out.print("* ");
                } else {
                    if ((j == 0) || (j == (lado - 1))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

    


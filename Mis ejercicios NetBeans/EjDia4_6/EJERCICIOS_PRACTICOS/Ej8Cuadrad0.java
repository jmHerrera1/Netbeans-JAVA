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
public class Ej8Cuadrad0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la dimensión del cuadrado que desea");
        int num;
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
                
            
    

    
    


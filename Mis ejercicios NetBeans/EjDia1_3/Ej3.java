/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.EjDia1_3;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("Su frase en minusculas es: " + frase.toLowerCase());
        System.out.println("Su frase en mayusculas es: " + frase.toUpperCase());
    }
    
}

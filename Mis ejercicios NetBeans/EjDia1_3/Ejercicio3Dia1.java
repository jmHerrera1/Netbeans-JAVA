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
public class Ejercicio3Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String frase;
      System.out.println("Escriba una frase");
       frase = leer.nextLine();
      System.out.println(frase); 
      System.out.println("Su frase en mayúsculas: " + frase.toUpperCase());
      System.out.println("Su frase en minúsculas: " + frase.toLowerCase());

    }
    
}


//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.
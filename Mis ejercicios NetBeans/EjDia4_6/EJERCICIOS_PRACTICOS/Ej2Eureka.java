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
public class Ej2Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            if (frase.equalsIgnoreCase("eureka")) {
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto!");
            }
        } while (!frase.equalsIgnoreCase("eureka"));
    }
}

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.*/
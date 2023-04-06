/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.EjDia4_6.EJERCICIOS_DE_LA_GUIA;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ej8GuiaDia4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una nota entre 0 y 10");
                int nota;
        nota=leer.nextInt();
        while (nota<0 || nota>10){
            System.out.println("Ingrese una nota valida");
            nota = leer.nextInt();
            
        }
    }
    
}


/*Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
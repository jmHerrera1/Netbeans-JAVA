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
public class Ejercicio5Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num;
     System.out.println("Ingrese un numero");
     num = leer.nextInt();
     System.out.println("El doble de: " + num + " es: " +(num*2));
     System.out.println("El triple de: " + num + " es: " +(num*3));
     System.out.println("La raíz cuadrada de: " + num + " es: " + Math.sqrt(num));

    }
    
}


/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
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
public class Ejercicio2Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Escriba nombre");
      nombre = leer.next();
      System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}


//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
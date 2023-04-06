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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       float centigrados;
        System.out.println("Ingrese los grados en ºC");
        centigrados = leer.nextFloat();
        System.out.println("Los grados centigrados, en Fahrenheit son: " + (32+(9*centigrados/5)));
        }
    
}

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
public class Ejercicio4Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    float centigrados;
    System.out.println("Ingrese la temperatura en ºC");
    centigrados = leer.nextFloat();
    System.out.println("La temperatura ingresada en Fahrenheit, es: ºF " + (32+(9*centigrados/5)));
    }
    
}


/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
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
public class Ejercicio1Dia1 {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Ingrese dos numeros enteros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    
    int suma = num1 + num2;
    System.out.println("La suma de los numeros ingresados es:" +suma);
    
    }
    
}


//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
//El programa deberá después mostrar el resultado de la suma
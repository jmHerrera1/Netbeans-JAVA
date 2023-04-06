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
public class Ej6GuiaDia4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();

        if (num1 < 25) {
            System.out.println("El numero " + num1 + " es menor que 25"+ "\n");
        } else {
            System.out.println("El numero " + num1 + " es mayor que 25"+ "\n");
        }
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        if (num2<25){
            System.out.println("El numero " + num2 + " es menor que 25"+ "\n");
        } else {
            System.out.println("El numero " + num2 + " es mayor que 25"+ "\n");
        }
    }
}

/*Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.*/

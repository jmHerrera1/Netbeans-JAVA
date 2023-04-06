/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.EjDia7_8.EJERCICIOS_PRACTICOS;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        //llama a la funcion
        if (esPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }

    public static boolean esPrimo(int num) {
        //si el numero es igual o menor a 1, no es primo
        if (num <= 1) {
            return false;
        }
        //el "para" arranca desde el 2 que es el primer num primo
        //i<= recorre todos los numeros(i) hasta llegar a la mitad del numero, ya que si hay un divisor mayor a la mitad, ya deberia haberse verificado antes.
        for (int i = 2; i <= num / 2; i++) {
            //si el numero ingresado, se divide y da 0, en algun antes de q termine el for, es falso
            if (num % i == 0) {
                return false;
            }
        }
        //despues de comprobar el if, cerrarlo, y el for, y cerrarlo. arroja VERDADERO
        return true;
    }
}
/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */

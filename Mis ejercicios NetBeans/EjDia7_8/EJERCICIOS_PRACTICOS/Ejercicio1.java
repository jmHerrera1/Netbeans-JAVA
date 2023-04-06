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
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion, resultado;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();

        
            System.out.println("\n\tMENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
           

            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sumar(num1,num2);
                    break;
                case 2:
                    restar(num1,num2);
                    break;
                case 3:
                    multiplicar(num1,num2);
                    break;
                case 4:
                    dividir(num1,num2);
                    break;
                
       }
    }
    public static int sumar(int num1, int num2){
        int suma;
        suma =num1+num2;
        System.out.println("El resultado de la suma es: "+suma);
        return suma;
    }
    public static int restar(int num1, int num2){
        int resta;
        resta =num1-num2;
        System.out.println("El resultado de la resta es: "+resta);
        return resta;
    }
    public static int multiplicar(int num1, int num2){
        int multi;
        multi =num1*num2;
        System.out.println("El resultado de la multiplicacion es: "+multi);
        return multi;
    }
    public static int dividir(int num1, int num2){
        int division;
        division =num1/num2;
        System.out.println("El resultado de la division es: "+division);
        return division;
    }

}

        
        
        
    
/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. */

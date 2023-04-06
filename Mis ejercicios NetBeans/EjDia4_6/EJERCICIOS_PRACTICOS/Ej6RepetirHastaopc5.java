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
public class Ej6RepetirHastaopc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, resultado, opcion;
        String resp;
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();

        do {
            System.out.println("\n\tMENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
            resp = leer.next();

            if (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                do {
                    System.out.println("Ingrese una opción correcta");
                    resp = leer.next();
                } while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));
            }

            if ("S".equalsIgnoreCase(resp)) {
                System.out.println("Saliendo del programa...");
                break;
            }

        } while (true);
    }
}



/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

    MENU
    1.Sumar
    2.Restar
    3.Multiplicar
    4.Dividir
    5.Salir
    Elija Opción:

*/


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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
        boolean seguirMostrandoPersonas = true;
        //mientras (while), seguirMostrandoPersonas sea verdadero
        while (seguirMostrandoPersonas) {   
            //nombre = llama a la funcion
            String nombre = solicitarNombre(leer);
            //edad = llama a la funcion
            int edad = solicitarEdad(leer);
            //se llama a la funcion para imprimir los datos 
            imprimirDatosPersona(nombre, edad);
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            //se pregunta si quiere seguir, la respuesta se define y se completa con el leer directo
            String respuesta = leer.nextLine();
            //si la respuesta es no, se da por falso el seguir mostrando personas por lo que se corta el programa.
            if (respuesta.equalsIgnoreCase("no")) {
                seguirMostrandoPersonas = false;
            }
        }
        leer.close();
    }
    
    public static String solicitarNombre(Scanner leer) {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        return nombre;
    }
    
    public static int solicitarEdad(Scanner leer) {
        System.out.print("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        leer.nextLine(); // Limpia el buffer de entrada
        return edad;
    }
    
    public static void imprimirDatosPersona(String nombre, int edad) {
        //si edad es mayor o igual a 18, es mayor de edad, sino menor
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
}

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas
y frenar cuando el usuario ingrese la palabra “No”.*/

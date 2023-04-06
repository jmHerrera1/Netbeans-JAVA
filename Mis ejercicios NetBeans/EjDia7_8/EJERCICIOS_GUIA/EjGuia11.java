/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.EjDia7_8.EJERCICIOS_GUIA;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class EjGuia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = leer.nextLine();

        //llama la funcion "convertidor"
        convertidor(frase);
        //deja espacio al final
        System.out.println("");
    }
        //se define la funcion
    public static void convertidor(String frase) {

        int longi = frase.length();
        
        String letra;
        //bucle para i=0(inicia, i<longitud recorre desde el 0 hasta donde termina, i++
        for (int i = 0; i < longi; i++) {

            letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                case "A":

                    letra = "@";
                    break;

                case "e":
                case "E":

                    letra = "#";
                    break;
                case "i":
                case "I":

                    letra = "$";
                    break;

                case "o":
                case "O":

                    letra = "%";
                    break;

                case "u":
                case "U":

                    letra = "*";
                    break;
            }
            System.out.print(letra);
            
        }

        
    }
}

/*Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera:

cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
(incluyendo a las vocales acentuadas) se mantienen sin cambios.*/

 /*  a = @
    e = #
    i = $
    o = %
    u = *
 */
 /*Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

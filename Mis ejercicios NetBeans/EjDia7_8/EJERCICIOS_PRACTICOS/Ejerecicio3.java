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
public class Ejerecicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //PIDE LA CANTIDAD DE EUROS
        System.out.print("Introduce la cantidad de euros a convertir: ");
        //LEE CANTIDAD DE EUROS
        double cantidadEuros = leer.nextDouble();
        //PIDE LA DIVISA
        System.out.print("Introduce la divisa a la que quieres convertir (libras, dolares o yenes): ");
        //LEE LA DIVISA
        String divisa = leer.nextLine();
        //LLAMA A LA FUNCION
        convertirDivisa(cantidadEuros, divisa);
        leer.close(); // Cerramos el objeto Scanner
    }

    //double era para numeros con decimales, si por ej se ingresa 4.20 euros
    public static void convertirDivisa(double cantidadEuros, String divisa) {
        //se inicializan variables en 0
        double cantidadConvertida;
        String mensaje;
        //se arma un segun(switch) con todas las monedas
        //tolowercase es para q no importe min o mayus
        switch (divisa.toLowerCase()) {
            //si es libras cantidadConvertida es la variable vacia, el resultado es la cantidad de euros ingresados * el valor
            case "libras":
                cantidadConvertida = cantidadEuros * 0.86;
                System.out.println(cantidadEuros+"euros, equivalen a "+cantidadConvertida+ divisa);
                break;
            case "dolares":
                cantidadConvertida = cantidadEuros * 1.28611;
                mensaje = "s";
                System.out.println(cantidadEuros+"euros, equivalen a "+cantidadConvertida+ divisa);
                break;
            case "yenes":
                cantidadConvertida = cantidadEuros * 129.852;
                System.out.println(cantidadEuros+"euros, equivalen a "+cantidadConvertida+ divisa);
                break;
            default:
                System.out.println("La divisa no es valida");
                break;
        }
       
    }

    

}



/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

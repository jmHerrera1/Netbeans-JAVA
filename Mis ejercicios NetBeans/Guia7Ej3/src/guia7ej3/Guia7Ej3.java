/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Guia7Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        
        Operacion op1 = new Operacion();
        op1.crearOperacion(num1, num2);
        
        System.out.println("La suma de los numeros es: " +op1.sumar());
        System.out.println("La resta de los numeros es: " +op1.restar());
        System.out.println("La multiplicacion es: " + op1.multiplicar());
        System.out.println("La division es: "+ op1.dividir());
    }

}

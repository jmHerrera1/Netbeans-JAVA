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
public class Ej5ValorLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        int suma = 0;
        int num;
        
        System.out.println("Ingrese un Valor Limite:");
        limite = leer.nextInt();
        System.out.println("Debera ingresar números a sumar:");
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
        }while (suma <= limite);
        System.out.println("Se supero el valor limite");
    }
    
}


/*Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
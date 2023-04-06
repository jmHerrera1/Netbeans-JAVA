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
public class EjGuia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2=leer.nextInt();
        
        EsMultiplo(num1,num2);
    }
    
    
    public static void EsMultiplo(int num1,int num2){
        if (num1%num2==0){
            System.out.println("El numero "+num1+" es multiplo de "+num2);
        }else{
            System.out.println("El numero "+num1+" no es multiplo de "+num2);
        }
        
    }
}


/*Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.*/
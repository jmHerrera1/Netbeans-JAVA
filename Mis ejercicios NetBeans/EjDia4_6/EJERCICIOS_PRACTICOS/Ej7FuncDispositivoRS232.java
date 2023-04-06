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
public class Ej7FuncDispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        System.out.println("Ingrese palabras, cuando ya no quiera ingresar mas, escriba &&&&&");
        String cadena;
        cadena= leer.nextLine();
        
        while (!cadena.equals("&&&&&")) {
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
            cadena = leer.nextLine();
        }

        System.out.println("Informe de lecturas:");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }
}

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 

Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,

la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

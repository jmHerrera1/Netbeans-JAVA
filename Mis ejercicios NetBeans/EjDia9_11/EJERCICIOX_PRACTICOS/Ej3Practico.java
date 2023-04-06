package egg.EjDia9_11.EJERCICIOX_PRACTICOS;

import java.util.Random;
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
/**
 *
 * @author windows
 */
public class Ej3Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int[] vecCont = new int[5];

        //Se llena el vector con numeros aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(100000);
            System.out.println(vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            switch (numDigitos(vector[i])) {
                case 1:
                    vecCont[0]++;
                    break;
                case 2:
                    vecCont[1]++;
                    break;
                case 3:
                    vecCont[2]++;
                    break;
                case 4:
                    vecCont[3]++;
                    break;
                case 5:
                    vecCont[4]++;
                    break;
                default:
//                    System.out.println("El numero de digitos es mayor a 5");
                    break;

            }
        }
        System.out.println("Se muestra el contador por pantalla");
        for (int i = 0; i < vecCont.length; i++) {
            
            System.out.print(vecCont[i] + ", ");
        }
    }


    public static int numDigitos(int num) {
        int aux = num;
        int i = 0;

        for (; aux > 0; aux = aux / 10, i++);
        return i;
    }
}

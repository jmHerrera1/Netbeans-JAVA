/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia7ej4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Guia7Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("----------- RECTANGULO -----------");
        System.out.println("");
        System.out.println("Ingrese la medida de la base");
        double b1 = leer.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        double a1 = leer.nextDouble();

        Rectangulo rect1 = new Rectangulo();
        rect1.crearRectangulo(b1, a1);

        //EL METODO GET MUESTRA LOS VALORES
        System.out.println("BASE = " + rect1.getBase() + " cm.");
        System.out.println("ALTURA = " + rect1.getAltura() + " cm.");

        System.out.println("La superficie del rectangulo es: " + rect1.calcularSuperficie()+" cm.");
        System.out.println("El perimetro del rectangulo es: " + rect1.calcularPerimetro()+" cm.");

        //par hacerlo desde el metodo
        rect1.dibujarRectangulo();            
        
       //para llamarlo desde el static void
       //dibujarRectangulo(b1, a1);                     

    }

    
//    public static void dibujarRectangulo(double base, double altura) {
//        //i = ALTURA
//        //j = BASE
//        for (int i = 0; i < altura; i++) {
//            for (int j = 0; j < base; j++) {
//                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }

}



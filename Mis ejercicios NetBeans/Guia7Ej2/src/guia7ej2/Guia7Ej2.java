/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej2;

import Entidad.Circunferencia;

/**
 *
 * @author windows
 */
public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia(10.0);

        circ1.calcularArea();
        circ1.calcularPerimetro();
       
        System.out.println("El area es: " + circ1.calcularArea());
        System.out.println("El perimetro es: " + circ1.calcularPerimetro());
    }

}

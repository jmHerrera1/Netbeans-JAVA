/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;

/**
 *
 * @author windows
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona1 = new Persona("Matias", "Herrera", 29);
       Persona persona2 = new Persona("Pedro", "Gonzalez", 39);
       Persona persona3 = new Persona("Juan", "Garcia", 45);
       
       persona2.setApellido("Gutierrez");
       persona1.setEdad(30);
       
        System.out.println("El nombre de la persona es "+ persona1.getNombre()+ " " +persona1.getApellido()+ " y su edad: " +persona1.getEdad());
        System.out.println("El nombre de la persona es "+ persona2.getNombre()+ " " +persona2.getApellido()+ " y su edad: " +persona2.getEdad());
        System.out.println("El nombre de la persona es "+ persona3.getNombre()+ " " +persona3.getApellido()+ " y su edad: " +persona3.getEdad());
        
        
    }
    
    
}

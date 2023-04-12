/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidad;

/**
 *
 * @author windows
 */
public class Rectangulo {

    //Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
    private double base;
    private double altura;

    //Constructor con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor vacio
    public Rectangulo() {
    }

    //Se deberán además definir los métodos getters, setters y constructores correspondientes.
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    ////La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
    public void crearRectangulo(double b1, double a1) {
        this.base = b1;
        this.altura = a1;
    }

    //También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
    public double calcularSuperficie() {
        double superficie = (this.base * this.altura);
        return superficie;
    }

    public double calcularPerimetro() {
        double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

    //Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == altura-1  || j == 0 || j == base - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

}

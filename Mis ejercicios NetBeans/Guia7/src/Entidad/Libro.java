/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author windows
 */
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void cargarLibro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public void mostrarLibro(){
        System.out.println("El numero de ISBN es:" +this.isbn);
        System.out.println("El titulo es: " +this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("La cantidad de paginas son: "+this.numPag);
        
    }
}

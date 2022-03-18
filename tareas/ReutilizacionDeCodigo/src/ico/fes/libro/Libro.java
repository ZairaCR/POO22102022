/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

import ico.fes.composicion.Autor;
import ico.fes.composicion.Editorial;

/**
 *
 * @author zaira
 */
public class Libro {
    private Autor escritor;
    private Editorial editorial;
    private String titulo;

    public Libro() {
    }

    public Libro(Autor escritor, Editorial editorial, String titulo) {
        this.escritor = escritor;
        this.editorial = editorial;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "escritor=" + escritor + ", editorial=" + editorial + ", titulo=" + titulo + '}';
    }
     
    
    
}

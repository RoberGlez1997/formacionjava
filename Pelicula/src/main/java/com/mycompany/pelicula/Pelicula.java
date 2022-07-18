/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pelicula;

/**
 *
 * @author rgongarcia
 */
public class Pelicula {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String género) {
        this.genero = género;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMayorde() {
        return mayorde;
    }

    public void setMayorde(int mayorde) {
        this.mayorde = mayorde;
    }

    public Pelicula(int codigo, String titulo, String genero, int rating, int mayorde) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.rating = rating;
        this.mayorde = mayorde;
    }
     
    private int codigo;
    private String titulo;
    private String genero;
    private int rating;
    private int mayorde;
    
    
}

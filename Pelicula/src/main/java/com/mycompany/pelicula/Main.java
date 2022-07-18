/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pelicula;
import java.util.ArrayList;

/**
 *
 * @author rgongarcia
 */
public class Main {
    
    public static void main(String[] args) {
		Pelicula pelicula = new Pelicula(12,"Spiderman","accion",5,13);
                Pelicula pelicula1 = new Pelicula(14,"IT","terror",5,18);
                Pelicula pelicula2 = new Pelicula(14,"Monsters","accion",5,13);
                Pelicula pelicula3 = new Pelicula(15,"SuperMan","accion",5,13);
                Pelicula pelicula4 = new Pelicula(16,"Minions","terror",5,13);
                
                
                ArrayList<Pelicula> peliculas= new ArrayList<Pelicula>();
                peliculas.add(pelicula);
                peliculas.add(pelicula1);
                peliculas.add(pelicula2);
                peliculas.add(pelicula3);
                peliculas.add(pelicula4);
                
                System.out.println("---------");
                
                for(int i=0;i<peliculas.size();i++){
                    System.out.println((peliculas.get(i).getTitulo()));
                    System.out.println((peliculas.get(i).getGenero()));
                    System.out.println((peliculas.get(i).getRating()));
                    System.out.println("---------");
                    
                }
                
                
                pelicula.setGenero("terror");
                pelicula1.setGenero("Comedia");
                
                System.out.println("----SEPARADOR DE RECORRIDO DE PELICULAS-----");
                
                System.out.println("---------");
                 for(int i=0;i<peliculas.size();i++){
                    System.out.println((peliculas.get(i).getTitulo()));
                    System.out.println((peliculas.get(i).getGenero()));
                    System.out.println((peliculas.get(i).getRating()));
                    System.out.println("---------");
                    
                }
                
                
               
                
               System.out.println("PELICULAS SOLO DE TERROR:");
                for(int i=0;i<peliculas.size();i++){
                    
                    if(peliculas.get(i).getGenero().equals("terror")){
                          System.out.println((peliculas.get(i).getTitulo()));
                    }
                  
                 
                    
                    
                }
                
               
	}

   
}

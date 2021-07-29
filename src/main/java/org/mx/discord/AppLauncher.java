/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mx.discord;

/**
 *
 * @author jganrica
 */
public class AppLauncher {
    
    public static void main(String[] args) {
        
        
        Pelicula  pelicula = new Pelicula("matriz","ciencia ficcion");
        System.out.println(pelicula.toString());
        
        
        Serie serie = new Serie("The big bang theory","comedia");
        System.out.println(serie);
    }
    
}

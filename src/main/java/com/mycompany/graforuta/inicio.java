/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Grafo;

/**
 *
 * @author Ruldin Ayala
 */
public class inicio {
    
    public static void main(String[] args) {
        
          Grafo g = new Grafo("ABCDEFGHIJKLMNOPQ");
        g.agregarRuta('A','O', 17);
        g.agregarRuta('A','B', 28);
        g.agregarRuta('B','O', 18);
        g.agregarRuta('B','J', 33);
        g.agregarRuta('B','C', 30);
        g.agregarRuta('B','P', 21);
        g.agregarRuta('C','P',15);
        g.agregarRuta('C','I',12);
        g.agregarRuta('D','Q',74);
        g.agregarRuta('D','F',68);
        g.agregarRuta('D','F',14);
        g.agregarRuta('D','H',14);
        char inicio = 'C';
        char fin    = 'A';
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}

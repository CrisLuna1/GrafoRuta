/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanzamiento;

import GrafosPkg.Grafo;


/**
 *
 * @author Ruldin Ayala
 */
public class inicio {
    
    
    public   String InsetarDatos (char partida, char destino){
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
        g.agregarRuta('D','H',18);
        g.agregarRuta('E','H',21);
        g.agregarRuta('E','K',7);
        g.agregarRuta('F','J',31);
        g.agregarRuta('F','P',8);
        g.agregarRuta('F','Q',7);
        g.agregarRuta('G','O',19);
        g.agregarRuta('G','J',15);
        g.agregarRuta('H','N',35);
        g.agregarRuta('H','M',25);
        g.agregarRuta('H','J',19);
        g.agregarRuta('H','D',17);
        g.agregarRuta('H','E',21);
        g.agregarRuta('H','K',22);
        g.agregarRuta('I','P',16);
        g.agregarRuta('J','O',37);
        g.agregarRuta('J','P',23);
        g.agregarRuta('J','M',20);
        g.agregarRuta('K','L',42);
        g.agregarRuta('M','N',21);
        g.agregarRuta('P','Q',10);
        
        char inicio = partida;
        char fin    = destino;
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        
        return respuesta;
    }
    
//    public static void main(String[] args) {
//            Scanner entrada = new Scanner (System.in); 
//        
//        char x ,y;
//        System.out.println("Ingresar la partia: ");
//        x = entrada.next().charAt(0);
//        
//        System.out.println("Ingresar el destino: ");
//        y = entrada.next().charAt(0);
//               
//        System.out.println(InsetarDatos(x,y));
//        
//        
//       
//    }
}

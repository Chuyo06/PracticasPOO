/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoseises;

import java.util.ArrayList;

/**
 *
 * @author jalex
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BarajaEspaniola baraja1   = new BarajaEspaniola();
       ArrayList<Carta> mano = null ;
       ArrayList<Carta> mano1 = null ;
       Jugadores jugador1 = new Jugadores();
       Jugadores jugador2 = new Jugadores();
       
        baraja1.barajear();
       //baraja1.mostrarBaraja();
       mano = baraja1.repartirMano(12) ;
       mano1 = baraja1.repartirMano(12);
       //System.out.println(mano.toString());
       
       jugador1.setNombre("Jesus");
       jugador1.setMano(mano);
       
       jugador2.setNombre("Ana");
       jugador2.setMano(mano1);
       
       System.out.println(jugador1.toString());
       //jugador1.jugarCarta(0);
       System.out.println(jugador2.toString());
      
      
       
      
       
       
       
    }
    
}

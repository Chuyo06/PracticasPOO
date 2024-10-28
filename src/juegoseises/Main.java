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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BarajaEspaniola baraja1   = new BarajaEspaniola();
       ArrayList<Carta> mano = null ;
       
       baraja1.barajear();
       //baraja1.mostrarBaraja();
       mano = baraja1.repartirMano(12) ;
       System.out.println(mano.toString());
    }
    
}

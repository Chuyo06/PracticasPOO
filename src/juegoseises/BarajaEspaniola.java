/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoseises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author jalex
 */
public class BarajaEspaniola {
    
    private ArrayList<Carta> baraja ; 
    
    
   public BarajaEspaniola() //Constructor que crea la baraja completa
   {
       baraja = new ArrayList<>();
       String [] figuras = {"oros", "copas", "bastos" , "espadas"};
       for (String figura : figuras)
       {
           for(int i = 1; i < 13; i++)
           {
               baraja.add(new Carta(i , figura));
           }
       }
   }
   
   
   public void mostrarBaraja()
   {
       String cartaMostrar;
       
       for (int i = 0; i < baraja.size();i++)
       {
           Carta actualCarta = baraja.get(i);
           cartaMostrar = actualCarta.toString();
           System.out.println(cartaMostrar);
           
       }
   }
   
   public void barajear()
   {
       Collections.shuffle(baraja);
   }
   
   public ArrayList<Carta> repartirMano(int cantidadCartas)
   {
      ArrayList<Carta> mano;
      mano = new ArrayList<>(cantidadCartas);
      Random rmd = new Random();
      for (int i = 0; i < cantidadCartas; i++)
      {
           int valor = rmd.nextInt(baraja.size());
            mano.add(baraja.remove(valor));
      }

       return mano;
   }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoseises;

import java.util.ArrayList;

/**
 *
 * @author jalex
 */
public class Jugadores {
    
  private ArrayList<Carta> mano;    
  private String nombre;
    
  
  public Jugadores(){
      this.mano = new ArrayList(); 
      this.nombre = nombre; 
  }
  
  
  public Carta jugarCarta(int indice)
  {
      if(indice >= 0 && indice <= mano.size())
      {
          return mano.remove(indice);
      }
      
  return null;    
  }
  
  public ArrayList<Carta> getMano()
  {
      return mano;
  }
  
    public void setMano(ArrayList<Carta> mano)
  {
      this.mano = mano;
  }
  
  public String getNombre()
  {
      return nombre;
  }
  
   public void setNombre(String nombre)
  {
      this.nombre = nombre;
  }

    @Override
    public String toString() {
        return "{ nombre = " + nombre + "\n" + "mano=" + mano +  "}";
    }
  
  
}

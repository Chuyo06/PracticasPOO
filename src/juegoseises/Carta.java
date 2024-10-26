/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoseises;

/**
 *
 * @author jalex
 */
public class Carta {
    
    private int valor;
    private String figura;
    
    
    public Carta(int valor , String figura)
    {
        this.valor = valor;
        this.figura = figura;
    }

    
    @Override
    public String toString() {
        return "Carta{" + "valor=" + valor + ", figura=" + figura + '}';
    }
    

    public int getValor() {
        return valor;
    }

    public String getFigura() {
        return figura;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    
    
    
}

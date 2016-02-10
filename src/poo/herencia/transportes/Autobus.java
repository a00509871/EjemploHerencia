/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.transportes;

/**
 *
 * @author falvizo
 */
public class Autobus extends Vehiculo{
    //Atributos
    private final int ruta;
    //Métodos
    /**
     * Constructor
     * @param placa 
     * @param modelo
     * @param pasajeros
     * @param ruta 
     */
    public Autobus(String placa, String modelo, int pasajeros, int ruta) {
        super(placa, modelo, pasajeros);
        this.ruta = ruta;
    }
    /**
     * Método que devuelve la ruta del autobus
     * @return devuelve un entero
     */
    public int getRuta(){
        return this.ruta;
    }
    
   


    
    
    
 
    
    
}

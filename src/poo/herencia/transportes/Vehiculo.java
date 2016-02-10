/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.transportes;

/**
 *Estamos programando una SUPERCLASE
 * @author falvizo
 */
public class Vehiculo {
    //atributos
    protected String placa, modelo;
    protected int pasajeros;
    
    //Métodos
    /**
     * Constructor 
     * @param placa Es la placa del vehículo
     * @param modelo El modelo del vehículo
     * @param pasajeros Es la cantidad de pasajero
     */
    public Vehiculo(String placa, String modelo, int pasajeros){
        this.placa = placa;
        this.modelo = modelo;
        this.pasajeros=pasajeros;   
    }
    /**
     * Método que devuelve la placa del vehículo
     * @return regresa la placa en formato string.
     */
    public String getPlaca (){
        return this.placa;
    }
    /**
     * Método para devolver el modelo del vehículo
     * @return una cadena con el modelo del vehículo
     */
    public String getModelo(){
        return this.modelo;
    }
    /**
     * Método para notificar la capacidad máxima del vehículo
     * @return devuelve un entero con la cantidad max de pasajeros
     */
    public int getPasajeros(){
        return this.pasajeros;
    }
    
    
    
}

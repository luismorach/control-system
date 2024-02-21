/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Administrador
 */
public class DistribuidoresDTO {
    private int id ;
    private String nombre;
    private float capacidad;
    private int tiempoNormal;
    private int tiempoRetraso;    
    
    public void setId(int id){
        this.id=id;
    }    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCapacidad(float capacidad){
        this.capacidad=capacidad;
    }
    public void setTiempoNormal(int tiempoNormal){
        this.tiempoNormal=tiempoNormal;   
    }    
    public void setTiempoRetraso(int tiempoRetraso){
        this.tiempoRetraso=tiempoRetraso;
    }    
     public int getId(){
        return id;
    }     
    public String getNombre(){
        return nombre;
    }
    public float getCapacidad(){
        return capacidad;
    }
    public int getTiempoNormal(){
        return tiempoNormal;
    }
     public int getTiempoRetraso(){
        return tiempoRetraso;
    }   
}

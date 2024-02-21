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
public class HistorialDTO {
    private int id ;
    private String user;
    private String ingresoGasto;
    private String fecha;
    private String hora; 
    
     public void setId(int id){
        this.id=id;
    }    
    public void setUser(String user){
        this.user=user;
    }
    public void setIngresoGasto(String ingresoGasto){
        this.ingresoGasto=ingresoGasto;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;   
    }    
    public void setHora(String hora){
        this.hora=hora;
    }    
     public int getId(){
        return id;
    }     
    public String getUser(){
        return user;
    }
    public String getIngresGasto(){
        return ingresoGasto;
    }
    public String getFecha(){
        return fecha;
    }
     public String getHora(){
        return hora;
    }   
}

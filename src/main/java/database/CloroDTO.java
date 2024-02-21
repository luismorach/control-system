/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.math.BigDecimal;

/**
 *
 * @author Administrador
 */
public class CloroDTO {
    private int id ;
    private float capacidadTotal;
    private BigDecimal cantidadActual;
    private float cloroUsado;
    private int intentos;    
    
    public void setId(int id){
        this.id=id;
    }    
    public void setCapacidadTotal(float capaciadTotal){
        this.capacidadTotal=capaciadTotal;
    }
    public void setCantidadActual(BigDecimal cantidadActual){
        this.cantidadActual=cantidadActual;
    }
    public void setCloroUsado(float cloroUsado){
        this.cloroUsado=cloroUsado;    }
    
    public void setIntentos(int intentos){
        this.intentos=intentos;
    }    
     public int getId(){
        return id;
    }     
    public float getCapacidadTotal(){
        return capacidadTotal;
    }
    public BigDecimal getCantidadActual(){
        return cantidadActual;
    }
    public float getCloroUsado(){
        return cloroUsado;
    }
    public int getIntentos(){
        return intentos;
    }    
}

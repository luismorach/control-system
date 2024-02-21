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
public class UsuarioDTO {
    private String usuario;
    private String nombre;
    private String apellido;
    private String cedula;
    private String pass ;
    private int id ;
    private String estado;
    private String tipo;
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
            this.apellido=apellido;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getPass(){
        return pass;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCedula(){
        return cedula;
    }
    public String getEstado(){
        return estado;
    }
    public String getTipo(){
        return tipo;
    }
}

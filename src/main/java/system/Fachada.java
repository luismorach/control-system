/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.math.BigDecimal;
import java.util.Collection;
import database.*;

/**
 *
 * @author Administrador
 */
public class Fachada {
    
    public static void creacionPorDefecto(){
        UsuarioDAO.crearAdministrador();
        CloroDAO.NivelPorDefecto();
        AlertaDAO.DatosPorDefecto();
    }
    
    public void registrarUser(String param1,String param2,
        String param3,String param4,String param5){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        acceso.crearUsuario(param1, param2, param3, param4, param5);
    }
    
    public Collection<UsuarioDTO> BuscarUserPass(String usuario,String pass){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        String sql = "SELECT *"
                +    "FROM Usuarios WHERE Usuario = ? AND Password = ?";
        return acceso.buscar(sql,usuario, pass);
    }
    
    public Collection<UsuarioDTO> BuscarUserCedula(String usuario,String cedula){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        String sql = "SELECT * "
                +    "FROM Usuarios WHERE Usuario = ? OR Cedula = ?";
        return acceso.buscar(sql,usuario,cedula);
    }  

    public Collection<UsuarioDTO> BuscarUser(int param1){
          UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
          return acceso.buscar(param1);
    }
    
    public Collection<UsuarioDTO> BuscarUser(){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        return acceso.buscar();
    }
    
    public void actualizarUsuario(int id, String param1,String param2,
             String param3,String param4,String param5){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        acceso.actualizarUsuario( id,param1,param2,param3,param4, param5);
    }
    
    public void actualizarUsuario(String param1,String param2){
        UsuarioDAO acceso= (UsuarioDAO)Instancia.getInstancia("database.UsuarioDAO");
        acceso.actualizarUsuario(param1,param2);
    }
    
    public Collection<CloroDTO> consultaCloro(){
        CloroDAO acceso= (CloroDAO)Instancia.getInstancia("database.CloroDAO");
        return acceso.consultaCloro();
    }
    
    public void ActualizarCloro(BigDecimal param1,float param2,
             float param3,int param4){
        CloroDAO acceso= (CloroDAO)Instancia.getInstancia("database.CloroDAO");
        acceso.actualizarCloro(param1,param2,param3,param4);
    }
    public Collection<AlertaDTO> consultarAlerta(){
        AlertaDAO acceso= (AlertaDAO)Instancia.getInstancia("database.AlertaDAO");
        return acceso.consultarAlerta();
    }
    
    public void ActualizarAlerta(String IP,int Port){
        AlertaDAO acceso= (AlertaDAO)Instancia.getInstancia("database.AlertaDAO");
        acceso.actualizarAlerta(IP,Port);
    }
    
    public Collection<DistribuidoresDTO> consultarDistribidor(){
        DistribuidoresDAO acceso=(DistribuidoresDAO)Instancia.getInstancia("database.DistribuidoresDAO");
        return acceso.consultarDatosDistribuidor();
    }
    
    public void actualizarDistribuidor(String param1,float param2,int param3,
            int param4,String param5){
        DistribuidoresDAO acceso=(DistribuidoresDAO)Instancia.getInstancia("database.DistribuidoresDAO");
        acceso.actualizarDistribuidor(param1, param2, param3, param4, param5);
    }
    
    public void crearDistribuidor(String param1, float param2,int param3,int param4){
        DistribuidoresDAO acceso=(DistribuidoresDAO)Instancia.getInstancia("database.DistribuidoresDAO");
        acceso.crearDistribuidor(param1, param2, param3,param4);
    }
    
    public void eliminarDistribuidor(String param1){
        DistribuidoresDAO acceso=(DistribuidoresDAO)Instancia.getInstancia("database.DistribuidoresDAO");
        acceso.eliminarDistribuidor(param1);
    }
     
    public Collection<DistribuidoresDTO> consultarDistribidor(String param1){
        DistribuidoresDAO acceso=(DistribuidoresDAO)Instancia.getInstancia("database.DistribuidoresDAO");
        return acceso.consultarDatosDistribuidor(param1);
    }           
    public void almacenarHistorial(String param1,String param2,String param3,String param4){
        HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
        acceso.almacenarHistorial(param1, param2, param3, param4);
    }
    public Collection<HistorialDTO> ConsultarHistorial(){
        HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
        return acceso.ConsultarHistorial();
    }
    public void eliminarHistorial(){
        HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
        acceso.eliminarHistorial();
    }
    
     public Collection<HistorialDTO> buscarPorUsuario(String param1) {
          HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
          String sql = "SELECT Usuario,IngresoGasto,Fecha,Hora "
                + "FROM Conexiones WHERE Usuario=?";
          return acceso.buscarHistorial(sql, param1);
     }
    public Collection<HistorialDTO> buscarPorFecha(String param1) {
        HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
        String sql = "SELECT Usuario,IngresoGasto,Fecha,Hora "
                + "FROM Conexiones WHERE Fecha=?";
        return acceso.buscarHistorial(sql, param1);
    }
    public Collection<HistorialDTO> buscarPorUsuarioyFecha(String param1, String param2){
        HistorialDAO acceso=(HistorialDAO)Instancia.getInstancia("database.HistorialDAO");
        String sql = "SELECT Usuario,IngresoGasto,Fecha,Hora "
                + "FROM Conexiones WHERE Usuario=? AND Fecha=?";
        return acceso.buscarHistorial(sql, param1,param2);
    }
}

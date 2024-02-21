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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class HistorialDAO {
    
    public void almacenarHistorial(String param1,String param2,String param3,String param4){
        
        String sql = "INSERT INTO Conexiones (Usuario,IngresoGasto,Fecha,Hora)"
                + " VALUES(?,?,?,?)";
        try{
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,param1);
            pstmt.setString(2, param2);
            pstmt.setString(3,param3);
            pstmt.setString(4, param4);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Collection<HistorialDTO> ConsultarHistorial() {
        ArrayList<HistorialDTO> datos=null;
        String sql = "SELECT Usuario,IngresoGasto,Fecha,Hora "
                + "FROM Conexiones";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            HistorialDTO result;
            datos=new ArrayList<>();
            while (rs.next()) {
                result=new HistorialDTO();
                result.setUser(rs.getString("Usuario"));
                result.setIngresoGasto(rs.getString("IngresoGasto"));
                result.setFecha(rs.getString("Fecha"));
                result.setHora(rs.getString("Hora"));  
                datos.add(result);
            }           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         return datos;
    }
     
    public void eliminarHistorial(){
    String sql = "DELETE FROM Conexiones";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public Collection<HistorialDTO> buscarHistorial(String sql,String param1) {
       ArrayList<HistorialDTO> datos=null;       
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, param1.toLowerCase().trim());
            ResultSet rs = pstmt.executeQuery();
            HistorialDTO result;
            datos=new ArrayList<>();
            while (rs.next()) {
                result=new HistorialDTO();
                result.setUser(rs.getString("Usuario"));
                result.setIngresoGasto(rs.getString("IngresoGasto"));
                result.setFecha(rs.getString("Fecha"));
                result.setHora(rs.getString("hora"));             
                datos.add(result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return datos;
    }

    public Collection<HistorialDTO> buscarHistorial(String sql,String param1,String param2) {
       ArrayList<HistorialDTO> datos=null;       
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, param1.toLowerCase().trim());
            pstmt.setString(2, param2.toLowerCase().trim());
            ResultSet rs = pstmt.executeQuery();
            HistorialDTO result;
            datos=new ArrayList<>();
            while (rs.next()) {
                result=new HistorialDTO();
                result.setUser(rs.getString("Usuario"));
                result.setIngresoGasto(rs.getString("IngresoGasto"));
                result.setFecha(rs.getString("Fecha"));
                result.setHora(rs.getString("hora"));             
                datos.add(result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return datos;
    }
}

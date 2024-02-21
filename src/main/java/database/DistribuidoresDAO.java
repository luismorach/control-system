/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class DistribuidoresDAO {
    
    public Collection<DistribuidoresDTO> consultarDatosDistribuidor() {
        ArrayList<DistribuidoresDTO> datos=null;        
        String sql = "SELECT *"
                + " FROM Distribuidores ORDER BY TiempoRetraso ";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            ResultSet rs = pstmt.executeQuery();           
            DistribuidoresDTO result;
            datos = new ArrayList<> ();
            while (rs.next()) {                
                result = new DistribuidoresDTO();
                result.setId(rs.getInt("ID"));
                result.setNombre(rs.getString("Nombre"));
                result.setCapacidad(rs.getFloat("Capacidad"));
                result.setTiempoNormal(rs.getInt("TiempoNormal"));
                result.setTiempoRetraso(rs.getInt("TiempoRetraso")); 
                datos.add(result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public Collection<DistribuidoresDTO> consultarDatosDistribuidor(String param1) {
        ArrayList<DistribuidoresDTO> datos=null;        
        String sql = "SELECT *"
                + " FROM Distribuidores WHERE Nombre=?";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            pstmt.setString(1, param1);
            ResultSet rs = pstmt.executeQuery();           
            DistribuidoresDTO result;
            datos = new ArrayList<> ();
            while (rs.next()) {                
                result = new DistribuidoresDTO();
                result.setId(rs.getInt("ID"));
                result.setNombre(rs.getString("Nombre"));
                result.setCapacidad(rs.getFloat("Capacidad"));
                result.setTiempoNormal(rs.getInt("TiempoNormal"));
                result.setTiempoRetraso(rs.getInt("TiempoRetraso")); 
                datos.add(result);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void actualizarDistribuidor(String param1,float param2,int param3,
            int param4,String param5) {
         String sql = "UPDATE Distribuidores SET  Nombre=?,Capacidad=?,TiempoNormal=?, TiempoRetraso=?"
                    + " WHERE Nombre=?";
            try {
                Connection Conexion = BaseDeDatos.getConexion();
                PreparedStatement pstmt = Conexion.prepareStatement(sql);
                pstmt.setString(1, (param1.toLowerCase()));
                pstmt.setFloat(2,param2);
                pstmt.setInt(3, param3);
                pstmt.setInt(4, param4);
                pstmt.setString(5, param5);
                pstmt.executeUpdate(); 
                
            } catch (NumberFormatException | SQLException e) {
                System.out.println(e.getMessage());
            }
    }
     
    public void crearDistribuidor(String param1, float param2,int param3,int param4) {
        String sql = "INSERT INTO Distribuidores (Nombre,Capacidad,TiempoNormal,"
                + "TiempoRetraso) VALUES(?,?,?,?)";
        try {
            Connection Conexion = BaseDeDatos.getConexion();        
            PreparedStatement pstmt = Conexion.prepareStatement(sql);
            pstmt.setString(1, param1);
            pstmt.setFloat(2, param2);
            pstmt.setInt(3, param3);
            pstmt.setInt(4, param4);
            pstmt.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void eliminarDistribuidor(String param1) {       
        String sql = "DELETE FROM Distribuidores WHERE Nombre=?";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, param1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }       
    }    
}
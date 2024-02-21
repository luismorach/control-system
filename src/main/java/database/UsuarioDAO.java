/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class UsuarioDAO {
    
    
    public Collection<UsuarioDTO> buscar(String sql, String param1, String param2){
        ArrayList<UsuarioDTO> datos=null;   
        Connection conn;  
        PreparedStatement pstmt=null;
        ResultSet rs=null;
         try  {
            conn = BaseDeDatos.getConexion();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, (param1.toLowerCase()).trim());
            pstmt.setString(2, (param2.toLowerCase()).trim());
            rs = pstmt.executeQuery();
            
            UsuarioDTO result;            
            datos = new ArrayList<>();
            while (rs.next()) {
                result=new UsuarioDTO();
                result.setId(rs.getInt("ID"));  
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido")); 
                result.setCedula(rs.getString("Cedula"));  
                result.setUsuario(rs.getString("Usuario"));
                result.setPass (rs.getString("Password"));
                result.setEstado(rs.getString("Estado"));
                result.setTipo(rs.getString("TipoCuenta")); 
                datos.add(result);   
                System.out.println("consulta exitosa");
            }            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         finally{
            try {
                if( rs!=null ) 
                    rs.close(); 
                if( pstmt!=null ) 
                    pstmt.close();
            } catch(SQLException ex){
                System.out.println("error     ");
                 throw new RuntimeException(ex);
            }               
        }
        return datos;   
    }
   
    public Collection<UsuarioDTO> buscar(int param1){
        ArrayList<UsuarioDTO> datos=null;
         String sql = "SELECT *"
                + "FROM Usuarios WHERE ID = ?";
        try{ 
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            pstmt.setInt(1,param1);
            ResultSet rs = pstmt.executeQuery();
            
            UsuarioDTO result;            
            datos = new ArrayList<>();
            while (rs.next()) {
                result=new UsuarioDTO();
                result.setId(rs.getInt("ID"));  
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido")); 
                result.setCedula(rs.getString("Cedula"));  
                result.setUsuario(rs.getString("Usuario"));
                result.setPass (rs.getString("Password"));
                result.setEstado(rs.getString("Estado"));
                result.setTipo(rs.getString("TipoCuenta")); 
                datos.add(result);   
                System.out.println("consulta exitosa");
            }            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public Collection<UsuarioDTO> buscar(){
        ArrayList<UsuarioDTO> datos=null;   
        String sql = "SELECT * "
                + "FROM Usuarios  WHERE TipoCuenta =?";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"Empleado");
            ResultSet rs = pstmt.executeQuery();
            UsuarioDTO result;            
            datos = new ArrayList<>();
            while (rs.next()) {
                result=new UsuarioDTO();
                result.setId(rs.getInt("ID"));  
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido")); 
                result.setCedula(rs.getString("Cedula"));  
                result.setUsuario(rs.getString("Usuario"));
                result.setPass (rs.getString("Password"));
                result.setEstado(rs.getString("Estado"));
                result.setTipo(rs.getString("TipoCuenta")); 
                datos.add(result);   
                System.out.println("consulta exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void crearUsuario(String param1,String param2,
             String param3,String param4,String param5) {
         
        String sql = "INSERT INTO Usuarios (Nombre, Apellido, "
                + "Cedula, Usuario, Password,TipoCuenta,Estado) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            Connection Conexion = BaseDeDatos.getConexion();
            PreparedStatement pstmt = Conexion.prepareStatement(sql);
            
            pstmt.setString(1, param1.toLowerCase());
            pstmt.setString(2, param2.toLowerCase());
            pstmt.setString(3, param3);
            pstmt.setString(4, param4.toLowerCase());
            pstmt.setString(5, param5.toLowerCase());
            pstmt.setString(6, "Empleado");
            pstmt.setString(7, "Activo");
            pstmt.executeUpdate();            
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void crearAdministrador(){        
           
            try {
                String sql = "INSERT INTO Usuarios (ID,Nombre, Apellido, Cedula, "
                        + "Usuario, Password,TipoCuenta,Estado) "
                        + "VALUES(?,?,?,?,?,?,?,?)";
                Connection con = BaseDeDatos.getConexion();
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, 1);
                pstmt.setString(2, "-");
                pstmt.setString(3, "-");
                pstmt.setString(4, "-");
                pstmt.setString(5, "admin");
                pstmt.setString(6, "1234");
                pstmt.setString(7, "Amninistrador");
                pstmt.setString(8, "Activo");
                pstmt.executeUpdate();
                System.out.println("admin creado");
            } catch (SQLException e) {
                System.out.println("errororororo...."+e.getMessage());
            }
    }
    
    public void actualizarUsuario(int id, String param1,String param2,
             String param3,String param4,String param5){
         String sql = "UPDATE Usuarios SET  Nombre=?,Apellido=?,Cedula=?,Usuario=?,Password=?"
                    + "WHERE ID=" + id;
            try {
                Connection Conexion = BaseDeDatos.getConexion();
                PreparedStatement pstmt = Conexion.prepareStatement(sql);                 
                pstmt.setString(1, param1);
                pstmt.setString(2, param2);
                pstmt.setString(3, param3);
                pstmt.setString(4, param4);
                pstmt.setString(5, param5);
                pstmt.executeUpdate();
                System.out.println("actualizacion exitosa");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
     } 
    
    public void actualizarUsuario(String param1,String param2){
        String sql = "UPDATE Usuarios SET Estado=? WHERE Usuario=?";
            try {
                Connection Conexion = BaseDeDatos.getConexion();
                PreparedStatement pstmt = Conexion.prepareStatement(sql);
                pstmt.setString(1, param1);
                pstmt.setString(2, param2);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}

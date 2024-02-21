/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class CloroDAO {
   
    public static void NivelPorDefecto() {
        String sql = "INSERT INTO Cloro (ID,CapacidadTotal,"
                + "CantidadActual,CloroUsado,Intentos) VALUES(?,?,?,?,?)";
        try {
            Connection Conexion = BaseDeDatos.getConexion();
            PreparedStatement pstmt = Conexion.prepareStatement(sql); 
            pstmt.setInt(1, 1);
            pstmt.setFloat(2, 2721);
            pstmt.setBigDecimal(3,new BigDecimal("2000"));
            pstmt.setFloat(4, 0);
            pstmt.setInt(5, 0);                                 
            pstmt.executeUpdate();  
            System.out.println("creacion cloro exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarCloro(BigDecimal param1,float param2,float param3,int param4) {
        String sql = "UPDATE Cloro SET  CantidadActual=?,CapacidadTotal=?,"
                   + "CloroUsado=?,Intentos=? WHERE ID=1";
        try {
            Connection Conexion = BaseDeDatos.getConexion();
            PreparedStatement pstmt = Conexion.prepareStatement(sql); 
            pstmt.setBigDecimal(1, param1);
            pstmt.setFloat(2, param2);
            pstmt.setFloat(3, param3);
            pstmt.setInt(4, param4);
            pstmt.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }       
    }
    
    public Collection<CloroDTO> consultaCloro() {
         ArrayList<CloroDTO> datos=null;    
        String sql = "SELECT  * "
                   + "FROM Cloro";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            CloroDTO result;
            datos = new ArrayList<>();
            while (rs.next()) {
                result = new CloroDTO();
                result.setId(rs.getInt("ID"));
                result.setCapacidadTotal(rs.getFloat("CapacidadTotal"));
                result.setCantidadActual(rs.getBigDecimal("CantidadActual"));                
                result.setCloroUsado(rs.getFloat("CloroUsado"));
                result.setIntentos(rs.getInt("Intentos"));
                datos.add(result);
             System.out.println("consulta  cloro exitosa");
            }            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
}

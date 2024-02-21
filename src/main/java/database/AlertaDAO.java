package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class AlertaDAO {
     public static void DatosPorDefecto() {
        String sql = "INSERT INTO Alerta (ID,IP,Port) VALUES(?,?,?)";
        try {
            Connection Conexion = BaseDeDatos.getConexion();
            PreparedStatement pstmt = Conexion.prepareStatement(sql); 
            pstmt.setInt(1, 1);
            pstmt.setString(2, "127.0.0.1");
            pstmt.setInt(3,5432);
            pstmt.executeUpdate();  
            System.out.println("creacion datos exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarAlerta(String IP,int Port) {
        String sql = "UPDATE Alerta SET  IP=?,Port=? WHERE ID=1";
        try {
            Connection Conexion = BaseDeDatos.getConexion();
            PreparedStatement pstmt = Conexion.prepareStatement(sql); 
            pstmt.setString(1,IP);
            pstmt.setInt(2, Port);
            pstmt.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }       
    }
    
    public Collection<AlertaDTO> consultarAlerta() {
         ArrayList<AlertaDTO> datos=null;    
        String sql = "SELECT  * FROM Alerta";
        try {
            Connection conn = BaseDeDatos.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            AlertaDTO result;
            datos = new ArrayList<>();
            while (rs.next()) {
                result = new AlertaDTO();
                result.setId(rs.getInt("ID"));
                result.setIP(rs.getString("IP"));
                result.setPort(rs.getInt("Port"));
                datos.add(result);
             System.out.println("consulta  alerta exitosa");
            }            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
}

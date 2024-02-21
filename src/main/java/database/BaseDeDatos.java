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
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatos {

    private static Connection conexion = null;

    public static Connection getConexion() {
        try {
            if (conexion == null) {
                // con esto determinamos cuando finalize el programa
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                String urlDB = "jdbc:sqlite:UsoDeCloro.db";
                conexion = DriverManager.getConnection(urlDB);
                System.out.println("Conexion Exitosa");
            }
            return conexion;
        } catch (SQLException ex) {
            throw new RuntimeException("Error al crear la conexion", ex);
        }
    }

    static class MiShDwnHook extends Thread {

        // justo antes de finalizar el programa la JVM invocara
        // a este metodo donde podemos cerrar la conexion
        @Override
        public void run() {
            try {
                // Connection conexion = BaseDeDatos.getConexion();
                conexion.close();
                System.out.println("conexion cerrada");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void crearTablas() {
        String sql = "CREATE TABLE IF NOT EXISTS Usuarios (\n"
                + "	ID Integer PRIMARY KEY NOT NULL,\n"
                + "	Nombre TEXT NOT NULL,\n"
                + "	Apellido TEXT NOT NULL,\n"
                + "	Cedula TEXT NOT NULL,\n"
                + "	Usuario TEXT NOT NULL,\n"
                + "	Password TEXT NOT NULL,\n"
                + "	TipoCuenta TEXT NOT NULL,\n"
                + "	Estado TEXT NOT NULL"
                + ");";

        String sql1 = "CREATE TABLE IF NOT EXISTS Cloro (\n"
                + "	ID Integer PRIMARY KEY NOT NULL,\n"
                + "	CapacidadTotal  REAL NOT NULL,\n"
                + "	CantidadActual NUMERIC NOT NULL,\n"
                + "	CloroUsado REAL NOT NULL,\n"
                + "	Intentos  INTEGER NOT NULL"
                + ");";

        String sql2 = "CREATE TABLE IF NOT EXISTS Conexiones (\n"
                + "	ID Integer PRIMARY KEY NOT NULL,\n"
                + "	Usuario TEXT NOT NULL,\n"
                + " IngresoGasto TEXT NOT NULL,\n"
                + "	Fecha TEXT NOT NULL,\n"
                + "	Hora TEXT NOT NULL"// Real
                + ");";
        String sql3 = "CREATE TABLE IF NOT EXISTS Distribuidores (\n"
                + "	ID Integer PRIMARY KEY NOT NULL,\n"
                + "	Nombre TEXT NOT NULL,\n"
                + "	Capacidad Float NOT NULL,\n"
                + "	TiempoNormal Integer NOT NULL,\n"
                + "	TiempoRetraso Integer NOT NULL"// Real
                + ");";
        String sql4 = "CREATE TABLE IF NOT EXISTS Alerta (\n"
                + "	ID Integer PRIMARY KEY NOT NULL,\n"
                + "	IP TEXT NOT NULL,\n"
                + "	Port Integer NOT NULL"
                + ");";

        try {
            Connection conn = BaseDeDatos.getConexion();
            Statement stmt = conn.createStatement();
            Statement stmt1 = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            Statement stmt3 = conn.createStatement();
            Statement stmt4 = conn.createStatement();
            stmt.execute(sql);
            stmt1.execute(sql1);
            stmt2.execute(sql2);
            stmt3.execute(sql3);
            stmt4.execute(sql4);
            System.out.println("las tablas fueron creadas");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

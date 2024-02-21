/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author Administrador
 */
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Collection;

import javax.swing.*;

import database.AlertaDTO;


public class Alerta{
    
    // Variables declaration - do not modify                     
     JButton botonEntendido;
    public JTextArea txtMsj;
    protected Fachada facade= (Fachada)Instancia.getInstancia("system.Fachada");
   
    String IP;
    int Port;
    
     public Alerta() {
        setDatos();  
    }
    private void setDatos() {
        Collection<AlertaDTO> collAlerta = facade.consultarAlerta();
        for (AlertaDTO dto : collAlerta) {
            IP=dto.getIP();
            Port=dto.getPort();
        }
    }
    public void enviarAlerta(String msj) throws Exception{
     ObjectOutputStream oos = null;       
     Socket s = null;
        try {
            // instancio el server con la IP y el PORT
            s = new Socket(IP, Port);
            oos = new ObjectOutputStream(s.getOutputStream());                                
            oos.writeObject(msj);   
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se logro enviar la alerta al gerente por fallo en comunicacion");
            ex.printStackTrace();
        } finally {            
            if (oos != null) {
                oos.close();
            }
            if (s != null) {
                s.close();
            }
        }
    }
}

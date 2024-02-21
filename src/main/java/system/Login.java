/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Collection;
import static javax.swing.SwingConstants.*;
import database.*;
/**
 *
 * @author Administrador
 */
public class Login extends JFrame {    
    private JButton botonEntrar;
    private JButton botonRegistrar;
    private JButton botonMinimizar;
    private JButton botonCerrar;
    private JLabel etiquetaBarra;
    private JLabel icono4;
    private JLabel icono3;
    private JLabel icono2;
    private JLabel icono1;
    private JLabel adornoTxtUser;
    private JLabel imgInicio;
    private JLabel etiquetaInicioSesion;
    private JLabel etiquetaUser;
    private JLabel etiquetaPass;
    private JLabel icono6;
    private JLabel icono5;
    private JLabel iconoBarra;
    private JLabel adornoTxtPass;
    private JPanel jPanel2;
    private JSeparator separador;
    private JPasswordField txt_Pass;
    private int x,y;
    public  JTextField txt_User;
    private int fontSize=12;
    BaseDeDatos manj= new BaseDeDatos();
    public Login() {        
        setUndecorated(true);        
        initComponents();       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(627,453);       
        setResizable(false);  
        manj.crearTablas();
        this.setLocationRelativeTo(null);
        setOpacity(0.95f); 
        Fachada.creacionPorDefecto();       
    }
    private void initComponents() {
        jPanel2 = new JPanel();
        botonMinimizar = new JButton();
        botonCerrar = new JButton();
        imgInicio = new JLabel();
        etiquetaInicioSesion = new JLabel();
        etiquetaUser = new JLabel();
        etiquetaPass = new JLabel();
        txt_Pass = new JPasswordField();
        txt_User = new JTextField();
        adornoTxtPass = new JLabel();
        adornoTxtUser = new JLabel();
        separador = new JSeparator();
        iconoBarra = new JLabel();
        etiquetaBarra = new JLabel();
        icono1 = new JLabel();
        icono2 = new JLabel();
        icono3 = new JLabel();
        icono4 = new JLabel();
        icono5 = new JLabel();
        icono6 = new JLabel();      
        botonRegistrar = new JButton();
        botonEntrar = new JButton();     
                        
        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
        jPanel2.setLayout(null);        
        
        iconoBarra.setIcon(new ImageIcon(getClass().getResource("/img/3logo.png"))); // NOI18N
        jPanel2.add(iconoBarra);
        iconoBarra.setBounds(2, 3, 74, 20);

        etiquetaBarra.setBackground(new Color(153, 0, 0));
        etiquetaBarra.setForeground(new Color(255, 255, 255));
        etiquetaBarra.setText("                           Sistema Control de Cloro - Ingreso al Sistema");
        etiquetaBarra.setOpaque(true);
        etiquetaBarra.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent evt) {
                x = evt.getX();
                y = evt.getY();               
            }
        });
        etiquetaBarra.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent evt) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                setLocation(point.x - x, point.y - y);
            }
        }); 
        etiquetaBarra.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
        jPanel2.add(etiquetaBarra);
        etiquetaBarra.setBounds(3, 3, 536, 20);

        botonMinimizar.setText("-");
        botonMinimizar.setFocusable(false); 
        botonMinimizar.addActionListener((ActionEvent e)->{
            setExtendedState(ICONIFIED);
        });      
        jPanel2.add(botonMinimizar);
        botonMinimizar.setBounds(541, 3, 41, 20);

        botonCerrar.setText("x");
        botonCerrar.setFocusable(false);       
        botonCerrar.addActionListener((ActionEvent e) -> {
            System.exit(0); 
        });        
        jPanel2.add(botonCerrar);
        botonCerrar.setBounds(583, 3, 41, 20);

        imgInicio.setIcon(new ImageIcon(getClass().getResource("/img/images (1).jpg"))); // NOI18N
        jPanel2.add(imgInicio);
        imgInicio.setBounds(10, 60, 200, 310);

        etiquetaInicioSesion.setBackground(new Color(0, 0, 102));
        etiquetaInicioSesion.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaInicioSesion.setForeground(new Color(255, 255, 255));
        etiquetaInicioSesion.setHorizontalAlignment(CENTER);
        etiquetaInicioSesion.setText("Inicio de Sesión con Usuario y Clave ya Creados");
        etiquetaInicioSesion.setOpaque(true);               
        jPanel2.add(etiquetaInicioSesion);
        etiquetaInicioSesion.setBounds(210, 90, 370, 20);

        etiquetaUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaUser.setHorizontalAlignment(CENTER);
        etiquetaUser.setText("Usuario");
        jPanel2.add(etiquetaUser);
        etiquetaUser.setBounds(190, 130, 370, 20);

        etiquetaPass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPass.setHorizontalAlignment(CENTER);
        etiquetaPass.setText("Contraseña");
        jPanel2.add(etiquetaPass);
        etiquetaPass.setBounds(190, 200, 360, 14);

        txt_Pass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Pass.setHorizontalAlignment(CENTER);
        txt_Pass.setBorder(null); 
        txt_Pass.addActionListener(new ActBtnEntrar());
        txt_Pass.addKeyListener(new AccTxt());       
        jPanel2.add(txt_Pass);
        txt_Pass.setBounds(290, 230, 180, 20);

        txt_User.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_User.setHorizontalAlignment(CENTER);
        txt_User.setBorder(null);
        txt_User.addActionListener(new ActBtnEntrar());
        txt_User.addKeyListener(new AccTxt());       
        jPanel2.add(txt_User);
        txt_User.setBounds(290, 160, 180, 20);

        adornoTxtPass.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel2.add(adornoTxtPass);
        adornoTxtPass.setBounds(280, 220, 200, 40);
        jPanel2.add(separador);
        separador.setBounds(230, 330, 340, 10);

        icono6.setIcon(new ImageIcon(getClass().getResource("/img/1logo.png"))); // NOI18N
        jPanel2.add(icono6);
        icono6.setBounds(490, 400, 110, 34);

        icono5.setIcon(new ImageIcon(getClass().getResource("/img/2logo.png"))); // NOI18N
        jPanel2.add(icono5);
        icono5.setBounds(430, 390, 40, 40);

        icono4.setIcon(new ImageIcon(getClass().getResource("/img/4logo.png"))); // NOI18N
        jPanel2.add(icono4);
        icono4.setBounds(340, 390, 60, 40);

        icono3.setIcon(new ImageIcon(getClass().getResource("/img/5logo.png"))); // NOI18N
        jPanel2.add(icono3);
        icono3.setBounds(260, 400, 70, 30);

        icono2.setIcon(new ImageIcon(getClass().getResource("/img/6logo.png"))); // NOI18N
        jPanel2.add(icono2);
        icono2.setBounds(170, 390, 80, 50);

        icono1.setIcon(new ImageIcon(getClass().getResource("/img/7logo.png"))); // NOI18N
        jPanel2.add(icono1);
        icono1.setBounds(60, 410, 90, 29);

        adornoTxtUser.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel2.add(adornoTxtUser);
        adornoTxtUser.setBounds(280, 150, 200, 40);

        botonRegistrar.setBackground(new Color(0, 0, 51));
        botonRegistrar.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        botonRegistrar.setForeground(new Color(255, 255, 255));
        botonRegistrar.setText("Registrarse");
        botonRegistrar.addActionListener((ActionEvent e)->{
            Registro registro=(Registro) Instancia.getInstancia("Registro");
            registro.setVisible(true);
            txt_User.requestFocus();
        });
        jPanel2.add(botonRegistrar);
        botonRegistrar.setBounds(300, 350, 160, 35);

        botonEntrar.setBackground(new Color(0, 0, 51));
        botonEntrar.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        botonEntrar.setForeground(new Color(255, 255, 255));
        botonEntrar.setText("Iniciar sesion");
        botonEntrar.addActionListener(new ActBtnEntrar());
        
        jPanel2.add(botonEntrar);
        botonEntrar.setBounds(300, 280, 160, 35);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }    
    
    public void inicioSesion() { 
        boolean aux=true;
        Fachada facade= (Fachada)Instancia.getInstancia("system.Fachada");
        Collection<UsuarioDTO> collUser= facade.BuscarUserPass(txt_User.getText(), String.valueOf(txt_Pass.getPassword()));
       
        if ("".equals((txt_User.getText().toLowerCase())) 
                && "".equals((String.valueOf(txt_Pass.getPassword()).toLowerCase()))) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su usuario y contraseña");
            txt_User.requestFocus();
        }else if ((txt_User.getText().toLowerCase()).equals("")) {
            JOptionPane.showMessageDialog(null, "Se Necesita el Usuario para Ingresar");
            txt_User.requestFocus();
        } else if ((String.valueOf(txt_Pass.getPassword()).toLowerCase()).equals("")) {
            JOptionPane.showMessageDialog(null, "Se Necesita la contraseña para Ingresar");
            txt_Pass.requestFocus();
        }else {
            for(UsuarioDTO dto:collUser){
                if (dto.getEstado().equals("Activo") && 
                       (txt_User.getText().toLowerCase()).equals(dto.getUsuario()) &&
                       (String.valueOf(txt_Pass.getPassword()).toLowerCase()).equals(dto.getPass())) {
                    aux=false;
                    if ("Empleado".equals(dto.getTipo())) {
                       Empleado empleado = (Empleado)Instancia.getInstancia("system.Empleado");
                       empleado.setVisible(true);  
                       empleado.setUser(txt_User.getText().toLowerCase());
                       empleado.setId(dto.getId());
                       this.dispose();
                    } else {
                       Administrador administrador=(Administrador)Instancia.getInstancia("system.Administrador");
                       administrador.setVisible(true);  
                       administrador.setUser(txt_User.getText().toLowerCase());
                       administrador.setId(dto.getId());
                       this.dispose();
                    }
               } else if ((txt_User.getText().toLowerCase()).equals(dto.getUsuario()) &&
                       (String.valueOf(txt_Pass.getPassword()).toLowerCase()).equals(dto.getPass()) && 
                       dto.getEstado().equals("Bloqueado")) {
                   aux=false;
                   JOptionPane.showMessageDialog(null, "Usuario Bloqueado. Comuniquese con su administrador");
                   txt_Pass.setText("");
                   txt_User.setText("");
                   txt_User.requestFocus();
               } 
            }
        }
        if ((txt_User.getText().toLowerCase()).length() > 0 && 
                (String.valueOf(txt_Pass.getPassword()).toLowerCase()).length() > 0 && aux==true) {
                   JOptionPane.showMessageDialog(null, "Usuario ó Contraseña Invalido");
                   txt_Pass.setText("");
                   txt_User.setText("");
                   txt_User.requestFocus();
               } 
    }

    private class ActBtnEntrar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){           
            inicioSesion();         
        }
    }
    
    private class AccTxt implements KeyListener{
        @Override
        public void keyTyped(KeyEvent evt) {            
            char caracter = evt.getKeyChar();
            JTextField aux= (JTextField) evt.getComponent();            
            if (aux.getText().length() == 10 || caracter == ' ') {
                evt.consume();  // ignorar el evento de teclado
            }
        }
        @Override
        public void keyReleased(KeyEvent evt){}
        @Override
        public void keyPressed (KeyEvent evt){}
    }
    
    public static void main(String args[]) {            
         new Login().setVisible(true);        
    }
}

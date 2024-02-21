/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.SwingConstants.*;
import database.*;
/**
 *
 * @author Administrador
 */
public class Registro extends JFrame {
    private JButton boton_Aceptar_Registro;
    private JButton btnCerrar;
    private JLabel etiquetaNombre;
    private JLabel adornotxtPass;
    private JLabel etiquetaRegistro;
    private JLabel iconoBarra;
    private JLabel reglaNombre;
    private JLabel etiquetaBarra;
    private JLabel reglaApellido;
    private JLabel reglaCedula;
    private JLabel reglaUser;
    private JLabel reglaPass;
    private JLabel etiquetaApellido;
    private JLabel etiquetaCedula;
    private JLabel etiquetaUsuario;
    private JLabel etiquetaPass;
    private JLabel adornotxtNombre;
    private JLabel adornotxtUser;
    private JLabel adornotxtCedula;
    private JLabel adornotxtApellido;
    private JPanel jPanel1;
    private JSeparator separador;
    private JSeparator separador2;
    private JTextField txt_Apellido;
    private JTextField txt_Cedula;
    private JTextField txt_Nombre;
    private JPasswordField txt_Pass;
    private JTextField txt_User;
    private int x,y;
    private int fontSize=12;
    
    public Registro() { 
        setUndecorated(true); 
        initComponents();        
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        setSize(388, 450);
        this.setLocationRelativeTo(null);
        setOpacity(0.95f);
        setResizable(false);
    }
    private void initComponents() {        
        jPanel1 = new JPanel(); 
        iconoBarra = new JLabel();        
        etiquetaBarra = new JLabel();
        btnCerrar = new JButton();
        etiquetaRegistro = new JLabel();
        separador = new JSeparator();
        etiquetaNombre = new JLabel();
        etiquetaApellido = new JLabel();
        etiquetaCedula = new JLabel();
        etiquetaUsuario = new JLabel();
        etiquetaPass = new JLabel();
        txt_Nombre = new JTextField();
        txt_Apellido = new JTextField();
        txt_Cedula = new JTextField();
        txt_User = new JTextField();
        txt_Pass = new JPasswordField();
        adornotxtNombre = new JLabel();
        adornotxtApellido = new JLabel();
        adornotxtCedula = new JLabel();
        adornotxtUser = new JLabel();       
        adornotxtPass = new JLabel(); 
        reglaNombre = new JLabel();
        reglaApellido = new JLabel();
        reglaCedula = new JLabel();
        reglaUser = new JLabel();
        reglaPass = new JLabel();
        boton_Aceptar_Registro = new JButton();        
        separador2 = new JSeparator();       

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(10, 10, 10), 2));
        jPanel1.setSize(386, 360);
        jPanel1.setLayout(null);
        
        iconoBarra.setIcon(new ImageIcon(getClass().getResource("/img/3logo.png"))); // NOI18N
        jPanel1.add(iconoBarra);
        iconoBarra.setBounds(3, 3, 74, 20);        
        
        etiquetaBarra.setBackground(new Color(153, 0, 0));
        etiquetaBarra.setForeground(new Color(255, 255, 255));
        etiquetaBarra.setHorizontalAlignment(LEFT);
        etiquetaBarra.setText("                           Sistema Control de Cloro - Registro");
        etiquetaBarra.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
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
        jPanel1.add(etiquetaBarra);
        etiquetaBarra.setBounds(3, 3, 340, 20);
        
        btnCerrar.setText("x");
        btnCerrar.setFocusable(false);
        btnCerrar.addActionListener((ActionEvent e) -> {
            this.dispose();
            txt_Nombre.setText("");
            txt_Apellido.setText("");
            txt_Cedula.setText("");
            txt_User.setText("");
            txt_Pass.setText("");
        }); 
        jPanel1.add(btnCerrar);
        btnCerrar.setBounds(344, 3, 41, 20);        

        etiquetaRegistro.setBackground(new Color(0, 0, 102));
        etiquetaRegistro.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaRegistro.setForeground(new Color(255, 255, 255));
        etiquetaRegistro.setHorizontalAlignment(CENTER);
        etiquetaRegistro.setText("Registro de Nuevo Usuario");
        etiquetaRegistro.setOpaque(true);
        jPanel1.add(etiquetaRegistro);
        etiquetaRegistro.setBounds(43, 40, 300, 20);
        
        jPanel1.add(separador);
        separador.setBounds(43, 70, 300, 10);          
        
        etiquetaNombre.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNombre.setHorizontalAlignment(RIGHT);
        etiquetaNombre.setText("Nombre:");
        jPanel1.add(etiquetaNombre);
        etiquetaNombre.setBounds(50, 110, 70, 20);

        etiquetaApellido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaApellido.setHorizontalAlignment(RIGHT);
        etiquetaApellido.setText("Apellido:");
        jPanel1.add(etiquetaApellido);
        etiquetaApellido.setBounds(20, 160, 100, 20);

        etiquetaCedula.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCedula.setHorizontalAlignment(RIGHT);
        etiquetaCedula.setText("Cedula:");
        jPanel1.add(etiquetaCedula);
        etiquetaCedula.setBounds(30, 210, 90, 20);

        etiquetaUsuario.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaUsuario.setHorizontalAlignment(RIGHT);
        etiquetaUsuario.setText("Usuario:");
        etiquetaUsuario.setHorizontalTextPosition(RIGHT);
        jPanel1.add(etiquetaUsuario);
        etiquetaUsuario.setBounds(50, 260, 70, 20);

        etiquetaPass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPass.setHorizontalAlignment(RIGHT);
        etiquetaPass.setText("Contraseña:");
        etiquetaPass.setHorizontalTextPosition(RIGHT);
        jPanel1.add(etiquetaPass);
        etiquetaPass.setBounds(30, 310, 90, 20);       

        txt_Nombre.setColumns(10);
        txt_Nombre.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Nombre.setHorizontalAlignment(JTextField.CENTER);
        txt_Nombre.setBorder(null); 
        txt_Nombre.addActionListener(new ActBtnEntrar());
        txt_Nombre.addKeyListener(new AccionesTxt());
        jPanel1.add(txt_Nombre);
        txt_Nombre.setBounds(130, 110, 180, 20);
        
        txt_Apellido.setColumns(10);
        txt_Apellido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Apellido.setHorizontalAlignment(CENTER);
        txt_Apellido.setBorder(null);  
        txt_Apellido.addActionListener(new ActBtnEntrar());
        txt_Apellido.addKeyListener(new AccionesTxt());
        jPanel1.add(txt_Apellido);
        txt_Apellido.setBounds(130, 160, 180, 20);

        txt_Cedula.setColumns(10);
        txt_Cedula.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Cedula.setHorizontalAlignment(CENTER);
        txt_Cedula.setBorder(null); 
        txt_Cedula.addActionListener(new ActBtnEntrar());
        txt_Cedula.addKeyListener(new AccionesTxt());
        jPanel1.add(txt_Cedula);
        txt_Cedula.setBounds(130, 210, 180, 20);

        txt_User.setColumns(10);
        txt_User.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_User.setHorizontalAlignment(CENTER);
        txt_User.setBorder(null); 
        txt_User.addActionListener(new ActBtnEntrar());
        txt_User.addKeyListener(new AccionesTxt());
        jPanel1.add(txt_User);
        txt_User.setBounds(130, 260, 170, 20);

        txt_Pass.setColumns(10);
        txt_Pass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Pass.setHorizontalAlignment(CENTER);
        txt_Pass.setBorder(null);   
        txt_Pass.addActionListener(new ActBtnEntrar());
        txt_Pass.addKeyListener(new AccionesTxt());
        jPanel1.add(txt_Pass);
        txt_Pass.setBounds(130, 310, 180, 20);


        adornotxtNombre.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        adornotxtNombre.setText("jLabel6");
        jPanel1.add(adornotxtNombre);
        adornotxtNombre.setBounds(120, 100, 200, 40);
        
        adornotxtApellido.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel1.add(adornotxtApellido);
        adornotxtApellido.setBounds(120, 150, 197, 40);

        adornotxtCedula.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel1.add(adornotxtCedula);
        adornotxtCedula.setBounds(120, 200, 200, 40);
        
        adornotxtUser.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel1.add(adornotxtUser);
        adornotxtUser.setBounds(120, 250, 200, 40);     

        adornotxtPass.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        jPanel1.add(adornotxtPass);
        adornotxtPass.setBounds(120, 300, 200, 40);        
        
        reglaNombre.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        reglaNombre.setForeground(new Color(102, 0, 0));
        reglaNombre.setHorizontalAlignment(CENTER);
        reglaNombre.setText("*");
        reglaNombre.setToolTipText("El campo no puede estar vacio");
        jPanel1.add(reglaNombre);
        reglaNombre.setBounds(320, 115, 10, 20);

        reglaApellido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        reglaApellido.setForeground(new Color(102, 0, 0));
        reglaApellido.setHorizontalAlignment(CENTER);
        reglaApellido.setText("*");
        reglaApellido.setToolTipText("El campo no puede estar vacio");
        jPanel1.add(reglaApellido);
        reglaApellido.setBounds(320, 165, 10, 20);

        reglaCedula.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        reglaCedula.setForeground(new Color(102, 0, 0));
        reglaCedula.setHorizontalAlignment(CENTER);
        reglaCedula.setText("*");
        reglaCedula.setToolTipText("El campo no puede estar vacio");
        jPanel1.add(reglaCedula);
        reglaCedula.setBounds(320, 215, 10, 20);

        reglaUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        reglaUser.setForeground(new Color(102, 0, 0));
        reglaUser.setHorizontalAlignment(CENTER);
        reglaUser.setText("*");
        reglaUser.setToolTipText("El campo no puede estar vacio");
        jPanel1.add(reglaUser);
        reglaUser.setBounds(320, 265, 10, 20);

        reglaPass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        reglaPass.setForeground(new Color(102, 0, 0));
        reglaPass.setHorizontalAlignment(CENTER);
        reglaPass.setText("*");
        reglaPass.setToolTipText("El campo no puede estar vacio");
        jPanel1.add(reglaPass);
        reglaPass.setBounds(320, 315, 10, 20);       
        
        boton_Aceptar_Registro.setBackground(new Color(0, 0, 51));
        boton_Aceptar_Registro.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        boton_Aceptar_Registro.setForeground(new Color(255, 255, 255));
        boton_Aceptar_Registro.setText("Aceptar"); 
        boton_Aceptar_Registro.addActionListener(new ActBtnEntrar());
        jPanel1.add(boton_Aceptar_Registro);
        boton_Aceptar_Registro.setBounds(113, 360, 160, 29);
        
        jPanel1.add(separador2);
        separador2.setBounds(43, 400, 300, 10);

        getContentPane().add(jPanel1, BorderLayout.CENTER);
        setUndecorated(true);

        pack();
    }
    
    public static int validarRegistro(JTextField txt_Nombre,JTextField txt_Apellido,
            JTextField txt_Cedula,JTextField txt_User,JTextField txt_Pass,
            String operacion,int id,String user,String cedula) {
        int aux=0;
        Fachada facade= (Fachada)Instancia.getInstancia("Fachada");
        Collection<UsuarioDTO> collUser= facade.BuscarUserCedula(txt_User.getText(), txt_Cedula.getText());
        
        if (txt_Nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
            aux=1;
        } else if (txt_Apellido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El apellido no puede estar vacio");
            aux=1;
        } else if (txt_Cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La cedula no puede estar vacio");
            aux=1;
        } else if (txt_User.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El usuario no puede estar vacio");
            aux=1;
        } else if (txt_Pass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacio");
            aux=1;
        } else {            
            for(UsuarioDTO dto:collUser){
                if ((txt_User.getText().toLowerCase()).equals(dto.getUsuario()) &&
                        operacion.equals("registrar") ||                       
                    txt_Cedula.getText().equals(dto.getCedula()) &&
                        operacion.equals("registrar")) {
                    aux=2;                   
                }
                if (txt_Cedula.getText().equals(dto.getCedula())&& 
                        !cedula.equals(txt_Cedula.getText())&&
                        operacion.equals("actualizar")) {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese numero de cedula");
                    aux=2;
                    break;
                }else if ((txt_User.getText().toLowerCase()).equals(dto.getUsuario()) &&
                        !user.equals(txt_User.getText().toLowerCase()) &&
                        operacion.equals("actualizar")) {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe");
                    aux=3;
                    break;
                }
            } 
            if (aux==0 && operacion.equals("registrar")){
                facade.registrarUser(txt_Nombre.getText(),txt_Apellido.getText(),
                      txt_Cedula.getText(),txt_User.getText(),txt_Pass.getText()); 
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_Cedula.setText("");
                txt_User.setText("");
                txt_Pass.setText("");
            }
            if (aux==0 && operacion.equals("actualizar")){
                facade.actualizarUsuario(id,txt_Nombre.getText(),txt_Apellido.getText(),
                      txt_Cedula.getText(),txt_User.getText(),txt_Pass.getText()); 
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_Cedula.setText("");
                txt_User.setText("");
                txt_Pass.setText("");
            }
        }
        return aux;
    }
     
    private class ActBtnEntrar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){ 
            int aux=validarRegistro(txt_Nombre,txt_Apellido,txt_Cedula,txt_User,
                    txt_Pass,"registrar",0,"","");
            if(aux==0){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");    
                dispose();
            }else if(aux==2)
                JOptionPane.showMessageDialog(null, "Usuario/Cedula ya Existe");
                txt_Cedula.requestFocus();
        }
    }
     
    private class AccionesTxt implements KeyListener{
        @Override
        public void keyTyped(KeyEvent evt) {  
           if(evt.getSource()==txt_Nombre||evt.getSource()== txt_Apellido){
                 char caracter = evt.getKeyChar();
                JTextField aux= (JTextField) evt.getComponent();    
                if ((caracter < 'a' || caracter > 'z' && caracter != 'ñ') && 
                    (caracter < 'A' || caracter > 'Z') || 
                    aux.getText().length() == 10) {
                    evt.consume();  // ignorar el evento de teclado
                 }
            }
            if(evt.getSource()==txt_Cedula){
                char caracter = evt.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') ||
                    txt_Cedula.getText().length() == 8) {
                    evt.consume();  // ignorar el evento de teclado
                }
            }
            if(evt.getSource()==txt_User||evt.getSource()== txt_Pass){
                char caracter = evt.getKeyChar();
                JTextField aux= (JTextField) evt.getComponent();            
                if (aux.getText().length() == 10 || caracter == ' ') {
                    evt.consume();  // ignorar el evento de teclado
                }
            }            
        }
        @Override
        public void keyReleased(KeyEvent evt){}
        @Override
        public void keyPressed (KeyEvent evt){}
    } 
}

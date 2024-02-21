/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.SwingConstants.*;
import database.*;
/**
 *
 * @author Administrador
 */
public class Empleado extends JFrame {    
    protected JPanel panelCentral;
    protected JLabel imgFondo;
    
    protected JPanel panelCabecera;
    private JLabel iconoBarra;
    private JLabel etiquetaBarra;
    private JButton btnMinimizar;
    private JButton btnCerrar;
    private JLabel usuario;
    private JLabel fecha;
    private JLabel hora;
    private JLabel adornoDatos;
   
    protected JPanel panelMenu;
    protected JLabel fondoPanelMenu;
    private JLabel etiquetaServicios;
    private JSeparator separador;
    protected JButton btnPrincipal;
    protected JButton btnNivelActual;
    protected JButton btnCloroUsado;
    protected JButton btnCloroRecibido;
    protected JButton btnSeguridad;
    protected JButton btnSalir;
    
    protected JPanel panelBienvenido;
    private JLabel iconoBienvenido;
    private JLabel imgFondoBienvenido;
    
    protected JPanel panelNivelActual;
    private JLabel etiquetaNivelActual;
    protected JLabel etiqueta_cloro_actual;
    protected JProgressBar indicNivel;
    protected JLabel etiquetaCapacidad;
    
    protected JPanel panelCloroUsado;
    private JLabel etiquetaCloroUsado;
    private JLabel etiquetaGasto;
    private JTextField entradaGasto;
    private JLabel adornoEntrada;
    private JButton botonGasto;
    
    protected JPanel panelCloroRecibido;
    private JLabel etiquetaCloroRecibido;
    private JLabel etiquetaSelecDistrib;
    protected JComboBox<String> listaDistrib;
    private JLabel etiquetaPedido;
    private JTextField entradaPedido;
    private JLabel adornoPedido;    
    private JLabel etiquetaCapMax; 
    private JButton btnIngreso;
   
    protected JPanel panelSeguridad;
    private JLabel etiquetaSeguridad;
    protected JLabel etiquetaDatos;
    protected JLabel etiquetaNombre;
    protected JLabel etiquetaApellido;   
    protected JLabel etiquetaCedula;
    protected JLabel etiquetaUser;
    protected JLabel etiquetaPass; 
    public JLabel nombreUser;
    public JLabel apellidoUser;
    public JLabel cedulaUser;
    public JLabel User;
    public JLabel passUser; 
    protected JButton btnActualizar;
    
    protected JPanel panelActuDatos;
    private JLabel etiquetaActuDatos;
    private JLabel etiquetaNombre1;
    private JLabel etiquetaApellido1 ;
    private JLabel etiquetaCedula1 ;
    private JLabel etiquetaUser1 ;
    private JLabel etiquetaPass1 ;
    private JTextField txt_Nombre;
    private JTextField txt_Apellido;
    private JTextField txt_Cedula;
    private JTextField txt_User;
    private JPasswordField txt_Pass;    
    private JLabel adornoTxtNombre;
    private JLabel adornoTxtApellido;
    private JLabel adornoTxtCedula;
    private JLabel adornoTxtUser;
    private JLabel adornoTxtPass;
    private JButton botonAceptarActu;
    protected JButton botonCancelarActu;
    
    protected Fachada facade= (Fachada)Instancia.getInstancia("system.Fachada");
    protected final DefaultComboBoxModel<String> modeloListDistrib = new DefaultComboBoxModel<String>();
    private final Calendar calendario = new GregorianCalendar(); 
    private String hour, minutos, dia, mes, annio;
    int x, y,id;
    private int fontSize=12;

    public Empleado() {
        setUndecorated(true);
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(940,528);
        setResizable(false);
        setFechaHora();        
        panelNivelActual.setVisible(false);
        panelCloroUsado.setVisible(false);
        panelCloroRecibido.setVisible(false);
        panelActuDatos.setVisible(false);
        panelSeguridad.setVisible(false); 
        this.setLocationRelativeTo(null);
    }    
    
    private void initComponents() {

        panelCabecera = new JPanel();
        btnCerrar = new JButton();
        btnMinimizar = new JButton();
        iconoBarra = new JLabel();
        etiquetaBarra = new JLabel();
        fecha = new JLabel();
        usuario = new JLabel();
        hora = new JLabel();
        adornoDatos = new JLabel();
        
        panelMenu = new JPanel();
        fondoPanelMenu = new JLabel();
        etiquetaServicios = new JLabel();
        separador = new JSeparator();
        btnPrincipal = new JButton();
        btnNivelActual = new JButton();
        btnCloroUsado = new JButton();
        btnCloroRecibido = new JButton();
        btnSeguridad = new JButton();
        btnSalir = new JButton();
         
        panelCentral = new JPanel();
        imgFondo = new JLabel();
          
        panelBienvenido = new JPanel();
        imgFondoBienvenido = new JLabel();
        iconoBienvenido = new JLabel();
        
        panelNivelActual = new JPanel();
        etiqueta_cloro_actual = new JLabel();
        indicNivel = new JProgressBar();
        etiquetaNivelActual = new JLabel();
        etiquetaCapacidad = new JLabel();
        
        panelCloroUsado = new JPanel();
        etiquetaGasto = new JLabel();
        entradaGasto = new JTextField();
        adornoEntrada = new JLabel();
        botonGasto = new JButton();
        etiquetaCloroUsado = new JLabel();
        
        panelCloroRecibido = new JPanel();
        etiquetaCloroRecibido = new JLabel();
        etiquetaSelecDistrib = new JLabel();
        listaDistrib = new JComboBox<>();
        etiquetaPedido = new JLabel();
        entradaPedido = new JTextField();
        adornoPedido = new JLabel();
        etiquetaCapMax = new JLabel();
        btnIngreso = new JButton();
        
        panelSeguridad = new JPanel();
        etiquetaSeguridad = new JLabel();
        etiquetaDatos = new JLabel();
        nombreUser = new JLabel();
        apellidoUser = new JLabel();
        cedulaUser = new JLabel();
        User = new JLabel();
        passUser = new JLabel();        
        etiquetaNombre = new JLabel();
        etiquetaApellido = new JLabel();
        etiquetaCedula = new JLabel();
        etiquetaUser = new JLabel();
        etiquetaPass = new JLabel();
        btnActualizar = new JButton();       
        
        panelActuDatos = new JPanel();
        etiquetaActuDatos = new JLabel();
        txt_Nombre = new JTextField();
        txt_Apellido = new JTextField();
        txt_Cedula = new JTextField();
        txt_User = new JTextField();
        txt_Pass = new JPasswordField();
        etiquetaNombre1 = new JLabel();
        etiquetaApellido1  = new JLabel();
        etiquetaCedula1  = new JLabel();
        etiquetaUser1  = new JLabel();
        etiquetaPass1  = new JLabel();
        adornoTxtNombre = new JLabel();
        adornoTxtApellido = new JLabel();
        adornoTxtCedula = new JLabel();
        adornoTxtUser = new JLabel();
        adornoTxtPass = new JLabel();
        botonAceptarActu = new JButton();
        botonCancelarActu = new JButton();
        
        panelCabecera.setBackground(new Color(255, 255, 255));
        panelCabecera.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, new Color(0, 0, 0)));
        panelCabecera.setSize(938, 55);
        panelCabecera.setLayout(null);
        
        iconoBarra.setIcon(new ImageIcon(getClass().getResource("/img/3logo.png"))); // NOI18N
        panelCabecera.add(iconoBarra);
        iconoBarra.setBounds(2, 2, 74, 20);

        etiquetaBarra.setBackground(new Color(153, 0, 0));
        etiquetaBarra.setForeground(new Color(255, 255, 255));
        etiquetaBarra.setHorizontalAlignment(LEFT);
        etiquetaBarra.setText("                           Sistema Control de Cloro - Ventana Principal");
        etiquetaBarra.setHorizontalTextPosition(CENTER);
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
        panelCabecera.add(etiquetaBarra);
        etiquetaBarra.setBounds(2, 2, 852, 20);
        
        btnMinimizar.setText("-");
        btnMinimizar.setFocusable(false);
        btnMinimizar.setSize(35, 20);  
        btnMinimizar.addActionListener((ActionEvent e)->{
            setExtendedState(ICONIFIED);
        });
        panelCabecera.add(btnMinimizar);
        btnMinimizar.setBounds(855, 2, 41, 20);

        btnCerrar.setText("x");
        btnCerrar.setFocusable(false);
        btnCerrar.setSize(35, 20);  
        btnCerrar.addActionListener(new AccionesBtns ());
        panelCabecera.add(btnCerrar);
        btnCerrar.setBounds(897, 2, 41, 20);       

        fecha.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        fecha.setForeground(new Color(255, 255, 255));
        fecha.setHorizontalAlignment(CENTER);
        fecha.setText("fecha");
        panelCabecera.add(fecha);
        fecha.setBounds(690, 30, 140, 16);

        usuario.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        usuario.setForeground(new Color(255, 255, 255));
        usuario.setHorizontalAlignment(CENTER);
        usuario.setText("usuario");
        panelCabecera.add(usuario);
        usuario.setBounds(590, 30, 100, 16);

        hora.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        hora.setForeground(new Color(255, 255, 255));
        hora.setHorizontalAlignment(CENTER);
        hora.setText("hora");
        panelCabecera.add(hora);
        hora.setBounds(830, 30, 90, 16);

        adornoDatos.setBackground(new Color(0, 0, 0));
        adornoDatos.setOpaque(true);
        panelCabecera.add(adornoDatos);
        adornoDatos.setBounds(2, 23, 936, 30);

        getContentPane().add(panelCabecera, BorderLayout.CENTER);

        panelMenu.setBackground(new Color(255, 255, 255));
        panelMenu.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, new Color(0, 0, 0)));
        panelMenu.setSize(206, 526);
        panelMenu.setLayout(null);         
             
        etiquetaServicios.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N        
        etiquetaServicios.setForeground(new Color(255, 255, 255));
        etiquetaServicios.setHorizontalAlignment(CENTER);
        etiquetaServicios.setText("Servicios");
        panelMenu.add(etiquetaServicios);
        etiquetaServicios.setBounds(53, 73, 100, 20);
        
        panelMenu.add(separador);
        separador.setBounds(38, 95, 130, 10);   
        
        btnPrincipal.setBackground(new Color(102, 0, 0));
        btnPrincipal.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnPrincipal.setForeground(new Color(255, 255, 255));
        btnPrincipal.setText("Principal");  
        btnPrincipal.addActionListener(new AccionesBtns());
        panelMenu.add(btnPrincipal);
        btnPrincipal.setBounds(6, 145, 193, 40);
        
        btnNivelActual.setBackground(new Color(102, 0, 0));
        btnNivelActual.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnNivelActual.setForeground(new Color(255, 255, 255));
        btnNivelActual.setText("Nivel Actual"); 
        btnNivelActual.addActionListener(new AccionesBtns());
        panelMenu.add(btnNivelActual);
        btnNivelActual.setBounds(6, 205, 193, 40);        

        btnCloroUsado.setBackground(new Color(102, 0, 0));
        btnCloroUsado.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnCloroUsado.setForeground(new Color(255, 255, 255));
        btnCloroUsado.setText("Cloro Usado"); 
        btnCloroUsado.addActionListener(new AccionesBtns());
        panelMenu.add(btnCloroUsado);
        btnCloroUsado.setBounds(6, 265, 193, 40);
        
        btnCloroRecibido.setBackground(new Color(102, 0, 0));
        btnCloroRecibido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnCloroRecibido.setForeground(new Color(255, 255, 255));
        btnCloroRecibido.setText("Cloro Recibido"); 
        btnCloroRecibido.addActionListener(new AccionesBtns());
        panelMenu.add(btnCloroRecibido);
        btnCloroRecibido.setBounds(6, 325, 193, 40);

        btnSeguridad.setBackground(new Color(102, 0, 0));
        btnSeguridad.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnSeguridad.setForeground(new Color(255, 255, 255));
        btnSeguridad.setText("Seguridad");     
        btnSeguridad.addActionListener(new AccionesBtns());
        panelMenu.add(btnSeguridad);
        btnSeguridad.setBounds(6, 385, 193, 40);        

        btnSalir.setBackground(new Color(102, 0, 0));
        btnSalir.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnSalir.setForeground(new Color(255, 255, 255));
        btnSalir.setText("Salir");    
        btnSalir.addActionListener(new AccionesBtns());
        panelMenu.add(btnSalir);
        btnSalir.setBounds(6, 445, 193, 40);
        
        fondoPanelMenu.setBackground(new Color(0, 0, 0));
        fondoPanelMenu.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        fondoPanelMenu.setOpaque(true);
        panelMenu.add(fondoPanelMenu);
        fondoPanelMenu.setBounds(2, 55, 202, 471);  
        
        getContentPane().add(panelMenu, BorderLayout.CENTER);

        panelCentral.setBackground(new Color(255, 255, 255));
        panelCentral.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(0, 0, 0)));
        panelCentral.setSize(914, 473);
        panelCentral.setLayout(null);

        panelBienvenido.setOpaque(false);
        panelBienvenido.setSize(914, 473);
        panelBienvenido.setLayout(null);

        iconoBienvenido.setBackground(new Color(102, 0, 0));
        iconoBienvenido.setFont(new Font("Modern No. 20", 0, 38)); // NOI18N
        iconoBienvenido.setForeground(new Color(255, 255, 255));
        iconoBienvenido.setHorizontalAlignment(CENTER);
        iconoBienvenido.setText("Bienvenido");
        iconoBienvenido.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        iconoBienvenido.setOpaque(true);
        panelBienvenido.add(iconoBienvenido);
        iconoBienvenido.setBounds(190, 50, 300, 54);        
        
        imgFondoBienvenido.setIcon(new ImageIcon(getClass().getResource("/img/agua fondo 10.png"))); // NOI18N
        imgFondoBienvenido.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        imgFondoBienvenido.setSize(0, 0);
        panelBienvenido.add(imgFondoBienvenido);
        imgFondoBienvenido.setBounds(0, 0, 730, 470);

        panelCentral.add(panelBienvenido);
        panelBienvenido.setBounds(204, 55, 730, 470);        
        
        panelNivelActual.setOpaque(false);
        panelNivelActual.setSize(914, 473);
        panelNivelActual.setLayout(null);
        
        etiquetaNivelActual.setBackground(new Color(102, 0, 0));
        etiquetaNivelActual.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNivelActual.setForeground(new Color(255, 255, 255));
        etiquetaNivelActual.setHorizontalAlignment(CENTER);
        etiquetaNivelActual.setText("Nivel Actual");
        etiquetaNivelActual.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaNivelActual.setOpaque(true);
        panelNivelActual.add( etiquetaNivelActual);
        etiquetaNivelActual.setBounds(300, 20, 130, 20);

        etiqueta_cloro_actual.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiqueta_cloro_actual.setForeground(new Color(255, 255, 255));
        etiqueta_cloro_actual.setHorizontalAlignment(CENTER);
        etiqueta_cloro_actual.setText("Cantidad de Cloro Actual ");
        etiqueta_cloro_actual.setMaximumSize(new Dimension(499, 20));
        etiqueta_cloro_actual.setMinimumSize(new Dimension(0, 20));
        etiqueta_cloro_actual.setPreferredSize(new Dimension(60, 20));
        panelNivelActual.add(etiqueta_cloro_actual);
        etiqueta_cloro_actual.setBounds(260, 150, 210, 30);

        indicNivel.setMaximum(2721);
        indicNivel.setValue(12);
        panelNivelActual.add(indicNivel);
        indicNivel.setBounds(165, 190, 400, 60);

        etiquetaCapacidad.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCapacidad.setForeground(new Color(255, 255, 255));
        etiquetaCapacidad.setHorizontalAlignment(CENTER);
        etiquetaCapacidad.setText("capacidad");
        etiquetaCapacidad.setHorizontalTextPosition(CENTER);
        panelNivelActual.add( etiquetaCapacidad);
        etiquetaCapacidad.setBounds(220, 300, 290, 20);
        
        panelCentral.add(panelNivelActual);
        panelNivelActual.setBounds(204, 55, 730, 470);

        panelCloroUsado.setOpaque(false);
        panelCloroUsado.setSize(914, 473);
        panelCloroUsado.setLayout(null);
        
        etiquetaCloroUsado.setBackground(new Color(102, 0, 0));
        etiquetaCloroUsado.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCloroUsado.setForeground(new Color(255, 255, 255));
        etiquetaCloroUsado.setHorizontalAlignment(CENTER);
        etiquetaCloroUsado.setText("Cloro Usado");
        etiquetaCloroUsado.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaCloroUsado.setOpaque(true);
        panelCloroUsado.add(etiquetaCloroUsado);
        etiquetaCloroUsado.setBounds(300, 20, 130, 20);

        etiquetaGasto.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaGasto.setForeground(new Color(255, 255, 255));
        etiquetaGasto.setHorizontalAlignment(CENTER);
        etiquetaGasto.setText("Ingrese la Cantidad de Cloro Usado al Dia (kg)");
        panelCloroUsado.add(etiquetaGasto);
        etiquetaGasto.setBounds(198, 150, 334, 30);

        entradaGasto.setColumns(10);
        entradaGasto.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        entradaGasto.setHorizontalAlignment(CENTER);
        entradaGasto.setBorder(null);
        entradaGasto.addActionListener(new AccionesBtns());
        entradaGasto.addKeyListener(new AccionesTxt());
        panelCloroUsado.add(entradaGasto);
        entradaGasto.setBounds(275, 220, 180, 20);

        adornoEntrada.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelCloroUsado.add(adornoEntrada);
        adornoEntrada.setBounds(266, 215, 198, 34);

        botonGasto.setBackground(new Color(102, 0, 0));
        botonGasto.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        botonGasto.setForeground(new Color(255, 255, 255));
        botonGasto.setText("Aceptar"); 
        botonGasto.addActionListener(new AccionesBtns());
        panelCloroUsado.add( botonGasto);
        botonGasto.setBounds(315, 315, 100, 29);

        panelCentral.add(panelCloroUsado);
        panelCloroUsado.setBounds(204, 55, 730, 470);   

        panelCloroRecibido.setOpaque(false);
        panelCloroRecibido.setSize(750, 400);
        panelCloroRecibido.setLayout(null);

        etiquetaCloroRecibido.setBackground(new Color(102, 0, 0));
        etiquetaCloroRecibido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCloroRecibido.setForeground(new Color(255, 255, 255));
        etiquetaCloroRecibido.setHorizontalAlignment(CENTER);
        etiquetaCloroRecibido.setText("Cloro Recibido");
        etiquetaCloroRecibido.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaCloroRecibido.setHorizontalTextPosition(CENTER);
        etiquetaCloroRecibido.setOpaque(true);
        panelCloroRecibido.add(etiquetaCloroRecibido);
        etiquetaCloroRecibido.setBounds(295, 20, 140, 20);

        etiquetaSelecDistrib.setBackground(new Color(102, 0, 0));
        etiquetaSelecDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaSelecDistrib.setForeground(new Color(255, 255, 255));
        etiquetaSelecDistrib.setHorizontalAlignment(CENTER);
        etiquetaSelecDistrib.setText("Seleccione el distribuidor");
        etiquetaSelecDistrib.setOpaque(true);
        panelCloroRecibido.add(etiquetaSelecDistrib);
        etiquetaSelecDistrib.setBounds(30, 210, 200, 30);

        listaDistrib.setBackground(new Color(102, 0, 0));
        listaDistrib.setForeground(new Color(255, 255, 255));
        listaDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        listaDistrib.setMaximumRowCount(5);
        listaDistrib.setModel(new DefaultComboBoxModel<>());
        listaDistrib.setSelectedIndex(-1);
        listaDistrib.setAutoscrolls(true);  
        listaDistrib.addItemListener((ItemEvent e) -> {
            String item = (String) modeloListDistrib.getSelectedItem();
            Collection<DistribuidoresDTO> collDistrib;
            collDistrib = facade.consultarDistribidor(item);
            for(DistribuidoresDTO dto:collDistrib){
                etiquetaPedido.setText("Ingrese la cantidad de cloro recibida por el distribuidor " + dto.getNombre() + " (kg)");
                etiquetaCapMax.setText("maximo " + dto.getCapacidad());
            }
        });
        panelCloroRecibido.add(listaDistrib);
        listaDistrib.setBounds(70, 260, 130, 30);

        etiquetaPedido.setBackground(new Color(255, 255, 255));
        etiquetaPedido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPedido.setForeground(new Color(255, 255, 255));
        etiquetaPedido.setHorizontalAlignment(CENTER);
        etiquetaPedido.setText("Debe ingresar distribuidores");
        panelCloroRecibido.add(etiquetaPedido);
        etiquetaPedido.setBounds(150, 160, 580, 30);

        entradaPedido.setColumns(10);
        entradaPedido.setFont(new java.awt.Font("Modern No. 20", 0, 16)); // NOI18N
        entradaPedido.setHorizontalAlignment(CENTER);
        entradaPedido.setBorder(null);  
        entradaPedido.addKeyListener(new AccionesTxt());
        entradaPedido.addActionListener(new AccionesBtns());
        panelCloroRecibido.add(entradaPedido);
        entradaPedido.setBounds(340, 220, 180, 18);

        adornoPedido.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelCloroRecibido.add(adornoPedido);
        adornoPedido.setBounds(330, 210, 197, 34);

        etiquetaCapMax.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCapMax.setForeground(new Color(255, 255, 255));
        etiquetaCapMax.setText("maximo 1000");
        panelCloroRecibido.add(etiquetaCapMax);
        etiquetaCapMax.setBounds(540, 210, 140, 30);

        btnIngreso.setBackground(new Color(102, 0, 0));
        btnIngreso.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnIngreso.setForeground(new Color(255, 255, 255));
        btnIngreso.setText("Aceptar");  
        btnIngreso.addActionListener(new AccionesBtns());
        panelCloroRecibido.add(btnIngreso);
        btnIngreso.setBounds(390, 260, 92, 29);

        panelCentral.add(panelCloroRecibido);
        panelCloroRecibido.setBounds(204, 55, 730, 470);

        panelSeguridad.setOpaque(false);
        panelSeguridad.setSize(630, 390);
        panelSeguridad.setLayout(null);
        
        etiquetaSeguridad.setBackground(new Color(102, 0, 0));
        etiquetaSeguridad.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaSeguridad.setForeground(new Color(255, 255, 255));
        etiquetaSeguridad.setHorizontalAlignment(CENTER);
        etiquetaSeguridad.setText("Seguridad");
        etiquetaSeguridad.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaSeguridad.setOpaque(true);
        panelSeguridad.add(etiquetaSeguridad);
        etiquetaSeguridad.setBounds(310, 20, 110, 20);
        
        etiquetaDatos.setBackground(new Color(102, 0, 0));
        etiquetaDatos.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaDatos.setForeground(new Color(255, 255, 255));
        etiquetaDatos.setHorizontalAlignment(CENTER);
        etiquetaDatos.setText("Datos del usuario");
        etiquetaDatos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaDatos.setOpaque(true);
        panelSeguridad.add(etiquetaDatos);
        etiquetaDatos.setBounds(130, 170, 500, 20);
        
        etiquetaNombre.setBackground(new Color(102, 0, 0));
        etiquetaNombre.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNombre.setForeground(new Color(255, 255, 255));
        etiquetaNombre.setHorizontalAlignment(CENTER);
        etiquetaNombre.setText("Nombre");
        etiquetaNombre.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaNombre.setOpaque(true);
        panelSeguridad.add(etiquetaNombre);
        etiquetaNombre.setBounds(131, 200, 97, 22);

        etiquetaApellido.setBackground(new Color(102, 0, 0));
        etiquetaApellido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaApellido.setForeground(new Color(255, 255, 255));
        etiquetaApellido.setHorizontalAlignment(CENTER);
        etiquetaApellido.setText("Apellido");
        etiquetaApellido.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaApellido.setOpaque(true);
        panelSeguridad.add(etiquetaApellido);
        etiquetaApellido.setBounds(231, 200, 97, 22);

        etiquetaCedula.setBackground(new Color(102, 0, 0));
        etiquetaCedula.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCedula.setForeground(new Color(255, 255, 255));
        etiquetaCedula.setHorizontalAlignment(CENTER);
        etiquetaCedula.setText("Cedula");
        etiquetaCedula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaCedula.setOpaque(true);
        panelSeguridad.add(etiquetaCedula);
        etiquetaCedula.setBounds(331, 200, 97, 22);

        etiquetaUser.setBackground(new Color(102, 0, 0));
        etiquetaUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaUser.setForeground(new Color(255, 255, 255));
        etiquetaUser.setHorizontalAlignment(CENTER);
        etiquetaUser.setText("Usuario");
        etiquetaUser.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaUser.setOpaque(true);
        panelSeguridad.add(etiquetaUser);
        etiquetaUser.setBounds(431, 200, 97, 22);

        etiquetaPass.setBackground(new Color(102, 0, 0));
        etiquetaPass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPass.setForeground(new Color(255, 255, 255));
        etiquetaPass.setHorizontalAlignment(CENTER);
        etiquetaPass.setText("Contraseña");
        etiquetaPass.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaPass.setOpaque(true);
        panelSeguridad.add(etiquetaPass);
        etiquetaPass.setBounds(531, 200, 97, 22);

        nombreUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        nombreUser.setForeground(new Color(255, 255, 255));
        nombreUser.setHorizontalAlignment(CENTER);
        nombreUser.setText("nombre:");
        nombreUser.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(nombreUser);
        nombreUser.setBounds(131, 224, 97, 30);

        apellidoUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        apellidoUser.setForeground(new Color(255, 255, 255));
        apellidoUser.setHorizontalAlignment(CENTER);
        apellidoUser.setText("apellido:");
        apellidoUser.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(apellidoUser);
        apellidoUser.setBounds(231, 224, 97, 30);

        cedulaUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        cedulaUser.setForeground(new Color(255, 255, 255));
        cedulaUser.setHorizontalAlignment(CENTER);
        cedulaUser.setText("cedula");
        cedulaUser.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(cedulaUser);
        cedulaUser.setBounds(331, 224, 97, 30);

        User.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        User.setForeground(new Color(255, 255, 255));
        User.setHorizontalAlignment(CENTER);
        User.setText("usuario");
        User.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(User);
        User.setBounds(431, 224, 97, 30);

        passUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        passUser.setForeground(new Color(255, 255, 255));
        passUser.setHorizontalAlignment(CENTER);
        passUser.setText("contraseña");
        passUser.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(passUser);
        passUser.setBounds(531, 224, 97, 30);

        btnActualizar.setBackground(new Color(102, 0, 0));
        btnActualizar.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        btnActualizar.setForeground(new Color(255, 255, 255));
        btnActualizar.setText("Actualizar"); 
        btnActualizar.addActionListener(new AccionesBtns());
        panelSeguridad.add( btnActualizar);
        btnActualizar.setBounds(310, 330, 130, 29);

        panelCentral.add(panelSeguridad);
        panelSeguridad.setBounds(204, 55, 730, 470);

        panelActuDatos.setOpaque(false);
        panelActuDatos.setSize(400, 450);
        panelActuDatos.setLayout(null);

        etiquetaActuDatos.setBackground(new Color(102, 0, 0));
        etiquetaActuDatos.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaActuDatos.setForeground(new Color(255, 255, 255));
        etiquetaActuDatos.setHorizontalAlignment(CENTER);
        etiquetaActuDatos.setText("Actualizar datos");
        etiquetaActuDatos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaActuDatos.setOpaque(true);
        panelActuDatos.add( etiquetaActuDatos);
        etiquetaActuDatos.setBounds(295, 20, 130, 22);

        etiquetaNombre1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNombre1.setForeground(new Color(255, 255, 255));
        etiquetaNombre1.setHorizontalAlignment(RIGHT);
        etiquetaNombre1.setText("Nombre:");
        panelActuDatos.add(etiquetaNombre1);
        etiquetaNombre1.setBounds(225, 110, 80, 20);

        etiquetaApellido1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaApellido1.setForeground(new Color(255, 255, 255));
        etiquetaApellido1.setHorizontalAlignment(RIGHT);
        etiquetaApellido1.setText("Apellido:");
        panelActuDatos.add(etiquetaApellido1);
        etiquetaApellido1.setBounds(205, 160, 100, 20);

        etiquetaCedula1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCedula1.setForeground(new Color(255, 255, 255));
        etiquetaCedula1.setHorizontalAlignment(RIGHT);
        etiquetaCedula1.setText("Cedula:");
        panelActuDatos.add(etiquetaCedula1);
        etiquetaCedula1.setBounds(215, 210, 90, 20);

        etiquetaUser1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaUser1.setForeground(new Color(255, 255, 255));
        etiquetaUser1.setHorizontalAlignment(RIGHT);
        etiquetaUser1.setText("Usuario:");
        etiquetaUser1.setHorizontalTextPosition(RIGHT);
        panelActuDatos.add(etiquetaUser1);
        etiquetaUser1.setBounds(235, 260, 70, 20);

        etiquetaPass1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPass1.setForeground(new Color(255, 255, 255));
        etiquetaPass1.setHorizontalAlignment(RIGHT);
        etiquetaPass1.setText("Contraseña:");
        etiquetaPass1.setHorizontalTextPosition(RIGHT);
        panelActuDatos.add(etiquetaPass1);
        etiquetaPass1.setBounds(215, 310, 90, 20);
        
        txt_Nombre.setColumns(10);
        txt_Nombre.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Nombre.setHorizontalAlignment(CENTER);
        txt_Nombre.setToolTipText("");
        txt_Nombre.setBorder(null);
        txt_Nombre.addActionListener(new AccionesBtns());
        txt_Nombre.addKeyListener(new AccionesTxt());
        panelActuDatos.add(txt_Nombre);
        txt_Nombre.setBounds(325, 110, 180, 20);

        txt_Apellido.setColumns(10);
        txt_Apellido.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Apellido.setHorizontalAlignment(CENTER);
        txt_Apellido.setToolTipText("");
        txt_Apellido.setBorder(null);  
        txt_Apellido.addActionListener(new AccionesBtns());
        txt_Apellido.addKeyListener(new AccionesTxt());
        panelActuDatos.add(txt_Apellido);
        txt_Apellido.setBounds(325, 160, 180, 20);

        txt_Cedula.setColumns(10);
        txt_Cedula.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Cedula.setHorizontalAlignment(CENTER);
        txt_Cedula.setToolTipText("");
        txt_Cedula.setBorder(null);   
        txt_Cedula.addActionListener(new AccionesBtns());
        txt_Cedula.addKeyListener(new AccionesTxt());
        panelActuDatos.add(txt_Cedula);
        txt_Cedula.setBounds(325, 210, 180, 20);

        txt_User.setColumns(10);
        txt_User.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_User.setHorizontalAlignment(CENTER);
        txt_User.setBorder(null);  
        txt_User.addActionListener(new AccionesBtns());
        txt_User.addKeyListener(new AccionesTxt());
        panelActuDatos.add(txt_User);
        txt_User.setBounds(325, 260, 170, 20);

        txt_Pass.setColumns(10);
        txt_Pass.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Pass.setHorizontalAlignment(CENTER);
        txt_Pass.setBorder(null); 
        txt_Pass.addActionListener(new AccionesBtns());
        txt_Pass.addKeyListener(new AccionesTxt());
        panelActuDatos.add(txt_Pass);
        txt_Pass.setBounds(325, 310, 180, 20);        

        adornoTxtNombre.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        adornoTxtNombre.setText("jLabel6");
        panelActuDatos.add(adornoTxtNombre);
        adornoTxtNombre.setBounds(315, 100, 200, 40);

        adornoTxtApellido.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDatos.add(adornoTxtApellido);
        adornoTxtApellido.setBounds(315, 150, 197, 40);

        adornoTxtCedula.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDatos.add(adornoTxtCedula);
        adornoTxtCedula.setBounds(315, 200, 200, 40);

        adornoTxtUser.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDatos.add(adornoTxtUser);
        adornoTxtUser.setBounds(315, 250, 200, 40);

        adornoTxtPass.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDatos.add(adornoTxtPass);
        adornoTxtPass.setBounds(315, 300, 200, 40);

        botonAceptarActu.setBackground(new Color(102, 0, 0));
        botonAceptarActu.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        botonAceptarActu.setForeground(new Color(255, 255, 255));
        botonAceptarActu.setText("Aceptar");    
        botonAceptarActu.addActionListener(new AccionesBtns());
        panelActuDatos.add(botonAceptarActu);
        botonAceptarActu.setBounds(250, 390, 110, 29);
        
        botonCancelarActu.setBackground(new Color(102, 0, 0));
        botonCancelarActu.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        botonCancelarActu.setForeground(new Color(255, 255, 255));
        botonCancelarActu.setText("Cancelar");    
        botonCancelarActu.addActionListener(new AccionesBtns());
        panelActuDatos.add(botonCancelarActu);
        botonCancelarActu.setBounds(370, 390, 110, 29);

        panelCentral.add(panelActuDatos);        
        panelActuDatos.setBounds(204, 55, 730, 470);

        imgFondo.setIcon(new ImageIcon(getClass().getResource("/img/FondoAzul.png"))); // NOI18N
        imgFondo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        imgFondo.setSize(900, 526);
        panelCentral.add(imgFondo);
        imgFondo.setBounds(204, 55, 734, 471);

        getContentPane().add(panelCentral,BorderLayout.CENTER);

        pack();
    }
    
    public void setUser (String user){
        usuario.setText("Usuario: " + user);
    }
    
    public void setId (int id){
        this.id=id;
    }
     
    public void ingresoGasto() throws Exception{
        Collection<CloroDTO> collCloro= facade.consultaCloro();
        Collection<DistribuidoresDTO> collDistrib= facade.consultarDistribidor();
        if ("".equals(entradaGasto.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un Valor Valido");
        }else if(Float.parseFloat(entradaGasto.getText())==0){
            JOptionPane.showMessageDialog(null, "Valor Nulo");
        }else{
            CloroDTO nuevosDatos;
            for(CloroDTO dto:collCloro){              
                if (!"".equals(entradaGasto.getText()) && 
                        (new BigDecimal(entradaGasto.getText())
                                .compareTo(dto.getCantidadActual()))==1){
                    JOptionPane.showMessageDialog(null, " No existe "
                            + "esa cantidad en la planta");
                }else if (!"".equals(entradaGasto.getText()) && 
                    (new BigDecimal(entradaGasto.getText())
                            .compareTo(dto.getCantidadActual()))<1){
                    nuevosDatos=new CloroDTO ();
                    nuevosDatos.setCantidadActual((dto.getCantidadActual()
                            .subtract (new BigDecimal(entradaGasto.getText()))));
                    nuevosDatos.setCapacidadTotal(dto.getCapacidadTotal());
                    nuevosDatos.setCloroUsado(dto.getCloroUsado()+Float.parseFloat(entradaGasto.getText()));
                    nuevosDatos.setIntentos(dto.getIntentos()+1);
                    facade.ActualizarCloro(nuevosDatos.getCantidadActual(),
                            nuevosDatos.getCapacidadTotal(),
                            nuevosDatos.getCloroUsado(),nuevosDatos.getIntentos());
                    facade.almacenarHistorial(usuario.getText().substring(9),"-" + entradaGasto.getText(),
                            fecha.getText().substring(7), hora.getText().substring(6));
                    JOptionPane.showMessageDialog(null, "Registro Exitoso ");
                    entradaGasto.requestFocus();
                    
                    Alerta alert =(Alerta) Instancia.getInstancia("system.Alerta");
                    for(DistribuidoresDTO dto2:collDistrib){
                        if (nuevosDatos.getCantidadActual().floatValue() <= 
                                ((nuevosDatos.getCloroUsado() / nuevosDatos.getIntentos()) 
                                * dto2.getTiempoRetraso())) {
                            
                            String msj ="  Estimado usuario debe realizarce el pedido "
                            + "inmediatamente al proveedor " + dto2.getNombre().toUpperCase() + " para evitar "
                            + "quedarse sin cloro y  detener el tratamieno de agua";
                            alert.enviarAlerta(msj);  
                            break;
                        } 
                    }                   
                }
            }
        }
        entradaGasto.setText("");
    }
    
    public void ingresoPedido() {
        String item = (String) modeloListDistrib.getSelectedItem();
        Collection<DistribuidoresDTO> collDistrib= facade.consultarDistribidor(item);
        Collection<CloroDTO> collCloro=facade.consultaCloro();  
        if ("".equals(entradaPedido.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un Valor Valido");
        }else if(Float.parseFloat(entradaPedido.getText())==0){
            JOptionPane.showMessageDialog(null, "Valor Nulo");
        }else{
            for(DistribuidoresDTO dto:collDistrib){
                if (!"".equals(entradaPedido.getText())
                        && Float.parseFloat(entradaPedido.getText()) <= dto.getCapacidad()) {
                    for(CloroDTO dto2:collCloro){
                        if((new BigDecimal(entradaPedido.getText()).
                                add(dto2.getCantidadActual())).floatValue()
                                > dto2.getCapacidadTotal()){
                             JOptionPane.showMessageDialog(null, "La Capacidad de Almacenamiento de la Planta es Insuficiente");
                        }else {
                            CloroDTO nuevosDatos;
                            nuevosDatos=new CloroDTO ();
                            nuevosDatos.setCantidadActual((dto2.getCantidadActual()
                                    .add(new BigDecimal(entradaPedido.getText()))));
                            nuevosDatos.setCapacidadTotal(dto2.getCapacidadTotal());
                            nuevosDatos.setCloroUsado(0);
                            nuevosDatos.setIntentos(0);
                            facade.ActualizarCloro(nuevosDatos.getCantidadActual(),
                                    dto2.getCapacidadTotal(),nuevosDatos.getCloroUsado(),
                                    nuevosDatos.getIntentos());
                            facade.almacenarHistorial(usuario.getText().substring(9),
                                "+" + entradaPedido.getText(),fecha.getText().substring(7),
                                    hora.getText().substring(6));  
                            JOptionPane.showMessageDialog(null, "Registro Exitoso"); 
                        }
                    }                    
                } else if (!"".equals(entradaPedido.getText())
                        && Float.parseFloat(entradaPedido.getText()) > dto.getCapacidad()) {
                    JOptionPane.showMessageDialog(null, "El distribuidor " + dto.getNombre() + " no puede suministrar esa Cantidad");
                    entradaPedido.setText("");
                }
            }
        }
        entradaPedido.setText("");
        entradaPedido.requestFocus();
     }
    
    public void setNivelActual() { 
        Collection<CloroDTO> collCloro= facade.consultaCloro();
        for(CloroDTO dto:collCloro){
            indicNivel.setValue(dto.getCantidadActual().intValue());
            indicNivel.setToolTipText(dto.getCantidadActual() + " Kilogramos");
            etiquetaCapacidad.setText("Capacidad total: " + dto.getCapacidadTotal()+ " kilogramos ");
            indicNivel.setMaximum((int)dto.getCapacidadTotal());
        }
        
    }
     
    private void setFechaHora() {
        if (calendario.get(Calendar.HOUR_OF_DAY) < 10) {
            hour = "0" + Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
        } else {
            hour = Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
        }
        if (calendario.get(Calendar.MINUTE) < 10) {
            minutos = "0" + Integer.toString(calendario.get(Calendar.MINUTE));
        } else {
            minutos = Integer.toString(calendario.get(Calendar.MINUTE));
        }

        if (calendario.get(Calendar.DATE) < 10) {
            dia = "0" + Integer.toString(calendario.get(Calendar.DATE));
        } else {
            dia = Integer.toString(calendario.get(Calendar.DATE));
        }
        if (calendario.get(Calendar.MONTH) < 10) {
            mes = "0" + Integer.toString(calendario.get(Calendar.MONTH) + 1);
        } else {
            mes = Integer.toString(calendario.get(Calendar.MONTH) + 1);
        }

        if (calendario.get(Calendar.YEAR) < 10) {
            annio = "0" + Integer.toString(calendario.get(Calendar.YEAR));
        } else {
            annio = Integer.toString(calendario.get(Calendar.YEAR));
        }
        fecha.setText("Fecha: " + dia + " - " + mes + " - " + annio);
        hora.setText("Hora: " + hour + " : " + minutos);
    }
    
    private void setDatos(){
         Collection<UsuarioDTO> collUser= facade.BuscarUser(id);
            for(UsuarioDTO dto:collUser){
                nombreUser.setText(dto.getNombre());
                apellidoUser.setText(dto.getApellido());
                cedulaUser.setText(dto.getCedula());
                User.setText(dto.getUsuario());
                passUser.setText(dto.getPass());
        }
    }
     
    protected class AccionesBtns implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e){
            panelBienvenido.setVisible(false);
            panelNivelActual.setVisible(false);
            panelCloroUsado.setVisible(false);
            panelCloroRecibido.setVisible(false);
            panelActuDatos.setVisible(false);
            panelSeguridad.setVisible(false);
            if (e.getSource() == btnCerrar|| e.getSource() == btnSalir) {
            dispose();
            new Login().setVisible(true);
            panelBienvenido.setVisible(true);
            imgFondoBienvenido.setVisible(true);
             }
            if (e.getSource() == btnPrincipal) {
                panelBienvenido.setVisible(true);
                imgFondoBienvenido.setVisible(true);
            }
            if (e.getSource() == btnNivelActual) {
                setNivelActual();
                panelNivelActual.setVisible(true);
            }
            if (e.getSource() == btnCloroUsado) {              
                panelCloroUsado.setVisible(true);
                entradaGasto.requestFocus();
            }
            if (e.getSource() == btnCloroRecibido) {  
                panelCloroRecibido.setVisible(true);
                entradaPedido.requestFocus();
                listaDistrib.setModel(modeloListDistrib);
                modeloListDistrib.removeAllElements();
                Collection<DistribuidoresDTO> collDistrib=facade.consultarDistribidor();
                for(DistribuidoresDTO dto:collDistrib){
                     modeloListDistrib.addElement(dto.getNombre());
                }
            }
            if (e.getSource() == btnSeguridad||e.getSource() == botonCancelarActu) {
                setDatos();
                panelSeguridad.setVisible(true);
            }
             if (e.getSource() == btnActualizar) {                
                txt_Nombre.setText(nombreUser.getText());
                txt_Apellido.setText(apellidoUser.getText());
                txt_Cedula.setText(cedulaUser.getText());
                txt_User.setText(User.getText());
                txt_Pass.setText(passUser.getText());
                panelActuDatos.setVisible(true);
                txt_Nombre.requestFocus();
            }   
            if (e.getSource() == botonGasto ||e.getSource() == entradaGasto) {
                panelCloroUsado.setVisible(true);
                try {
                    ingresoGasto();
                } catch (Exception ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getSource() == btnIngreso ||e.getSource() == entradaPedido) {
                panelCloroRecibido.setVisible(true);
                ingresoPedido();
            }
             if (e.getSource() == txt_Nombre||e.getSource() == txt_Apellido||
                     e.getSource() == txt_Cedula||e.getSource() == txt_User||
                     e.getSource() == txt_Pass || e.getSource() == botonAceptarActu) {               
                panelActuDatos.setVisible(true);
                if (nombreUser.getText().equals(txt_Nombre.getText()) && 
                        apellidoUser.getText().equals(txt_Apellido.getText())
                   && cedulaUser.getText().equals(txt_Cedula.getText()) && 
                        User.getText().equals(txt_User.getText())
                   && passUser.getText().equals(String.valueOf(txt_Pass.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "No ha modificado sus datos");
                    panelSeguridad.setVisible(true);
                    panelActuDatos.setVisible(false);
                }else{
                    int aux=Registro.validarRegistro(txt_Nombre,txt_Apellido,
                            txt_Cedula,txt_User,txt_Pass,"actualizar",id,User.getText(),
                            cedulaUser.getText());                                           
                    if(aux==0){
                        JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
                        setDatos();
                        panelSeguridad.setVisible(true);
                        panelActuDatos.setVisible(false); 
                    }
                    if(aux==2)
                        txt_Cedula.requestFocus();                       
                    if(aux==3)
                        txt_User.requestFocus();
                }
            }
        }
    }
    
    class AccionesTxt implements KeyListener{
        @Override
        public void keyTyped(KeyEvent evt) {  
            if(evt.getSource()==entradaGasto||evt.getSource()==entradaPedido){
                char caracter = evt.getKeyChar();
                 JTextField aux= (JTextField) evt.getComponent();    
                if (((caracter < '0')|| (caracter > '9')) && (caracter != '\b')
                    && (caracter != '.') || aux.getText().length() == 8){
                        evt.consume();  // ignorar el evento de teclado
                }
                if (caracter == '.' && aux.getText().contains(".")) {
                    evt.consume();
                }
                if("".equals(aux.getText()) && caracter=='.')
                    aux.setText("0");
            }if(evt.getSource()==txt_Nombre||evt.getSource()== txt_Apellido){
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
 
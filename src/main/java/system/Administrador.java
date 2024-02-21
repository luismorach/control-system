/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Collection;
import javax.swing.*;
import static javax.swing.SwingConstants.*;
import javax.swing.text.*;
import javax.swing.table.*;
import database.*;

/**
 *
 * @author Administrador
 */
public class Administrador extends Empleado {
    private JButton btnModificarCapac;
    private JLabel etiquetaCapacidadTotal;
    private JTextField entradaCapacidadTotal;
    private JLabel adornoCapacidadTotal;
    private JButton btnAceptarModif;
    private JButton btnDistribuidores;
    private JButton btnHistorial;
    private JButton btnUsuarios;

    private JPanel panelDistribuidores;
    private JLabel etiquetaDistrib;
    private JButton btnAñadirDistrib;
    private JButton btnBorrarDistrib;
    private JButton btnActuDistrib;
    private JScrollPane contenedorTablaDistrib;
    private JTable tablaDistrib;

    private JPanel panelAñadirDistribuidor;
    private JLabel etiquetaAñadirDistrib;
    private JLabel etiquetaNomDistrib;
    private JLabel adornoTxtNomDistrib;
    private JLabel etiquetaCapDistrib;
    private JLabel adornoTxtCapDistrib;
    private JLabel etiquetaTimeNormDistrib;
    private JLabel adornoTxtTimeNormDistrib;
    private JLabel etiquetaTimeRetraDistrib;
    private JLabel adornoTxtTimeRetraDistrib;
    private JTextField txtCapDistrib;
    private JTextField txtNomDistrib;
    private JTextField txtTimeRetraDistrib;
    private JTextField txtTimeNormDistrib;
    private JButton btnAceptarDistrib;
    private JButton btnCancelarDistrib;

    private JPanel panelActuDistrib;
    private JLabel adornoTxtTimeRetraDistrib1;
    private JLabel adornoTxtCapDistrib1;
    private JLabel etiquetaTimeRetraDistrib1;
    private JLabel adornoTxtNomDistrib1;
    private JLabel adornoTxtTimeNormDistrib1;
    private JLabel etiquetaCapDistrib1;
    private JLabel etiquetaTimeNormDistrib1;
    private JLabel etiquetaNomDistrib1;
    private JLabel etiquetaActuDistrib;
    private JButton btnAceptarActuDistrib;
    private JButton btnCancelarActuDistrib;
    private JTextField txtCapDistrib1;
    private JTextField txtNomDistrib1;
    private javax.swing.JTextField txtTimeRetraDistrib1;
    private javax.swing.JTextField txtTimeNormDistrib1;

    private JPanel panelHistorial;
    private JScrollPane contenedorTablaHistorial;
    private JButton btnEliminarHistorial;
    private JButton btnBuscar;
    private JButton btnMostrarTodo;
    private JLabel etiquetaHistorial;
    private JLabel etiquetaBuscarUser;
    private JLabel etiquetaBuscarFecha;
    private JTextField txtBuscarUser;
    private JFormattedTextField txtBuscarFecha;
    private javax.swing.JTable tablaHistorial;

    private JPanel panelUsuarios;
    private JLabel etiquetaUsuarios;
    private JScrollPane contenedorTablaUser;
    private JTable tablaUsers;
    private JButton btnBloquear;
    private JButton btnDesbloquear;
    private int fontSize = 12;

    private JLabel line;
    private JLabel etiquetaDatosAlerta;
    private JLabel etiquetaIP;
    private JLabel etiquetaPort;
    private JLabel IP;
    private JLabel port;
    private JButton btnActualizarDatosAlerta;

    private JPanel panelActDatosAlerta;
    private JLabel etiquetaActuDatosAlerta;
    private JLabel etiquetaIP1;
    private JLabel etiquetaPort1;
    private JTextField txt_IP;
    private JTextField txt_Port;
    private JLabel adornoTxtIP;
    private JLabel adornoTxtPort;
    private JButton btnAceptarActuDatosAlerta;
    private JButton btnCancelarActuDatosAlerta;

    private DefaultTableModel modeloDistrib, modeloHistorial, modeloUser;

    public Administrador() {
        super();
        initComp();
        panelAñadirDistribuidor.setVisible(false);
        panelActuDistrib.setVisible(false);
        panelDistribuidores.setVisible(false);
        panelHistorial.setVisible(false);
        panelUsuarios.setVisible(false);
    }

    private void initComp() {
        btnModificarCapac = new JButton();
        etiquetaCapacidadTotal = new JLabel();
        entradaCapacidadTotal = new JTextField();
        adornoCapacidadTotal = new JLabel();
        btnAceptarModif = new JButton();
        btnDistribuidores = new JButton();
        btnHistorial = new JButton();
        btnUsuarios = new JButton();

        panelDistribuidores = new JPanel();
        etiquetaDistrib = new JLabel();
        contenedorTablaDistrib = new JScrollPane();
        tablaDistrib = new JTable();
        btnAñadirDistrib = new JButton();
        btnBorrarDistrib = new JButton();
        btnActuDistrib = new JButton();

        panelAñadirDistribuidor = new JPanel();
        etiquetaAñadirDistrib = new JLabel();
        etiquetaNomDistrib = new JLabel();
        etiquetaCapDistrib = new JLabel();
        etiquetaTimeNormDistrib = new JLabel();
        etiquetaTimeRetraDistrib = new JLabel();
        txtNomDistrib = new JTextField();
        txtCapDistrib = new JTextField();
        txtTimeNormDistrib = new JTextField();
        txtTimeRetraDistrib = new JTextField();
        adornoTxtNomDistrib = new JLabel();
        adornoTxtCapDistrib = new JLabel();
        adornoTxtTimeNormDistrib = new JLabel();
        adornoTxtTimeRetraDistrib = new JLabel();
        btnAceptarDistrib = new JButton();
        btnCancelarDistrib = new JButton();

        panelActuDistrib = new JPanel();
        etiquetaActuDistrib = new JLabel();
        etiquetaNomDistrib1 = new JLabel();
        etiquetaCapDistrib1 = new JLabel();
        etiquetaTimeNormDistrib1 = new JLabel();
        etiquetaTimeRetraDistrib1 = new JLabel();
        txtNomDistrib1 = new JTextField();
        txtCapDistrib1 = new JTextField();
        txtTimeNormDistrib1 = new JTextField();
        txtTimeRetraDistrib1 = new JTextField();
        adornoTxtNomDistrib1 = new JLabel();
        adornoTxtCapDistrib1 = new JLabel();
        adornoTxtTimeNormDistrib1 = new JLabel();
        adornoTxtTimeRetraDistrib1 = new JLabel();
        btnAceptarActuDistrib = new JButton();
        btnCancelarActuDistrib = new JButton();

        panelHistorial = new JPanel();
        etiquetaHistorial = new JLabel();
        etiquetaBuscarUser = new JLabel();
        etiquetaBuscarFecha = new JLabel();
        contenedorTablaHistorial = new JScrollPane();
        tablaHistorial = new JTable();
        txtBuscarUser = new JTextField();
        txtBuscarFecha = new JFormattedTextField();
        btnMostrarTodo = new JButton();
        btnBuscar = new JButton();

        panelUsuarios = new JPanel();
        etiquetaUsuarios = new JLabel();
        contenedorTablaUser = new JScrollPane();
        tablaUsers = new JTable();
        btnBloquear = new JButton();
        btnDesbloquear = new JButton();

        line = new JLabel();
        etiquetaDatosAlerta = new JLabel();
        etiquetaIP = new JLabel();
        etiquetaPort = new JLabel();
        IP = new JLabel();
        port = new JLabel();
        btnActualizarDatosAlerta = new JButton();

        panelActDatosAlerta = new JPanel();
        etiquetaActuDatosAlerta = new JLabel();
        etiquetaIP1 = new JLabel();
        etiquetaPort1 = new JLabel();
        txt_IP = new JTextField();
        txt_Port = new JTextField();
        adornoTxtIP = new JLabel();
        adornoTxtPort = new JLabel();
        btnAceptarActuDatosAlerta = new JButton();
        btnCancelarActuDatosAlerta = new JButton();

        btnModificarCapac.setBackground(new Color(102, 0, 0));
        btnModificarCapac.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnModificarCapac.setForeground(new Color(255, 255, 255));
        btnModificarCapac.setText("Modificar");
        btnModificarCapac.addActionListener(new NuevasAccionesBtn());
        panelNivelActual.add(btnModificarCapac);
        btnModificarCapac.setBounds(460, 246, 110, 30);
        etiquetaCapacidad.setBounds(160, 250, 290, 20);
        etiqueta_cloro_actual.setBounds(260, 100, 210, 30);
        indicNivel.setBounds(165, 140, 400, 60);

        etiquetaCapacidadTotal.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCapacidadTotal.setForeground(new Color(255, 255, 255));
        etiquetaCapacidadTotal.setHorizontalAlignment(CENTER);
        etiquetaCapacidadTotal.setText("Ingrese la nueva capacidad de la planta");
        panelNivelActual.add(etiquetaCapacidadTotal);
        etiquetaCapacidadTotal.setBounds(190, 310, 340, 30);

        entradaCapacidadTotal.setColumns(10);
        entradaCapacidadTotal.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        entradaCapacidadTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradaCapacidadTotal.setBorder(null);
        entradaCapacidadTotal.addActionListener(new NuevasAccionesBtn());
        entradaCapacidadTotal.addKeyListener(new NuevasAccionesTxt());
        panelNivelActual.add(entradaCapacidadTotal);
        entradaCapacidadTotal.setBounds(280, 357, 180, 20);

        adornoCapacidadTotal.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelNivelActual.add(adornoCapacidadTotal);
        adornoCapacidadTotal.setBounds(270, 350, 197, 34);

        btnAceptarModif.setBackground(new Color(102, 0, 0));
        btnAceptarModif.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnAceptarModif.setForeground(new Color(255, 255, 255));
        btnAceptarModif.setText("Aceptar");
        btnAceptarModif.addActionListener(new NuevasAccionesBtn());
        panelNivelActual.add(btnAceptarModif);
        btnAceptarModif.setBounds(310, 410, 110, 30);

        btnDistribuidores.setBackground(new Color(102, 0, 0));
        btnDistribuidores.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnDistribuidores.setForeground(new Color(255, 255, 255));
        btnDistribuidores.setText("Distribuidores");
        btnDistribuidores.addActionListener(new NuevasAccionesBtn());
        panelMenu.add(btnDistribuidores);

        btnHistorial.setBackground(new Color(102, 0, 0));
        btnHistorial.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnHistorial.setForeground(new Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new NuevasAccionesBtn());
        panelMenu.add(btnHistorial);

        btnUsuarios.setBackground(new Color(102, 0, 0));
        btnUsuarios.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnUsuarios.setForeground(new Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new NuevasAccionesBtn());
        panelMenu.add(btnUsuarios);

        btnSeguridad.addActionListener(new NuevasAccionesBtn());

        etiquetaDatos.setBounds(130, 90, 500, 20);
        etiquetaNombre.setBounds(131, 120, 97, 22);
        etiquetaApellido.setBounds(231, 120, 97, 22);
        etiquetaCedula.setBounds(331, 120, 97, 22);
        etiquetaUser.setBounds(431, 120, 97, 22);
        etiquetaPass.setBounds(531, 120, 97, 22);
        nombreUser.setBounds(131, 144, 97, 30);
        apellidoUser.setBounds(231, 144, 97, 30);
        cedulaUser.setBounds(331, 144, 97, 30);
        User.setBounds(431, 144, 97, 30);
        passUser.setBounds(531, 144, 97, 30);
        btnActualizar.setBounds(310, 190, 130, 29);

        line.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(line);
        line.setBounds(0, 250, 840, 1);

        etiquetaDatosAlerta.setBackground(new Color(102, 0, 0));
        etiquetaDatosAlerta.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaDatosAlerta.setForeground(new Color(255, 255, 255));
        etiquetaDatosAlerta.setHorizontalAlignment(CENTER);
        etiquetaDatosAlerta.setText("Datos para enviar alerta");
        etiquetaDatosAlerta.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaDatosAlerta.setOpaque(true);
        panelSeguridad.add(etiquetaDatosAlerta);
        etiquetaDatosAlerta.setBounds(130, 300, 500, 20);

        etiquetaIP.setBackground(new Color(102, 0, 0));
        etiquetaIP.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaIP.setForeground(new Color(255, 255, 255));
        etiquetaIP.setHorizontalAlignment(CENTER);
        etiquetaIP.setText("Direccion IP");
        etiquetaIP.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaIP.setOpaque(true);
        panelSeguridad.add(etiquetaIP);
        etiquetaIP.setBounds(131, 330, 249, 22);

        etiquetaPort.setBackground(new Color(102, 0, 0));
        etiquetaPort.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPort.setForeground(new Color(255, 255, 255));
        etiquetaPort.setHorizontalAlignment(CENTER);
        etiquetaPort.setText("Puerto");
        etiquetaPort.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaPort.setOpaque(true);
        panelSeguridad.add(etiquetaPort);
        etiquetaPort.setBounds(383, 330, 248, 22);

        IP.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        IP.setForeground(new Color(255, 255, 255));
        IP.setHorizontalAlignment(CENTER);
        IP.setText("oro");
        IP.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(IP);
        IP.setBounds(131, 354, 249, 30);

        port.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        port.setForeground(new Color(255, 255, 255));
        port.setHorizontalAlignment(CENTER);
        port.setText("puro");
        port.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        panelSeguridad.add(port);
        port.setBounds(383, 354, 248, 30);

        btnActualizarDatosAlerta.setBackground(new Color(102, 0, 0));
        btnActualizarDatosAlerta.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        btnActualizarDatosAlerta.setForeground(new Color(255, 255, 255));
        btnActualizarDatosAlerta.setText("Actualizar");
        btnActualizarDatosAlerta.addActionListener(new NuevasAccionesBtn());
        panelSeguridad.add(btnActualizarDatosAlerta);
        btnActualizarDatosAlerta.setBounds(310, 400, 130, 29);

        panelActDatosAlerta.setVisible(false);
        panelActDatosAlerta.setOpaque(false);
        panelActDatosAlerta.setSize(400, 450);
        panelActDatosAlerta.setLayout(null);

        etiquetaActuDatosAlerta.setBackground(new Color(102, 0, 0));
        etiquetaActuDatosAlerta.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaActuDatosAlerta.setForeground(new Color(255, 255, 255));
        etiquetaActuDatosAlerta.setHorizontalAlignment(CENTER);
        etiquetaActuDatosAlerta.setText("Actualizar datos");
        etiquetaActuDatosAlerta.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaActuDatosAlerta.setOpaque(true);
        panelActDatosAlerta.add(etiquetaActuDatosAlerta);
        etiquetaActuDatosAlerta.setBounds(295, 20, 130, 22);

        etiquetaIP1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaIP1.setForeground(new Color(255, 255, 255));
        etiquetaIP1.setHorizontalAlignment(RIGHT);
        etiquetaIP1.setText("IP:");
        panelActDatosAlerta.add(etiquetaIP1);
        etiquetaIP1.setBounds(225, 110, 80, 20);

        etiquetaPort1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaPort1.setForeground(new Color(255, 255, 255));
        etiquetaPort1.setHorizontalAlignment(RIGHT);
        etiquetaPort1.setText("Puerto:");
        panelActDatosAlerta.add(etiquetaPort1);
        etiquetaPort1.setBounds(205, 160, 100, 20);

        txt_IP.setColumns(10);
        txt_IP.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_IP.setHorizontalAlignment(CENTER);
        txt_IP.setToolTipText("");
        txt_IP.setBorder(null);
        txt_IP.addActionListener(new NuevasAccionesBtn());
        txt_IP.addKeyListener(new NuevasAccionesTxt());
        panelActDatosAlerta.add(txt_IP);
        txt_IP.setBounds(325, 110, 180, 20);

        txt_Port.setColumns(10);
        txt_Port.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txt_Port.setHorizontalAlignment(CENTER);
        txt_Port.setToolTipText("");
        txt_Port.setBorder(null);
        txt_Port.addActionListener(new NuevasAccionesBtn());
        txt_Port.addKeyListener(new NuevasAccionesTxt());
        panelActDatosAlerta.add(txt_Port);
        txt_Port.setBounds(325, 160, 180, 20);

        adornoTxtIP.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActDatosAlerta.add(adornoTxtIP);
        adornoTxtIP.setBounds(315, 100, 200, 40);

        adornoTxtPort.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActDatosAlerta.add(adornoTxtPort);
        adornoTxtPort.setBounds(315, 150, 197, 40);

        btnAceptarActuDatosAlerta.setBackground(new Color(102, 0, 0));
        btnAceptarActuDatosAlerta.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        btnAceptarActuDatosAlerta.setForeground(new Color(255, 255, 255));
        btnAceptarActuDatosAlerta.setText("Aceptar");
        btnAceptarActuDatosAlerta.addActionListener(new NuevasAccionesBtn());
        panelActDatosAlerta.add(btnAceptarActuDatosAlerta);
        btnAceptarActuDatosAlerta.setBounds(250, 240, 110, 29);

        btnCancelarActuDatosAlerta.setBackground(new Color(102, 0, 0));
        btnCancelarActuDatosAlerta.setFont(new Font("Modern No. 20", 1, fontSize)); // NOI18N
        btnCancelarActuDatosAlerta.setForeground(new Color(255, 255, 255));
        btnCancelarActuDatosAlerta.setText("Cancelar");
        btnCancelarActuDatosAlerta.addActionListener(new NuevasAccionesBtn());
        panelActDatosAlerta.add(btnCancelarActuDatosAlerta);
        btnCancelarActuDatosAlerta.setBounds(370, 240, 110, 29);

        panelCentral.add(panelActDatosAlerta);
        panelActDatosAlerta.setBounds(204, 55, 730, 470);

        btnPrincipal.setBounds(6, 120, 193, 40);
        btnNivelActual.setBounds(6, 165, 193, 40);
        btnCloroUsado.setBounds(6, 210, 193, 40);
        btnCloroRecibido.setBounds(6, 255, 193, 40);
        btnDistribuidores.setBounds(6, 300, 193, 40);
        btnSeguridad.setBounds(6, 345, 193, 40);
        btnHistorial.setBounds(6, 390, 193, 40);
        btnUsuarios.setBounds(6, 435, 193, 40);
        btnSalir.setBounds(6, 480, 193, 40);

        fondoPanelMenu.setBackground(new Color(0, 0, 0));
        fondoPanelMenu.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        fondoPanelMenu.setOpaque(true);
        panelMenu.add(fondoPanelMenu);
        fondoPanelMenu.setBounds(2, 55, 202, 471);

        panelDistribuidores.setSize(914, 473);
        panelDistribuidores.setOpaque(false);
        panelDistribuidores.setLayout(null);

        etiquetaDistrib.setBackground(new Color(102, 0, 0));
        etiquetaDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaDistrib.setForeground(new Color(255, 255, 255));
        etiquetaDistrib.setHorizontalAlignment(CENTER);
        etiquetaDistrib.setText("Distribuidores");
        etiquetaDistrib.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaDistrib.setOpaque(true);
        panelDistribuidores.add(etiquetaDistrib);
        etiquetaDistrib.setBounds(320, 20, 110, 20);

        contenedorTablaDistrib.setBackground(new Color(102, 0, 0));
        contenedorTablaDistrib.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        contenedorTablaDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        panelDistribuidores.add(contenedorTablaDistrib);
        contenedorTablaDistrib.setBounds(8, 90, 720, 260);

        tablaDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        tablaDistrib.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nombre", "Capacidad (kg)", "Tiempo de entrega normal (dias)", "Tiempo maximo de entrega (dias)"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablaDistrib.setRowHeight(30);
        tablaDistrib.setRowMargin(10);
        tablaDistrib.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contenedorTablaDistrib.setViewportView(tablaDistrib);

        btnAñadirDistrib.setBackground(new Color(102, 0, 0));
        btnAñadirDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnAñadirDistrib.setForeground(new Color(255, 255, 255));
        btnAñadirDistrib.setText("Añadir");
        btnAñadirDistrib.addActionListener(new NuevasAccionesBtn());
        panelDistribuidores.add(btnAñadirDistrib);
        btnAñadirDistrib.setBounds(110, 370, 120, 30);

        btnBorrarDistrib.setBackground(new Color(102, 0, 0));
        btnBorrarDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnBorrarDistrib.setForeground(new Color(255, 255, 255));
        btnBorrarDistrib.setText("Borrar");
        btnBorrarDistrib.addActionListener(new NuevasAccionesBtn());
        panelDistribuidores.add(btnBorrarDistrib);
        btnBorrarDistrib.setBounds(310, 370, 120, 30);

        btnActuDistrib.setBackground(new Color(102, 0, 0));
        btnActuDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnActuDistrib.setForeground(new Color(255, 255, 255));
        btnActuDistrib.setText("Actualizar");
        btnActuDistrib.addActionListener(new NuevasAccionesBtn());
        panelDistribuidores.add(btnActuDistrib);
        btnActuDistrib.setBounds(500, 370, 120, 29);

        panelCentral.add(panelDistribuidores);
        panelDistribuidores.setBounds(204, 55, 730, 470);

        panelAñadirDistribuidor.setOpaque(false);
        panelAñadirDistribuidor.setSize(630, 390);
        panelAñadirDistribuidor.setLayout(null);

        etiquetaAñadirDistrib.setBackground(new Color(102, 0, 0));
        etiquetaAñadirDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaAñadirDistrib.setForeground(new Color(255, 255, 255));
        etiquetaAñadirDistrib.setHorizontalAlignment(CENTER);
        etiquetaAñadirDistrib.setText("Añadir  distribuidor");
        etiquetaAñadirDistrib.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaAñadirDistrib.setOpaque(true);
        panelAñadirDistribuidor.add(etiquetaAñadirDistrib);
        etiquetaAñadirDistrib.setBounds(325, 20, 170, 20);

        etiquetaNomDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNomDistrib.setForeground(new Color(255, 255, 255));
        etiquetaNomDistrib.setHorizontalAlignment(RIGHT);
        etiquetaNomDistrib.setText("Nombre:");
        panelAñadirDistribuidor.add(etiquetaNomDistrib);
        etiquetaNomDistrib.setBounds(270, 130, 80, 20);

        etiquetaCapDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCapDistrib.setForeground(new Color(255, 255, 255));
        etiquetaCapDistrib.setHorizontalAlignment(RIGHT);
        etiquetaCapDistrib.setText("Capacidad (kg) :");
        panelAñadirDistribuidor.add(etiquetaCapDistrib);
        etiquetaCapDistrib.setBounds(210, 190, 140, 20);

        etiquetaTimeNormDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaTimeNormDistrib.setForeground(new Color(255, 255, 255));
        etiquetaTimeNormDistrib.setHorizontalAlignment(RIGHT);
        etiquetaTimeNormDistrib.setText("Tiempo de entrega Normal(dias) :");
        panelAñadirDistribuidor.add(etiquetaTimeNormDistrib);
        etiquetaTimeNormDistrib.setBounds(100, 250, 250, 20);

        etiquetaTimeRetraDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaTimeRetraDistrib.setForeground(new Color(255, 255, 255));
        etiquetaTimeRetraDistrib.setHorizontalAlignment(RIGHT);
        etiquetaTimeRetraDistrib.setText("Tiempo maximo de entrega(dias) :");
        etiquetaTimeRetraDistrib.setHorizontalTextPosition(RIGHT);
        panelAñadirDistribuidor.add(etiquetaTimeRetraDistrib);
        etiquetaTimeRetraDistrib.setBounds(100, 310, 250, 20);

        txtNomDistrib.setColumns(10);
        txtNomDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtNomDistrib.setHorizontalAlignment(JTextField.CENTER);
        txtNomDistrib.setBorder(null);
        txtNomDistrib.addActionListener(new NuevasAccionesBtn());
        txtNomDistrib.addKeyListener(new NuevasAccionesTxt());
        panelAñadirDistribuidor.add(txtNomDistrib);
        txtNomDistrib.setBounds(370, 130, 180, 20);

        txtCapDistrib.setColumns(10);
        txtCapDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtCapDistrib.setHorizontalAlignment(CENTER);
        txtCapDistrib.setBorder(null);
        txtCapDistrib.addActionListener(new NuevasAccionesBtn());
        txtCapDistrib.addKeyListener(new NuevasAccionesTxt());
        panelAñadirDistribuidor.add(txtCapDistrib);
        txtCapDistrib.setBounds(370, 190, 180, 20);

        txtTimeNormDistrib.setColumns(10);
        txtTimeNormDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtTimeNormDistrib.setHorizontalAlignment(CENTER);
        txtTimeNormDistrib.setBorder(null);
        txtTimeNormDistrib.addActionListener(new NuevasAccionesBtn());
        txtTimeNormDistrib.addKeyListener(new NuevasAccionesTxt());
        panelAñadirDistribuidor.add(txtTimeNormDistrib);
        txtTimeNormDistrib.setBounds(370, 250, 180, 20);

        txtTimeRetraDistrib.setColumns(10);
        txtTimeRetraDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtTimeRetraDistrib.setHorizontalAlignment(CENTER);
        txtTimeRetraDistrib.setBorder(null);
        txtTimeRetraDistrib.addActionListener(new NuevasAccionesBtn());
        txtTimeRetraDistrib.addKeyListener(new NuevasAccionesTxt());
        panelAñadirDistribuidor.add(txtTimeRetraDistrib);
        txtTimeRetraDistrib.setBounds(370, 310, 180, 20);

        adornoTxtNomDistrib.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        adornoTxtNomDistrib.setText("jLabel6");
        panelAñadirDistribuidor.add(adornoTxtNomDistrib);
        adornoTxtNomDistrib.setBounds(360, 120, 200, 40);

        adornoTxtCapDistrib.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelAñadirDistribuidor.add(adornoTxtCapDistrib);
        adornoTxtCapDistrib.setBounds(360, 180, 197, 40);

        adornoTxtTimeNormDistrib.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelAñadirDistribuidor.add(adornoTxtTimeNormDistrib);
        adornoTxtTimeNormDistrib.setBounds(360, 240, 200, 40);

        adornoTxtTimeRetraDistrib.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelAñadirDistribuidor.add(adornoTxtTimeRetraDistrib);
        adornoTxtTimeRetraDistrib.setBounds(360, 300, 200, 40);

        btnAceptarDistrib.setBackground(new Color(102, 0, 0));
        btnAceptarDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnAceptarDistrib.setForeground(new Color(255, 255, 255));
        btnAceptarDistrib.setText("Aceptar");
        btnAceptarDistrib.addActionListener(new NuevasAccionesBtn());
        panelAñadirDistribuidor.add(btnAceptarDistrib);
        btnAceptarDistrib.setBounds(220, 380, 120, 30);

        btnCancelarDistrib.setBackground(new Color(102, 0, 0));
        btnCancelarDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnCancelarDistrib.setForeground(new Color(255, 255, 255));
        btnCancelarDistrib.setText("Cancelar");
        btnCancelarDistrib.addActionListener(new NuevasAccionesBtn());
        panelAñadirDistribuidor.add(btnCancelarDistrib);
        btnCancelarDistrib.setBounds(390, 380, 120, 30);

        panelCentral.add(panelAñadirDistribuidor);
        panelAñadirDistribuidor.setBounds(204, 55, 730, 470);

        panelActuDistrib.setOpaque(false);
        panelActuDistrib.setSize(914, 473);
        panelActuDistrib.setLayout(null);

        etiquetaActuDistrib.setBackground(new Color(102, 0, 0));
        etiquetaActuDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaActuDistrib.setForeground(new Color(255, 255, 255));
        etiquetaActuDistrib.setHorizontalAlignment(CENTER);
        etiquetaActuDistrib.setText("Actualizar distribuidor");
        etiquetaActuDistrib.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaActuDistrib.setOpaque(true);
        panelActuDistrib.add(etiquetaActuDistrib);
        etiquetaActuDistrib.setBounds(325, 20, 180, 20);

        etiquetaNomDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaNomDistrib1.setForeground(new Color(255, 255, 255));
        etiquetaNomDistrib1.setHorizontalAlignment(RIGHT);
        etiquetaNomDistrib1.setText("Nombre:");
        panelActuDistrib.add(etiquetaNomDistrib1);
        etiquetaNomDistrib1.setBounds(270, 130, 80, 20);

        etiquetaCapDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaCapDistrib1.setForeground(new Color(255, 255, 255));
        etiquetaCapDistrib1.setHorizontalAlignment(RIGHT);
        etiquetaCapDistrib1.setText("Capacidad (kg) :");
        panelActuDistrib.add(etiquetaCapDistrib1);
        etiquetaCapDistrib1.setBounds(210, 190, 140, 20);

        etiquetaTimeNormDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaTimeNormDistrib1.setForeground(new Color(255, 255, 255));
        etiquetaTimeNormDistrib1.setHorizontalAlignment(RIGHT);
        etiquetaTimeNormDistrib1.setText("Tiempo de entrega Normal(dias) :");
        panelActuDistrib.add(etiquetaTimeNormDistrib1);
        etiquetaTimeNormDistrib1.setBounds(100, 250, 250, 20);

        etiquetaTimeRetraDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaTimeRetraDistrib1.setForeground(new Color(255, 255, 255));
        etiquetaTimeRetraDistrib1.setHorizontalAlignment(RIGHT);
        etiquetaTimeRetraDistrib1.setText("Tiempo maximo de entrega(dias) :");
        etiquetaTimeRetraDistrib1.setHorizontalTextPosition(RIGHT);
        panelActuDistrib.add(etiquetaTimeRetraDistrib1);
        etiquetaTimeRetraDistrib1.setBounds(100, 310, 250, 20);

        txtNomDistrib1.setColumns(10);
        txtNomDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtNomDistrib1.setHorizontalAlignment(CENTER);
        txtNomDistrib1.setBorder(null);
        txtNomDistrib1.addActionListener(new NuevasAccionesBtn());
        txtNomDistrib1.addKeyListener(new NuevasAccionesTxt());
        panelActuDistrib.add(txtNomDistrib1);
        txtNomDistrib1.setBounds(370, 130, 180, 20);

        txtCapDistrib1.setColumns(10);
        txtCapDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtCapDistrib1.setHorizontalAlignment(CENTER);
        txtCapDistrib1.setBorder(null);
        txtCapDistrib1.addActionListener(new NuevasAccionesBtn());
        txtCapDistrib1.addKeyListener(new NuevasAccionesTxt());
        panelActuDistrib.add(txtCapDistrib1);
        txtCapDistrib1.setBounds(370, 190, 180, 20);

        txtTimeNormDistrib1.setColumns(10);
        txtTimeNormDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtTimeNormDistrib1.setHorizontalAlignment(CENTER);
        txtTimeNormDistrib1.setBorder(null);
        txtTimeNormDistrib1.addActionListener(new NuevasAccionesBtn());
        txtTimeNormDistrib1.addKeyListener(new NuevasAccionesTxt());
        panelActuDistrib.add(txtTimeNormDistrib1);
        txtTimeNormDistrib1.setBounds(370, 250, 180, 20);

        txtTimeRetraDistrib1.setColumns(10);
        txtTimeRetraDistrib1.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtTimeRetraDistrib1.setHorizontalAlignment(CENTER);
        txtTimeRetraDistrib1.setBorder(null);
        txtTimeRetraDistrib1.addActionListener(new NuevasAccionesBtn());
        txtTimeRetraDistrib1.addKeyListener(new NuevasAccionesTxt());
        panelActuDistrib.add(txtTimeRetraDistrib1);
        txtTimeRetraDistrib1.setBounds(370, 310, 180, 20);

        adornoTxtNomDistrib1.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        adornoTxtNomDistrib1.setText("jLabel6");
        panelActuDistrib.add(adornoTxtNomDistrib1);
        adornoTxtNomDistrib1.setBounds(360, 120, 200, 40);

        adornoTxtCapDistrib1.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDistrib.add(adornoTxtCapDistrib1);
        adornoTxtCapDistrib1.setBounds(360, 180, 197, 40);

        adornoTxtTimeNormDistrib1.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDistrib.add(adornoTxtTimeNormDistrib1);
        adornoTxtTimeNormDistrib1.setBounds(360, 240, 200, 40);

        adornoTxtTimeRetraDistrib1.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png"))); // NOI18N
        panelActuDistrib.add(adornoTxtTimeRetraDistrib1);
        adornoTxtTimeRetraDistrib1.setBounds(360, 300, 200, 40);

        btnAceptarActuDistrib.setBackground(new Color(102, 0, 0));
        btnAceptarActuDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnAceptarActuDistrib.setForeground(new Color(255, 255, 255));
        btnAceptarActuDistrib.setText("Aceptar");
        btnAceptarActuDistrib.addActionListener(new NuevasAccionesBtn());
        panelActuDistrib.add(btnAceptarActuDistrib);
        btnAceptarActuDistrib.setBounds(220, 380, 120, 30);

        btnCancelarActuDistrib.setBackground(new Color(102, 0, 0));
        btnCancelarActuDistrib.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnCancelarActuDistrib.setForeground(new Color(255, 255, 255));
        btnCancelarActuDistrib.setText("Cancelar");
        btnCancelarActuDistrib.addActionListener(new NuevasAccionesBtn());
        panelActuDistrib.add(btnCancelarActuDistrib);
        btnCancelarActuDistrib.setBounds(390, 380, 120, 30);

        panelCentral.add(panelActuDistrib);
        panelActuDistrib.setBounds(204, 55, 730, 470);

        btnPrincipal.addActionListener(new NuevasAccionesBtn());
        btnNivelActual.addActionListener(new NuevasAccionesBtn());
        btnCloroUsado.addActionListener(new NuevasAccionesBtn());
        btnCloroRecibido.addActionListener(new NuevasAccionesBtn());
        btnSeguridad.addActionListener(new NuevasAccionesBtn());

        panelHistorial.setOpaque(false);
        panelHistorial.setSize(914, 473);
        panelHistorial.setLayout(null);

        etiquetaHistorial.setBackground(new Color(102, 0, 0));
        etiquetaHistorial.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaHistorial.setForeground(new Color(255, 255, 255));
        etiquetaHistorial.setHorizontalAlignment(CENTER);
        etiquetaHistorial.setText("Historial");
        etiquetaHistorial.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaHistorial.setOpaque(true);
        panelHistorial.add(etiquetaHistorial);
        etiquetaHistorial.setBounds(310, 20, 110, 20);

        contenedorTablaHistorial.setBackground(new Color(102, 0, 0));
        contenedorTablaHistorial.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        contenedorTablaHistorial.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        panelHistorial.add(contenedorTablaHistorial);
        contenedorTablaHistorial.setBounds(10, 90, 710, 260);

        tablaHistorial.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        tablaHistorial.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Usuario", "Ingreso/Gasto", "Fecha", "Hora"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablaHistorial.setRowHeight(30);
        tablaHistorial.setRowMargin(10);
        tablaHistorial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contenedorTablaHistorial.setViewportView(tablaHistorial);

        etiquetaBuscarUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaBuscarUser.setForeground(new Color(255, 255, 255));
        etiquetaBuscarUser.setText("Usuario:");
        panelHistorial.add(etiquetaBuscarUser);
        etiquetaBuscarUser.setBounds(30, 370, 70, 20);

        etiquetaBuscarFecha.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaBuscarFecha.setForeground(new Color(255, 255, 255));
        etiquetaBuscarFecha.setText("Fecha:");
        panelHistorial.add(etiquetaBuscarFecha);
        etiquetaBuscarFecha.setBounds(230, 370, 50, 20);

        txtBuscarUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtBuscarUser.setHorizontalAlignment(CENTER);
        txtBuscarUser.addActionListener(new NuevasAccionesBtn());
        txtBuscarUser.addKeyListener(new NuevasAccionesTxt());
        panelHistorial.add(txtBuscarUser);
        txtBuscarUser.setBounds(100, 368, 120, 25);

        try {
            txtBuscarFecha.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("## - ## - ####")));
        } catch (ParseException ex) {
            System.out.println("error" + ex.getMessage());
        }
        txtBuscarFecha.setHorizontalAlignment(JTextField.CENTER);
        txtBuscarFecha.setFocusLostBehavior(JFormattedTextField.COMMIT);
        txtBuscarFecha.setFont(new java.awt.Font("Modern No. 20", 0, fontSize)); // NOI18N
        txtBuscarFecha.addActionListener(new NuevasAccionesBtn());
        panelHistorial.add(txtBuscarFecha);
        txtBuscarFecha.setBounds(280, 368, 120, 25);

        btnEliminarHistorial = new JButton();
        btnEliminarHistorial.setBackground(new Color(102, 0, 0));
        btnEliminarHistorial.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnEliminarHistorial.setForeground(new Color(255, 255, 255));
        btnEliminarHistorial.setText("Eliminar historial");
        btnEliminarHistorial.addActionListener(new NuevasAccionesBtn());
        panelHistorial.add(btnEliminarHistorial);
        btnEliminarHistorial.setBounds(480, 370, 170, 30);

        btnMostrarTodo.setBackground(new Color(102, 0, 0));
        btnMostrarTodo.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnMostrarTodo.setForeground(new Color(255, 255, 255));
        btnMostrarTodo.setText("Mostrar todo");
        btnMostrarTodo.addActionListener(new NuevasAccionesBtn());
        panelHistorial.add(btnMostrarTodo);
        btnMostrarTodo.setBounds(480, 410, 170, 30);

        btnBuscar.setBackground(new Color(102, 0, 0));
        btnBuscar.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnBuscar.setForeground(new Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new NuevasAccionesBtn());
        panelHistorial.add(btnBuscar);
        btnBuscar.setBounds(180, 410, 130, 30);

        panelCentral.add(panelHistorial);
        panelHistorial.setBounds(204, 55, 730, 470);

        panelUsuarios.setOpaque(false);
        panelUsuarios.setSize(914, 473);
        panelUsuarios.setLayout(null);

        etiquetaUsuarios.setBackground(new Color(102, 0, 0));
        etiquetaUsuarios.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        etiquetaUsuarios.setForeground(new Color(255, 255, 255));
        etiquetaUsuarios.setHorizontalAlignment(CENTER);
        etiquetaUsuarios.setText("Usuarios");
        etiquetaUsuarios.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        etiquetaUsuarios.setOpaque(true);
        panelUsuarios.add(etiquetaUsuarios);
        etiquetaUsuarios.setBounds(310, 20, 110, 20);

        contenedorTablaUser.setBackground(new Color(102, 0, 0));
        contenedorTablaUser.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        contenedorTablaUser.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        panelUsuarios.add(contenedorTablaUser);
        contenedorTablaUser.setBounds(12, 100, 710, 260);

        tablaUsers.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        tablaUsers.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nombre", "Apellido", "Cedula", "Usuario", "Tipo", "Estado"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablaUsers.setRowHeight(30);
        tablaUsers.setRowMargin(10);
        tablaUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contenedorTablaUser.setViewportView(tablaUsers);

        btnBloquear.setBackground(new Color(102, 0, 0));
        btnBloquear.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnBloquear.setForeground(new Color(255, 255, 255));
        btnBloquear.setText("Bloquear");
        btnBloquear.addActionListener(new NuevasAccionesBtn());
        panelUsuarios.add(btnBloquear);
        btnBloquear.setBounds(200, 400, 130, 30);

        btnDesbloquear.setBackground(new Color(102, 0, 0));
        btnDesbloquear.setFont(new Font("Modern No. 20", 0, fontSize)); // NOI18N
        btnDesbloquear.setForeground(new Color(255, 255, 255));
        btnDesbloquear.setText("Desbloquear");
        btnDesbloquear.addActionListener(new NuevasAccionesBtn());
        panelUsuarios.add(btnDesbloquear);
        btnDesbloquear.setBounds(440, 400, 130, 30);

        panelCentral.add(panelUsuarios);
        panelUsuarios.setBounds(204, 55, 730, 470);

        imgFondo.setIcon(new ImageIcon(getClass().getResource("/img/FondoAzul.png"))); // NOI18N
        imgFondo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        imgFondo.setSize(900, 526);
        panelCentral.add(imgFondo);
        imgFondo.setBounds(206, 55, 732, 471);

    }

    public void iniciarTabla() {
        tablaDistrib.getTableHeader().setFont(new Font("Modern No. 20", 0, fontSize));
        tablaDistrib.getTableHeader().setOpaque(false);
        tablaDistrib.getTableHeader().setBackground(new Color(102, 0, 0));
        tablaDistrib.getTableHeader().setForeground(new Color(255, 255, 255));
        tablaDistrib.getColumnModel().getColumn(0).setPreferredWidth(70);
        tablaDistrib.getColumnModel().getColumn(1).setPreferredWidth(40);
        tablaDistrib.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDistrib.getColumnModel().getColumn(3).setPreferredWidth(160);
        tablaDistrib.setSelectionBackground(new Color(102, 0, 0));
        tablaDistrib.setSelectionForeground(new Color(255, 255, 255));

        tablaHistorial.getTableHeader().setFont(new Font("Modern No. 20", 0, fontSize));
        tablaHistorial.getTableHeader().setOpaque(false);
        tablaHistorial.getTableHeader().setBackground(new Color(102, 0, 0));
        tablaHistorial.getTableHeader().setForeground(new Color(255, 255, 255));
        tablaHistorial.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaHistorial.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaHistorial.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaHistorial.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaHistorial.setSelectionBackground(new Color(102, 0, 0));
        tablaHistorial.setSelectionForeground(new Color(255, 255, 255));

        tablaUsers.getTableHeader().setFont(new Font("Modern No. 20", 0, fontSize));
        tablaUsers.getTableHeader().setOpaque(false);
        tablaUsers.getTableHeader().setBackground(new Color(102, 0, 0));
        tablaUsers.getTableHeader().setForeground(new Color(255, 255, 255));
        tablaUsers.setSelectionBackground(new Color(102, 0, 0));
        tablaUsers.setSelectionForeground(new Color(255, 255, 255));
        // Indicamos el DefaultTableModel de nuestra tabla
        modeloDistrib = (DefaultTableModel) tablaDistrib.getModel();
        modeloHistorial = (DefaultTableModel) tablaHistorial.getModel();
        modeloUser = (DefaultTableModel) tablaUsers.getModel();
        modeloDistrib.setNumRows(0);
        modeloHistorial.setNumRows(0);
        modeloUser.setNumRows(0);
    }

    public boolean validarDistribuidor() {
        boolean aux = true;
        Collection<DistribuidoresDTO> collDistribuidores = facade.consultarDistribidor(txtNomDistrib.getText());
        if (txtNomDistrib.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
            txtNomDistrib.requestFocus();
            aux = false;
        } else if (txtCapDistrib.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La capacidad no puede estar vacia");
            txtCapDistrib.requestFocus();
            aux = false;
        } else if (txtTimeNormDistrib.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El tiempo de entrega normal no puede estar vacio");
            txtTimeNormDistrib.requestFocus();
            aux = false;
        } else if (txtTimeRetraDistrib.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El tiempo maximo de entrega  no puede estar vacio");
            txtTimeRetraDistrib.requestFocus();
            aux = false;
        } else if (Integer.parseInt(txtTimeNormDistrib.getText()) > Integer.parseInt(txtTimeRetraDistrib.getText())) {
            JOptionPane.showMessageDialog(null, "El tiempo maximo no puede ser menor al tiempo normal");
            txtTimeRetraDistrib.requestFocus();
            aux = false;
        } else {
            for (DistribuidoresDTO dto : collDistribuidores) {
                if ((txtNomDistrib.getText().toLowerCase()).equals(dto.getNombre())) {
                    JOptionPane.showMessageDialog(null, "distribuidor ya Existe");
                    txtNomDistrib.requestFocus();
                    aux = false;
                }
            }
            if (aux == true) {
                facade.crearDistribuidor(txtNomDistrib.getText(),
                        Float.parseFloat(txtCapDistrib.getText()),
                        Integer.parseInt(txtTimeNormDistrib.getText()),
                        Integer.parseInt(txtTimeRetraDistrib.getText()));
                JOptionPane.showMessageDialog(null, "Creacion exitosa");
                txtNomDistrib.setText("");
                txtCapDistrib.setText("");
                txtTimeNormDistrib.setText("");
                txtTimeRetraDistrib.setText("");
            }
        }
        return aux;
    }

    private void mostrarHistorial() {
        iniciarTabla();
        Collection<HistorialDTO> collHistory = facade.ConsultarHistorial();
        for (HistorialDTO dto : collHistory) {
            modeloHistorial.addRow(new Object[] {
                    dto.getUser(), dto.getIngresGasto(), dto.getFecha(), dto.getHora()
            });
        }
    }

    private void setListaDistribuidores() {
        iniciarTabla();
        Collection<DistribuidoresDTO> collDistrib = facade.consultarDistribidor();
        for (DistribuidoresDTO dto : collDistrib) {
            modeloDistrib.addRow(new Object[] {
                    dto.getNombre(), dto.getCapacidad(), dto.getTiempoNormal(),
                    dto.getTiempoRetraso()
            });
        }
    }

    private void setDatos() {
        Collection<UsuarioDTO> collUser = facade.BuscarUser(id);
        for (UsuarioDTO dto : collUser) {
            nombreUser.setText(dto.getNombre());
            apellidoUser.setText(dto.getApellido());
            cedulaUser.setText(dto.getCedula());
            User.setText(dto.getUsuario());
            passUser.setText(dto.getPass());
        }
        Collection<AlertaDTO> collAlerta = facade.consultarAlerta();
        for (AlertaDTO dto : collAlerta) {
            IP.setText(dto.getIP());
            port.setText(String.valueOf(dto.getPort()));
        }
    }

    private void validarBusqueda() {
        iniciarTabla();
        int numRegistros = 0;
        Collection<HistorialDTO> collHistorial;
        if ("".equals(txtBuscarUser.getText()) && !"   -    -     ".equals(txtBuscarFecha.getText())) {
            collHistorial = facade.buscarPorFecha(txtBuscarFecha.getText());
            for (HistorialDTO dto : collHistorial) {
                modeloHistorial.addRow(new Object[] {
                        dto.getUser(), dto.getIngresGasto(), dto.getFecha(), dto.getHora()
                });
                numRegistros++;
            }
            if (numRegistros == 0) {
                mostrarHistorial();
                JOptionPane.showMessageDialog(null, "No se encontraron registros para la fecha ingresada");
            }
            txtBuscarFecha.setText("");
        } else if (!"".equals(txtBuscarUser.getText()) && "   -    -     ".equals(txtBuscarFecha.getText())) {
            collHistorial = facade.buscarPorUsuario(txtBuscarUser.getText());
            for (HistorialDTO dto : collHistorial) {
                modeloHistorial.addRow(new Object[] {
                        dto.getUser(), dto.getIngresGasto(), dto.getFecha(), dto.getHora()
                });
                numRegistros++;
            }
            if (numRegistros == 0) {
                mostrarHistorial();
                JOptionPane.showMessageDialog(null, "No se encontraron registros para el usuario ingresado");
            }
            txtBuscarUser.setText("");
        } else if (!"".equals(txtBuscarUser.getText()) && !"   -    -     ".equals(txtBuscarFecha.getText())) {
            collHistorial = facade.buscarPorUsuarioyFecha(txtBuscarUser.getText(), txtBuscarFecha.getText());
            for (HistorialDTO dto : collHistorial) {
                modeloHistorial.addRow(new Object[] {
                        dto.getUser(), dto.getIngresGasto(), dto.getFecha(), dto.getHora()
                });
                numRegistros++;
            }
            if (numRegistros == 0) {
                mostrarHistorial();
                JOptionPane.showMessageDialog(null, "No se encontraron registros para el usuario y la fecha ingresada");
            }
            txtBuscarUser.setText("");
            txtBuscarFecha.setText("");
        } else if ("".equals(txtBuscarUser.getText()) && "   -    -     ".equals(txtBuscarFecha.getText())) {
            mostrarHistorial();
            JOptionPane.showMessageDialog(null, "Ingrese valores para realizar la busqueda");
        }
        if (numRegistros > 0) {
            JOptionPane.showMessageDialog(null, numRegistros + " registros encontrados");
        }
    }

    public void setListaUsuarios() {
        iniciarTabla();
        Collection<UsuarioDTO> collAlerta = facade.BuscarUser();
        for (UsuarioDTO dto : collAlerta) {
            modeloUser.addRow(new Object[] {
                    dto.getNombre(), dto.getApellido(), dto.getCedula(),
                    dto.getUsuario(), dto.getTipo(), dto.getEstado()
            });
        }
    }

    private boolean actualizar_distribuidor(String dato) {
        boolean aux = true;
        Collection<DistribuidoresDTO> collDistribuidores = facade.consultarDistribidor();
        if (txtNomDistrib1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
            txtNomDistrib1.requestFocus();
            aux = false;
        } else if (txtCapDistrib1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La capacidad no puede estar vacia");
            txtCapDistrib1.requestFocus();
            aux = false;
        } else if (txtTimeNormDistrib1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El tiempo de entrega normal no puede estar vacio");
            txtTimeNormDistrib1.requestFocus();
            aux = false;
        } else if (txtTimeRetraDistrib1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El tiempo maximo de entrega  no puede estar vacio");
            txtTimeRetraDistrib1.requestFocus();
            aux = false;
        } else if (Integer.parseInt(txtTimeNormDistrib1.getText()) > Integer.parseInt(txtTimeRetraDistrib1.getText())) {
            JOptionPane.showMessageDialog(null, "El tiempo maximo no puede ser menor al tiempo normal");
            txtTimeRetraDistrib1.requestFocus();
            aux = false;
        } else {
            for (DistribuidoresDTO dto : collDistribuidores) {
                if ((txtNomDistrib1.getText().toLowerCase()).equals(dto.getNombre())
                        && !txtNomDistrib1.getText().toLowerCase()
                                .equals(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 0).toString())) {
                    JOptionPane.showMessageDialog(null, "distribuidor ya Existe");
                    txtNomDistrib1.requestFocus();
                    aux = false;
                }
            }
            if (aux == true) {
                facade.actualizarDistribuidor(txtNomDistrib1.getText(),
                        Float.parseFloat(txtCapDistrib1.getText()),
                        Integer.parseInt(txtTimeNormDistrib1.getText()),
                        Integer.parseInt(txtTimeRetraDistrib1.getText()),
                        dato);
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
                txtNomDistrib1.setText("");
                txtCapDistrib1.setText("");
                txtTimeNormDistrib1.setText("");
                txtTimeRetraDistrib1.setText("");
            }
        }
        return aux;
    }

    private class NuevasAccionesBtn extends AccionesBtns {
        @Override
        public void actionPerformed(ActionEvent e) {
            panelBienvenido.setVisible(false);
            panelNivelActual.setVisible(false);
            panelCloroUsado.setVisible(false);
            panelCloroRecibido.setVisible(false);
            panelActuDatos.setVisible(false);
            panelSeguridad.setVisible(false);
            panelAñadirDistribuidor.setVisible(false);
            panelActuDistrib.setVisible(false);
            panelDistribuidores.setVisible(false);
            panelHistorial.setVisible(false);
            panelUsuarios.setVisible(false);
            panelActDatosAlerta.setVisible(false);
            if (e.getSource() == btnNivelActual) {
                etiquetaCapacidadTotal.setVisible(false);
                entradaCapacidadTotal.setVisible(false);
                adornoCapacidadTotal.setVisible(false);
                btnAceptarModif.setVisible(false);
                btnModificarCapac.setVisible(true);

            }
            if (e.getSource() == btnModificarCapac) {
                etiquetaCapacidadTotal.setVisible(true);
                entradaCapacidadTotal.setVisible(true);
                adornoCapacidadTotal.setVisible(true);
                btnAceptarModif.setVisible(true);
                btnModificarCapac.setVisible(false);
                panelNivelActual.setVisible(true);
                entradaCapacidadTotal.requestFocus();
                entradaCapacidadTotal.setText("");
            }
            if (e.getSource() == btnSeguridad || e.getSource() == botonCancelarActu ||
                    e.getSource() == btnCancelarActuDatosAlerta) {
                setDatos();
                panelSeguridad.setVisible(true);
            }
            if (e.getSource() == btnActualizarDatosAlerta) {
                System.out.println("hola loco");
                txt_IP.setText(IP.getText());
                txt_Port.setText(port.getText());
                panelActDatosAlerta.setVisible(true);
                txt_IP.requestFocus();
            }
            if (e.getSource() == txt_IP || e.getSource() == txt_Port ||
                    e.getSource() == btnAceptarActuDatosAlerta) {
                panelActDatosAlerta.setVisible(true);
                if (IP.getText().equals(txt_IP.getText()) &&
                        port.getText().equals(txt_Port.getText())) {
                    JOptionPane.showMessageDialog(null, "No ha modificado sus datos");
                    panelSeguridad.setVisible(true);
                    panelActDatosAlerta.setVisible(false);
                } else {
                    facade.ActualizarAlerta(txt_IP.getText(),
                            Integer.parseInt(txt_Port.getText()));
                    JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
                    setDatos();
                    panelSeguridad.setVisible(true);
                    panelActDatosAlerta.setVisible(false);
                }
            }
            if (e.getSource() == btnAceptarModif || e.getSource() == entradaCapacidadTotal)

            {
                panelNivelActual.setVisible(true);
                Collection<CloroDTO> collCloro = facade.consultaCloro();
                if ("".equals(entradaCapacidadTotal.getText())) {
                    JOptionPane.showMessageDialog(null, "Ingrese una capacidad valida");
                } else {
                    for (CloroDTO dto : collCloro) {
                        if (Float.parseFloat(entradaCapacidadTotal.getText()) == (dto.getCapacidadTotal())) {
                            JOptionPane.showMessageDialog(null, "No ha modificado la capacidad total de la planta");
                        } else if (new BigDecimal(entradaCapacidadTotal.getText())
                                .compareTo(dto.getCantidadActual()) == 1 ||
                                new BigDecimal(entradaCapacidadTotal.getText())
                                        .compareTo(dto.getCantidadActual()) == 0) {
                            facade.ActualizarCloro(dto.getCantidadActual(),
                                    Float.parseFloat(entradaCapacidadTotal.getText()),
                                    dto.getCloroUsado(), dto.getIntentos());
                            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa ");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La capacidad expresada es menor a la cantidad de cloro que existe actualmente");
                        }
                    }
                }
                setNivelActual();
                etiquetaCapacidadTotal.setVisible(false);
                entradaCapacidadTotal.setVisible(false);
                adornoCapacidadTotal.setVisible(false);
                btnAceptarModif.setVisible(false);
                btnModificarCapac.setVisible(true);
            }
            if (e.getSource() == btnDistribuidores) {
                panelDistribuidores.setVisible(true);
                setListaDistribuidores();
            }
            if (e.getSource() == btnAñadirDistrib) {
                panelAñadirDistribuidor.setVisible(true);
                txtNomDistrib.requestFocus();
            }
            if (e.getSource() == btnAceptarDistrib || e.getSource() == txtTimeRetraDistrib) {
                panelAñadirDistribuidor.setVisible(true);
                if (validarDistribuidor()) {
                    panelAñadirDistribuidor.setVisible(false);
                    panelDistribuidores.setVisible(true);
                    setListaDistribuidores();
                }
            }
            if (e.getSource() == txtNomDistrib) {
                panelAñadirDistribuidor.setVisible(true);
                txtCapDistrib.requestFocus();
            }
            if (e.getSource() == txtCapDistrib) {
                panelAñadirDistribuidor.setVisible(true);
                txtTimeNormDistrib.requestFocus();
            }
            if (e.getSource() == txtTimeNormDistrib) {
                panelAñadirDistribuidor.setVisible(true);
                txtTimeRetraDistrib.requestFocus();
            }
            if (e.getSource() == btnCancelarDistrib || e.getSource() == btnCancelarActuDistrib) {
                panelDistribuidores.setVisible(true);
                txtNomDistrib.setText("");
                txtCapDistrib.setText("");
                txtTimeNormDistrib.setText("");
                txtTimeRetraDistrib.setText("");
            }
            if (e.getSource() == btnBorrarDistrib) {
                String dato;
                int sel = -1;
                panelDistribuidores.setVisible(true);
                if (tablaDistrib.getRowCount() > 0)
                    sel = tablaDistrib.getSelectedRow();
                if (sel >= 0) {
                    dato = (String) modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 0);
                    facade.eliminarDistribuidor(dato);
                    JOptionPane.showMessageDialog(null, "borrado Exitoso");
                } else
                    JOptionPane.showMessageDialog(null, "Selecciona una fila.");
                setListaDistribuidores();
            }
            if (e.getSource() == btnActuDistrib) {
                String dato;
                int sel = -1;
                if (tablaDistrib.getRowCount() > 0)
                    sel = tablaDistrib.getSelectedRow();
                if (sel >= 0) {
                    dato = (String) modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 0);
                    txtNomDistrib1.setText(dato);
                    txtCapDistrib1.setText(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 1).toString());
                    txtTimeNormDistrib1.setText(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 2).toString());
                    txtTimeRetraDistrib1.setText(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 3).toString());
                    panelActuDistrib.setVisible(true);
                    txtNomDistrib1.requestFocus();
                } else {
                    panelDistribuidores.setVisible(true);
                    setListaDistribuidores();
                    JOptionPane.showMessageDialog(null, "Selecciona una fila.");
                }
            }
            if (e.getSource() == btnAceptarActuDistrib || e.getSource() == txtNomDistrib1
                    || e.getSource() == txtCapDistrib1 || e.getSource() == txtTimeNormDistrib1
                    || e.getSource() == txtTimeRetraDistrib1) {
                panelActuDistrib.setVisible(true);
                if (txtNomDistrib1.getText().toLowerCase()
                        .equals(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 0).toString())
                        && txtCapDistrib1.getText().toLowerCase()
                                .equals(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 1).toString())
                        && txtTimeNormDistrib1.getText().toLowerCase()
                                .equals(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 2).toString())
                        && txtTimeRetraDistrib1.getText().toLowerCase()
                                .equals(modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 3).toString())) {
                    panelDistribuidores.setVisible(true);
                    panelActuDistrib.setVisible(false);
                    setListaDistribuidores();
                    JOptionPane.showMessageDialog(null, "No ha modificado los datos");
                } else if (actualizar_distribuidor(
                        modeloDistrib.getValueAt(tablaDistrib.getSelectedRow(), 0).toString())) {
                    panelDistribuidores.setVisible(true);
                    panelActuDistrib.setVisible(false);
                    setListaDistribuidores();
                }
            }
            if (e.getSource() == btnHistorial || e.getSource() == btnMostrarTodo) {
                panelHistorial.setVisible(true);
                mostrarHistorial();
            }
            if (e.getSource() == btnEliminarHistorial) {
                panelHistorial.setVisible(true);
                facade.eliminarHistorial();
                mostrarHistorial();
            }
            if (e.getSource() == btnBuscar || e.getSource() == txtBuscarUser || e.getSource() == txtBuscarFecha) {
                panelHistorial.setVisible(true);
                validarBusqueda();
            }
            if (e.getSource() == btnUsuarios) {
                panelUsuarios.setVisible(true);
                setListaUsuarios();
            }

            if (e.getSource() == btnBloquear) {
                panelUsuarios.setVisible(true);
                String estado, dato;
                int sel = -1;
                if (tablaUsers.getRowCount() > 0) {
                    sel = tablaUsers.getSelectedRow();
                }
                if (sel >= 0) {
                    dato = (String) modeloUser.getValueAt(tablaUsers.getSelectedRow(), 3);
                    estado = (String) modeloUser.getValueAt(tablaUsers.getSelectedRow(), 5);
                    if (estado.equals("Bloqueado")) {
                        JOptionPane.showMessageDialog(null, "El usuario ya esta bloqueado");
                    } else {
                        facade.actualizarUsuario("Bloqueado", dato);
                        JOptionPane.showMessageDialog(null, "Bloqueo Exitoso");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una fila.");
                }
                setListaUsuarios();
            }
            if (e.getSource() == btnDesbloquear) {
                panelUsuarios.setVisible(true);
                String estado, dato;
                int sel = -1;
                if (tablaUsers.getRowCount() > 0) {
                    sel = tablaUsers.getSelectedRow();
                }
                if (sel >= 0) {
                    dato = (String) modeloUser.getValueAt(tablaUsers.getSelectedRow(), 3);
                    estado = (String) modeloUser.getValueAt(tablaUsers.getSelectedRow(), 5);
                    if (estado.equals("Activo")) {
                        JOptionPane.showMessageDialog(null, "El usuario ya esta Activo");
                    } else {
                        facade.actualizarUsuario("Activo", dato);
                        JOptionPane.showMessageDialog(null, "Desbloqueo Exitoso");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una fila.");
                }
                setListaUsuarios();
            }
        }
    }

    private class NuevasAccionesTxt implements KeyListener {
        @Override
        public void keyTyped(KeyEvent evt) {
            if (evt.getSource() == entradaCapacidadTotal || evt.getSource() == txtCapDistrib
                    || evt.getSource() == txtCapDistrib1) {
                char caracter = evt.getKeyChar();
                JTextField aux = (JTextField) evt.getComponent();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')
                        && (caracter != '.') || aux.getText().length() == 8) {
                    evt.consume(); // ignorar el evento de teclado
                }
                if (caracter == '.' && aux.getText().contains(".")) {
                    evt.consume();
                }
                if ("".equals(aux.getText()) && caracter == '.')
                    aux.setText("0");
            }
            if (evt.getSource() == txtNomDistrib || evt.getSource() == txtNomDistrib1) {
                char caracter = evt.getKeyChar();
                JTextField aux = (JTextField) evt.getComponent();
                if ((caracter < 'a' || caracter > 'z' && caracter != 'ñ') &&
                        (caracter < 'A' || caracter > 'Z' && caracter != 'Ñ') ||
                        aux.getText().length() == 15) {
                    evt.consume(); // ignorar el evento de teclado
                }
            }
            if (evt.getSource() == txtTimeNormDistrib
                    || evt.getSource() == txtTimeRetraDistrib
                    || evt.getSource() == txtTimeNormDistrib1
                    || evt.getSource() == txtTimeRetraDistrib1) {
                char caracter = evt.getKeyChar();
                JTextField aux = (JTextField) evt.getComponent();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') ||
                        aux.getText().length() == 8) {
                    evt.consume(); // ignorar el evento de teclado
                }
            }
            if (evt.getSource() == txtBuscarUser) {
                char caracter = evt.getKeyChar();
                JTextField aux = (JTextField) evt.getComponent();
                if (aux.getText().length() == 10 || caracter == ' ') {
                    evt.consume(); // ignorar el evento de teclado
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent evt) {
        }

        @Override
        public void keyPressed(KeyEvent evt) {
        }
    }
}

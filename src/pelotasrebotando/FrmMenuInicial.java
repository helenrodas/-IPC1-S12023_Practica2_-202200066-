/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pelotasrebotando;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class FrmMenuInicial extends javax.swing.JFrame implements Observer {
    private ArrayList<JPanel> listaCuadradosInventario;
    private ArrayList<JPanel> listaCuadradosProduccion;
    private ArrayList<JPanel> listaCuadradosEmpaquetado;
    private ArrayList<JPanel> listaCuadradosSalida;
    private int count;
    int tiempoInventarioAsInt;
    int tiempoProduccionAsInt;
    int tiempoEmpaquetadoAsInt;
    int tiempoSalidaAsInt;
   
    public FrmMenuInicial() {
        initComponents();
        listaCuadradosInventario = new ArrayList<>();
        listaCuadradosProduccion = new ArrayList<>();
        listaCuadradosEmpaquetado = new ArrayList<>();
        listaCuadradosSalida = new ArrayList<>();
        count = 0;
        setExtendedState(FrmMenuInicial.MAXIMIZED_BOTH);
        
        setResizable(false);
        pack();

        lblImg.setVisible(false);
        
        setTitle("Inicio");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTiempoInventario = new javax.swing.JTextField();
        txtCostoInventario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTiempoProduccion = new javax.swing.JTextField();
        txtCostoProduccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTiempoEmpaquetado = new javax.swing.JTextField();
        txtCostoEmpaquetado = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoSalida = new javax.swing.JTextField();
        txtCostoSalida = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTiempoTotal = new javax.swing.JTextField();
        btnNuevaSiulacion = new javax.swing.JButton();
        jPanelSimulacion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanelProduccion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelInventario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanelEmpaquetado = new javax.swing.JPanel();
        jPanelSalida = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtContadorSalida = new javax.swing.JTextField();
        lblImg = new javax.swing.JLabel();
        txtContadorEmpaquetado = new javax.swing.JTextField();
        txtContadorInventario = new javax.swing.JTextField();
        txtContadorProduccion = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtContadorfinal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtContadorInicio = new javax.swing.JTextField();
        txtSalida1 = new javax.swing.JTextField();
        lblImg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a Monkey");

        jPanelDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Tiempo (S)");

        jLabel7.setText("Costo (Q/s)");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        txtTiempoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoInventarioActionPerformed(evt);
            }
        });

        txtCostoInventario.setText("3");
        txtCostoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoInventarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Produccion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        txtCostoProduccion.setText("3");

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(153, 204, 255));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Empaquetado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        txtTiempoEmpaquetado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoEmpaquetadoActionPerformed(evt);
            }
        });

        txtCostoEmpaquetado.setText("3");

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Salida");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtCostoSalida.setText("3");

        btnIniciar.setBackground(new java.awt.Color(204, 255, 204));
        btnIniciar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnIniciar.setText("Iniciar Simulacion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(204, 255, 204));
        btnReporte.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Tiempo Transcurrido: ");

        txtTiempoTotal.setEditable(false);

        btnNuevaSiulacion.setBackground(new java.awt.Color(204, 255, 204));
        btnNuevaSiulacion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnNuevaSiulacion.setText("Nueva Simulacion");
        btnNuevaSiulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSiulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtTiempoEmpaquetado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTiempoProduccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTiempoInventario))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCostoProduccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtCostoEmpaquetado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCostoSalida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCostoInventario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41))))
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTiempoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 166, Short.MAX_VALUE))
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevaSiulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTiempoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTiempoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTiempoEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTiempoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporte)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaSiulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTiempoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelSimulacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("Produccion");

        jPanelProduccion.setBackground(new java.awt.Color(204, 255, 204));
        jPanelProduccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanelProduccion.setLayout(new java.awt.GridLayout(6, 5, 1, 1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("Inventario: ");

        jPanelInventario.setBackground(new java.awt.Color(255, 204, 204));
        jPanelInventario.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanelInventario.setLayout(new java.awt.GridLayout(6, 5, 1, 1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPelotas/FlechaIzquierda64.png"))); // NOI18N

        jPanelEmpaquetado.setBackground(new java.awt.Color(102, 204, 255));
        jPanelEmpaquetado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanelEmpaquetado.setLayout(new java.awt.GridLayout(6, 5, 1, 1));

        jPanelSalida.setBackground(new java.awt.Color(255, 204, 153));
        jPanelSalida.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanelSalida.setLayout(new java.awt.GridLayout(6, 5, 1, 1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("Empaquetado");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPelotas/FlechaArriba64.png"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPelotas/FlechaAbajo.png"))); // NOI18N
        jLabel25.setText("l");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setText("Salida");

        txtContadorSalida.setEditable(false);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPelotas/esferaInicial.png"))); // NOI18N

        txtContadorEmpaquetado.setEditable(false);

        txtContadorInventario.setEditable(false);

        txtContadorProduccion.setEditable(false);
        txtContadorProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContadorProduccionActionPerformed(evt);
            }
        });

        txtSalida.setEditable(false);
        txtSalida.setBackground(new java.awt.Color(255, 255, 204));
        txtSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalida.setText("Salida");
        txtSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalidaActionPerformed(evt);
            }
        });

        txtContadorfinal.setEditable(false);

        jLabel13.setText("Contador:");

        jLabel16.setText("Contador:");

        txtContadorInicio.setEditable(false);

        txtSalida1.setEditable(false);
        txtSalida1.setBackground(new java.awt.Color(255, 255, 204));
        txtSalida1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalida1.setText("Inicio");
        txtSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalida1ActionPerformed(evt);
            }
        });

        lblImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPelotas/esferaInicial.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSimulacionLayout = new javax.swing.GroupLayout(jPanelSimulacion);
        jPanelSimulacion.setLayout(jPanelSimulacionLayout);
        jPanelSimulacionLayout.setHorizontalGroup(
            jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContadorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContadorEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContadorfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg1)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                            .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtContadorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(114, 114, 114))
                        .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImg)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContadorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addGap(18, 18, 18)))
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContadorProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
        );
        jPanelSimulacionLayout.setVerticalGroup(
            jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtContadorProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel11)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtContadorEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContadorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                            .addComponent(txtContadorfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblImg1))
                                    .addComponent(jLabel25))
                                .addGap(31, 31, 31)
                                .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContadorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImg)
                            .addGroup(jPanelSimulacionLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContadorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        StringBuilder htmlCodigo = new StringBuilder();
        
        //--Datos costo Inventario
        String costoInventario = txtCostoInventario.getText().trim();
        int costoInventarioAsInt = Integer.parseInt(costoInventario);
        String tiempoInventario = txtTiempoInventario.getText().trim();
        int tiempoInventarioAsInt = Integer.parseInt(tiempoInventario);
        int costoTotalInventario = costoInventarioAsInt * tiempoInventarioAsInt * 30; 
        String costoTotalInventarioAsString  = String.valueOf(costoTotalInventario);
        
        //--Datos costo Produccion
        String costoProduccion = txtCostoProduccion.getText().trim();
        int costoProduccionAsInt = Integer.parseInt(costoProduccion);
        String tiempoProduccion = txtTiempoProduccion.getText().trim();
        int tiempoProduccionAsInt = Integer.parseInt(tiempoProduccion);
        int costoTotalProduccion = costoProduccionAsInt * tiempoProduccionAsInt * 30; 
        String costoTotalProduccionAsString  = String.valueOf(costoTotalProduccion);
        
        //--Datos costo Empaquetado
        String costoEmpaquetado = txtCostoEmpaquetado.getText().trim();
        int costoEmpaquetadoAsInt = Integer.parseInt(costoEmpaquetado);
        String tiempoEmpaquetado = txtTiempoEmpaquetado.getText().trim();
        int tiempoEmpaquetadoAsInt = Integer.parseInt(tiempoEmpaquetado);
        int costoTotalEmpaquetado = costoEmpaquetadoAsInt * tiempoEmpaquetadoAsInt * 30; 
        String costoTotalEmpaquetadoAsString  = String.valueOf(costoTotalEmpaquetado);
        
        //--Datos costo Salida
        String costoSalida = txtCostoSalida.getText().trim();
        int costoSalidaAsInt = Integer.parseInt(costoSalida);
        String tiempoSalida = txtTiempoSalida.getText().trim();
        int tiempoSalidaAsInt = Integer.parseInt(tiempoSalida);
        int costoTotalSalida = costoSalidaAsInt * tiempoSalidaAsInt * 30; 
        String costoTotalSalidaAsString  = String.valueOf(costoTotalSalida);
        
        int costoTotalAsInt = costoTotalInventario + costoTotalProduccion + costoTotalEmpaquetado + costoTotalSalida;
        String costoTotalAsString = String.valueOf(costoTotalAsInt);

        htmlCodigo.append("<!DOCTYPE html>");
        htmlCodigo.append("<html lang=\"en\">");
        htmlCodigo.append("<head>");
        htmlCodigo.append("<meta charset=\"UTF-8\">");
        htmlCodigo.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        htmlCodigo.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        htmlCodigo.append("<title>Reportes</title>");
        htmlCodigo.append("</head>");
        htmlCodigo.append("<center>");
        htmlCodigo.append("<h1>Reportes Monkey</h1>");
        htmlCodigo.append("<h3>Usuario: Helen Rodas || Carne: 202200066</h3>");
        htmlCodigo.append("<body style=\"background-color:rgb(178, 237, 245);\">");
        htmlCodigo.append("<table border=\"3\">");
        htmlCodigo.append("<thead>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<th style=\"background-color:rgb(133, 186, 255); ;\">Sector</th>");
        htmlCodigo.append("<th style=\"background-color:rgb(133, 186, 255); ;\">Tiempo de Produccion</th>");
        htmlCodigo.append("<th style=\"background-color:rgb(133, 186, 255); ;\">Costo de Produccion</th>");
        htmlCodigo.append(" <th style=\"background-color:rgb(133, 186, 255); ;\">Cantidad Materia Prima</th>");
        htmlCodigo.append("<th style=\"background-color:rgb(133, 186, 255); ;\">Costo Total</th>");
        htmlCodigo.append(" </tr>");
        htmlCodigo.append("</thead>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<td>Inventario</td>");
        htmlCodigo.append("<td>" + tiempoInventario + " segundos</td>");
        htmlCodigo.append("<td>Q " + costoInventario + "</td>");
        htmlCodigo.append("<td>30 productos</td>");
        htmlCodigo.append("<td>Q " + costoTotalInventarioAsString + "</td>");
        htmlCodigo.append("</tr>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<td>Produccion</td>");
        htmlCodigo.append("<td>" + tiempoProduccion + " segundos</td>");
        htmlCodigo.append("<td>Q " + costoProduccion + "</td>");
        htmlCodigo.append("<td>30 productos</td>");
        htmlCodigo.append("<td>Q " + costoTotalProduccionAsString + "</td>");
        htmlCodigo.append("</tr>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<td>Empaquetado</td>");
        htmlCodigo.append("<td>" + tiempoEmpaquetado + " segundos</td>");
        htmlCodigo.append("<td>Q " + costoEmpaquetado + "</td>");
        htmlCodigo.append("<td>30 productos</td>");
        htmlCodigo.append("<td>Q " + costoTotalEmpaquetadoAsString + "</td>");
        htmlCodigo.append("</tr>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<td>Salida</td>");
        htmlCodigo.append("<td>" + tiempoSalida + " segundos</td>");
        htmlCodigo.append("<td>Q " + costoSalida + "</td>");
        htmlCodigo.append("<td>30 productos</td>");
        htmlCodigo.append("<td>Q " + costoTotalSalidaAsString + "</td>");
        htmlCodigo.append("</tr>");
        htmlCodigo.append("<tr>");
        htmlCodigo.append("<td>Totoal</td>");
        htmlCodigo.append("<td>----</td>");
        htmlCodigo.append("<td>----</td>");
        htmlCodigo.append("<td>----</td>");
        htmlCodigo.append("<td>Q " + costoTotalAsString +  "</td>");
        htmlCodigo.append("</tr>");
        htmlCodigo.append("</table> ");
        htmlCodigo.append("<h3>El total de costos es de: Q " + costoTotalAsString + "</h3>");
        htmlCodigo.append("</body>");
        htmlCodigo.append("</center>");
        htmlCodigo.append("</html>");
        
        try {

            File file = new File("src/ReporteMonkeyPDF/reportePdf" + ".html");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(htmlCodigo.toString());
            fileWriter.close();

            Desktop.getDesktop().open(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

       int tiempoAnterior = 0;
       String tiempoInventario = txtTiempoInventario.getText().trim();
       String costoInventario = txtCostoInventario.getText().trim();
       String tiempoProduccion = txtTiempoProduccion.getText().trim();
       String costoProduccion = txtCostoProduccion.getText().trim();
       String tiempoEmpaquetado = txtTiempoEmpaquetado.getText().trim();
       String costoEmpaquetado = txtCostoEmpaquetado.getText().trim();
       String tiempoSalida = txtTiempoSalida.getText().trim();
       String costoSalida = txtCostoSalida.getText().trim();
       
       //---Validacion para saber si los campos estan vacios
        if(tiempoInventario.isEmpty()|| costoInventario.isEmpty() || tiempoProduccion.isEmpty() ||
           costoProduccion.isEmpty() || tiempoEmpaquetado.isEmpty() || costoEmpaquetado.isEmpty() ||
           tiempoSalida.isEmpty() || costoSalida.isEmpty()){
            
           JOptionPane.showMessageDialog(this,"Todos los campos son requeridos!","Error", JOptionPane.ERROR_MESSAGE);
           
           return;
        }
        
        //---Validacion para que solo ingrese numeros enteros
        try {
             tiempoInventarioAsInt = Integer.parseInt(tiempoInventario);
            int costoInventarioAsInt = Integer.parseInt(costoInventario);
            tiempoProduccionAsInt = Integer.parseInt(tiempoProduccion);
            int costoProduccionAsInt = Integer.parseInt(costoProduccion);
            tiempoEmpaquetadoAsInt = Integer.parseInt(tiempoEmpaquetado);
            int costoEmpaquetadoASInt = Integer.parseInt(costoEmpaquetado);
            tiempoSalidaAsInt = Integer.parseInt(tiempoSalida);
            int costoSalidaAsInt = Integer.parseInt(costoSalida);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //---Validacion para que ingrese numeros mayores a 1
        if(tiempoInventario.equals("1") || costoInventario.equals("1") || tiempoProduccion.equals("1") || 
           costoProduccion.equals("1") || tiempoEmpaquetado.equals("1") || costoEmpaquetado.equals("1") || 
           tiempoSalida.equals("1") || costoSalida.equals("1")){
            JOptionPane.showMessageDialog(null, "Los valores deben ser mayores a 1.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        //---Validacion para que ingrese numeros mayores al anterior ingresado
        try {
            int tiempoInventarioAsInt = Integer.parseInt(tiempoInventario);
            if (tiempoInventarioAsInt <= tiempoAnterior) {
                JOptionPane.showMessageDialog(null, "El tiempo de inventario debe ser mayor a 1", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            tiempoAnterior = tiempoInventarioAsInt;

            int tiempoProduccionAsInt = Integer.parseInt(tiempoProduccion);
            if (tiempoProduccionAsInt <= tiempoAnterior) {
                JOptionPane.showMessageDialog(null, "El tiempo de producción debe ser mayor al tiempo anterior.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            tiempoAnterior = tiempoProduccionAsInt;

            int tiempoEmpaquetadoAsInt = Integer.parseInt(tiempoEmpaquetado);
            if (tiempoEmpaquetadoAsInt <= tiempoAnterior) {
                JOptionPane.showMessageDialog(null, "El tiempo de empaquetado debe ser mayor al tiempo anterior.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            tiempoAnterior = tiempoEmpaquetadoAsInt;

            int tiempoSalidaAsInt = Integer.parseInt(tiempoSalida);
            if (tiempoSalidaAsInt <= tiempoAnterior) {
                JOptionPane.showMessageDialog(null, "El tiempo de salida debe ser mayor al tiempo anterior.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            tiempoAnterior = tiempoSalidaAsInt;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        
        
        
        
       //---Conversion de Segundos ingresados a milisegundos
        //String tiempoInventario = txtTiempoInventario.getText().trim();
        //int tiempoInventarioAsInt = Integer.parseInt(tiempoInventario);
        int tiempoInventarioMilisegundos = tiempoInventarioAsInt * 1000;
        
       // String tiempoProduccion = txtTiempoProduccion.getText().trim();
        //int tiempoProduccionAsInt = Integer.parseInt(tiempoProduccion);
        int tiempoProduccionMilisegundos = tiempoProduccionAsInt * 1000;
        
        //String tiempoEmpaquetado = txtTiempoEmpaquetado.getText().trim();
       // int tiempoEmpaquetadoAsInt = Integer.parseInt(tiempoEmpaquetado);
        int tiempoEmpaquetadoMilisegundos = tiempoEmpaquetadoAsInt * 1000;
        
        //String tiempoSalida = txtTiempoSalida.getText().trim();
        //int tiempoSalidaAsInt = Integer.parseInt(tiempoSalida);
        int tiempoSalidaMilisegundos = tiempoSalidaAsInt * 1000;
        
        this.btnIniciar.setEnabled(false);
        lblImg.setVisible(true);
        
        //---Inicializo cuadros en blanco en los paneles
        InitPanel(listaCuadradosInventario, jPanelInventario);
        InitPanel(listaCuadradosProduccion, jPanelProduccion);
        InitPanel(listaCuadradosEmpaquetado, jPanelEmpaquetado);
        InitPanel(listaCuadradosSalida, jPanelSalida);
        
        //---Cambio de color de los cuadros con hilos
        CColorCuadros SetearInvRojo = new CColorCuadros(listaCuadradosInventario ,1000, Color.RED);
        CColorCuadros SetearInvBlanco = new CColorCuadros(listaCuadradosInventario ,tiempoInventarioMilisegundos, Color.WHITE);

        SetearInvRojo.start();
        SetearInvBlanco.start();
        
        CColorCuadros AgregarColorVerde = new CColorCuadros(listaCuadradosProduccion ,tiempoInventarioMilisegundos, Color.GREEN);
        CColorCuadros AgregarColorBlancoEnVerde = new CColorCuadros(listaCuadradosProduccion ,tiempoProduccionMilisegundos, Color.WHITE);

        AgregarColorVerde.start();
        AgregarColorBlancoEnVerde.start();
        
        CColorCuadros AgregarColorAzul = new CColorCuadros(listaCuadradosEmpaquetado ,tiempoProduccionMilisegundos, Color.BLUE);
        CColorCuadros AgregarColorBlancoEnAzul = new CColorCuadros(listaCuadradosEmpaquetado ,tiempoEmpaquetadoMilisegundos, Color.WHITE);

        AgregarColorAzul.start();
        AgregarColorBlancoEnAzul.start();
        
        CColorCuadros AgregarColorAnaranjado = new CColorCuadros(listaCuadradosSalida ,tiempoEmpaquetadoMilisegundos, Color.ORANGE);
        CColorCuadros AgregarColorBlancoEnAnaranjado = new CColorCuadros(listaCuadradosSalida ,tiempoSalidaMilisegundos, Color.WHITE);

        AgregarColorAnaranjado.start();
        AgregarColorBlancoEnAnaranjado.start();
        
        //Se maneja el temporizador
        CRelojDigital r = new CRelojDigital(00, 00, 00);
        r.addObserver(this);
        Thread cronometro = new Thread(r);
        cronometro.start();
        txtTiempoTotal.setEditable(false);
        
        //Se inicializa el hilo encargado de la primera bolita
        CBolaInicial bolaInicial = new CBolaInicial(lblImg, txtContadorInicio);
        bolaInicial.start();
        
        //Se inicializa el hilo encargado de la ultima bolita
        CBolaFinal bolaFinal = new CBolaFinal(lblImg1, txtContadorfinal, tiempoSalidaMilisegundos,r);
        bolaFinal.start();
        
              
        Thread t = new Thread(new Runnable() {
         public void run() {
            while (true) {
                repaint();
                
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
           }
         }
        });
         t.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void InitPanel(ArrayList<JPanel> listaCuados, JPanel panel ){
        for (int i = 0; i < 30; i++) {
            JPanel cuadrado = new JPanel();
            cuadrado.setVisible(true);
            cuadrado.setName("");
            cuadrado.setBackground(Color.WHITE);
            panel.add(cuadrado);
            listaCuados.add(cuadrado);
        }
    }
    
    private void txtSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalidaActionPerformed

    private void txtContadorProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContadorProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContadorProduccionActionPerformed

    private void txtSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalida1ActionPerformed

    private void txtCostoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoInventarioActionPerformed

    private void btnNuevaSiulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSiulacionActionPerformed

        
        
        FrmMenuInicial mn = new FrmMenuInicial();
        //mn.registros.clear();
                txtTiempoInventario.setText("");
        txtTiempoProduccion.setText("");
        txtTiempoEmpaquetado.setText("");
        txtTiempoSalida.setText("");
        txtContadorInventario.setText("");
        txtContadorProduccion.setText("");
        txtContadorEmpaquetado.setText("");
        txtContadorSalida.setText("");
        txtTiempoTotal.setText("");
        txtContadorInicio.setText("");
        txtContadorfinal.setText("");
        
        listaCuadradosInventario = new ArrayList<>();
        listaCuadradosProduccion = new ArrayList<>();
        listaCuadradosEmpaquetado = new ArrayList<>();
        listaCuadradosSalida = new ArrayList<>();
        count = 0;
        mn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnNuevaSiulacionActionPerformed

    private void txtTiempoEmpaquetadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoEmpaquetadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoEmpaquetadoActionPerformed

    private void txtTiempoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoInventarioActionPerformed

    }//GEN-LAST:event_txtTiempoInventarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNuevaSiulacion;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelEmpaquetado;
    private javax.swing.JPanel jPanelInventario;
    private javax.swing.JPanel jPanelProduccion;
    private javax.swing.JPanel jPanelSalida;
    private javax.swing.JPanel jPanelSimulacion;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JTextField txtContadorEmpaquetado;
    private javax.swing.JTextField txtContadorInicio;
    private javax.swing.JTextField txtContadorInventario;
    private javax.swing.JTextField txtContadorProduccion;
    private javax.swing.JTextField txtContadorSalida;
    private javax.swing.JTextField txtContadorfinal;
    private javax.swing.JTextField txtCostoEmpaquetado;
    private javax.swing.JTextField txtCostoInventario;
    private javax.swing.JTextField txtCostoProduccion;
    private javax.swing.JTextField txtCostoSalida;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtSalida1;
    private javax.swing.JTextField txtTiempoEmpaquetado;
    private javax.swing.JTextField txtTiempoInventario;
    private javax.swing.JTextField txtTiempoProduccion;
    private javax.swing.JTextField txtTiempoSalida;
    private javax.swing.JTextField txtTiempoTotal;
    // End of variables declaration//GEN-END:variables

@Override
    public void update(Observable o, Object arg) {
        txtTiempoTotal.setText((String) arg);
    }
}

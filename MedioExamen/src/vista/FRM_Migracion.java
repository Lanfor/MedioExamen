/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Migracion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lanfor
 */
public class FRM_Migracion extends javax.swing.JFrame {

    Controlador_FRM_Migracion controlador_FRM_Migracion;
    DefaultTableModel modelo;
    public FRM_Migracion() {
        initComponents();
        controlador_FRM_Migracion=new Controlador_FRM_Migracion(this);
        agregarEventos();
        modelo=new DefaultTableModel();
        jtbl_Tabla.setModel(modelo);
        colocarTitulosTabla();
    }
    
    public void colocarTitulosTabla()
    {
        String[] titulos={"Cédula","Nombre","Edad","Fecha","Priorida"};
        modelo.setColumnIdentifiers(titulos);
    }
    public void agregarEventos()
    {
        btn_Registrar.addActionListener(controlador_FRM_Migracion);
        btn_Cancelar.addActionListener(controlador_FRM_Migracion);
        btn_Modificar.addActionListener(controlador_FRM_Migracion);
        btn_Atendiendo.addActionListener(controlador_FRM_Migracion);
        btn_Mayor.addActionListener(controlador_FRM_Migracion);
        btn_Menor.addActionListener(controlador_FRM_Migracion);
        btn_Reporte.addActionListener(controlador_FRM_Migracion);
        btn_Limpiar.addActionListener(controlador_FRM_Migracion);
    }
    
    public void colocarCantPersonas(String msj)
    {
        jl_CantPersonas.setText("Cant.Personas: "+msj);
    }
    
    public void colocarPromedio(String msj)
    {
        jl_PromedioEdades.setText("Promedio de Edades: "+msj);
    }
    public void mostarReporte(String msj)
    {
        jt_Pizarra2.setText(msj);
    }
    
    public void limpiarPizarra2()
    {
        jt_Pizarra2.setText("");
    }
    public String[] getInformacionCliente()
    {
        String[] info={jt_Cedula.getText(),jt_Nombre.getText(),jcb_Prioridad.getSelectedItem()+"",jt_Edad.getText(),jt_Fecha.getText()};
        return info;
    }
    
    public void mostrarInformacion(String info[])
    {
        
    }
    
    public void resetGUI()
    {
        jt_Nombre.setText("");
        jt_Edad.setText("");
        jt_Cedula.setText("");
        jt_Fecha.setText("");
    }
    
    public void mensaje(String msj)
    {
        JOptionPane.showMessageDialog(this, msj);
    }
    
    public void mostrarEnPantalla(String msj)
    {
        jt_Pizarra.setText(msj);
    }
    
    public void limpiarTabla()
    {
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
    }
    
    public void colocarFilas(String arreglo[])
    {
        modelo.addRow(arreglo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_EntregaFichas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_Edad = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        jcb_Prioridad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        jt_Fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Modificar = new javax.swing.JButton();
        panel_LLamarCliente = new javax.swing.JPanel();
        btn_Atendiendo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Pizarra = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_Tabla = new javax.swing.JTable();
        btn_Menor = new javax.swing.JButton();
        btn_Mayor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_Pizarra2 = new javax.swing.JTextArea();
        btn_Reporte = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jl_PromedioEdades = new javax.swing.JLabel();
        jl_CantPersonas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Departamento de Migración");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel5.setText("Prioridad:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad:");

        btn_Registrar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Registrar.setText("Registrar");

        jcb_Prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "7600" }));

        jLabel7.setText("Cédula:");

        btn_Cancelar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Cancelar.setText("Cancelar");

        jLabel4.setText("Fecha:");

        btn_Modificar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Modificar.setText("Modificar");

        javax.swing.GroupLayout panel_EntregaFichasLayout = new javax.swing.GroupLayout(panel_EntregaFichas);
        panel_EntregaFichas.setLayout(panel_EntregaFichasLayout);
        panel_EntregaFichasLayout.setHorizontalGroup(
            panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EntregaFichasLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_EntregaFichasLayout.createSequentialGroup()
                            .addComponent(btn_Registrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_Cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_Modificar))
                        .addGroup(panel_EntregaFichasLayout.createSequentialGroup()
                            .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(44, 44, 44)
                            .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_Nombre)
                                    .addComponent(jcb_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jt_Cedula))))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        panel_EntregaFichasLayout.setVerticalGroup(
            panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EntregaFichasLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcb_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EntregaFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Cancelar)
                        .addComponent(btn_Modificar))
                    .addComponent(btn_Registrar))
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("Entrega de Fichas", panel_EntregaFichas);

        btn_Atendiendo.setForeground(new java.awt.Color(0, 153, 153));
        btn_Atendiendo.setText("Atendiendo");

        jt_Pizarra.setEditable(false);
        jt_Pizarra.setColumns(20);
        jt_Pizarra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_Pizarra.setForeground(new java.awt.Color(0, 153, 153));
        jt_Pizarra.setRows(5);
        jScrollPane1.setViewportView(jt_Pizarra);

        javax.swing.GroupLayout panel_LLamarClienteLayout = new javax.swing.GroupLayout(panel_LLamarCliente);
        panel_LLamarCliente.setLayout(panel_LLamarClienteLayout);
        panel_LLamarClienteLayout.setHorizontalGroup(
            panel_LLamarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LLamarClienteLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(panel_LLamarClienteLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btn_Atendiendo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_LLamarClienteLayout.setVerticalGroup(
            panel_LLamarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LLamarClienteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btn_Atendiendo)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LLamar Cliente", panel_LLamarCliente);

        jtbl_Tabla.setBackground(new java.awt.Color(51, 51, 51));
        jtbl_Tabla.setFont(new java.awt.Font("HP Simplified", 2, 18)); // NOI18N
        jtbl_Tabla.setForeground(new java.awt.Color(0, 153, 153));
        jtbl_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtbl_Tabla);

        btn_Menor.setText("<");

        btn_Mayor.setText(">");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Ordenar Clientes por Edades");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Menor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Mayor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Menor)
                    .addComponent(btn_Mayor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Ordenar", jPanel1);

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Reportes");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jt_Pizarra2.setEditable(false);
        jt_Pizarra2.setColumns(20);
        jt_Pizarra2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_Pizarra2.setForeground(new java.awt.Color(0, 153, 153));
        jt_Pizarra2.setRows(5);
        jScrollPane4.setViewportView(jt_Pizarra2);

        btn_Reporte.setText("Generar Reporte");

        btn_Limpiar.setText("Limpiar");

        jl_PromedioEdades.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jl_PromedioEdades.setForeground(new java.awt.Color(0, 102, 255));
        jl_PromedioEdades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_PromedioEdades.setText("Promedio de Edades:");
        jl_PromedioEdades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jl_CantPersonas.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jl_CantPersonas.setForeground(new java.awt.Color(0, 102, 255));
        jl_CantPersonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_CantPersonas.setText("Cant.Personas:");
        jl_CantPersonas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_PromedioEdades, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jl_CantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btn_Reporte)
                                    .addGap(51, 51, 51)
                                    .addComponent(btn_Limpiar)
                                    .addGap(101, 101, 101))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_PromedioEdades)
                    .addComponent(jl_CantPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_Reporte))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Reportes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Migracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atendiendo;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Mayor;
    private javax.swing.JButton btn_Menor;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcb_Prioridad;
    private javax.swing.JLabel jl_CantPersonas;
    private javax.swing.JLabel jl_PromedioEdades;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Edad;
    private javax.swing.JTextField jt_Fecha;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextArea jt_Pizarra;
    private javax.swing.JTextArea jt_Pizarra2;
    private javax.swing.JTable jtbl_Tabla;
    private javax.swing.JPanel panel_EntregaFichas;
    private javax.swing.JPanel panel_LLamarCliente;
    // End of variables declaration//GEN-END:variables
}

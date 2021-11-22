/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Method.MantencionDepartamentoMethod;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author thoma
 */
public class VistaMantencionDepartamento extends javax.swing.JFrame {
    MantencionDepartamentoMethod mdm = new MantencionDepartamentoMethod();
    /**
     * Creates new form VistaMantencionDepartamento
     */
    public VistaMantencionDepartamento() {
        initComponents();
        setLocationRelativeTo(null);
         mdm.cargarTablaMantencionDepartamentosEnMantencion(TablaDepartamentosEnMantencion);
         mdm.cargarTablaMantencionDepartamentos(tablaMantencionDepartamentos);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMantencionDepartamentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FechaInicioMantencion = new com.toedter.calendar.JDateChooser();
        fechaTerminoMantencion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtIdDepartamentoMantencion = new javax.swing.JTextField();
        btonRefrescarTablaMantencionDepartamento = new javax.swing.JButton();
        btonAgregarDepartamento = new javax.swing.JButton();
        txtCostoDepartamentoMantencion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDepartamentosEnMantencion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtDepartamentoEnMantenimiento2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        refrescarTablaDepartamentos2 = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaMantencionDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Direccion", "Costo", "Estado", "Descripcion", "Orientacion", "Estacionamiento", "NumHabitaciones", "NumBaños", "NumEstacionamiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMantencionDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMantencionDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMantencionDepartamentos);

        jLabel1.setText("Fecha Inicio mantencion");

        jLabel2.setText("Fecha termino mantencion");

        jLabel3.setText("ID Departamento");

        btonRefrescarTablaMantencionDepartamento.setText("Refrescar tabla");
        btonRefrescarTablaMantencionDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonRefrescarTablaMantencionDepartamentoActionPerformed(evt);
            }
        });

        btonAgregarDepartamento.setText("Agregar a mantencion");
        btonAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonAgregarDepartamentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Costo");

        TablaDepartamentosEnMantencion.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDepartamentosEnMantencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDepartamentosEnMantencionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDepartamentosEnMantencion);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Departamentos en Mantencion");

        jLabel6.setText("idDepartamento");

        jButton1.setText("Sacar de mantencion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refrescarTablaDepartamentos2.setText("Refrescar tabla");
        refrescarTablaDepartamentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarTablaDepartamentos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(btonRefrescarTablaMantencionDepartamento))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btonAgregarDepartamento))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FechaInicioMantencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaTerminoMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdDepartamentoMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostoDepartamentoMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartamentoEnMantenimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(refrescarTablaDepartamentos2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdDepartamentoMantencion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(FechaInicioMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCostoDepartamentoMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(fechaTerminoMantencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonRefrescarTablaMantencionDepartamento)
                    .addComponent(btonAgregarDepartamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartamentoEnMantenimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1)
                    .addComponent(refrescarTablaDepartamentos2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMantencionDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMantencionDepartamentosMouseClicked
        int fila = tablaMantencionDepartamentos.getSelectedRow();
        String codigo = tablaMantencionDepartamentos.getValueAt(fila, 0).toString();

        mdm.PasarDatosTablasACampos(codigo,txtIdDepartamentoMantencion);
    }//GEN-LAST:event_tablaMantencionDepartamentosMouseClicked

    private void btonRefrescarTablaMantencionDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonRefrescarTablaMantencionDepartamentoActionPerformed
        mdm.cargarTablaMantencionDepartamentos(tablaMantencionDepartamentos);
    }//GEN-LAST:event_btonRefrescarTablaMantencionDepartamentoActionPerformed

    private void btonAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonAgregarDepartamentoActionPerformed
        Date f1 = FechaInicioMantencion.getDate();
        Date ft = fechaTerminoMantencion.getDate();
        
        mdm.agregarDepartamentoMantencion(txtIdDepartamentoMantencion,f1, ft, txtCostoDepartamentoMantencion);
    }//GEN-LAST:event_btonAgregarDepartamentoActionPerformed

    private void TablaDepartamentosEnMantencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDepartamentosEnMantencionMouseClicked
        int fila = TablaDepartamentosEnMantencion.getSelectedRow();
        String codigo = TablaDepartamentosEnMantencion.getValueAt(fila, 0).toString();
        mdm.PasarDatosTablasACampos2(codigo, txtDepartamentoEnMantenimiento2);

    }//GEN-LAST:event_TablaDepartamentosEnMantencionMouseClicked

    private void refrescarTablaDepartamentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarTablaDepartamentos2ActionPerformed
        mdm.cargarTablaMantencionDepartamentosEnMantencion(TablaDepartamentosEnMantencion);
    }//GEN-LAST:event_refrescarTablaDepartamentos2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtDepartamentoEnMantenimiento2.equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar o ingresar el id del departamento que desea actualizar");
        }
        else{
        mdm.ActualizarEstadoDepartamentoADisponible(txtDepartamentoEnMantenimiento2);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMantencionDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMantencionDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMantencionDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMantencionDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMantencionDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser FechaInicioMantencion;
    public javax.swing.JTable TablaDepartamentosEnMantencion;
    public javax.swing.JButton btonAgregarDepartamento;
    private javax.swing.JButton btonRefrescarTablaMantencionDepartamento;
    public com.toedter.calendar.JDateChooser fechaTerminoMantencion;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    public javax.swing.JButton refrescarTablaDepartamentos2;
    public javax.swing.JTable tablaMantencionDepartamentos;
    public javax.swing.JTextField txtCostoDepartamentoMantencion;
    public javax.swing.JTextField txtDepartamentoEnMantenimiento2;
    private javax.swing.JTextField txtIdDepartamentoMantencion;
    // End of variables declaration//GEN-END:variables
}

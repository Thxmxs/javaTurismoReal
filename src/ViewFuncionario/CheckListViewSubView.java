/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewFuncionario;

import ControllerFuncionario.CheckListController;
import Method.funcionario.CheckListMethod;
import Model.Funcionario.CheckList;
import Model.Funcionario.Departamento;
import Model.Funcionario.DetalleCheckList;
import Model.Funcionario.ObjetoHabitacion;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckListViewSubView extends javax.swing.JFrame {
    ObjetoHabitacion oh = new ObjetoHabitacion();
    Departamento dep = new Departamento();
    CheckList cl = new CheckList();
    DetalleCheckList dcl = new DetalleCheckList();
    CheckListController clc = new CheckListController();
    CheckListMethod clm = new CheckListMethod();
    DetalleCheckList detalle = new DetalleCheckList();
    
    
    /**
     * Creates new form CheckListViewSubView
     */
    public CheckListViewSubView() {
        initComponents();
        
        
    }

    CheckListViewSubView(int iddep) {
        initComponents();
        setLocationRelativeTo(null);
        CheckListController clc = new CheckListController();
        ArrayList<ObjetoHabitacion> objeto = new ArrayList<ObjetoHabitacion>();
        objeto = clc.listarObjetoHabitacionCheckList(iddep);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = clc.updateTableSubCheckList(objeto);
        jTableInventario.setModel(modelo);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblObservaciones = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        lblEstado = new javax.swing.JLabel();
        btnCrearCheckList = new javax.swing.JButton();
        comboBoxEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblObservaciones.setText("Observaciones");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtaObservaciones);

        lblEstado.setText("Estado");

        btnCrearCheckList.setText("Ingresar Estado");
        btnCrearCheckList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCheckListActionPerformed(evt);
            }
        });

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Muy malo", "Malo", "No se utilizo", "No hubo cambios", "Bueno", "Muy bueno" }));

        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableInventario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblEstado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(lblObservaciones)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearCheckList))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblObservaciones))
                    .addComponent(btnCrearCheckList))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        CheckListView clv = new CheckListView();
        clv.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCrearCheckListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCheckListActionPerformed
        boolean resultado = false;
        DefaultTableModel table = (DefaultTableModel) jTableInventario.getModel();
        String comboBox = comboBoxEstado.getSelectedItem().toString();
        int fila = jTableInventario.getSelectedRow();
        try {
            if (resultado == false) {

                if (fila < 0) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para poder ingresar el check in");
                    resultado = true;
                }

                if (resultado == false) {
                    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
                    Date date = new Date();
                    String fecha = dateFormat.format(date.getTime());
                    cl.setFechaCheckList(new SimpleDateFormat("dd-MM-yyy").parse(fecha));

                    cl.setEstadoCheckList(comboBoxEstado.getSelectedItem().toString());
                    cl.setObservacionInventario(txtaObservaciones.getText());
                    String comentario = txtaObservaciones.getText();
                    
                    if (comboBox.equals("Seleccionar")) {
                        JOptionPane.showMessageDialog(this, "Debes seleccionar un tipo de Ingreso para poder ingresar el check in");
                        resultado = true;
                    }
                    
                    if (comentario.equals("")) {
                        JOptionPane.showMessageDialog(this, "El campo observaciones no puede quedar vacio");
                        resultado = true;
                    }
                    
                    if (resultado == false) {
                        String idInventario = String.valueOf(table.getValueAt(jTableInventario.getSelectedRow(), 1));
                        int idIn = Integer.parseInt(idInventario);
                        cl.setIdCheckList(clc.insertarCheckList(cl));
                        int idCheckList = cl.getIdCheckList();
                        if (resultado == false) {
                            clc.insertarDetalleCheckList(detalle, idCheckList, idIn);
                            System.out.println("Se ingreso el detalle en la base de datos");
                                            JOptionPane.showMessageDialog(this, "Se ingreso correctamente el CheckList del inventario");
                        } else {
                            System.out.println("El detalle no se ingreso en la base de datos");
                        }
                    }

                }



            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCrearCheckListActionPerformed

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
            java.util.logging.Logger.getLogger(CheckListViewSubView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckListViewSubView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckListViewSubView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckListViewSubView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckListViewSubView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCheckList;
    public javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JTextArea txtaObservaciones;
    // End of variables declaration//GEN-END:variables
}

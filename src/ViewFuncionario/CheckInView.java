/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewFuncionario;

import ControllerFuncionario.CheckInController;
import ControllerFuncionario.CheckListController;
import ControllerFuncionario.ValidacionesController;
import Method.funcionario.CheckInMethod;
import Model.Funcionario.CheckIn;
import Model.Funcionario.Departamento;
import Model.Funcionario.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckInView extends javax.swing.JFrame {

    ArrayList<Departamento> dep = new ArrayList<Departamento>();
    Departamento depa = new Departamento();
    CheckInMethod cim = new CheckInMethod();
    CheckInController cic = new CheckInController();
    CheckIn ci = new CheckIn();
    ValidacionesController vc = new ValidacionesController();
    Boolean e;
    Usuario u = new Usuario();

    /**
     * Creates new form CheckInView
     */
    public CheckInView() {
        initComponents();
        setLocationRelativeTo(null);
        cim.listarReservaCheckIn(jTableCheckIn);
        txtFechaIngreso.setText(vc.fechaActual());
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
        lblConfirmarIngreso = new javax.swing.JLabel();
        comboBoxConfirmarIngreso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCheckIn = new javax.swing.JTable();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        txtBuscarRut = new javax.swing.JTextField();
        btnBuscarRut = new javax.swing.JButton();
        btnIngresarCheckIn = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblConfirmarIngreso.setText("Confirmar Ingreso");

        comboBoxConfirmarIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Confirmado", "Cancelado" }));

        jTableCheckIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCheckIn);

        lblFechaIngreso.setText("Fecha Ingreso");

        txtFechaIngreso.setEnabled(false);
        txtFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoActionPerformed(evt);
            }
        });

        txtBuscarRut.setText("Rut...");
        txtBuscarRut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarRutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarRutMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscarRutMouseReleased(evt);
            }
        });

        btnBuscarRut.setText("Buscar");
        btnBuscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutActionPerformed(evt);
            }
        });

        btnIngresarCheckIn.setText("Ingresar Check-In");
        btnIngresarCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCheckInActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnVolver)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresarCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarRut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblConfirmarIngreso)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxConfirmarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblFechaIngreso)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmarIngreso)
                    .addComponent(comboBoxConfirmarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnIngresarCheckIn))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuFuncionario mf = new MenuFuncionario();
        mf.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed


    private void txtFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoActionPerformed

    }//GEN-LAST:event_txtFechaIngresoActionPerformed

    private void btnIngresarCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCheckInActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableCheckIn.getModel();
        boolean resultado = false;
        int fila = jTableCheckIn.getSelectedRow();
        String comboBox = comboBoxConfirmarIngreso.getSelectedItem().toString();
        try {
            if (resultado == false) {
                if (comboBox.equals("Seleccionar")) {
                    JOptionPane.showMessageDialog(this, "Debes seleccionar un tipo de Ingreso para poder ingresar el check in");
                    resultado = true;
                }
                if (fila < 0) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para poder ingresar el check in");
                    resultado = true;
                }
            }
            if (resultado == false) {

                try {
                    //guardo el id de la reserva en una variable int
                    String r = String.valueOf(model.getValueAt(jTableCheckIn.getSelectedRow(), 1));
                    int idRe = Integer.parseInt(r);

                    //guardo el rut del usuario para mostrarlo
                    String rut = String.valueOf(model.getValueAt(jTableCheckIn.getSelectedRow(), 0));

                    //guardo el monto en una variable int
                    String m = String.valueOf(model.getValueAt(jTableCheckIn.getSelectedRow(), 3));
                    int Monto = Integer.parseInt(m);

                    //guardo el id del departamento en una variable int
                    String d = String.valueOf(model.getValueAt(jTableCheckIn.getSelectedRow(), 2));
                    int idDepa = Integer.parseInt(d);

                    //guardo la seleccion del combo box
                    ci.setConfirmacion(comboBoxConfirmarIngreso.getSelectedItem().toString());

                    String f = String.valueOf(model.getValueAt(jTableCheckIn.getSelectedRow(), 4));
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    Date fecha = formato.parse(f);

                    cim.insertarCheckIn(comboBoxConfirmarIngreso, fecha, idRe, Monto, idDepa);
                    cim.listarReservaCheckIn(jTableCheckIn);
                    JOptionPane.showMessageDialog(this, "Se ingreso el Check in de: " + rut + "el" + fecha);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnIngresarCheckInActionPerformed

    private void txtBuscarRutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarRutMouseClicked
        String text = txtBuscarRut.getText();
        if (text.equals("Rut...")) {
            txtBuscarRut.setText("");
        }
    }//GEN-LAST:event_txtBuscarRutMouseClicked

    private void txtBuscarRutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarRutMouseExited

    }//GEN-LAST:event_txtBuscarRutMouseExited

    private void txtBuscarRutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarRutMouseReleased

    }//GEN-LAST:event_txtBuscarRutMouseReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        String text = txtBuscarRut.getText();
        if (text.equals("")) {
            txtBuscarRut.setText("Rut...");
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnBuscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutActionPerformed
        u.setRutUsuario(txtBuscarRut.getText());
        String rut = txtBuscarRut.getText();
        boolean r = false;
        
        if (!txtBuscarRut.getText().matches("\\b(\\d{1,3}(?:(\\.?)\\d{3}){2}(-)[\\dkK])\\b")) {
           JOptionPane.showMessageDialog(this, "El rut que buscas puede ser con o sin puntos, pero tiene que llevar guion");
           r = true;
        }
 
        if (rut.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un rut para poder buscar");
            r = true;
        }
        
        if (rut.equals("Rut...")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un rut para poder buscar");
            r = true;
        } 
        
        if (r = false) {
           cim.listarReservaCheckInRut(txtBuscarRut, jTableCheckIn); 
        }
                
            

        


    }//GEN-LAST:event_btnBuscarRutActionPerformed

    public static Boolean validaRut(String rut) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if (matcher.matches() == false) {
            return false;
        }
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(CheckInView.dv(stringRut[0]));
    }

    public static String dv(String rut) {
        Integer M = 0, S = 1, T = Integer.parseInt(rut);
        for (; T != 0; T = (int) Math.floor(T /= 10)) {
            S = (S + T % 10 * (9 - M++ % 6)) % 11;
        }
        return (S > 0) ? String.valueOf(S - 1) : "k";
    }

    
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
            java.util.logging.Logger.getLogger(CheckInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRut;
    private javax.swing.JButton btnIngresarCheckIn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboBoxConfirmarIngreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCheckIn;
    private javax.swing.JLabel lblConfirmarIngreso;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JTextField txtBuscarRut;
    private javax.swing.JTextField txtFechaIngreso;
    // End of variables declaration//GEN-END:variables
}

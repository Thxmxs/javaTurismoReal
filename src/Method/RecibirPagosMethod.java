package Method;

import Database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RecibirPagosMethod {

    PreparedStatement ps = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    private static Connection conn;

    public void cargarTablaMontoFinal(JTable tablaMontoFinal) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaMontoFinal.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_monto_final_a_pagar( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("rut_usuario");
            modeloTabla.addColumn("id_departamento");
            modeloTabla.addColumn("id_reserva");
            modeloTabla.addColumn("costo_departamento");
            modeloTabla.addColumn("nombre_servicio");
            modeloTabla.addColumn("costo_servicio");
            modeloTabla.addColumn("nombre_tour");
            modeloTabla.addColumn("costo_tour");
            modeloTabla.addColumn("direccion");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("apellido");
            modeloTabla.addColumn("email");
            modeloTabla.addColumn("fecha_entrada");
            modeloTabla.addColumn("fecha_salida");
            modeloTabla.addColumn("fecha_pago");
            modeloTabla.addColumn("forma_pago");
            modeloTabla.addColumn("monto_pago");
            modeloTabla.addColumn("estado_pago");
            modeloTabla.addColumn("cantidad total a pagar");
            modeloTabla.addColumn("monto total final a pagar");

            while (rs.next()) {
                Object fila[] = new Object[20];
                for (int i = 0; i < 20; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void PasarIdResAText(String codigo, JTextField txt1, JTextField montoPago) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "{ call sp_read_monto_final_a_pagar_by_id_reserva_java( ?, ?) }";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();

            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                txt1.setText(rs.getString("id_reserva"));
                montoPago.setText(rs.getString("monto total final a pagar"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void agregarPagoFinal(JTextField id_reserva, JComboBox cmbModoPago, JTextField montoPagado) {

        try {
            String sql = "{ call SP_CREATE_PAGO_RESTO_JAVA( ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, id_reserva.getText());
            cstm.setString(2, cmbModoPago.getSelectedItem().toString());
            cstm.setString(3, montoPagado.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Pago realizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    
        public void cargarReservasPagadas(JTable tablaReservasPagadas) {
        DefaultTableModel modeloTablax = new DefaultTableModel();
        tablaReservasPagadas.setModel(modeloTablax);
        try {
            String sql = "{ call sp_read_reservas_pagadas_java( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTablax.addColumn("rut_usuario");
            modeloTablax.addColumn("id_departamento");
            modeloTablax.addColumn("id_reserva");
            modeloTablax.addColumn("direccion");
            modeloTablax.addColumn("nombre");
            modeloTablax.addColumn("apellido");
            modeloTablax.addColumn("email");
            modeloTablax.addColumn("fecha_entrada");
            modeloTablax.addColumn("fecha_salida");
            modeloTablax.addColumn("fecha_pago");
            modeloTablax.addColumn("forma_pago");
            modeloTablax.addColumn("monto_pago");
            modeloTablax.addColumn("estado_pago");

            while (rs.next()) {
                Object fila[] = new Object[13];
                for (int i = 0; i < 13; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTablax.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package Method;

import Database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ServiciosMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    //no borrar se usan

    private static Connection conn;

    public void agregarServicio(JTextField nombreServicio, JTextField valor) {

        try {
            String sql = "{ call SP_CREATE_SERVICIO_JAVA( ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, nombreServicio.getText());
            cstm.setString(2, valor.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void cargarTablaServicios(JTable tablaServicios) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaServicios.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_servicios( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_servicio");
            modeloTabla.addColumn("nombre_servicio");
            modeloTabla.addColumn("valor_servicio");

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ActualizarServicio(JTextField idServicio, JTextField nombreServicio, JTextField valor) {

        try {
            String sql = "{ call sp_update_servicio_by_id_java( ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, nombreServicio.getText());
            cstm.setInt(2, Integer.parseInt(valor.getText()));
            cstm.setString(3, idServicio.getText());

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Servicio Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void EliminarServicio(JTextField idServicio) {

        try {
            String sql = "{ call sp_delete_servicio_by_id_java( ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setInt(1, Integer.parseInt(idServicio.getText()));

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Servicio Eliminado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
    
         public void PasarDatosTablasACampos(String codigo,JTextField idServicio, JTextField nombreServicio, JTextField valor) {

        try {
            String sql = "{ call sp_read_servicios_by_id_java( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                idServicio.setText(rs.getString("id_servicio"));
                nombreServicio.setText(rs.getString("nombre_servicio"));
                valor.setText(rs.getString("costo_servicio"));

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

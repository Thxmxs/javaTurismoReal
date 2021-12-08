package Method;

import Database.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TransporteMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    //no borrar se usan

    private static Connection conn;

    public void AgregarTransporte(JTextField lugarRecogida, Date fechaRecogida, JTextField idReserva, JTextField costoTransporte,
            JTextField nombreChofer) {
        try {
            String sql = "{ call SP_INSERTAR_TRANSPORTE_JAVA( ?, ?, ?, ?,?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            long fi = fechaRecogida.getTime();

            java.sql.Date fecha_inicio = new java.sql.Date(fi);

            cstm.setString(1, lugarRecogida.getText());
            cstm.setDate(2, fecha_inicio);
            cstm.setString(3, idReserva.getText());
            cstm.setString(4, costoTransporte.getText());
            cstm.setString(5, nombreChofer.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void cargarTablaReservas(JTable tablaObjetos) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaObjetos.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_reservas_java( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_reserva");
            modeloTabla.addColumn("fecha_entrada");
            modeloTabla.addColumn("fecha_salida");
            modeloTabla.addColumn("rut_usuario");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("apellido");
            modeloTabla.addColumn("email");

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cargarTablaTransportes(JTable tablaTrans) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaTrans.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_transportess_java( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_transporte");
            modeloTabla.addColumn("lugar_recogida");
            modeloTabla.addColumn("fecha_recogida");
            modeloTabla.addColumn("reserva_id_reserva");
            modeloTabla.addColumn("costo_transporte");
            modeloTabla.addColumn("nombre_chofer");

            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pasarIdReservaACampo(String codigo, JTextField id_reserva) {

        try {
            String sql = "{ call sp_read_only_idReserva_java( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                id_reserva.setText(rs.getString("id_reserva"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void pasarTransporteACampos(String codigo, JTextField id_transporte, JTextField lugar_recogida, JDateChooser fecha_recogida, JTextField reserva_id_reserva, JTextField costo_transporte, JTextField nombre_chofer) {

        try {
            String sql = "{ call sp_read_transportess_by_id_java( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                id_transporte.setText(rs.getString("id_transporte"));
                lugar_recogida.setText(rs.getString("lugar_recogida"));
                fecha_recogida.setDate(rs.getDate("fecha_recogida"));
                reserva_id_reserva.setText(rs.getString("reserva_id_reserva"));
                costo_transporte.setText(rs.getString("costo_transporte"));
                nombre_chofer.setText(rs.getString("nombre_chofer"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void ActualizarTransporte(JTextField idTransporte, JTextField lugarRecogida, Date fechaRecogida, JTextField idReserva, JTextField costoTransporte,
            JTextField nombreChofer) {

        try {
            String sql = "{ call sp_update_transportess_by_id_java( ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            long fi = fechaRecogida.getTime();

            java.sql.Date fecha_inicio = new java.sql.Date(fi);

            cstm.setString(1, lugarRecogida.getText());
            cstm.setDate(2, fecha_inicio);
            cstm.setString(3, idReserva.getText());
            cstm.setString(4, costoTransporte.getText());
            cstm.setString(5, nombreChofer.getText());
            cstm.setString(6, idTransporte.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Transporte Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void EliminarTransporte(JTextField idTransporte) {

        try {
            String sql = "{ call sp_delete_transportess_by_id_java( ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setInt(1, Integer.parseInt(idTransporte.getText()));

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Transporte Eliminado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
}

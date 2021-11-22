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

public class UsuarioMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    //no borrar se usan

    private static Connection conn;

    public void cargarTablaUsuarios(JTable tablaUsuarios) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaUsuarios.setModel(modeloTabla);
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("select * from usuario");
            rs = ps.executeQuery();

            modeloTabla.addColumn("rut_usuario");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("apellido");
            modeloTabla.addColumn("email");
            modeloTabla.addColumn("direccion");
            modeloTabla.addColumn("telefono");
            modeloTabla.addColumn("cuenta_usuario_id_cuenta_usuario");

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

    public void agregarUsuario(JTextField rutuser, JTextField nombre, JTextField apellido, JTextField email,
            JTextField direccion, JTextField telefono) {

        try {
            String sql = "{ call SP_CREATE_USUARIO_JAVA( ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, rutuser.getText());
            cstm.setString(2, nombre.getText());
            cstm.setString(3, apellido.getText());
            cstm.setString(4, email.getText());
            cstm.setString(5, direccion.getText());
            cstm.setString(6, telefono.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void ActualizarDepartamento(JTextField rutuser,JTextField nombre, JTextField apellido, JTextField email,
            JTextField direccion,JTextField telefono) {

        try {
            String sql = "{ call sp_update_usuarios_by_rut_java( ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, rutuser.getText());
            cstm.setString(2, nombre.getText());
            cstm.setString(3, apellido.getText());
            cstm.setString(4, email.getText());
            cstm.setString(5, direccion.getText());
            cstm.setString(6, telefono.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Usuario Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void EliminarUsuario(JTextField rutuser) {

        try {
            String sql = "{ call sp_delete_usuarios_by_rut_java( ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, rutuser.getText());

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void PasarDatosTablasACampos(String codigo, JTextField rutuser, JTextField nombre, JTextField apellido, JTextField email,
            JTextField direccion, JTextField telefono) {

        try {
            String sql = "{ call sp_read_usuarios_by_rut_java( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                rutuser.setText(rs.getString("rut_usuario"));
                nombre.setText(rs.getString("nombre"));
                apellido.setText(rs.getString("apellido"));
                email.setText(rs.getString("email"));
                direccion.setText(rs.getString("direccion"));
                telefono.setText(rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

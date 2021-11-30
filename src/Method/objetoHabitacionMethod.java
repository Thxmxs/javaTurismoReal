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

public class objetoHabitacionMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    //no borrar se usan

    private static Connection conn;

    public void agregarObjeto(JTextField nombreObjeto, JTextField valor, JTextField categoria, JTextField subcategoria,
            JTextField descripcionObjeto) {

        try {
            String sql = "{ call SP_CREATE_OBJETO_JAVA( ?, ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, nombreObjeto.getText());
            cstm.setString(2, valor.getText());
            cstm.setString(3, categoria.getText());
            cstm.setString(4, subcategoria.getText());
            cstm.setString(5, descripcionObjeto.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void cargarTablaObjetos(JTable tablaObjetos) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaObjetos.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_objetos( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_objeto_habitacion");
            modeloTabla.addColumn("nombre_objeto");
            modeloTabla.addColumn("valor_objeto");
            modeloTabla.addColumn("categoria_objeto");
            modeloTabla.addColumn("sub_categoria_objeto");
            modeloTabla.addColumn("fecha_objeto");
            modeloTabla.addColumn("descripcion_objeto");

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

    public void ActualizarObjeto(JTextField idObjeto, JTextField nombreObjeto, JTextField valor, JTextField categoria, JTextField subcategoria,
            JTextField descripcionObjeto) {

        try {
            String sql = "{ call sp_update_objeto_by_id_java( ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, nombreObjeto.getText());
            cstm.setInt(2, Integer.parseInt(valor.getText()));
            cstm.setString(3, categoria.getText());
            cstm.setString(4, subcategoria.getText());
            cstm.setString(5, descripcionObjeto.getText());
            cstm.setInt(6, Integer.parseInt(idObjeto.getText()));
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Objeto Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void EliminarObjeto(JTextField idObjeto) {

        try {
            String sql = "{ call sp_delete_objeto_by_id_java( ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setInt(1, Integer.parseInt(idObjeto.getText()));

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Objeto Eliminado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
    
     public void PasarDatosTablasACampos(String codigo,JTextField id_objeto, JTextField nombreObjeto, JTextField valor, JTextField categoria, JTextField subcategoria,
            JTextField descripcionObjeto) {

        try {
            String sql = "{ call sp_read_objetos_by_id_java( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                id_objeto.setText(rs.getString("id_objeto_habitacion"));
                nombreObjeto.setText(rs.getString("nombre_objeto"));
                valor.setText(rs.getString("valor_objeto"));
                categoria.setText(rs.getString("categoria_objeto"));
                subcategoria.setText(rs.getString("sub_categoria_objeto"));
                descripcionObjeto.setText(rs.getString("descripcion_objeto"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}


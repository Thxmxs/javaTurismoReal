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

public class InventarioDepartamentoMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    private static Connection conn;

    public void AgregarObjetoAlInventarioDepto(JTextField idObjeto, JTextField idDepto) {

        try {
            String sql = "{ call SP_INSERT_OBJECT_TO_DEPTO_INVENTORY( ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setInt(1, Integer.parseInt(idObjeto.getText()));
            cstm.setInt(2, Integer.parseInt(idDepto.getText()));

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Insertado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void cargarTablaInventarioPorDepartamento(JTable tablaObjetos) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaObjetos.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_inventarios_por_departamentos_java( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_departamento");
            modeloTabla.addColumn("direccion");
            modeloTabla.addColumn("estado_departamento");
            modeloTabla.addColumn("objeto_habitacion_id_objeto_habitacion");
            modeloTabla.addColumn("nombre_objeto");
            modeloTabla.addColumn("valor_objeto");

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

    public void cargarTablaDepartamentosInventario(JTable tablaDepartamentosMantencion) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaDepartamentosMantencion.setModel(modeloTabla);
        try {
            String sql = "{ call sp_read_departamentos( ?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTabla.addColumn("id_departamento");
            modeloTabla.addColumn("direccion");
            modeloTabla.addColumn("costo_departamento");
            modeloTabla.addColumn("estado_departamento");
            modeloTabla.addColumn("descripcion_estado_departamento");
            modeloTabla.addColumn("orientacion_departamento");
            modeloTabla.addColumn("estacionamiento");
            modeloTabla.addColumn("num_habitaciones");
            modeloTabla.addColumn("num_baño");
            modeloTabla.addColumn("num_estacionamiento");
            modeloTabla.addColumn("nombre_comuna");
            modeloTabla.addColumn("nombre_provincia");
            modeloTabla.addColumn("nombre_region");

            while (rs.next()) {
                Object fila[] = new Object[13];
                for (int i = 0; i < 13; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println(e);
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

    public void PasarIdDeptoAText(String codigo, JTextField txt1) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "{ call sp_read_departamentos_by_id_depto( ?, ?) }";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, codigo);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();

            rs = (ResultSet) cstm.getObject(2);

            while (rs.next()) {
                txt1.setText(rs.getString("id_departamento"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void PasarDatosTablasACampos(String codigo,JTextField id_objeto) {

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
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
        public void EliminarObjetoInventarioDepto(JTextField idObjeto,JTextField idDepartamento) {

        try {
            String sql = "{ call sp_delete_objetos_por_inventario_departamento_java( ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setInt(1, Integer.parseInt(idObjeto.getText()));
            cstm.setInt(2, Integer.parseInt(idDepartamento.getText()));

            cstm.execute();

            JOptionPane.showMessageDialog(null, "Objeto eliminado del inventario Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
}

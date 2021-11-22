package Method;

import Database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MantencionDepartamentoMethod {



    private static Connection conn;
    public void agregarDepartamentoMantencion(JTextField txtidDepartamento, Date fechaInicio, Date fechaTermino, JTextField costoMantencion) {
        try {
            String sql = "{ call SP_INSERTAR_MANTENCION_DEPARTAMENTO_JAVA( ?, ?, ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            long fi = fechaInicio.getTime();
            long ft = fechaTermino.getTime();
            
            java.sql.Date fecha_inicio = new java.sql.Date(fi);
            java.sql.Date fecha_termino = new java.sql.Date(ft);
            
            cstm.setString(1, txtidDepartamento.getText());
            cstm.setDate(2, fecha_inicio);
            cstm.setDate(3, fecha_termino);
            cstm.setString(4, costoMantencion.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
        public void ActualizarEstadoDepartamentoADisponible(JTextField txtidDepartamento) {
        try {
            String sql = "{ call SP_ACTUALIZAR_ESTADO_MANTENCION_DEPARTAMENTO_JAVA( ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            
            cstm.setString(1, txtidDepartamento.getText());
            cstm.execute();

            JOptionPane.showMessageDialog(null, "Departamento Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
    public void PasarDatosTablasACampos(String codigo, JTextField txt1) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "{ call sp_read_departamentos_by_id_depto( ?, ?) }";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm=conn.prepareCall(sql);
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
     public void PasarDatosTablasACampos2(String codigo, JTextField txt1) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "{ call sp_read_departamentos_by_id_depto( ?, ?) }";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm=conn.prepareCall(sql);
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
    public void cargarTablaMantencionDepartamentos(JTable tablaDepartamentosMantencion) {
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
    public void cargarTablaMantencionDepartamentosEnMantencion(JTable tablaDepartamentosMantencion) {
        DefaultTableModel modeloTablax = new DefaultTableModel();
        tablaDepartamentosMantencion.setModel(modeloTablax);
        try {
            String sql = "{ call sp_read_departamentos_en_mantenimiento(?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);

            //vista.tablaDepartamentos.setModel(modeloTabla);
            modeloTablax.addColumn("id_departamento");
            modeloTablax.addColumn("direccion");
            modeloTablax.addColumn("costo_departamento");
            modeloTablax.addColumn("estado_departamento");
            modeloTablax.addColumn("descripcion_estado_departamento");
            modeloTablax.addColumn("orientacion_departamento");
            modeloTablax.addColumn("estacionamiento");
            modeloTablax.addColumn("num_habitaciones");
            modeloTablax.addColumn("num_baño");
            modeloTablax.addColumn("num_estacionamiento");
            modeloTablax.addColumn("nombre_comuna");
            modeloTablax.addColumn("nombre_provincia");
            modeloTablax.addColumn("nombre_region");

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

package Method;

import Database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DepartamentosMethod {
        PreparedStatement ps=null;
        ResultSet rs=null;

    private static Connection conn;

    public void cargarTablaDepartamentos(JTable tablaDepartamentos) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaDepartamentos.setModel(modeloTabla);
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("select d.id_departamento,d.direccion,d.costo_departamento,d.estado_departamento,d.descripcion_estado_departamento,d.orientacion_departamento,d.estacionamiento,d.num_habitaciones,d.num_baño,d.num_estacionamiento, \n"
                    + "c.nombre_comuna,p.nombre_provincia,r.nombre_region from departamento d join comuna c on d.comuna_id_comuna = c.id_comuna join provincia p on c.provincia_id_provincia = p.id_provincia join region r on p.region_id_region = r.id_region");
            rs = ps.executeQuery();
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
    public void PasarDatosTablasACampos(JTable tablaDepartamentos,JTextField txt1,JTextField txt2,JTextField txt3,JTextField txt4,JTextField txt5,
    JTextField txt6,JTextField txt7,JTextField txt8,JTextField txt9,JTextField txt10,JComboBox cmb1,JComboBox cmb2,JComboBox cmb3){


        try {
            conn = Conexion.getConnection();
           

            int fila = tablaDepartamentos.getSelectedRow();
            String codigo = tablaDepartamentos.getValueAt(fila, 0).toString();

            ps = conn.prepareStatement("select d.id_departamento,d.direccion,d.costo_departamento,d.estado_departamento,d.descripcion_estado_departamento,d.orientacion_departamento,d.estacionamiento,d.num_habitaciones,d.num_baño,d.num_estacionamiento, \n" +
"c.nombre_comuna,p.nombre_provincia,r.nombre_region from departamento d join comuna c on d.comuna_id_comuna = c.id_comuna join provincia p on c.provincia_id_provincia = p.id_provincia join region r on p.region_id_region = r.id_region where d.id_departamento=?");

            ps.setString(1, codigo);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                txt1.setText(rs.getString("id_departamento"));
                txt2.setText(rs.getString("direccion"));
                txt3.setText(rs.getString("costo_departamento"));
                txt4.setText(rs.getString("estado_departamento"));
                txt5.setText(rs.getString("descripcion_estado_departamento"));
                txt6.setText(rs.getString("orientacion_departamento"));
                txt7.setText((rs.getString("estacionamiento")));
                txt8.setText((rs.getString("num_habitaciones")));
                txt9.setText(rs.getString("num_baño"));
                txt10.setText(rs.getString("num_estacionamiento"));
                cmb1.setSelectedItem(rs.getString("nombre_comuna"));
                cmb2.setSelectedItem(rs.getString("nombre_provincia"));
                cmb3.setSelectedItem(rs.getString("nombre_region"));

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
        public void mostrarCmbxRegiones(JComboBox combo){
        try {
            
            Conexion con = new Conexion();
            conn = Conexion.getConnection();
            
            ps = conn.prepareStatement("select * from region");
            rs = ps.executeQuery();
         combo.addItem("seleccione region");
            while (rs.next()) {                
                combo.addItem(rs.getString("nombre_region"));
                
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
        
        
    }
      public void mostrarCmbxComunas(JComboBox combo){
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select * from comuna");
            rs = ps.executeQuery();
         combo.addItem("seleccione comuna");
            while (rs.next()) {                
                combo.addItem(rs.getString("nombre_comuna"));
                
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
        
        
    }
        public void mostrarCmbxProvincias(JComboBox combo){
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select * from provincia");
            rs = ps.executeQuery();
         combo.addItem("seleccione provincia");
            while (rs.next()) {                
                combo.addItem(rs.getString("nombre_provincia"));
                
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
        
        
    }
}

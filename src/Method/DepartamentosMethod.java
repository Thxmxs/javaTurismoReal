package Method;

import Database.Conexion;
import Model.Comuna;
import Model.Provincia;
import Model.Region;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DepartamentosMethod {

    PreparedStatement ps = null;

    ResultSet rs = null;
    ResultSet rs2 = null;
    //no borrar se usan

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

    public Vector<Region> mostrarRegiones() {
        Region region = null;
        Vector<Region> vectorRegion = new Vector<Region>();

        try {

            conn = Conexion.getConnection();
            ps = conn.prepareStatement("select * from region");
            rs = ps.executeQuery();
            region = new Region();
            region.setIdRegion(0);
            region.setNombreRegion("Seleccione una region");
            vectorRegion.add(region);
            while (rs.next()) {
                region = new Region();
                region.setIdRegion(rs.getInt("id_region"));
                region.setNombreRegion(rs.getString("nombre_region"));
                vectorRegion.add(region);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return vectorRegion;
    }

    public Vector<Comuna> mostrarComunas(Integer idProvincia) {
        Comuna comuna = null;
        Vector<Comuna> vectorComuna = new Vector<Comuna>();

        try {

            conn = Conexion.getConnection();
            ps = conn.prepareStatement("select * from comuna where provincia_id_provincia=" + idProvincia);
            rs = ps.executeQuery();
            comuna = new Comuna();
            comuna.setIdComuna(0);
            comuna.setNombreComuna("Seleccione una Comuna");
            comuna.setProvinciaIdProvincia(0);
            comuna.setProvinciaRegionIdRegion(0);
            vectorComuna.add(comuna);
            while (rs.next()) {
                comuna = new Comuna();
                comuna.setIdComuna(rs.getInt("id_comuna"));
                comuna.setNombreComuna(rs.getString("nombre_comuna"));
                comuna.setProvinciaIdProvincia(rs.getInt("provincia_id_provincia"));
                comuna.setProvinciaRegionIdRegion(rs.getInt("provincia_region_id_region"));
                vectorComuna.add(comuna);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return vectorComuna;
    }

    public Vector<Provincia> mostrarProvincias(Integer idRegion) {
        Provincia provincia = null;
        Vector<Provincia> vectorProvincia = new Vector<Provincia>();

        try {

            conn = Conexion.getConnection();
            ps = conn.prepareStatement("select * from provincia where region_id_region=" + idRegion);
            rs = ps.executeQuery();
            provincia = new Provincia();
            provincia.setIdProvincia(0);
            provincia.setNombreProvincia("Seleccione una provincia");
            provincia.setRegionIdRegion(0);
            vectorProvincia.add(provincia);
            while (rs.next()) {
                provincia = new Provincia();
                provincia.setIdProvincia(rs.getInt("id_provincia"));
                provincia.setNombreProvincia(rs.getString("nombre_provincia"));
                provincia.setRegionIdRegion(rs.getInt("region_id_region"));
                vectorProvincia.add(provincia);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return vectorProvincia;
    }

    public void agregarDepartamento(JTextField txtdir, JTextField txtCostoDepartamento, JTextField txtEstadoDepto, JTextField txtdescripcion,
            JTextField txtorientacion, JTextField txtestacionamiento, JTextField txtnumHabitaciones, JTextField txtnumbaños,
            JTextField txtnumEstacionamientos, int comuna, int provincia, int region) {

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("insert into departamento (direccion,costo_departamento,estado_departamento, "
                    + "descripcion_estado_departamento,orientacion_departamento,estacionamiento,num_habitaciones,num_baño,"
                    + "num_estacionamiento,comuna_id_comuna,comuna_provincia_id_provincia,comuna_provincia_region_id_region) values (?,?,?,?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, txtdir.getText());
            ps.setInt(2, Integer.parseInt(txtCostoDepartamento.getText()));
            ps.setString(3, txtEstadoDepto.getText());
            ps.setString(4, txtdescripcion.getText());
            ps.setString(5, txtorientacion.getText());
            ps.setString(6, txtestacionamiento.getText());
            ps.setInt(7, Integer.parseInt(txtnumHabitaciones.getText()));
            ps.setInt(8, Integer.parseInt(txtnumbaños.getText()));
            ps.setInt(9, Integer.parseInt(txtnumEstacionamientos.getText()));
            ps.setInt(10, comuna);
            ps.setInt(11, provincia);
            ps.setInt(12, region);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void ActualizarDepartamento(JTextField txtdir, JTextField txtCostoDepartamento, JTextField txtEstadoDepto, JTextField txtdescripcion,
            JTextField txtorientacion, JTextField txtestacionamiento, JTextField txtnumHabitaciones, JTextField txtnumbaños,
            JTextField txtnumEstacionamientos, int comuna, int provincia, int region, JTextField txtIdDepartamento) {

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("update departamento set direccion=?,costo_departamento=?,estado_departamento=?, "
                    + "descripcion_estado_departamento=?,orientacion_departamento=?,estacionamiento=?,num_habitaciones=?,num_baño=?,"
                    + "num_estacionamiento=?,comuna_id_comuna=?,comuna_provincia_id_provincia=?,comuna_provincia_region_id_region=? where id_departamento=?");
            ps.setString(1, txtdir.getText());
            ps.setInt(2, Integer.parseInt(txtCostoDepartamento.getText()));
            ps.setString(3, txtEstadoDepto.getText());
            ps.setString(4, txtdescripcion.getText());
            ps.setString(5, txtorientacion.getText());
            ps.setString(6, txtestacionamiento.getText());
            ps.setInt(7, Integer.parseInt(txtnumHabitaciones.getText()));
            ps.setInt(8, Integer.parseInt(txtnumbaños.getText()));
            ps.setInt(9, Integer.parseInt(txtnumEstacionamientos.getText()));
            ps.setInt(10, comuna);
            ps.setInt(11, provincia);
            ps.setInt(12, region);
            ps.setInt(13, Integer.parseInt(txtIdDepartamento.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
     public void EliminarDepartamento(JTextField txtIdDepartamento) {

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("delete from departamento where id_departamento=?");

            ps.setInt(1, Integer.parseInt(txtIdDepartamento.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }

    public void PasarDatosTablasACampos(int fila,String codigo,JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5,
            JTextField txt6, JTextField txt7, JTextField txt8, JTextField txt9, JTextField txt10 ) {
Region region = new Region();
        try {
            conn = Conexion.getConnection();

            ps = conn.prepareStatement("select * from departamento where id_departamento=?");

            ps.setString(1, codigo);
            rs = ps.executeQuery();

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
                //cmb1.setSelectedItem((Integer.parseInt(rs.getString("comuna_provincia_region_id_region"))));
                //cmb2.setSelectedItem((Integer.parseInt(rs.getString("comuna_provincia_id_provincia"))));
                //cmb3.setSelectedItem((Integer.parseInt(rs.getString("comuna_id_comuna"))));

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

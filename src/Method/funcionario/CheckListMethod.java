/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method.funcionario;

import Database.Conexion;
import Model.Funcionario.CheckList;
import Model.Funcionario.Comuna;
import Model.Funcionario.Departamento;
import Model.Funcionario.DetalleCheckList;
import Model.Funcionario.DetalleHabitacion;
import Model.Funcionario.Habitacion;
import Model.Funcionario.ObjetoHabitacion;
import Model.Funcionario.Provincia;
import Model.Funcionario.Region;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckListMethod {
    private static Connection conn;
    
    
    public ArrayList<Departamento> listarDepartamentosCheckList(){
        ArrayList<Departamento> dep = new ArrayList<Departamento>();
        
        try {
            String sql = "{ call sp_buscar_departamentos(?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);
            
            while (rs.next()) {
                Departamento depa = new Departamento();
                depa.setIdDepartamento(rs.getInt("ID_DEPARTAMENTO"));
                depa.setDireccion(rs.getString("DIRECCION"));
                depa.setCostoDepartamento(rs.getInt("COSTO_DEPARTAMENTO"));
                depa.setEstadoDepartamento(rs.getString("ESTADO_DEPARTAMENTO"));
                depa.setDescripcionDepartamento(rs.getString("DESCRIPCION_DEPARTAMENTO"));
                depa.setOrientacionDepartamento(rs.getString("ORIENTACION_DEPARTAMENTO"));
                depa.setEstacionamiento(rs.getString("ESTACIONAMIENTO"));
                depa.setNumHabitaciones(rs.getInt("NUM_HABITACIONES"));
                depa.setNumBano(rs.getInt("NUM_BAÑO"));
                depa.setNumEstacionamiento(rs.getInt("NUM_ESTACIONAMIENTO"));
                Region reg = new Region();
                reg.setNombreRegion(rs.getString("NOMBRE_REGION"));
                depa.setRegion(reg);
                Provincia pro = new Provincia();
                pro.setNombreProvincia(rs.getString("NOMBRE_PROVINCIA"));
                depa.setProvincia(pro);
                Comuna com = new Comuna();
                com.setNombreComuna(rs.getString("NOMBRE_COMUNA"));
                depa.setComuna(com);
                dep.add(depa);
                        
            }
            rs.close();
            cstm.close();
            System.out.println("Datos de Departamento encontrandos");
        } catch (Exception e) {
            System.out.println("No se encontraron datos de Departamentos");
        }
        return dep;
    }
    
    public ArrayList<ObjetoHabitacion> listarObjetoHabitacionCheckList (int iddep){
        
        ArrayList<ObjetoHabitacion> oh = new ArrayList<ObjetoHabitacion>();
        
        
        try {
            String sql = "{ call SP_BUSCAR_INVENTARIO_ID_DEPARTAMENTO( ?,? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setInt(1, iddep);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);
            
            while (rs.next()) {
                Departamento d = new Departamento();
                ObjetoHabitacion o = new ObjetoHabitacion();
                d.setIdDepartamento(rs.getInt("ID_DEPARTAMENTO"));
                o.setIdObjetoHabitacion(rs.getInt("ID_OBJETO"));
                o.setNombreObjeto(rs.getString("NOMBRE_OBJETO"));
                o.setValorObjeto(rs.getInt("VALOR_OBJETO"));
                o.setCategoriaObjeto(rs.getString("CATEGORIA_OBJETO"));
                o.setSubCategoriaObjeto(rs.getString("SUB_CATEGORIA_OBJETO"));
                o.setFechaObjeto(rs.getDate("FECHA_OBJETO"));
                o.setDescripcionObjeto(rs.getString("DESCRIPCION_OBJETO"));
                o.setDepartamento(d);
                oh.add(o);
                
            }
            rs.close();
            cstm.close();
            System.out.println("Objeto(s) encontrado(s)");
        } catch (Exception e) {
            System.out.println("No se encontro objetos ingresados en el departamento");
        }
        return oh;
        
    }
    
    public int insertarCheckList(CheckList CheckList) throws SQLException{
       int id = 0;
       
        try {
            conn = Conexion.getConnection();
            CallableStatement sql = conn.prepareCall("{ call sp_ingresar_check_list_objeto(?, ?, ?, ?) }");
            sql.registerOutParameter(1, Types.INTEGER);
            sql.setString(2, CheckList.getEstadoCheckList());
            sql.setString(3, CheckList.getObservacionInventario());
            sql.setDate(4, new java.sql.Date(CheckList.getFechaCheckList().getTime()));
            
            sql.executeUpdate();
            id = sql.getInt(1);
            
        } catch (Exception e) {
            System.out.println("No se puede insertar el checklist en la base de datos"+ e.getMessage());
        }
       return id;
    }
    
    public boolean insertarDetalleCheckList (DetalleCheckList detalle, int idCheckList, int idIn){
        boolean resultado = false;
        try {
             conn = Conexion.getConnection();
             CallableStatement sql = conn.prepareCall("{ call sp_insertar_id_detalle_check_list( ?, ?) }");
             sql.setInt(1, idCheckList);
             sql.setInt(2, idIn);
             sql.executeUpdate();
             System.out.println("El detalle fue insertado correctamente");
             resultado = true;
             return resultado;
            
        } catch (Exception e) {
            System.out.println("No se pudo ingresar el detalle " + e.getMessage());
        }
        return resultado;
        
    }
    

    public void actualizarEstadoDepartamento(JTextArea estado, int idDepa) {

        try {
            String sql = "{ call sp_actualizar_estado_habitacion( ?, ?) }";
            CallableStatement cstm;

            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);

            cstm.setString(1, estado.getText());
            cstm.setInt(2, idDepa);
            cstm.execute();
            System.out.println("Se actualizo correctamente");
            JOptionPane.showMessageDialog(null, "Estado insertado Correctamente");
        } catch (Exception e) {
            System.out.println("Error ," + e);
        }
    }
    
}

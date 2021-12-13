/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method.funcionario;

import Database.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckInMethod {
    private static Connection conn;
   
    
    public void listarReservaCheckIn(JTable jTableCheckIn){
        DefaultTableModel model = new DefaultTableModel();
        jTableCheckIn.setModel(model);
        
        try {
            String sql = "{ call sp_buscar_reserva_check_in(?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(1);
            
            model.addColumn("RUT_USUARIO");
            model.addColumn("ID_RESERVA");
            model.addColumn("ID_DEPARTAMENTO");
            model.addColumn("MONTO_FINAL");
            model.addColumn("FECHA_ENTRADA");
            model.addColumn("DESCRIPCION_DEPARTAMENTO");
            model.addColumn("ESTADO_HABITACION");
            
            while (rs.next()){
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
                
            }
            rs.close();
            cstm.close();
            
            System.out.println("Consulta correcta");
        } catch (Exception e) {
            System.out.println("Consulta incorrecta");
        }
        
    }
    
    public void insertarCheckIn(JComboBox con, Date fecha, int idRe, int Monto, int idDepa){
        
        try {
            String sql = "{ call sp_insertar_check_in (?,?,?,?,?) }";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            long f = fecha.getTime();
            java.sql.Date fechaa = new java.sql.Date(f);
            cstm.setString(1, con.getSelectedItem().toString());
            cstm.setDate(2, fechaa);
            cstm.setInt(3, idRe);
            cstm.setInt(4, Monto);
            cstm.setInt(5, idDepa);
            cstm.execute();
            System.out.println("Se inserto el check_in");
            
        } catch (Exception e) {
            System.out.println("No se inserto el check_in"+ e.getMessage());
        }
    }
    
     public void listarReservaCheckInRut(JTextField rut, JTable jTableCheckIn){
        DefaultTableModel model = new DefaultTableModel();
        jTableCheckIn.setModel(model);
        
        try {
            String sql = "{ call sp_buscar_reserva_ci_por_rut(?,?) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, rut.getText());
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.executeQuery();
            rs = (ResultSet) cstm.getObject(2);
            
            model.addColumn("RUT_USUARIO");
            model.addColumn("ID_RESERVA");
            model.addColumn("ID_DEPARTAMENTO");
            model.addColumn("MONTO_FINAL");
            model.addColumn("FECHA_ENTRADA");
            model.addColumn("DESCRIPCION_DEPARTAMENTO");
            model.addColumn("ESTADO_HABITACION");
            
            while (rs.next()){
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
                
            }
            rs.close();
            cstm.close();
            
            System.out.println("Consulta correcta");
        } catch (Exception e) {
            System.out.println("Consulta incorrecta"+e);
        }
        
    }
    
      
    
    
}

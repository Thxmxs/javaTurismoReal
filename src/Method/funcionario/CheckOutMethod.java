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
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckOutMethod {
    private static Connection conn;
    
    public void listarReservaCheckOut (JTable JTableCheckOut){
        DefaultTableModel model = new DefaultTableModel();
        JTableCheckOut.setModel(model);
        
        try {
            String sql = "{ call sp_buscar_reserva_check_out(?)}";
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
            model.addColumn("FECHA_SALIDA");
            
            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i+ 1);
                }
                model.addRow(fila);      
            }
            
            
        } catch (Exception e) {
        }
    }
    
    public void insertarCheckOut (int multa, int costoReparacion, JTextArea descripcion, Date fecha, int idReserva, int idDepa){
        try {
            String sql = "{ call sp_insertar_check_out(?, ?, ?, ?, ? ,?)}";
            CallableStatement cstm;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            
            cstm.setInt(1, multa);
            cstm.setInt(2, costoReparacion);
            cstm.setString(3, descripcion.getText());
            
            long f = fecha.getTime();
            java.sql.Date fechaa = new java.sql.Date(f);
            cstm.setDate(4, fechaa);
            
            cstm.setInt(5, idReserva);
            cstm.setInt(6, idDepa);
            cstm.execute();
            System.out.println("Se ingreso el check out desde el metodo");
            
        } catch (Exception e) {
            System.out.println("No se ingreso el check out desde el metodo: " + e.getMessage());
        }
    }
    
     public void listarReservaCheckOutPorRut (JTextField rut,JTable JTableCheckOut){
        DefaultTableModel model = new DefaultTableModel();
        JTableCheckOut.setModel(model);
        
        try {
            String sql = "{ call sp_buscar_reserva_check_out_por_rut(?, ?)}";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, rut.getText());
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);
            
            model.addColumn("RUT_USUARIO");
            model.addColumn("ID_RESERVA");
            model.addColumn("ID_DEPARTAMENTO");
            model.addColumn("FECHA_SALIDA");
            
            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i+ 1);
                }
                model.addRow(fila);      
            }
            rs.close();
            cstm.close();
            System.out.println("Consulta correcta");
        } catch (Exception e) {
            System.out.println("Consulta incorrecta"+ e);
        }
    }
    
}

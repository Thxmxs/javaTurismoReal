package Method;

import Database.Conexion;
import Model.CuentaUsuario;
import Model.TipoUsuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class CuentaUsuarioMethod {
    private static Connection conn;
  
    
    public CuentaUsuario readCuentaUsuario(String emailCuentaUsuario){
        CuentaUsuario cu = new CuentaUsuario();
        TipoUsuario tu = new TipoUsuario();
        try {
            String sql = "{ call sp_read_cuenta_usuario( ?, ? ) }";
            CallableStatement cstm;
            ResultSet rs;
            conn = Conexion.getConnection();
            cstm = conn.prepareCall(sql);
            cstm.setString(1, emailCuentaUsuario);
            cstm.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            cstm.execute();
            rs = (ResultSet) cstm.getObject(2);
            
            while (rs.next()) {
                cu.setIdCuentaUsuario(rs.getInt("id_cuenta_usuario"));
                cu.setEmailCuentaUsuario(rs.getString("email_usuario"));
                cu.setPasswordCuentaUsuario(rs.getString("password_usuario"));
                cu.setFechaCreacion(rs.getString("fecha_creacion"));
                tu.setIdtipoUsuario(rs.getInt("tipo_usuario_id_tipo_usuario"));
                tu.setnombre(rs.getString("nombre_tipo_usuario"));
                cu.setIdTipoUsuario(tu);      
            }
            
            rs.close();
            cstm.close();
            System.out.println("Usuario registrado");
            
        } catch (Exception e) {
            System.out.println("Usuario no registrado");
        }
        return cu;
    }
}

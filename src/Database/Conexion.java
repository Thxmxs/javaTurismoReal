 package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    //variables
    private static Connection conn = null;
    private static Statement stm = null;
    private static ResultSet rs = null;
    
    //metodo para la conexion con la base de datos
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        try {
            if (conn == null) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String myDB = "jdbc:oracle:thin:@//localhost:1521/orcl";
            String usuario = "TurismoRealApp";
            String password = "turismorealapp";
            conn = DriverManager.getConnection(myDB,usuario,password);
            System.out.println("Se logró la conexión");
        }
        } catch (Exception e) {
           
        }    
        return conn;
    }
    
    //metodo para obtener querys
    public static ResultSet getExecuteQuery(String qy, Connection con) throws ClassNotFoundException, SQLException {
        stm = con.createStatement();
        rs = stm.executeQuery(qy);
        
        return rs;
    }

    //metodo para cerrar conexion
    public static void closeConnection(Connection con) throws ClassNotFoundException, SQLException{
        stm.close();
        rs.close();
        //conn.close();
        
    }

}

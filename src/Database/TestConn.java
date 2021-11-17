package Database;

import java.sql.Connection;


public class TestConn {
  
    public static void main(String[] args) {
      try {
         Connection cn = Conexion.getConnection();
         
         cn.close();
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }
}

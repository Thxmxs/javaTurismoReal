package Controller;

import Method.CuentaUsuarioMethod;
import Model.CuentaUsuario;


public class LoginController {
    
    CuentaUsuarioMethod user = new CuentaUsuarioMethod();
    CuentaUsuario cu = new CuentaUsuario();
    
    public boolean ValidarCuentaUsuario(String password, String txtPassword){
        boolean resultado = false;
        
        if(password.equals(txtPassword)){
            resultado = true;
        }
        
        return resultado;
    }
    
      public CuentaUsuario readCuentaUsuario (String emailCuentaUsuario){
        CuentaUsuario c = new CuentaUsuario();
        c = user.readCuentaUsuario(emailCuentaUsuario);
        return c;
        
    }
    
    
    
    
}

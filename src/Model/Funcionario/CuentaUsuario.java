package Model.Funcionario;

import java.sql.Date;


public class CuentaUsuario {
    
    private int idCuentaUsuario;
    private String emailCuentaUsuario;
    private String passwordCuentaUsuario;
    private String fechaCreacion;
    TipoUsuario tipoUsuario;
    private String nombreTipoUsuario;
    

    public CuentaUsuario() {
    }

    public CuentaUsuario(int idCuentaUsuario, String emailCuentaUsuario, String passwordCuentaUsuario, String fechaCreacion, TipoUsuario tipoUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
        this.emailCuentaUsuario = emailCuentaUsuario;
        this.passwordCuentaUsuario = passwordCuentaUsuario;
        this.fechaCreacion = fechaCreacion;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(int idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getEmailCuentaUsuario() {
        return emailCuentaUsuario;
    }

    public void setEmailCuentaUsuario(String emailCuentaUsuario) {
        this.emailCuentaUsuario = emailCuentaUsuario;
    }

    public String getPasswordCuentaUsuario() {
        return passwordCuentaUsuario;
    }

    public void setPasswordCuentaUsuario(String passwordCuentaUsuario) {
        this.passwordCuentaUsuario = passwordCuentaUsuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
    public TipoUsuario getTipoUsuario(){
        return tipoUsuario;
    }
    
     public void setTipoUsuario(TipoUsuario tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }
    
    public TipoUsuario getIdTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setIdTipoUsuario (TipoUsuario tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getNombreTipoUsuario(){
        return nombreTipoUsuario;
    }
    
    public void setNombreTipoUsuario(String nombreTipoUsuario){
        this.nombreTipoUsuario = nombreTipoUsuario;
    }
    
  
   
    
    
    
}

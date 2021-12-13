/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Funcionario;

/**
 *
 * @author alx4a
 */
public class Usuario {
    
    private String rutUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    CuentaUsuario cuentaUsuario;
    private int cuentaUsuarioIdCuentaUsuario;
    Reserva reserva;

    public Usuario() {
    }

    public Usuario(String rutUsuario, String nombre, String apellido, String email, String direccion, String telefono, CuentaUsuario cuentaUsuario, int cuentaUsuarioIdCuentaUsuario, Reserva reserva) {
        this.rutUsuario = rutUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentaUsuario = cuentaUsuario;
        this.cuentaUsuarioIdCuentaUsuario = cuentaUsuarioIdCuentaUsuario;
        this.reserva = reserva;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CuentaUsuario getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCuentaUsuario(CuentaUsuario cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }

    public int getCuentaUsuarioIdCuentaUsuario() {
        return cuentaUsuarioIdCuentaUsuario;
    }

    public void setCuentaUsuarioIdCuentaUsuario(int cuentaUsuarioIdCuentaUsuario) {
        this.cuentaUsuarioIdCuentaUsuario = cuentaUsuarioIdCuentaUsuario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
    
}

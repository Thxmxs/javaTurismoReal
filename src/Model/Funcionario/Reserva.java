/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Funcionario;

import java.util.Date;

/**
 *
 * @author alx4a
 */
public class Reserva {
    
    private int idReserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    Usuario usuario;
    private String usuarioIdUsuario;
    Departamento departamento;
    DetalleReserva detalleReserva;
    CheckIn checkIn;
    Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(int idReserva, Date fechaEntrada, Date fechaSalida, Usuario usuario, String usuarioIdUsuario, Departamento departamento, DetalleReserva detalleReserva, CheckIn checkIn, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.usuario = usuario;
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.departamento = departamento;
        this.detalleReserva = detalleReserva;
        this.checkIn = checkIn;
        this.habitacion = habitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(String usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public DetalleReserva getDetalleReserva() {
        return detalleReserva;
    }

    public void setDetalleReserva(DetalleReserva detalleReserva) {
        this.detalleReserva = detalleReserva;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

   
}

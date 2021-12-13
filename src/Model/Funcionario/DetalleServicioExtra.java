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
public class DetalleServicioExtra {
    
    private int idDetalleServicio;
    Servicio servicio;
    private int servicioIdServicio;
    Reserva reserva;
    private int reservaIdReserva;

    public DetalleServicioExtra() {
    }

    public DetalleServicioExtra(int idDetalleServicio, Servicio servicio, int servicioIdServicio, Reserva reserva, int reservaIdReserva) {
        this.idDetalleServicio = idDetalleServicio;
        this.servicio = servicio;
        this.servicioIdServicio = servicioIdServicio;
        this.reserva = reserva;
        this.reservaIdReserva = reservaIdReserva;
    }

    public int getIdDetalleServicio() {
        return idDetalleServicio;
    }

    public void setIdDetalleServicio(int idDetalleServicio) {
        this.idDetalleServicio = idDetalleServicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getServicioIdServicio() {
        return servicioIdServicio;
    }

    public void setServicioIdServicio(int servicioIdServicio) {
        this.servicioIdServicio = servicioIdServicio;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getReservaIdReserva() {
        return reservaIdReserva;
    }

    public void setReservaIdReserva(int reservaIdReserva) {
        this.reservaIdReserva = reservaIdReserva;
    }
    
    
}

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
public class Pago {
    
    private int idPago;
    private String formaPago;
    private int montoPago;
    private Date fechaPago;
    EstadoPago estadopago;
    private int estadoPagoIdEstadoPago;
    Reserva reserva;
    private int reservaIdReserva;

    public Pago() {
    }

    public Pago(int idPago, String formaPago, int montoPago, Date fechaPago, EstadoPago estadopago, int estadoPagoIdEstadoPago, Reserva reserva, int reservaIdReserva) {
        this.idPago = idPago;
        this.formaPago = formaPago;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
        this.estadopago = estadopago;
        this.estadoPagoIdEstadoPago = estadoPagoIdEstadoPago;
        this.reserva = reserva;
        this.reservaIdReserva = reservaIdReserva;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(int montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public EstadoPago getEstadopago() {
        return estadopago;
    }

    public void setEstadopago(EstadoPago estadopago) {
        this.estadopago = estadopago;
    }

    public int getEstadoPagoIdEstadoPago() {
        return estadoPagoIdEstadoPago;
    }

    public void setEstadoPagoIdEstadoPago(int estadoPagoIdEstadoPago) {
        this.estadoPagoIdEstadoPago = estadoPagoIdEstadoPago;
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

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
public class CheckIn {
    
    private int idCheckIn;
    private String confirmacion;
    private Date fecha_check_in;
    Reserva reserva;
    private int reservaIdReserva;
    public int montoFinal;

    public CheckIn() {
    }

    public CheckIn(int idCheckIn, String confirmacion, Date fecha_check_in, Reserva reserva, int reservaIdReserva, int montoFinal) {
        this.idCheckIn = idCheckIn;
        this.confirmacion = confirmacion;
        this.fecha_check_in = fecha_check_in;
        this.reserva = reserva;
        this.reservaIdReserva = reservaIdReserva;
        this.montoFinal = montoFinal;
    }

    public int getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(int idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public Date getFecha_check_in() {
        return fecha_check_in;
    }

    public void setFecha_check_in(Date fecha_check_in) {
        this.fecha_check_in = fecha_check_in;
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

    public int getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(int montoFinal) {
        this.montoFinal = montoFinal;
    }
    
}

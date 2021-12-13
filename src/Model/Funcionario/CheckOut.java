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
public class CheckOut {
    
    private int idCheckOut;
    private int multa;
    private int costoReparacion;
    private String descripcion;
    private Date fechaCheckOut;
    private int reservaIdreserva;

    public CheckOut() {
    }

    public CheckOut(int idCheckOut, int multa, int costoReparacion, String descripcion, Date fechaCheckOut, int reservaIdreserva) {
        this.idCheckOut = idCheckOut;
        this.multa = multa;
        this.costoReparacion = costoReparacion;
        this.descripcion = descripcion;
        this.fechaCheckOut = fechaCheckOut;
        this.reservaIdreserva = reservaIdreserva;
    }

    public int getIdCheckOut() {
        return idCheckOut;
    }

    public void setIdCheckOut(int idCheckOut) {
        this.idCheckOut = idCheckOut;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getCostoReparacion() {
        return costoReparacion;
    }

    public void setCostoReparacion(int costoReparacion) {
        this.costoReparacion = costoReparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public int getReservaIdreserva() {
        return reservaIdreserva;
    }

    public void setReservaIdreserva(int reservaIdreserva) {
        this.reservaIdreserva = reservaIdreserva;
    }
    
    
}

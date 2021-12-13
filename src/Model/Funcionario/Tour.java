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
public class Tour {
    
    private int idTour;
    private String nombreTour;
    private Date fechaTour;
    private int costoTour;
    private String descripcionTour;

    public Tour() {
    }

    public Tour(int idTour, String nombreTour, Date fechaTour, int costoTour, String descripcionTour) {
        this.idTour = idTour;
        this.nombreTour = nombreTour;
        this.fechaTour = fechaTour;
        this.costoTour = costoTour;
        this.descripcionTour = descripcionTour;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public Date getFechaTour() {
        return fechaTour;
    }

    public void setFechaTour(Date fechaTour) {
        this.fechaTour = fechaTour;
    }

    public int getCostoTour() {
        return costoTour;
    }

    public void setCostoTour(int costoTour) {
        this.costoTour = costoTour;
    }

    public String getDescripcionTour() {
        return descripcionTour;
    }

    public void setDescripcionTour(String descripcionTour) {
        this.descripcionTour = descripcionTour;
    }
    
}

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
public class Servicio {
    
    private int idServicio;
    private String nombreServicio;
    private int costoServicio;

    public Servicio() {
    }

    public Servicio(int idServicio, String nombreServicio, int costoServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.costoServicio = costoServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }
    
}

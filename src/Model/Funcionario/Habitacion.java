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
public class Habitacion {
    
    int idHabitacion;
    String estadoHabitacion;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String estadoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.estadoHabitacion = estadoHabitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", estadoHabitacion=" + estadoHabitacion + '}';
    }

    
    

}
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
public class DetalleHabitacion {
    
    private int idDetalleHabitacion;
    Departamento departamento;
    private int departamentoIdDepartamento;
    Habitacion habitacion;
    private int habitacionIdHabitacion;

    public DetalleHabitacion() {
    }

    public DetalleHabitacion(int idDetalleHabitacion, Departamento departamento, int departamentoIdDepartamento, Habitacion habitacion, int habitacionIdHabitacion) {
        this.idDetalleHabitacion = idDetalleHabitacion;
        this.departamento = departamento;
        this.departamentoIdDepartamento = departamentoIdDepartamento;
        this.habitacion = habitacion;
        this.habitacionIdHabitacion = habitacionIdHabitacion;
    }

    public int getIdDetalleHabitacion() {
        return idDetalleHabitacion;
    }

    public void setIdDetalleHabitacion(int idDetalleHabitacion) {
        this.idDetalleHabitacion = idDetalleHabitacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(int departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getHabitacionIdHabitacion() {
        return habitacionIdHabitacion;
    }

    public void setHabitacionIdHabitacion(int habitacionIdHabitacion) {
        this.habitacionIdHabitacion = habitacionIdHabitacion;
    }
    
}

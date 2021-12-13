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
public class DetalleInventario {
    
    private int idDetalleInventario;
    private int objetoHabitacionIdObjetoHabitacion;
    private int departamentoIdDepartamento;

    public DetalleInventario() {
    }

    public DetalleInventario(int idDetalleInventario, int objetoHabitacionIdObjetoHabitacion, int departamentoIdDepartamento) {
        this.idDetalleInventario = idDetalleInventario;
        this.objetoHabitacionIdObjetoHabitacion = objetoHabitacionIdObjetoHabitacion;
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public int getIdDetalleInventario() {
        return idDetalleInventario;
    }

    public void setIdDetalleInventario(int idDetalleInventario) {
        this.idDetalleInventario = idDetalleInventario;
    }

    public int getObjetoHabitacionIdObjetoHabitacion() {
        return objetoHabitacionIdObjetoHabitacion;
    }

    public void setObjetoHabitacionIdObjetoHabitacion(int objetoHabitacionIdObjetoHabitacion) {
        this.objetoHabitacionIdObjetoHabitacion = objetoHabitacionIdObjetoHabitacion;
    }

    public int getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(int departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }
    
}

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
public class DetalleReserva {
    
    private int idDetalleReserva;
    Reserva reserva;
    private int reservaIdReserva;
    Departamento departamento;
    private int departamentoIdDepartamento;

    public DetalleReserva() {
    }

    public DetalleReserva(int idDetalleReserva, Reserva reserva, int reservaIdReserva, Departamento departamento, int departamentoIdDepartamento) {
        this.idDetalleReserva = idDetalleReserva;
        this.reserva = reserva;
        this.reservaIdReserva = reservaIdReserva;
        this.departamento = departamento;
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    public void setIdDetalleReserva(int idDetalleReserva) {
        this.idDetalleReserva = idDetalleReserva;
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
    
}

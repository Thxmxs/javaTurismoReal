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
public class EstadoPago {
    
    private int idEstadoPago;
    private String estadoPago;

    public EstadoPago() {
    }

    public EstadoPago(int idEstadoPago, String estadoPago) {
        this.idEstadoPago = idEstadoPago;
        this.estadoPago = estadoPago;
    }

    public int getIdEstadoPago() {
        return idEstadoPago;
    }

    public void setIdEstadoPago(int idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
    
}

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
public class DetalleCheckList {
   
    private int idDetalleCheckList;
    private int checkListEstadoInventarioIdCheckList;
    private int objetoHabitacionIdObjetoHabitacionCheckList;

    public DetalleCheckList() {
    }

    public DetalleCheckList(int idDetalleCheckList, int checkListEstadoInventarioIdCheckList, int objetoHabitacionIdObjetoHabitacionCheckList) {
        this.idDetalleCheckList = idDetalleCheckList;
        this.checkListEstadoInventarioIdCheckList = checkListEstadoInventarioIdCheckList;
        this.objetoHabitacionIdObjetoHabitacionCheckList = objetoHabitacionIdObjetoHabitacionCheckList;
    }

    public int getIdDetalleCheckList() {
        return idDetalleCheckList;
    }

    public void setIdDetalleCheckList(int idDetalleCheckList) {
        this.idDetalleCheckList = idDetalleCheckList;
    }

    public int getCheckListEstadoInventarioIdCheckList() {
        return checkListEstadoInventarioIdCheckList;
    }

    public void setCheckListEstadoInventarioIdCheckList(int checkListEstadoInventarioIdCheckList) {
        this.checkListEstadoInventarioIdCheckList = checkListEstadoInventarioIdCheckList;
    }

    public int getObjetoHabitacionIdObjetoHabitacionCheckList() {
        return objetoHabitacionIdObjetoHabitacionCheckList;
    }

    public void setObjetoHabitacionIdObjetoHabitacionCheckList(int objetoHabitacionIdObjetoHabitacionCheckList) {
        this.objetoHabitacionIdObjetoHabitacionCheckList = objetoHabitacionIdObjetoHabitacionCheckList;
    }
    
}

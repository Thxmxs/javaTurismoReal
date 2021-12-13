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
public class CheckList {
    
    private int idCheckList;
    private String estadoCheckList;
    private String observacionInventario;
    private Date fechaCheckList;

    public CheckList() {
    }

    public CheckList(int idCheckList, String estadoCheckList, String observacionInventario, Date fechaCheckList) {
        this.idCheckList = idCheckList;
        this.estadoCheckList = estadoCheckList;
        this.observacionInventario = observacionInventario;
        this.fechaCheckList = fechaCheckList;
    }

    public int getIdCheckList() {
        return idCheckList;
    }

    public void setIdCheckList(int idCheckList) {
        this.idCheckList = idCheckList;
    }

    public String getEstadoCheckList() {
        return estadoCheckList;
    }

    public void setEstadoCheckList(String estadoCheckList) {
        this.estadoCheckList = estadoCheckList;
    }

    public String getObservacionInventario() {
        return observacionInventario;
    }

    public void setObservacionInventario(String observacionInventario) {
        this.observacionInventario = observacionInventario;
    }

    public Date getFechaCheckList() {
        return fechaCheckList;
    }

    public void setFechaCheckList(Date fechaCheckList) {
        this.fechaCheckList = fechaCheckList;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Funcionario;

import java.sql.Date;

/**
 *
 * @author alx4a
 */
public class ObjetoHabitacion {
    
    private int idObjetoHabitacion;
    private String nombreObjeto;
    private int valorObjeto;
    private String categoriaObjeto;
    private String subCategoriaObjeto;
    private Date fechaObjeto;
    private String descripcionObjeto;
    Departamento departamento;
    int iddepartamento;

    public ObjetoHabitacion() {
    }

    public ObjetoHabitacion(int idObjetoHabitacion, String nombreObjeto, int valorObjeto, String categoriaObjeto, String subCategoriaObjeto, Date fechaObjeto, String descripcionObjeto, Departamento departamento, int iddepartamento) {
        this.idObjetoHabitacion = idObjetoHabitacion;
        this.nombreObjeto = nombreObjeto;
        this.valorObjeto = valorObjeto;
        this.categoriaObjeto = categoriaObjeto;
        this.subCategoriaObjeto = subCategoriaObjeto;
        this.fechaObjeto = fechaObjeto;
        this.descripcionObjeto = descripcionObjeto;
        this.departamento = departamento;
        this.iddepartamento = iddepartamento;
    }

    public int getIdObjetoHabitacion() {
        return idObjetoHabitacion;
    }

    public void setIdObjetoHabitacion(int idObjetoHabitacion) {
        this.idObjetoHabitacion = idObjetoHabitacion;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public int getValorObjeto() {
        return valorObjeto;
    }

    public void setValorObjeto(int valorObjeto) {
        this.valorObjeto = valorObjeto;
    }

    public String getCategoriaObjeto() {
        return categoriaObjeto;
    }

    public void setCategoriaObjeto(String categoriaObjeto) {
        this.categoriaObjeto = categoriaObjeto;
    }

    public String getSubCategoriaObjeto() {
        return subCategoriaObjeto;
    }

    public void setSubCategoriaObjeto(String subCategoriaObjeto) {
        this.subCategoriaObjeto = subCategoriaObjeto;
    }

    public Date getFechaObjeto() {
        return fechaObjeto;
    }

    public void setFechaObjeto(Date fechaObjeto) {
        this.fechaObjeto = fechaObjeto;
    }

    public String getDescripcionObjeto() {
        return descripcionObjeto;
    }

    public void setDescripcionObjeto(String descripcionObjeto) {
        this.descripcionObjeto = descripcionObjeto;
    }
    
    public Departamento getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
    public int getIddepartamento(){
        return iddepartamento;
    }
    
    public void setIddepartamento(int iddepartamento){
        this.iddepartamento = iddepartamento;
    }
    
}

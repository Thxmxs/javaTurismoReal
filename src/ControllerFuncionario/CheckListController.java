/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerFuncionario;

import Method.funcionario.CheckListMethod;
import Model.Funcionario.CheckList;
import Model.Funcionario.Departamento;
import Model.Funcionario.DetalleCheckList;
import Model.Funcionario.DetalleHabitacion;
import Model.Funcionario.Habitacion;
import Model.Funcionario.ObjetoHabitacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alx4a
 */
public class CheckListController {
    
    CheckListMethod clm = new CheckListMethod();
    
    public ArrayList<Departamento> arrayListDepartamento() {
        ArrayList<Departamento> dep = new ArrayList<Departamento>();
        CheckListMethod clm = new CheckListMethod();
        dep = clm.listarDepartamentosCheckList();
        return dep;
    }
   
    public ArrayList<ObjetoHabitacion> listarObjetoHabitacionCheckList(int iddep){
        ArrayList<ObjetoHabitacion> oh = new ArrayList<ObjetoHabitacion>();
        CheckListMethod clm = new CheckListMethod();
        oh = clm.listarObjetoHabitacionCheckList(iddep);
        return oh;
    }
    
    public DefaultTableModel updateTableCheckList(ArrayList<Departamento> dep){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID");
        table.addColumn("Direccion");
        table.addColumn("Costo");
        table.addColumn("Estado");
        table.addColumn("Descripcion");
        table.addColumn("Orientacion");
        table.addColumn("Estacionamiento");
        table.addColumn("N° Habitaciones");
        table.addColumn("N° Baños");
        table.addColumn("N° Estacionamiento");
        table.addColumn("Region");
        table.addColumn("Provincia");
        table.addColumn("Comuna");
        
        for(Departamento depa : dep){
            String[] fila = new String[13];
            fila[0] = String.valueOf(depa.getIdDepartamento());
            fila[1] = depa.getDireccion();
            fila[2] = String.valueOf(depa.getCostoDepartamento());
            fila[3] = depa.getEstadoDepartamento();
            fila[4] = depa.getDescripcionDepartamento();
            fila[5] = depa.getOrientacionDepartamento();
            fila[6] = depa.getEstacionamiento();
            fila[7] = String.valueOf(depa.getNumHabitaciones());
            fila[8] = String.valueOf(depa.getNumBano());
            fila[9] = String.valueOf(depa.getNumEstacionamiento());
            fila[10] = String.valueOf(depa.getRegion().getNombreRegion());
            fila[11] = String.valueOf(depa.getProvincia().getNombreProvincia());
            fila[12] = String.valueOf(depa.getComuna().getNombreComuna());         
            table.addRow(fila);
        }
        return table;     
    }
    
    public DefaultTableModel updateTableSubCheckList (ArrayList<ObjetoHabitacion> obj){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Departamento");
        table.addColumn("ID Inventario");
        table.addColumn("Nombre");
        table.addColumn("Valor");
        table.addColumn("Categoria");
        table.addColumn("Sub Categoria");
        table.addColumn("Fecha");
        table.addColumn("Descripcion");
        
        for (ObjetoHabitacion oh : obj) {
            String[] fila = new String [8];
            fila[0] = String.valueOf(oh.getDepartamento().getIdDepartamento());
            fila[1] = String.valueOf(oh.getIdObjetoHabitacion());
            fila[2] = oh.getNombreObjeto();
            fila[3] = String.valueOf(oh.getValorObjeto());
            fila[4] = oh.getCategoriaObjeto();
            fila[5] = oh.getSubCategoriaObjeto();
            fila[6] = String.valueOf(oh.getFechaObjeto());
            fila[7] = oh.getDescripcionObjeto();
            table.addRow(fila);
            
        }
             
        return table;  
    }
    
    public boolean validarCheckListHecho(ArrayList<CheckList> checklist, int idchecklist){
       Boolean existe = false;
        for (CheckList checkList : checklist) {
            if (checkList.getIdCheckList() == idchecklist) {
                existe = true;
            }
        }
        return existe;
    }
    
    public int insertarCheckList(CheckList CheckList){
        int id = 0;
        try {
            id = clm.insertarCheckList(CheckList);
            System.out.println("Datos de CHECKLIST entraron a la capa controller");
            return id;
        } catch (Exception e) {
            System.out.println("Los datos de CHECKLIST no lograron entrar a la capa controller" + e.getMessage());
        }
        return id;
    }
    
    public boolean insertarDetalleCheckList(DetalleCheckList detalle, int idCheckList, int idIn){
        boolean resultado = false;
        try {
            resultado = clm.insertarDetalleCheckList(detalle, idCheckList, idIn);
            System.out.println("Datos de DETALLE_CHECKLIST entraron a la capa controller");
            return resultado;
        } catch (Exception e) {
            System.out.println("Los datos de DETALLE_CHECKLIST no lograron entrar a la capa controller correctamente" + e.getMessage());
        }
        return resultado;
    }
    

}

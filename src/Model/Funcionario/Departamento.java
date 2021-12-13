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
public class Departamento {
    
    private int idDepartamento;
    private String direccion;
    private int costoDepartamento;
    private String estadoDepartamento;
    private String descripcionDepartamento;
    private String orientacionDepartamento;
    private String estacionamiento;
    private int numHabitaciones;
    private int numBano;
    private int numEstacionamiento;
    Comuna comuna;
    int comunaIdComuna;
    Provincia provincia;
    int comunaProvinciaIdProvincia;
    Region region;
    int comunaProvinciaRegionIdRegion;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String direccion, int costoDepartamento, String estadoDepartamento, String descripcionDepartamento, String orientacionDepartamento, String estacionamiento, int numHabitaciones, int numBano, int numEstacionamiento, Comuna comuna, int comunaIdComuna, Provincia provincia, int comunaProvinciaIdProvincia, Region region, int comunaProvinciaRegionIdRegion) {
        this.idDepartamento = idDepartamento;
        this.direccion = direccion;
        this.costoDepartamento = costoDepartamento;
        this.estadoDepartamento = estadoDepartamento;
        this.descripcionDepartamento = descripcionDepartamento;
        this.orientacionDepartamento = orientacionDepartamento;
        this.estacionamiento = estacionamiento;
        this.numHabitaciones = numHabitaciones;
        this.numBano = numBano;
        this.numEstacionamiento = numEstacionamiento;
        this.comuna = comuna;
        this.comunaIdComuna = comunaIdComuna;
        this.provincia = provincia;
        this.comunaProvinciaIdProvincia = comunaProvinciaIdProvincia;
        this.region = region;
        this.comunaProvinciaRegionIdRegion = comunaProvinciaRegionIdRegion;
    }

   

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCostoDepartamento() {
        return costoDepartamento;
    }

    public void setCostoDepartamento(int costoDepartamento) {
        this.costoDepartamento = costoDepartamento;
    }

    public String getEstadoDepartamento() {
        return estadoDepartamento;
    }

    public void setEstadoDepartamento(String estadoDepartamento) {
        this.estadoDepartamento = estadoDepartamento;
    }

    public String getDescripcionDepartamento() {
        return descripcionDepartamento;
    }

    public void setDescripcionDepartamento(String descripcionDepartamento) {
        this.descripcionDepartamento = descripcionDepartamento;
    }

    public String getOrientacionDepartamento() {
        return orientacionDepartamento;
    }

    public void setOrientacionDepartamento(String orientacionDepartamento) {
        this.orientacionDepartamento = orientacionDepartamento;
    }

    public String getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(String estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBano() {
        return numBano;
    }

    public void setNumBano(int numBano) {
        this.numBano = numBano;
    }

    public int getNumEstacionamiento() {
        return numEstacionamiento;
    }

    public void setNumEstacionamiento(int numEstacionamiento) {
        this.numEstacionamiento = numEstacionamiento;
    }
    
    public Comuna getComuna(){
        return comuna;
    }
    
    public void setComuna(Comuna comuna){
        this.comuna = comuna;
    }
    
    public int getComunaIdComuna() {
        return comunaIdComuna;
    }

    public void setComunaIdComuna(int comunaIdComuna) {
        this.comunaIdComuna = comunaIdComuna;
    }

    public Provincia getProvincia(){
        return provincia;
    }
    
    public void setProvincia (Provincia provincia){
        this.provincia = provincia;
    }
    
    public int getComunaProvinciaIdProvincia() {
        return comunaProvinciaIdProvincia;
    }

    public void setComunaProvinciaIdProvincia(int comunaProvinciaIdProvincia) {
        this.comunaProvinciaIdProvincia = comunaProvinciaIdProvincia;
    }

    public Region getRegion(){
        return region;
    }
    
    public void setRegion(Region region){
        this.region = region;
    }
    
    public int getComunaProvinciaRegionIdRegion() {
        return comunaProvinciaRegionIdRegion;
    }

    public void setComunaProvinciaRegionIdRegion(int comunaProvinciaRegionIdRegion) {
        this.comunaProvinciaRegionIdRegion = comunaProvinciaRegionIdRegion;
    }
    

}
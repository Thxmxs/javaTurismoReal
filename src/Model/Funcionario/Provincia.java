/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Funcionario;

public class Provincia {
    int idProvincia;
    String nombreProvincia;
    int RegionIdRegion;

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getRegionIdRegion() {
        return RegionIdRegion;
    }

    public void setRegionIdRegion(int RegionIdRegion) {
        this.RegionIdRegion = RegionIdRegion;
    }

    @Override
    public String toString() {
        return this.nombreProvincia;
    }
    
    
}

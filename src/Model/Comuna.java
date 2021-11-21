/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thoma
 */
public class Comuna {
    private int idComuna;
    private String nombreComuna;
    private int provinciaIdProvincia;
    private int ProvinciaRegionIdRegion;
    

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getProvinciaIdProvincia() {
        return provinciaIdProvincia;
    }

    public void setProvinciaIdProvincia(int provinciaIdProvincia) {
        this.provinciaIdProvincia = provinciaIdProvincia;
    }

    public int getProvinciaRegionIdRegion() {
        return ProvinciaRegionIdRegion;
    }

    public void setProvinciaRegionIdRegion(int ProvinciaRegionIdRegion) {
        this.ProvinciaRegionIdRegion = ProvinciaRegionIdRegion;
    }

    @Override
    public String toString() {
        return nombreComuna;
    }
    
    
}


package Model.Funcionario;


public class Region {
    int idRegion;
    String nombreRegion;

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    @Override
    public String toString() {
        return this.nombreRegion;
    }
    
    
}

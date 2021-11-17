package Model;


public class TipoUsuario {
    
    int idTipoUsuario;
    String nombre;
    String tipoPerfil;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String nombre, String tipoPerfil) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
        this.tipoPerfil = tipoPerfil;
    }

    public int getIdtipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdtipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String gettipoPerfil() {
        return tipoPerfil;
    }

    public void settipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}

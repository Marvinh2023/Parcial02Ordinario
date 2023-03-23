package utec.edu.sv.parcial2ordinario;

public class DatosUsuarios {
    private String nombre;
    private String cargo;
    private String compania;
    private int avatar;

    public DatosUsuarios() {
    }

    public DatosUsuarios(String nombre, String cargo, String compania, int avatar) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.compania = compania;
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}

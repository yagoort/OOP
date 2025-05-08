public class Usuario {
    private String nombre;
    private long id;
    private Fecha fecha_nacimiento;
    private String ciudad_nacimiento;
    private long tel;
    private String email;
    private Direccion dir;

    public Usuario() {}

    public Usuario(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFecha_nacimiento(Fecha f) {
        this.fecha_nacimiento = f;
    }

    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public long getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDir() {
        return dir;
    }

    // Método toString
    public String toString() {
        return "Nombre: " + nombre +
               "\nID: " + id +
               "\nFecha de Nacimiento: " + fecha_nacimiento +
               "\nCiudad de Nacimiento: " + ciudad_nacimiento +
               "\nTeléfono: " + tel +
               "\nEmail: " + email +
               "\nDirección: " + dir;
    }
}

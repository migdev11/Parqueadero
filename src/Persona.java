public class Persona {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String telefono;

    public Persona(String nombre, String apellido, String cedula, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCedula() { return cedula; }
    public String getTelefono() { return telefono; }
}

public class Personal extends Persona {
    private String rol;
    private String turno;
    private float salario;

    public Personal(String nombre, String apellido, String cedula, String telefono,
                    String rol, String turno, float salario) {
        super(nombre, apellido, cedula, telefono);
        this.rol = rol;
        this.turno = turno;
        this.salario = salario;
    }

    // Getters y setters
    public String getRol() { return rol; }
    public String getTurno() { return turno; }
    public float getSalario() { return salario; }
}

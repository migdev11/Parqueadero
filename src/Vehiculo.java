public abstract class Vehiculo {
    protected String color;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String color, String modelo, String matricula) {
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Getters y setters
    public String getColor() { return color; }
    public String getModelo() { return modelo; }
    public String getMatricula() { return matricula; }
}

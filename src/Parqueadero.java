import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private double tarifaPorHora;
    private List<Piso> pisos;
    private List<Personal> personal;

    public Parqueadero(String nombre, String direccion, int horaApertura,
                       int horaCierre, double tarifaPorHora) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.tarifaPorHora = tarifaPorHora;
        this.pisos = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void agregarPersonal(Personal empleado) {
        personal.add(empleado);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getHoraApertura() { return horaApertura; }
    public int getHoraCierre() { return horaCierre; }
    public double getTarifaPorHora() { return tarifaPorHora; }
    public List<Piso> getPisos() { return pisos; }
    public List<Personal> getPersonal() { return personal; }

}

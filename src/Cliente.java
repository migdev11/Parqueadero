import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String tipo;
    private List<Reserva> reservas;
    private List<Pago> pagos;

    public Cliente(String nombre, String apellido, String cedula, String telefono, String tipo) {
        super(nombre, apellido, cedula, telefono);
        this.tipo = tipo;
        this.reservas = new ArrayList<>();
        this.pagos = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Getters y setters
    public String getTipo() { return tipo; }
    public List<Reserva> getReservas() { return reservas; }
    public List<Pago> getPagos() { return pagos; }
}

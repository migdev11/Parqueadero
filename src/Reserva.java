import java.sql.Time;
import java.util.Date;

public class Reserva {
    private Date fecha;
    private Time horainicio;
    private Time horaFin;
    private Cliente cliente;
    private Plaza plaza;

    public Reserva(Date fecha, Time horainicio, Time horaFin, Cliente cliente, Plaza plaza) {
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horaFin = horaFin;
        this.cliente = cliente;
        this.plaza = plaza;
    }

    public void crearReserva() {
        plaza.setEstado(Estado.RESERVADO);
        cliente.agregarReserva(this);
    }

    public double calcularDuracion() {
        // Cálculo de la duración en horas
        long diferencia = horaFin.getTime() - horainicio.getTime();
        return diferencia / (1000.0 * 60 * 60);
    }

    // Getters y setters
    public Date getFecha() { return fecha; }
    public Time getHorainicio() { return horainicio; }
    public Time getHoraFin() { return horaFin; }
    public Cliente getCliente() { return cliente; }
    public Plaza getPlaza() { return plaza; }
}

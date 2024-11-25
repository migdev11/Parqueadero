import java.util.Date;

public class Pago {
    private String tipo;
    private double monto;
    private Date fecha;
    private MetodoPago metodoPago;
    private Cliente cliente;

    public Pago(String tipo, double monto, Date fecha, MetodoPago metodoPago, Cliente cliente) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.cliente = cliente;
    }

    // Getters y setters
    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
    public Date getFecha() { return fecha; }
    public MetodoPago getMetodoPago() { return metodoPago; }
    public Cliente getCliente() { return cliente; }
}

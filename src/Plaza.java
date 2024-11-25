public class Plaza {
    private int numero;
    private String tipoVehiculo;
    private Estado estado;
    private Piso piso;

    public Plaza(int numero, String tipoVehiculo) {
        this.numero = numero;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = Estado.DISPONIBLE;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = Estado.valueOf(nuevoEstado);
    }

    // Getters y setters
    public int getNumero() { return numero; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }
}


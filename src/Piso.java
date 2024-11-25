import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int capacidad;
    private int numero;
    private List<Plaza> plazas;

    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(Plaza plaza) {
        if (plazas.size() < capacidad) {
            plazas.add(plaza);
        }
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    // Getters
    public int getCapacidad() { return capacidad; }
    public int getNumero() { return numero; }
}


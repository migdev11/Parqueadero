import java.util.Date;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        // 1. Crear y configurar el parqueadero
        System.out.println("=== Inicializando Sistema de Parqueadero ===\n");
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Av. Principal 123", 6, 22, 2000.0);

        // 2. Crear y agregar pisos
        System.out.println("Configurando pisos y plazas...");
        Piso piso1 = new Piso(1, 10);
        Piso piso2 = new Piso(2, 10);
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);

        // 3. Crear plazas en cada piso
        Plaza plazaAuto = new Plaza(1, "Auto");
        Plaza plazaMoto = new Plaza(2, "Moto");
        piso1.agregarPlaza(plazaAuto);
        piso1.agregarPlaza(plazaMoto);
        System.out.println("Plazas creadas: 2");

        // 4. Agregar personal
        System.out.println("\n=== Registrando Personal ===");
        Personal supervisor = new Personal("Juan", "Pérez", "1234567890", "555-0100",
                "SUPERVISOR", "Mañana", 2500000.0f);
        Personal cajero = new Personal("María", "López", "0987654321", "555-0200",
                "CAJERO", "Tarde", 1800000.0f);
        parqueadero.agregarPersonal(supervisor);
        parqueadero.agregarPersonal(cajero);
        System.out.println("Personal registrado: " + parqueadero.getPersonal().size());

        // 5. Crear cliente y vehículo
        System.out.println("\n=== Registrando Cliente y Vehículo ===");
        Cliente cliente = new Cliente("Luis", "Veintimilla", "123456", "094836", "Regular");
        Auto auto = new Auto("Rojo", "Hyundai Accent", "ABC123");
        System.out.println("Cliente registrado: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Vehículo registrado: " + auto.getModelo() + " - " + auto.getMatricula());

        // 6. Crear una reserva
        System.out.println("\n=== Creando Reserva ===");
        Reserva reserva = new Reserva(
                new Date(),
                Time.valueOf("10:00:00"),
                Time.valueOf("12:00:00"),
                cliente,
                plazaAuto
        );
        reserva.crearReserva();
        System.out.println("Reserva creada para la plaza: " + plazaAuto.getNumero());
        System.out.println("Estado de la plaza: " + plazaAuto.getEstado());

        // 7. Registrar un pago
        System.out.println("\n=== Registrando Pago ===");
        Pago pago = new Pago(
                "Estacionamiento",
                40.0,
                new Date(),
                MetodoPago.EFECTIVO,
                cliente
        );
        cliente.getPagos().add(pago);
        System.out.println("Pago registrado por: $" + pago.getMonto());

        // 8. Mostrar resumen del estado del parqueadero
        System.out.println("\n=== Resumen del Sistema ===");
        System.out.println("Nombre del parqueadero: " + parqueadero.getNombre());
        System.out.println("Dirección: " + parqueadero.getDireccion());
        System.out.println("Horario: " + parqueadero.getHoraApertura() + ":00 - "
                + parqueadero.getHoraCierre() + ":00");
        System.out.println("Tarifa por hora: $" + parqueadero.getTarifaPorHora());
        System.out.println("Número de pisos: " + parqueadero.getPisos().size());
        System.out.println("Personal registrado: " + parqueadero.getPersonal().size());
        System.out.println("Reservas activas del cliente: " + cliente.getReservas().size());
        System.out.println("Pagos registrados: " + cliente.getPagos().size());

        // 9. Mostrar información del personal
        System.out.println("\n=== Personal Activo ===");
        for (Personal empleado : parqueadero.getPersonal()) {
            System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido()
                    + " - Rol: " + empleado.getRol() + " - Turno: " + empleado.getTurno());
        }

        System.out.println("\n=== Fin de la Demostración ===");
    }
}
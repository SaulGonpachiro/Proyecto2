import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias y datos de ejemplo
        Sala sala1 = new Sala("Sala 1", 100, 200, true, "Buena acústica", "");
        Sala sala2 = new Sala("Sala 2", 150, 250, false, "Regular acústica", "");

        Evento evento1 = new Evento("Concierto A", "Artista 1", sala1, "2024-01-15", "19:00", 20.0, "Concierto", 80, null);
        Evento evento2 = new Evento("Conferencia B", "Conferencista 2", sala2, "2024-02-20", "15:00", 10.0, "Conferencia", 50, null);

        Asistente asistente1 = new Asistente("Juan", "Pérez", "juan@example.com", "12345678X", "1990-05-15");
        Asistente asistente2 = new Asistente("Ana", "Gómez", "ana@example.com", "98765432Y", "1985-08-25");

        Butaca butaca1 = new Butaca("A1", true, true);
        Butaca butaca2 = new Butaca("B3", false, true);

        Reserva reserva1 = new Reserva(1, asistente1, evento1, butaca1, "2024-01-10", "18:30");
        Reserva reserva2 = new Reserva(2, asistente2, evento2, butaca2, "2024-02-15", "14:45");

        // Menú
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Por favor escoja una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1: Seleccionar evento");
                    // Lógica para seleccionar evento y hacer reserva
                    seleccionarEventoYReservar(scanner, asistente1, sala1, evento1);
                    break;
                case 2:
                    System.out.println("Opción 2: Información de las reservas");
                    // Lógica para mostrar información de las reservas
                    mostrarInformacionReservas(asistente1);
                    break;
                case 3:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija de nuevo.");
                    break;
            }

        } while (opcion != 3);
    }

    private static void mostrarMenu() {
        System.out.println("\n###      DELECTARE MULTIEVENTOS     ###\n");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Seleccionar evento");
        System.out.println("2. Informacion de las reservas.");
        System.out.println("3. Salir");
    }

    private static void seleccionarEventoYReservar(Scanner scanner, Asistente asistente, Sala sala, Evento evento) {
        // Lógica para seleccionar un evento y hacer una reserva
        System.out.println("Eventos disponibles:");
        System.out.println("1. " + evento.getNombre());

        System.out.print("Seleccione un evento (Ingrese el número del evento): ");
        int opcionEvento = scanner.nextInt();

        // Aquí podrías implementar la lógica de reserva basada en la opción seleccionada
        // y mostrar información adicional sobre la reserva.
        System.out.println("Reserva realizada para el evento: " + evento.getNombre());
    }

    private static void mostrarInformacionReservas(Asistente asistente) {
        // Lógica para mostrar información de las reservas del asistente
        System.out.println("Información de las reservas para " + asistente.getNombre() + ":");
        // Aquí podrías mostrar la información detallada de las reservas del asistente.
    }
}

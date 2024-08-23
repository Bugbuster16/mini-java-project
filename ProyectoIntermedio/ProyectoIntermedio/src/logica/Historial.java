package logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Historial {
    private ArrayList<Partida> historial;
    private Scanner scanner = new Scanner(System.in);

    public void agregarPartida(Partida partida) {
        historial.add(partida);
    }

    public void mostrarHistorialResumido() {
        if (historial.isEmpty()) {
            System.out.println("No hay partidas registradas.");
        } else {
            System.out.println("Historial de Partidas:");
            for (int i = 0; i < historial.size(); i++) {
                System.out.println((i + 1) + ". " + historial.get(i).getResumen());
            }
        }
    }

    public void mostrarDetallePartida() {
        System.out.println("¿Qué partida desea ver en detalle?");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= historial.size()) {
            historial.get(opcion - 1).mostrarDetalle();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void eliminarPartida() {
        System.out.println("¿Qué partida desea eliminar?");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= historial.size()) {
            historial.remove(opcion - 1);
            System.out.println("Partida eliminada del historial.");
        } else {
            System.out.println("Opción inválida.");
        }
    }
}

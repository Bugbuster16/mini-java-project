package logica

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Historial {
  private Date fecha;
    private String tipoPartida;
    private String resultado;
    private ArrayList<String> eventos;
    private Scanner scanner = new Scanner(System.in);

    public String getResumen() {
        return fecha + " - " + tipoPartida + " - " + resultado;
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

    public void mostrarDetalle() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de Partida: " + tipoPartida);
        System.out.println("Resultado: " + resultado);
        System.out.println("Eventos:");
        for (String evento : eventos) {
            System.out.println(evento);
        }
    }

public void eliminarPartida() {
        System.out.println("¿Qué partida desea eliminar?");
 int opcion = scanner.nextInt();
  historial.remove(opcion - 1);
        System.out.println("Partida eliminada del historial.");
}

}

package logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Historial {
    private ArrayList<Combate> historial;
    private Scanner scanner = new Scanner(System.in);

    public Historial() {
        this.historial = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public Historial(ArrayList<Combate> historial, Scanner scanner) {
        this.historial = historial;
        this.scanner = scanner;
    }
	public void agregarPartida(Combate combate) {
        historial.add(combate);
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
        System.out.println("¿Qué partida desa elimienar?");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= historial.size()) {
            historial.remove(opcion - 1);
            System.out.println("Partida eliminada del historial.");
        } else {
            System.out.println("Opción inválida.");
        }
    }
    public void mostrarHistorialResumido() {
        if (historial.isEmpty()) {
            System.out.println("No hay partidas registradas.");
          
        } else {
            System.out.println("Historial de Partidas:");
            for (int i = 0; i < historial.size(); i++) {
                System.out.println((i + 1) + ". " + historial.get(i).getResumen());
                System.out.println("|==========================|");
				System.out.println("|    1.  Ver a detalle     |");
				System.out.println("|    2. Eliminar partida   |");
				System.out.println("|    3. Salir              |");
				System.out.println("|==========================|");
		  int opcc = scanner.nextInt();
		  		  switch (opcc) {
   			 case 1:
       			 mostrarDetallePartida();
        			break;
  			  case 2:
       			 eliminarPartida();
      			  break;
 			   case 3:
   			     System.out.println("Volviendo al menú...");		  
	                break;
   			 default:
       			 System.out.println("Opción no válida");
      			  break;
		     }
            }
        }
    }

}

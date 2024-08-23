package presentacion;

import logica.*;
import java.util.Scanner;

public class MenuPrincipal {
	Scanner entrada = new Scanner (System.in);
	private boolean continuar=true;
	public void mostrarMenu() {
		while (continuar) {
		System.out.println("|==========================|");
		System.out.println("|=>      Bienvenido      <=|");
		System.out.println("|==========================|");
		System.out.println("|    1. Crear Personaje    |");
		System.out.println("|     2. Jugar Partida     |");
		System.out.println("| 3. Historial de Partidas |");
		System.out.println("|         4. Salir          |");
		System.out.println("|==========================|");
		int op = entrada.nextInt();

		  switch (op) {
            case 1:
                //pendiente
                break;
            case 2:
                //pendiente
                break;
            case 3:
            	Historial historial = new Historial();
                historial.mostrarHistorialResumido();
						System.out.println("|==========================|");
						System.out.println("|    1.  Ver a detalle     |");
						System.out.println("|    2. Eliminar partida   |");
						System.out.println("|    3. Salir              |");
						System.out.println("|==========================|");
				  int opcc = entrada.nextInt();
				  		  switch (opcc) {
           			 case 1:
               			 historial.mostrarDetallePartida();
                			break;
          			  case 2:
               			 historial.eliminarPartida();
              			  break;
         			   case 3:
           			     System.out.println("Volviendo al menú...");		  
			                break;
           			 default:
               			 System.out.println("Opción no válida");
              			  break;
   			     }
                break;
	  case 4:
                     System.out.println("¡Gracias por jugar!");
				  continuar = !continuar;
				  break;
            default:
                System.out.println("Opción no válida");
                break;
        }
	}
}
}

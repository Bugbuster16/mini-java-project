package presentacion;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner entrada = new Scanner (System.in);
	
	public void mostrarMenu() {
		System.out.println("|==========================|");
		System.out.println("|=>      Bienvenido      <=|");
		System.out.println("|==========================|");
		System.out.println("|    1. Crear Personaje    |");
		System.out.println("|     2. Jugar Partida     |");
		System.out.println("| 3. Historial de Partidas |");
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
                mostrarHistorialResumido();
						System.out.println("|==========================|");
						System.out.println("|    1.  Ver a detalle     |");
						System.out.println("|    2. Eliminar partida   |");
						System.out.println("|    3. Salir              |");
						System.out.println("|==========================|");
				  int opcc = entrada.nextInt();
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
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
	}
}

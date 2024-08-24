package presentacion;

import logica.*;
import java.util.Scanner;

public class MenuPrincipal {
	Historial historial = new Historial();
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
		System.out.println("|         4. Salir         |");
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
                historial.mostrarHistorialResumido();		
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

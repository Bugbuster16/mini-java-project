package presentacion;

import java.util.Scanner;

public class Ejecutor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
		int opcion;
		
		do {
			System.out.println("------------------------------");
			System.out.println("1. Jugar partida");
			System.out.println("2. Ver historial");
			System.out.println("0. Salir");
			System.out.println("------------------------------");
			opcion = Integer.parseInt(scanner.nextLine());

			
			switch (opcion) {
				case 1:
					MenuPartida menuPartida = new MenuPartida();
					menuPartida.mostrarMenu();
					break;
                case 2:
					MenuHistorial menuHistorial = new MenuHistorial();
					menuHistorial.mostrarMenu();
                    break;
				case 0:
					System.out.println("------------------------------");
					System.out.println("Saliendo...");
					System.out.println("------------------------------");
					break;
				default:
					System.out.println("------------------------------");
					System.out.println("Opción no válida.");
					System.out.println("------------------------------");
			}
		}while (opcion != 0);
		}finally{
			scanner.close();
		}
	}

}

package presentacion;

public class MenuPartida extends Menu{

	@Override
	public void mostrarMenu() {
		int opcion;
		do {
			System.out.println("--------------------");
			System.out.println("1. Jugar partida PvP");
			System.out.println("2. Jugar partida PvE");
			System.out.println("0. Salir");
			System.out.println("--------------------");
			opcion = Integer.parseInt(leerEntrada("Ingrese una opcion: "));
			
			switch (opcion) {
			case 1:
				System.out.println("Jugando partida pvp...");
				break;
			case 2:
				System.out.println("Jugando partida pve...");
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		}while (opcion != 0);
	}

}

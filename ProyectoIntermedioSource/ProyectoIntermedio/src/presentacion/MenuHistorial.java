package presentacion;

public class MenuHistorial extends Menu{
	@Override
	public void mostrarMenu() {
		int opcion;
		do {
			System.out.println("--------------------");
			System.out.println("1. Ver historial");
			System.out.println("2. Ver más");
			System.out.println("0. Salir");
			System.out.println("--------------------");
			opcion = Integer.parseInt(leerEntrada("Ingrese una opcion: "));
			
			switch (opcion) {
			case 1:
				System.out.println("Viendo historial...");
				break;
			case 2:
				System.out.println("Viendo más...");
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

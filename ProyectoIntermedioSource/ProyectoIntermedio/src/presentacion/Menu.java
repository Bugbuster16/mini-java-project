package presentacion;

import java.util.Scanner;

public abstract class Menu {
	protected Scanner scanner;
	
	public Menu() {
		scanner = new Scanner(System.in);
	}
	
	protected String leerEntrada(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextLine();
	}
	
	public abstract void mostrarMenu();

}

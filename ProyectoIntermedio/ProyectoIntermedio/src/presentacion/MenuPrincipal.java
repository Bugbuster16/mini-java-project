package presentacion;

import java.util.Scanner;

public class MenuPrincipal extends Menu {
	Scanner entrada = new Scanner (System.in);
	
	@Override
	void mostrarMenu() {
		System.out.println("|==========================|");
		System.out.println("|=>      Bienvenido      <=|");
		System.out.println("|==========================|");
		System.out.println("|    1. Crear Personaje    |");
		System.out.println("|     2. Jugar Partida     |");
		System.out.println("| 3. Historial de Partidas |");
		System.out.println("|==========================|");
		int op = entrada.nextInt();
		
	}
}

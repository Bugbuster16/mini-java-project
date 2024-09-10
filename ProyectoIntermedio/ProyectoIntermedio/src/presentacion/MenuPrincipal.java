package presentacion;

import logica.CombatePvP;
import logica.CombatePvE;
import logica.Historial;
import logica.Combate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
	Scanner entrada = new Scanner (System.in);
	private boolean continuar=true;
	private ArrayList<Combate> historial = new ArrayList<>();
	
	public void mostrarMenu() {
		while (continuar) {
		System.out.println("|==========================|");
		System.out.println("|=>      Bienvenido      <=|");
		System.out.println("|==========================|");
		System.out.println("|    1. Jugar partida PvP    |");
		System.out.println("|    2. Jugar partida PvE    |");
		System.out.println("|  3. Historial de Partidas  |");
		System.out.println("|          4. Salir          |");
		System.out.println("|============================|");
		int op = entrada.nextInt();

		  switch (op) {
            		case 1:
                		CombatePVP pvp = new CombatePvP;
				pvp.inicarCombate();
				historial.add(pvp);
                		break;
         		case 2:
               			CombatePvE pve = new CombatePvE;
				pve.inicarCombate();
				historial.add(pve);
             			break;
          		case 3:
            			Historial historia = new Historial(historial, entrada);
				historia.mostrarHistorialResumido();
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

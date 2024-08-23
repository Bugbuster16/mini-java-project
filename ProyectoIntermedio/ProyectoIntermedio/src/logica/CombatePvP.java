package logica;

import java.util.Date;
import java.util.ArrayList;

public class CombatePvP extends Combate {
	
	public CombatePvP() {
		super();
	}

	public CombatePvP(Date fecha, String tipoPartida, String resultado, ArrayList<String> eventos, Personaje jugador1, Personaje jugador2) {
		super(fecha, tipoPartida, resultado, eventos, jugador1, jugador2);
	}

	public void iniciarCombate() {
		
	}
}

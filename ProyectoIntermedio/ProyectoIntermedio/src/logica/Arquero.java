package logica;

import java.util.Random;

public class Arquero extends Personaje {
	double evasion;
	Random random = new Random();

	public Arquero() {
		super();
		evasion = -1;
	}

	public Arquero(String nombre, double vitalidad, double ataque, double evasion) {
		super(nombre, vitalidad, ataque);
		this.evasion = evasion;
		vidaActual = this.vitalidad*4;
		bloquear = false;
	}
	
	boolean recibirAtaque(double Daño) {
		double probabilidadEsquivar = random.nextDouble(101.0);
		if (probabilidadEsquivar <= evasion*0.2) {
			return false;
		} else {
			vidaActual = vidaActual - Daño;
			return true;
		}
	}

	public double getEvasion() {
		return evasion;
	}

	public void setEvasion(double evasion) {
		this.evasion = evasion;
	}
}

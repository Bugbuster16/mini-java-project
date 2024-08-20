package logica;

import java.util.Random;

public class Asesino extends Personaje{
	double ataqueCritico;
	double probabilidadCritico;
	Random random = new Random();
	
	public Asesino() {
		super();
		ataqueCritico = -1;
		probabilidadCritico = -1;
	}
	
	public Asesino(String nombre, double vitalidad, double ataque, double probabilidadCritico, double ataqueCritico) {
		super(nombre, vitalidad, ataque);
		this.ataqueCritico = ataqueCritico;
		this.probabilidadCritico = probabilidadCritico;
		vidaActual = this.vitalidad*4;
		bloquear = false;
	}
	
	double atacar(Personaje oponente) {
		double randomCritico = random.nextDouble(101.0);
		if (randomCritico <= probabilidadCritico*0.4) {
			oponente.recibirAtaque(ataque*ataqueCritico*0.02);
		} else {
			oponente.recibirAtaque(ataque);
		}
		return oponente.vidaActual;
	}
}

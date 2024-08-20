package logica;

public class Paladin extends Personaje {
	double resistencia;

	public Paladin() {
		super();
		resistencia = -1;
	}

	public Paladin(String nombre, int vitalidad, int ataque, int resistencia) {
		super(nombre, vitalidad, ataque);
		this.resistencia = resistencia;
		vidaActual = this.vitalidad*4;
		bloquear = false;
	}
	
	
	boolean recibirAtaque(double Daño) {
		Daño = Daño - resistencia*0.2;
		vidaActual = vidaActual - Daño;
		return true;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}
}

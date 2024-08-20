package logica;

public class Curandero extends Personaje {
	double curacion;
	
	public Curandero() {
		super();
		curacion = -1;
	}

	public Curandero(String nombre, double vitalidad, double ataque, double vidaActual, double curacion) {
		super(nombre, vitalidad, ataque);
		this.curacion = curacion;
		vidaActual = this.vitalidad*4;
		bloquear = false;
	}
	
	void curar() {
		vidaActual = vidaActual + curacion*1;
	}
}

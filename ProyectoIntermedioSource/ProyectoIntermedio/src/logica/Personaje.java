package logica;

public abstract class Personaje {
	String nombre;
	double vitalidad;
	double ataque;
	double vidaActual;
	boolean bloquear;
	
	Personaje() {
		nombre = "defecto";
		vitalidad = -1;
		ataque = -1;
		vidaActual = -1;
		bloquear = false;
	}

	
	Personaje(String nombre, double vitalidad, double ataque) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		vidaActual = this.vitalidad*4;
		bloquear = false;
	}
	
	boolean recibirAtaque(double Daño) {
		vidaActual = vidaActual - Daño;
		return true;
	}
	
	double atacar(Personaje oponente) {
		oponente.recibirAtaque(ataque);
		return oponente.vidaActual;
	}
	
	void bloquear() {
		bloquear = true;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getVitalidad() {
		return vitalidad;
	}


	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}


	public double getAtaque() {
		return ataque;
	}


	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}


	public double getVidaActual() {
		return vidaActual;
	}


	public void setVidaActual(double vidaActual) {
		this.vidaActual = vidaActual;
	}
}

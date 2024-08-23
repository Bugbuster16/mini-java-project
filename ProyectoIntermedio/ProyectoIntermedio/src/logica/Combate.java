package logica;
import java.util.Date;
import java.util.ArrayList;

public abstract class Combate {
	private Personaje jugador1;
	private Personaje jugador2;
	private Date fecha;
    private String tipoPartida;
    private String resultado;
    private ArrayList<String> eventos;
    
    Combate() {
    	jugador1 = null;
    	jugador2 = null;
    	fecha = null;
    	tipoPartida = "Defecto";
    	resultado = "Defecto";
    	eventos = null;
    }

    Combate(Date fecha, String tipoPartida, String resultado, ArrayList<String> eventos, Personaje jugador1, Personaje jugador2) {
    	this.jugador1 = jugador1;
    	this.jugador2 = jugador2;
    	this.fecha = fecha;
        this.tipoPartida = tipoPartida;
        this.resultado = resultado;
        this.eventos = new ArrayList<>(eventos);
    }

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public ArrayList<String> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<String> eventos) {
		this.eventos = eventos;
	}

	public Personaje getJugador1() {
		return jugador1;
	}

	public void setJugador1(Personaje jugador1) {
		this.jugador1 = jugador1;
	}

	public Personaje getJugador2() {
		return jugador2;
	}

	public void setJugador2(Personaje jugador2) {
		this.jugador2 = jugador2;
	}
}

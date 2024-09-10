package logica;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.SimpleDateFormat;

public abstract class Combate {
	private Personaje jugador1;
	private Personaje jugador2;
	private Date fecha;
   	private String tipoPartida;
    	private String ganador;
    	private ArrayList<String> eventos;
    
    Combate() {
    	jugador1 = null;
    	jugador2 = null;
    	fecha = null;
    	tipoPartida = "Defecto";
    	ganador = "Empate";
    	eventos = new ArrayList<String>();
    }

    Combate(String tipoPartida) {
        this.tipoPartida = tipoPartida;
        this.eventos = new ArrayList<String>(eventos);
    }
	public String asignarNombrePersonaje(Scanner entrada){
		System.out.println("|==> Asignar nombre de personaje <==|");
		getEventos().add("|==> Asignar nombre de personaje <==|");
		String nombrePersonaje = entrada.next();
		return nombrePersonaje;
	}
	
	public double asignarPuntosPersonaje(String atributoNombre, Scanner entrada){
		System.out.println("|=> Asignar pintos libres a " + atributoNombre + " <=|");
		getEventos().add(String.valueOf(pla));
		System.out.println("| " + pla + " puntos libres han sido asignados a " + atributoNombre + " |");
		return pla;
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
	
    public String getResumen() {
        return fecha + " - " + tipoPartida + " - " + resultado;
    }

    public void mostrarDetalle() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de Partida: " + tipoPartida);
        System.out.println("Resultado: " + resultado);
        System.out.println("Eventos:");
        for (String evento : eventos) {
            System.out.println(evento);
        }
    }

}

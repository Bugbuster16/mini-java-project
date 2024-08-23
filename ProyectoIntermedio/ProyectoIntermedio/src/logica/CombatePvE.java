package logica;

import java.util.Random;
import java.util.Date;
import java.util.ArrayList;

public class CombatePvE extends Combate {
	Random random = new Random();
	
	public CombatePvE() {
		super();
	}
	
	public CombatePvE(Date fecha, String tipoPartida, String resultado, ArrayList<String> eventos, Personaje jugador1, Personaje jugador2) {
		super(fecha, tipoPartida, resultado, eventos, jugador1, jugador2);
	}
	
	public Personaje crearPersonajeBot(double puntosTotales) {
		double puntosLibres = puntosTotales; // Inicializacion y definicion de variables y atributos genericos de Personaje
		double vitalidadBot, ataqueBot, randomAtributoPorcentaje;
		
        switch(random.nextInt(4)+1) {
        case 1: // Construccion arquero
        	double evasionBot; // Inicializacion y definicion de variables y atributos especificos de Arquero
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Asigna porcentaje de double puntosLibres al atributo double vitalidadBot
        	vitalidadBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - vitalidadBot; // Re-define double puntosLibres en base al resultado de lineas 25 y 26
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Repite proceso previo para atributo double ataqueBot
        	ataqueBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - ataqueBot;
        	
        	evasionBot = puntosLibres; // Asigna los puntos libres restantes al ultimo atributo
        	puntosLibres = puntosLibres - evasionBot;
        	
        	if (puntosLibres != 0.0) { // Checkea si hay exceso o falta de puntos alocados a atributos, en caso de haber los asigna al ultimo atributo
        		evasionBot = evasionBot + puntosLibres;
        		puntosLibres = 0;
        	}
        	
        	Personaje botArquero = new Arquero("Bot Arquero", vitalidadBot, ataqueBot, evasionBot);
        	return botArquero;
        	
        case 2: // Construccion asesino
        	double ataqueCriticoBot, probabilidadCriticoBot; // Inicializacion y definicion de variables y atributos especificos de Asesino
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Asigna porcentaje de double puntosLibres al atributo double vitalidadBot
        	vitalidadBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - vitalidadBot; // Re-define double puntosLibres en base al resultado previo
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Repite proceso previo para atributo double ataqueBot
        	ataqueBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - ataqueBot;
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Repite proceso previo para atributo double ataqueCriticoBot
        	ataqueCriticoBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - ataqueCriticoBot;
        	
        	probabilidadCriticoBot = puntosLibres; // Asigna los puntos libres restantes al ultimo atributo
        	puntosLibres = puntosLibres - probabilidadCriticoBot;
        	
        	if (puntosLibres != 0.0) { // Checkea si hay exceso o falta de puntos alocados a atributos, en caso de haber los asigna al ultimo atributo
        		probabilidadCriticoBot = probabilidadCriticoBot + puntosLibres;
        		puntosLibres = 0;
        	}
        	
        	Personaje botAsesino = new Asesino("Bot Asesino", vitalidadBot, ataqueBot, probabilidadCriticoBot, ataqueCriticoBot);
        	return botAsesino;
            
        case 3: // Construccion paladin
        	double resistenciaBot; // Inicializacion y definicion de variables y atributos especificos de Paladin
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Asigna porcentaje de double puntosLibres al atributo double vitalidadBot
        	vitalidadBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - vitalidadBot; // Re-define double puntosLibres en base al resultado de lineas 25 y 26
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Repite proceso previo para atributo double ataqueBot
        	ataqueBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - ataqueBot;
        	
        	resistenciaBot = puntosLibres; // Asigna los puntos libres restantes al ultimo atributo
        	puntosLibres = puntosLibres - resistenciaBot;
        	
        	if (puntosLibres != 0.0) { // Checkea si hay exceso o falta de puntos alocados a atributos, en caso de haber los asigna al ultimo atributo
        		resistenciaBot = resistenciaBot + puntosLibres;
        		puntosLibres = 0;
        	}
        	
        	Personaje botPaladin = new Arquero("Bot Paladin", vitalidadBot, ataqueBot, resistenciaBot);
        	return botPaladin;
            
        case 4: // Construccion curandero
        	double curacionBot; // Inicializacion y definicion de variables y atributos especificos de Paladin
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Asigna porcentaje de double puntosLibres al atributo double vitalidadBot
        	vitalidadBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - vitalidadBot; // Re-define double puntosLibres en base al resultado de lineas 25 y 26
        	
        	randomAtributoPorcentaje = random.nextDouble(99.0)+1.0; // Repite proceso previo para atributo double ataqueBot
        	ataqueBot = puntosLibres*(randomAtributoPorcentaje/100);
        	puntosLibres = puntosLibres - ataqueBot;
        	
        	curacionBot = puntosLibres; // Asigna los puntos libres restantes al ultimo atributo
        	puntosLibres = puntosLibres - curacionBot;
        	
        	if (puntosLibres != 0.0) { // Checkea si hay exceso o falta de puntos alocados a atributos, en caso de haber los asigna al ultimo atributo
        		curacionBot = curacionBot + puntosLibres;
        		puntosLibres = 0;
        	}
        	
        	Personaje botCurandero = new Arquero("Bot Curandero", vitalidadBot, ataqueBot, curacionBot);
        	return botCurandero;
            
        default: // Error
            return null;
        }
    }
	
	public int chanceMoneda() {
		int caraMoneda = random.nextInt(2)+1;
		return caraMoneda;
	}
	
	public Personaje iniciarCombate() {
		while (getJugador1().vidaActual > 0.0 || getJugador2().vidaActual > 0.0) {
			
			
		}
		
		// Definir ganador despues de que un jugador llega a 0 vidaActual
		if (getJugador1().vidaActual > 0.0) {
			return getJugador1();
		} else if (getJugador2().vidaActual > 0.0) {
			return getJugador2();
		}
		return null;
	}
}

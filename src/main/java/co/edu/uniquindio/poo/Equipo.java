package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public record Equipo(String nombreEquipo, Persona representante, Collection<Jugador> jugadores){

    public Equipo (String nombreEquipo, Persona representante){
        this(nombreEquipo, representante, new LinkedList<>());
    }

    public void registrarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

}

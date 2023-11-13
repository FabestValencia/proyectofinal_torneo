package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

public record Equipo(String nombreEquipo, Persona representante, Collection<Jugador> jugadores){
    /*
     * Metodo para crear equipo
     */
    public Equipo (String nombreEquipo, Persona representante){
        this(nombreEquipo, representante, new LinkedList<>());
    }
    /*
     * Metodo para resgistrar jugador
     */
    public void registrarJugador(Jugador jugador){
        validarJugadorExistente(jugador);
        jugadores.add(jugador);
    }
    /*
     * Metodo para validar jugador existente
     */
    private void validarJugadorExistente(Jugador jugador) {
        boolean existeJugador = buscarJugador(jugador).isPresent();
        assert !existeJugador : "El jugador ya esta registrado";
    }
    /*
     * Metodo para buscar jugador
     */
    public Optional<Jugador> buscarJugador(Jugador jugador) {
        Predicate<Jugador> nombreIgual = (j)-> j.getNombre().equals(jugador.getNombre());
        Predicate<Jugador> apellidoIgual = (j)->j.getApellido().equals(jugador.getApellido());
        return jugadores.stream().filter(nombreIgual.and(apellidoIgual)).findAny();
    }

}

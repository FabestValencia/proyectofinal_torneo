package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;

public class Jugador extends Persona{

    private final LocalDate fechaNacimiento;
    private final GeneroJugador generoJugador;
    /*
     * Creacion del objeto jugador
     */
    public Jugador(String nombre, String apellido, String email, String numeroCelular, LocalDate fechaNacimiento, GeneroJugador generoJugador) {
        super(nombre, apellido, email, numeroCelular);
        
        assert fechaNacimiento!= null : "La fecha de nacimiento es requerida";
        assert generoJugador!= null : "El genero del jugador es requerido";

        this.fechaNacimiento = fechaNacimiento;
        this.generoJugador = generoJugador;
    }
    /*
     * Metodo para obtener fecha nacimiento 
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    /*
     * Metodo para calcular edad
     */
    public byte calcularEdad(LocalDate fecha) {
        return (byte) Period.between(fechaNacimiento, fecha).getYears();
    }
    /*
     * Metodo para obtener el genero del jugador
     */
    public GeneroJugador getGeneroJugador() {
        return generoJugador;
    }
       
}

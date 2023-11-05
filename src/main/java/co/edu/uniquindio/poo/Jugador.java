package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;

public class Jugador extends Persona{

    private final LocalDate fechaNacimiento;
    private final GeneroJugador generoJugador;

    public Jugador(String nombre, String apellido, String email, String numeroCelular, LocalDate fechaNacimiento, GeneroJugador generoJugador) {
        super(nombre, apellido, email, numeroCelular);
        
        assert generoJugador!= null;

        this.fechaNacimiento = fechaNacimiento;
        this.generoJugador = generoJugador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public byte calcularEdad(LocalDate fecha) {
        return (byte) Period.between(fechaNacimiento, fecha).getYears();
    }

    public GeneroJugador getGeneroJugador() {
        return generoJugador;
    }
       
}

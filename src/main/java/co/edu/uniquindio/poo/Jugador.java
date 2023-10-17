package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Jugador extends Persona{

    private LocalDate fechaNacimiento;
    private GeneroJugador generoJugador;
    
    public Jugador(String nombre, String apellido, String email, String numeroCelular, LocalDate fechaNacimiento,
            GeneroJugador generoJugador) {
        super(nombre, apellido, email, numeroCelular);
        this.fechaNacimiento = fechaNacimiento;
        this.generoJugador = generoJugador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public GeneroJugador getGeneroJugador() {
        return generoJugador;
    }

    public void setGeneroJugador(GeneroJugador generoJugador) {
        this.generoJugador = generoJugador;
    }
    
}

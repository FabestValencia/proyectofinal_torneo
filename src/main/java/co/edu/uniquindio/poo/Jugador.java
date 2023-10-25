package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Jugador extends Persona{

    private LocalDate fechaNacimiento;
    private GeneroJugador generoJugador;
    /*
     * Creacion del objeto jugador
     */
    public Jugador(String nombre, String apellido, String email, String numeroCelular, LocalDate fechaNacimiento,
            GeneroJugador generoJugador) {
        super(nombre, apellido, email, numeroCelular);
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
     * Metodo para cambiar fecha de nacimiento
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /*
     * Metodo para obtener genero del jugador
     */
    public GeneroJugador getGeneroJugador() {
        return generoJugador;
    }
    /*
     * Metodo para cambiar genero del jugador
     */
    public void setGeneroJugador(GeneroJugador generoJugador) {
        this.generoJugador = generoJugador;
    }
    
}

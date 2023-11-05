package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Jugador extends Persona{

    private final LocalDate fechaNacimiento;

    public Jugador(String nombre, String apellido, String email, String numeroCelular, LocalDate fechaNacimiento) {
        super(nombre, apellido, email, numeroCelular);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
       
}

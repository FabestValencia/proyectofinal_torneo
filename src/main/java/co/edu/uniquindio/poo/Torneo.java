package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Torneo {

    private String nombre;
    private byte numeroParticipantes;
    private boolean isLimiteEdad;
    private byte limiteEdad;
    private LocalDate fechaInicio;
    private Inscripcion inscripcion;
    /*
     * Creacion del objeto torneo
     */
    public Torneo(String nombre, byte numeroParticipantes, boolean isLimiteEdad, byte limiteEdad, LocalDate fechaInicio,
            Inscripcion inscripcion) {
        this.nombre = nombre;
        this.numeroParticipantes = numeroParticipantes;
        this.isLimiteEdad = isLimiteEdad;
        this.limiteEdad = limiteEdad;
        this.fechaInicio = fechaInicio;
        this.inscripcion = inscripcion;
    }
    
}

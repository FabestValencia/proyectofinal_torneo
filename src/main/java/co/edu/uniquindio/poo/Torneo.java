package co.edu.uniquindio.poo;

import java.time.LocalDate;

public record Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaInicioInscripciones,
        LocalDate fechaCierreInscripciones,
        byte numeroParticipantes,
        byte limiteEdad,
        byte valorInscripcion) {

        public Torneo{
                assert nombre != null;
                assert fechaInicio != null;
                assert fechaInicioInscripciones != null;
                assert fechaCierreInscripciones != null;
                assert numeroParticipantes >= (byte) 0;
                assert limiteEdad >= (byte)0;
                assert valorInscripcion >= (byte)0;
                assert fechaInicio.isAfter(fechaInicioInscripciones) && fechaInicio.isAfter(fechaCierreInscripciones);
                assert fechaCierreInscripciones.isAfter(fechaInicioInscripciones);
        }
}

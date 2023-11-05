package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Torneo{

        private final String nombre;
        private LocalDate fechaInicio; 
        private LocalDate fechaInicioInscripciones;
        private LocalDate fechaCierreInscripciones;
        private final byte numeroParticipantes;
        private final byte limiteEdad;
        private final byte valorInscripcion;

        

        public Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaInicioInscripciones,
                        LocalDate fechaCierreInscripciones, byte numeroParticipantes, byte limiteEdad,
                        byte valorInscripcion) {

                assert nombre != null;
                assert fechaInicio != null;
                assert fechaInicioInscripciones != null;
                assert fechaCierreInscripciones != null;
                assert numeroParticipantes >= (byte) 0;
                assert limiteEdad >= (byte)0;
                assert valorInscripcion >= (byte)0;
                assert fechaInicio.isAfter(fechaInicioInscripciones) && fechaInicio.isAfter(fechaCierreInscripciones);
                assert fechaCierreInscripciones.isAfter(fechaInicioInscripciones);
                

                this.nombre = nombre;
                this.fechaInicio = fechaInicio;
                this.fechaInicioInscripciones = fechaInicioInscripciones;
                this.fechaCierreInscripciones = fechaCierreInscripciones;
                this.numeroParticipantes = numeroParticipantes;
                this.limiteEdad = limiteEdad;
                this.valorInscripcion = valorInscripcion;
        }


        public String getNombre() {
                return nombre;
        }

        public LocalDate getFechaInicio() {
                return fechaInicio;
        }

        public LocalDate getFechaInicioInscripciones() {
                return fechaInicioInscripciones;
        }

        public LocalDate getFechaCierreInscripciones() {
                return fechaCierreInscripciones;
        }

        public byte getNumeroParticipantes() {
                return numeroParticipantes;
        }

        public byte getLimiteEdad() {
                return limiteEdad;
        }

        public byte getValorInscripcion() {
                return valorInscripcion;
        }

        public void setFechaInicio(LocalDate fechaInicio) {
                this.fechaInicio = fechaInicio;
        }

        public void setFechaInicioInscripciones(LocalDate fechaInicioInscripciones) {
                this.fechaInicioInscripciones = fechaInicioInscripciones;
        }

        public void setFechaCierreInscripciones(LocalDate fechaCierreInscripciones) {
                this.fechaCierreInscripciones = fechaCierreInscripciones;
        }
        
}

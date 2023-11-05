package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Torneo{

        private final String nombre;
        private LocalDate fechaInicio; 
        private LocalDate fechaInicioInscripciones;
        private LocalDate fechaCierreInscripciones;
        private final byte numeroParticipantes;
        private final byte limiteEdad;
        private final int valorInscripcion;

        

        public Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaInicioInscripciones,
                        LocalDate fechaCierreInscripciones, byte numeroParticipantes, byte limiteEdad,
                        int valorInscripcion) {

                assert nombre != null;

                setFechaInicio(fechaInicio);
                setFechaInicioInscripciones(fechaInicioInscripciones);

                assert fechaCierreInscripciones != null;
                assert numeroParticipantes >= (byte) 0;
                assert limiteEdad >= (byte)0;
                assert valorInscripcion >= 0;
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

        public int getValorInscripcion() {
                return valorInscripcion;
        }

        public void setFechaInicio(LocalDate fechaInicio) {
                assert fechaInicio != null;
                assert (fechaInicioInscripciones == null || fechaInicio.isAfter(fechaInicioInscripciones))&&
                (fechaCierreInscripciones == null || fechaInicio.isAfter(fechaCierreInscripciones));
                
                this.fechaInicio = fechaInicio;
        }

        public void setFechaInicioInscripciones(LocalDate fechaInicioInscripciones) {
                assert fechaInicioInscripciones != null;

                this.fechaInicioInscripciones = fechaInicioInscripciones;
        }

        public void setFechaCierreInscripciones(LocalDate fechaCierreInscripciones) {
                this.fechaCierreInscripciones = fechaCierreInscripciones;
        }
        
}

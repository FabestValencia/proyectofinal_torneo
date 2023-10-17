package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Inscripcion {
    
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;
    private double valor;
    
    public Inscripcion(LocalDate fechaInicio, LocalDate fechaCierre, double valor) {
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.valor = valor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}

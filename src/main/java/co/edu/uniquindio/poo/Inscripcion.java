package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Inscripcion {
    
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;
    private double valor;
    /*
     * Creacion del objeto inscripcion
     */
    public Inscripcion(LocalDate fechaInicio, LocalDate fechaCierre, double valor) {
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.valor = valor;
    }
    /*
     * Metodo para obtener fecha inicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    /*
     * Metodo para cambiar fecha de inicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /*
     * Metodo para obtener fecha cierre
     */
    public LocalDate getFechaCierre() {
        return fechaCierre;
    }
    /*
     * Metodo para cambiar fecha cierre
     */
    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
    /*
     * Metodo para obtener valor
     */
    public double getValor() {
        return valor;
    }
    /*
     * Metodo para cambiar valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

}

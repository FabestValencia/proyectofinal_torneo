package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Enfrentamiento {
    private String nombreLugar;
    private String direccioLugar;
    private LocalDate fecha;
    private LocalDate hora;
    private byte resultado;
    private EstadoEnfrentamiento estadoEnfrentamiento;
    
    public Enfrentamiento(String nombreLugar, String direccioLugar, LocalDate fecha, LocalDate hora, byte resultado,
            EstadoEnfrentamiento estadoEnfrentamiento) {
        this.nombreLugar = nombreLugar;
        this.direccioLugar = direccioLugar;
        this.fecha = fecha;
        this.hora = hora;
        this.resultado = resultado;
        this.estadoEnfrentamiento = estadoEnfrentamiento;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccioLugar() {
        return direccioLugar;
    }

    public void setDireccioLugar(String direccioLugar) {
        this.direccioLugar = direccioLugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public byte getResultado() {
        return resultado;
    }

    public void setResultado(byte resultado) {
        this.resultado = resultado;
    }

    public EstadoEnfrentamiento getEstadoEnfrentamiento() {
        return estadoEnfrentamiento;
    }

    public void setEstadoEnfrentamiento(EstadoEnfrentamiento estadoEnfrentamiento) {
        this.estadoEnfrentamiento = estadoEnfrentamiento;
    }  

}

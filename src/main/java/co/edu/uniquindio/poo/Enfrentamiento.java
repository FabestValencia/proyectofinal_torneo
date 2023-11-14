package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public class Enfrentamiento {

    private String nombreLugar;
    private String direccionLugar;
    private LocalDate fecha;
    private LocalDate hora;
    private final Equipo equipo1;
    private final Equipo equipo2;
    private final Collection<Juez> jueces;
    private byte resultado;
    private EstadoEnfrentamiento estadoEnfrentamiento;
    
    /*
     * Creación del metodo enfrentamiento 
     */
    
    public Enfrentamiento(String nombreLugar, String direccionLugar, LocalDate fecha, LocalDate hora, Equipo equipo1,
            Equipo equipo2, Collection<Juez> jueces, byte resultado, EstadoEnfrentamiento estadoEnfrentamiento) {
        this.nombreLugar = nombreLugar;
        this.direccionLugar = direccionLugar;
        this.fecha = fecha;
        this.hora = hora;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.jueces = jueces;
        this.resultado = resultado;
        this.estadoEnfrentamiento = estadoEnfrentamiento;
    } 
    
    /*
     * Metodo para obtener nombre del lugar
     */
    public String getNombreLugar() {
        return nombreLugar;
    }

    /*
     * Metodo Para cambiar nombre del lugar
     */
    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }
    /*
     * Metodo para obtener direccion del lugar
     */
    public String getDireccioLugar() {
        return direccionLugar;
    }
    /*
     * Metodo para cambiar direccion del lugar
     */
    public void setDireccionLugar(String direccionLugar) {
        this.direccionLugar = direccionLugar;
    }
    /*
     * Metodo para obtener fecha 
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /*
     * Metodo para cambiar fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /*
     * Metodo para obtener hora
     */
    public LocalDate getHora() {
        return hora;
    }
    /*
     * Metodo para cambiar hora
     */
    public void setHora(LocalDate hora) {
        this.hora = hora;
    }
    /*
     * Metodo para obtener resultado
     */
    public byte getResultado() {
        return resultado;
    }
    /*
     * Metodo apra cambiar resultado
     */
    public void setResultado(byte resultado) {
        this.resultado = resultado;
    }
    /*
     * Metodo para obtener el estado del enfrentamiento
     */
    public EstadoEnfrentamiento getEstadoEnfrentamiento() {
        return estadoEnfrentamiento;
    }
    /*
     * Metodo para cambiar el estado del enfrentamiento
     */
    public void setEstadoEnfrentamiento(EstadoEnfrentamiento estadoEnfrentamiento) {
        this.estadoEnfrentamiento = estadoEnfrentamiento;
    }

    public String getDireccionLugar() {
        return direccionLugar;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public Collection<Juez> getJueces() {
        return Collections.unmodifiableCollection(jueces);
    }  

    

}

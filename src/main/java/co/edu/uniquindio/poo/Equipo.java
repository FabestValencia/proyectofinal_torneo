package co.edu.uniquindio.poo;

public class Equipo {
    
    private String nombreEquipo;
    private Persona representante;
    /*
     * Creacion del objeto equipo
     */
    public Equipo(String nombreEquipo, Persona representante) {
        this.nombreEquipo = nombreEquipo;
        this.representante = representante;
    }
    /*
     * Metodo para obtener nombre equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    /*
     * Metodo para cambiar nombre equipo
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    /*
     * Metodo para obtener representante
     */
    public Persona getRepresentante() {
        return representante;
    }
    /*
     * Metodo para cambiar representante
     */
    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }
        
}

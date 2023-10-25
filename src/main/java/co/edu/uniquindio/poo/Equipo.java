package co.edu.uniquindio.poo;

public class Equipo {
    
    private String nombreEquipo;
    private Persona representante;
    
    public Equipo(String nombreEquipo, Persona representante) {
        this.nombreEquipo = nombreEquipo;
        this.representante = representante;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Persona getRepresentante() {
        return representante;
    }

    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }
        
}

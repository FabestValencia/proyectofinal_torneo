package co.edu.uniquindio.poo;

public class Juez extends Persona{

    private final String licencia;
    /*
     * Creacion del objeto Juez
     */
    public Juez(String nombre, String apellido, String email, String numeroCelular, String licencia) {
        super(nombre, apellido, email, numeroCelular);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }
        
}

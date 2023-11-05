package co.edu.uniquindio.poo;

public class Juez extends Persona{

    private final String licencia;

    public Juez(String nombre, String apellido, String email, String numeroCelular, String licencia) {
        super(nombre, apellido, email, numeroCelular);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }
        
}

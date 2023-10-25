package co.edu.uniquindio.poo;

public class Juez extends Persona{

    private String licencia;
    /*
     * Creacion del objeto juez
     */
    public Juez(String nombre, String apellido, String email, String numeroCelular, String licencia) {
        super(nombre, apellido, email, numeroCelular);
        this.licencia = licencia;
    }
    /*
     * Metodo para obtener licencia
     */
    public String getLicencia() {
        return licencia;
    }
    /*
     * Metodo cambiar licencia
     */
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
        
}

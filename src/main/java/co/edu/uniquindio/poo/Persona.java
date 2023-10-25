package co.edu.uniquindio.poo;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String numeroCelular;
    /*
     * Creacion del objeto persona
     */
    public Persona(String nombre, String apellido, String email, String numeroCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }
    /*
     * Metodo para obtener nombre
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * Metodo para cambiar nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * Metodo para obtener apellido
     */
    public String getApellido() {
        return apellido;
    }
    /*
     * Metodo para cambiar apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*
     * Metodo para obtener email
     */
    public String getEmail() {
        return email;
    }
    /*
     * Metodo para cambiar email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /*
     * Metodo para obtner numero celular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }
    /*
     * Metodo para cambiar numero de celular
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

}

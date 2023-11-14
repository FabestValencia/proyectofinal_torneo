package co.edu.uniquindio.poo;

public class Persona {
    
    private final String nombre; 
    private final String apellido;  
    private final String email; 
    private final String numeroCelular;
    /*
     * Creacion del objeto persona
     */
    public Persona(String nombre, String apellido, String email, String numeroCelular) {


        assert (nombre != null && !nombre.isBlank()):  "El nombre es requerido";
        assert (apellido != null && !apellido.isBlank()) : "El apellido es requerido";
        assert (email != null && !email.isBlank()) : "El email es requerido";
        assert (numeroCelular != null && !numeroCelular.isBlank()) : "El nombre es requerido";

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
     * Metodo para obtener apellido
     */
    public String getApellido() {
        return apellido;
    }
    /*
     * Metodo para obtener email
     */
    public String getEmail() {
        return email;
    }
    /*
     * Metodo para obtener numero de celular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

}



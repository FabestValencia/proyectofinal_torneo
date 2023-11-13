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
     * Metood para obtener apellido
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



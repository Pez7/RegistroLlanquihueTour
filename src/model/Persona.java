
package model;

/**
 * Representa a una Persona dentro de LlanquihueTour.
 * 
 * Esta clase utiliza composición, ya que una Persona tiene una Dirección.
 */
public class Persona {
    private String nombre;
    private Rut rut;
    private int telefono;
    private int edad;
    // Composición: la Persona tiene una dirección
    private Direccion direccion;

    /**
     * Construtor de la clase Persona
     * @param nombre nombre de la Persona
     * @param rut Rut de la Persona
     * @param telefono teléfono de la Persona
     * @param edad edad de la Persona
     * @param direccion Dirección de la Persona
     */
    public Persona(String nombre, Rut rut, int telefono, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    /**
     * Muestra la información completa de la Persona.
     * @return muestra los datos de la persona
     */
    @Override
    public String toString() {
        return "\n---Datos personales---" +
                "\nNombre: " + nombre +
                "\nRut: " + rut +
                "\nTeléfono: " + telefono +
                "\nEdad: " + edad + " años"+
                "\nDirección: " + direccion;
    }
    
}

package model;

/**
 *
 * @author ASUS TUF
 */
public class Empleado extends Persona {
    /**
     * Atributo propio del Empleado
     */
    private String cargo;

    /**
     * Contructor de la Clase empleado de hereda de Persona
     * @param cargo
     * @param nombre
     * @param rut
     * @param telefono
     * @param edad
     * @param direccion
     */

    public Empleado(String cargo, String nombre, Rut rut, int telefono, int edad, Direccion direccion) {
        super(nombre, rut, telefono, edad, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "\n---Colaborador---" +
                super.toString() +
                "\nCargo: " + cargo;
    }


    
}

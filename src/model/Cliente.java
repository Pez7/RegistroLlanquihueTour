/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS TUF
 */
public class Cliente extends Persona {
    private String servicio;

    public Cliente(String servicio, String nombre, Rut rut, int telefono, int edad, Direccion direccion) {
        super(nombre, rut, telefono, edad, direccion);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
       return "\n---Cliente---" +
            super.toString()+
            "\nServicio: " + servicio; 
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author ASUS TUF
 */
public class Validador {
        /**
     * Valida si un texto no está vacío.
     * 
     * @param texto texto que se desea validar
     * @return true si el texto tiene contenido, false si está vacío
     */
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
        /**
     * Valida si un numero de teléfono no está vacío.
     * 
     * @param telefono telefono que se desea validar
     * @return true si el texto tiene contenido, false si está vacío
     */
    public static boolean telefonoValido(int telefono) {
        String largo = Integer.toString(telefono);
        return largo.length() == 9;

    }
}

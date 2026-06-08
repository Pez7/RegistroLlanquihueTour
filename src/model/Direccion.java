package model;

/**
 * Representa la dirección de la Persona
 * Esta clase se utiliza como parte de la composición dentro de la clase Persona
 */
public class Direccion {
    
    // Atributos de la dirección
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

        /**
     * Constructor de la clase Direccion
     * @param calle nombre de la calle
     * @param ciudad ciudad donde vive la Persona
     * @param region region donde vive la Persona
     * @param numero numero de la dirección
     */
    public Direccion(String calle, String ciudad, String region, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
/**
 * Muestra la direccion completa de la Persona
 * @return dirección formateada como texto
 */
 
    @Override
    public String toString() {
        return calle + " #" + numero +", " + ciudad + ", region " + region;
    }
    
}

package app;

import model.Direccion;
import model.Empleado;
import model.Persona;
import model.Cliente;
import model.Rut;
import util.RutInvalidoException;
import util.Validador;
import java.util.List;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
/**
 *          Creacion de Colaborador1            
 *          Se crea un RUT válido
 */
            Rut rutEmpleado1 = new Rut("12.345.678-9");

            // Se crea la dirección de la persona
            Direccion dir1 = new Direccion("Martin henriquez","Osorno","Los Lagos",1800);

            // Se crea una Persona usando composición:
            // Persona tiene un Rut y tiene una Dirección
            Empleado emp = new Empleado("Vendedor","Eladio Beltrán",rutEmpleado1,935623569,20,dir1); 

            /**
             * Creacion de Cliente
             */
            
            /**
             * RUT válido
             */
            Rut rutCliente = new Rut("13.254.785-k");

           /**
            * Se crea la dirección del cliente
            */
            Direccion dir2 = new Direccion("Calle larga","Frutillar","Los Lagos",4475);

            /**
             * Se crea una Persona usando composición:
             * Persona tiene un Rut y tiene una Dirección
             */
            Cliente cliente = new Cliente("Trekking","Judith Nuñez",rutCliente,956625412,30,dir2); 
            
            //Creacion de Colaborador2
            
            // Se crea un RUT válido
            Rut rutColaborador2 = new Rut("15.688.654-9");

            // Se crea la dirección de la persona
            Direccion dir3 = new Direccion("Los Quesos","Puerto Montt","Los Lagos",2256);

            // Se crea una Persona usando composición:
            // Persona tiene un Rut y tiene una Dirección
            Empleado emp2 = new Empleado("Recepcionista","Berta Cifuentes",rutColaborador2,965214785,23,dir3); 
            
            /**
             * Creamos una lista de Personas(Empleado y Cliente heredan de persona)
             */
            List<Persona> personas = new ArrayList<>();
            personas.add(emp);
            personas.add(cliente);
            personas.add(emp2);

            /**
             * Validación dinámica
             */
            for (Persona p : personas) {
                if (Validador.textoValido(p.getDireccion().toString()) && Validador.telefonoValido(p.getTelefono())) {
                    System.out.println(p);
                } else {
                    System.out.println("Datos inválidos para: " + p.getNombre());
                }
                System.out.println();
            }

        } catch (RutInvalidoException e) {
            System.out.println("Error al crear el cliente:");
            System.out.println(e.getMessage());
        }
    }
    
}

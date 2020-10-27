
package cr.ac.ucenfotec.bl.logica;

import cr.ac.ucenfotec.bl.entidades.*;
import java.util.ArrayList;

public class Gestor {

    private final static ArrayList<Empleado> empleados = new ArrayList<>();

    private final static ArrayList<Computadora> computadoras = new ArrayList<>();

    public static void registrarEmpleado(String nombre, String cedula) {
        if (getEmpleados().contains(new Empleado(nombre, cedula))) {

            System.out.println("\nRegistro fallido. El empleado ya existe!");
        } else {
            getEmpleados().add(new Empleado(nombre, cedula));
            System.out.println("\n" + nombre + " ha sido registrado con éxito");
        }
    }

    
    
    
    
    
    public static void registrarComputadora(String marca, String serie) {
        Computadora PC = new Computadora();
        if (getComputadoras().contains(new Computadora(marca, serie))) {

            System.out.println("\nRegistro fallido. El dispositivo ya existe!");
        
        } else {
            PC.setMarca(marca);
            PC.setSerie(serie);
            computadoras.add(PC);
            System.out.println("\nDispositivo Serie " + marca + " ha sido registrado con éxito");
            
        }
        
        System.out.println(PC.toString());
       
    }
    
    
    
     public static void registrarComputadora(String marca, String serie, Empleado empleado) {
        Computadora PC = new Computadora();
        if (getComputadoras().contains(new Computadora(marca, serie, empleado))) {

            System.out.println("\nRegistro fallido. El dispositivo ya existe!");
        
        } else {
            PC.setMarca(marca);
            PC.setSerie(serie);
            PC.setResponsable(empleado);
            computadoras.add(PC);
            System.out.println("\nDispositivo Serie " + marca + " ha sido registrado con éxito");
            
        }
        
        System.out.println(PC.toString());
       
    }
    
    
    
    
    
    
    
    
    
    
    public static void listarEmpleados() {
        System.out.println("Lista de empleados:\n");
        int contador = 1;
        
        for (Empleado empleado : getEmpleados()) {
            System.out.println(contador + "-" + empleado.toString() + "\n");
            contador++;
        }
       
    }
    
    public static void asignarComputadora(Computadora computadora, Empleado empleado){
        computadora.setResponsable(empleado);
    }
    
    public static void listarComputadoras() {
        System.out.println("Lista de computadoras:\n");
        int contador = 1;
        for (Computadora computadora : computadoras) {
            System.out.println(contador + "-" + computadora.toString() + "\n");
            contador++;
        }
    }

    /**
     * @return the empleados
     */
    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @return the computadoras
     */
    public static ArrayList<Computadora> getComputadoras() {
        return computadoras;
    }

}

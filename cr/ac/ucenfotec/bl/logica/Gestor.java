/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.logica;

import cr.ac.ucenfotec.bl.entidades.Empleado;
import java.util.ArrayList;

public class Gestor {

    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void registrarEmpleado(String nombre, String cedula) {
        Empleado empleado = new Empleado(nombre, cedula);
        empleados.add(empleado);
        System.out.println("\n"+ nombre + " ha sido registrado con éxito");
    }

    public static void listarEmpleados() {
        System.out.println("Lista de empleados:\n");
        int contador = 1;
        for(Empleado empleado:empleados){
            System.out.println(contador + "-" + empleado.toString() + "\n");
            contador++;
        }
    }

}

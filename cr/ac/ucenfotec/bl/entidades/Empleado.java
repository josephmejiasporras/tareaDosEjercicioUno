/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.entidades;

public class Empleado {

    private String nombre;
    private String cedula;

    public Empleado() {

    }

    public Empleado(String nombreE, String cedulaE) {
        this.nombre = nombreE;
        this.cedula = cedulaE;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ". Cedula:" + this.cedula + ".";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.entidades;

import java.util.Objects;


public class Computadora {
    
    private String marca;
    private String serie;
    private Empleado responsable;
    
    public Computadora(){
        
    }
    public Computadora(String marcaC, String serieC, Empleado empleadoC){
        this.marca= marcaC;
        this.serie = serieC;
        this.responsable = empleadoC;
    }

    public Computadora(String marca, String serie) {
        this.serie=serie;
        this.marca=marca;
                }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the responsable
     */
    public Empleado getResponsable() {
        return responsable;
    }
    
    

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }
    
    @Override
    public String toString(){
        return "Marca: " + marca +". Serie: " +serie + responsable;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Objects.hashCode(this.serie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Computadora other = (Computadora) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        return true;
    }

    
}

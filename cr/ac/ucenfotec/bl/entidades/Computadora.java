/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.entidades;


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

}

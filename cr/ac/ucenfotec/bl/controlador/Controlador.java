/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.controlador;

import cr.ac.ucenfotec.bl.iu.IU;
import cr.ac.ucenfotec.bl.logica.Gestor;

public class Controlador {

    public void ejecutar() {

        boolean ward = true;
        while (ward) {
            switch (IU.showMenu(ward)) {

                case 1:
                    IU.print("Ingrese el nombre del Empleado");
                    String inputNombre = IU.readString();
                    IU.print("Ingrese la identificación del Empleado");
                    String inputCedula = IU.readString();
                    Gestor.registrarEmpleado(inputNombre, inputCedula);
                    break;
                case 2:
                    Gestor.listarEmpleados();
                    break;
                case 3:
                    System.out.println("\nHasta pronto!");
                    System.exit(0);
                    break;
                case 4:
                    IU.print("Esa no es una opción válida\n");
                    break;
                default:
                    IU.print("Esa no es una opción válida\n");
                    break;
            }
        }
    }

}

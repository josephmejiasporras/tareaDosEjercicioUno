
package cr.ac.ucenfotec.bl.controlador;

import cr.ac.ucenfotec.bl.entidades.*;
import cr.ac.ucenfotec.bl.iu.IU;
import cr.ac.ucenfotec.bl.logica.Gestor;
import java.util.ArrayList;

public class Controlador {

    public void ejecutar() {

        boolean ward = true;
        while (ward) {
            switch (IU.showMenu()) {

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

                    IU.print("Ingrese la marca del dispositivo");
                    String inputMarca = IU.readString();
                    IU.print("Ingrese el número de serie del dispositivo");
                    String inputSerie = IU.readString();

                    if (!Gestor.getEmpleados().isEmpty()) {

                        
                        
                        IU.print("\nSi desea asociar un usuario a la computadora digite 1\n"
                                + "De lo contrario digite cualquier otra cosa.");
                        
                        if (IU.readInt() == 1) {
                            Gestor.listarEmpleados();
                            IU.print("\nDigite el numero del empleado:");
                            ArrayList<Empleado> lista = Gestor.getEmpleados();
                            int opcion = IU.readInt();
                            if (opcion > lista.size() || opcion <= 0) {
                                IU.print("Esa no es una opción válida.");
                            } else {
                                int choice = opcion -1;
                                Gestor.registrarComputadora(inputMarca, inputSerie, lista.get(choice));
                            }
                        }
                        
                    } else{
                            Gestor.registrarComputadora(inputMarca, inputSerie);
                        }
                    break;

                case 4:
                    Gestor.listarComputadoras();
                    break;
                
                case 5:
                    System.out.println("\nHasta pronto!");
                    System.exit(0);
                    break;
                case 6:
                    IU.print("Esa no es una opción válida\n");
                    break;
                default:
                    IU.print("Esa no es una opción válida\n");
                    break;
            }
        }
    }

}

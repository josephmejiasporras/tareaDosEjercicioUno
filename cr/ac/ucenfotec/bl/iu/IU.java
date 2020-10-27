

package cr.ac.ucenfotec.bl.iu;

import java.util.Scanner;


public class IU {
    
    private static final Scanner input = new Scanner(System.in);
    
    /**
     *
     * @param check
     * @return
     */
    public static int showMenu(boolean check) {
        if(check){
            System.out.println("\n***Menu***\nEliga 1 para registrar un empleado\n"
                    + "Eliga 2 para listar los empleados\n"
                    + "Eliga 3 para registrar una computadora\n"
                    + "Eliga 4 para listar las computadoras\n"
                    + "Eliga 5 para salir\n");
            try{
                return Integer.parseInt(readString());
            }catch(NumberFormatException ex){
                return 5;
            }
        }else{
            return 6;
        }
    }
    
    public static void print (String toPrint){
        System.out.println(toPrint);
    }
    
    public static void consume(){
        input.nextLine();
    }
    
    public static String readString(){
        return input.nextLine();
    }
    public static int readInt(){
        try{
            return Integer.parseInt(readString());
        } catch (NumberFormatException ex){
            return -1;
        }
    }
    
    public void imprimir(String toPrint){
        System.out.println(toPrint);
    }
}

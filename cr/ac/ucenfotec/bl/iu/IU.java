

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
            System.out.println("\n***Menu***\nEliga 1 para registrar un empleado\nEliga 2 para listar los empleados\nEliga 3 para salir\n");
            try{
                return Integer.parseInt(readString());
            }catch(NumberFormatException ex){
                return 4;
            }
        }else{
            System.out.println("Esa no es una opción válida/n");
            System.out.println("Menu\nEliga 1 para registrar un empleado\nEliga 2 para listar los empleados\nEliga 3 para salir");
           return readInt(); 
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
        return input.nextInt();
    }
    
    public void imprimir(String toPrint){
        System.out.println(toPrint);
    }
}

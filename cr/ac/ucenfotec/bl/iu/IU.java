

package cr.ac.ucenfotec.bl.iu;

import java.util.Scanner;


public class IU {
    
    private static final Scanner input = new Scanner(System.in);
    
    public static void print (String toPrint){
        System.out.println(toPrint);
    }
    
    public static String readString(){
        return input.nextLine();
    }
    public static int readInt(){
        return input.nextInt();
    }
}

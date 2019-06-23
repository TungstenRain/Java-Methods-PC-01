package ch05pc01;
import java.util.Scanner;
/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose
 */
public class Ch05pc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String name;
        int charPosition;
        char character;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request info
        System.out.print("Please provide a name: ");
        name = keyboard.nextLine();
        System.out.print("Please indicate a position: ");
        charPosition = keyboard.nextInt();
        
        character = showChar(name, charPosition);
        
        System.out.println("The character in " + name + " at position " + charPosition + " is: " + character);
    }
    
    public static char showChar (String str, int charPosition)
    {
        //variables
        char result;
        
        result = str.charAt(charPosition);
        
        return result;
    }
}



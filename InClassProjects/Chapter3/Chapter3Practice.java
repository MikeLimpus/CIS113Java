/**
 * @author  Mike Limpus
 * @version 1.0
 * @since   0.1
 * 
 */

import java.util.Scanner;

public class Chapter3Practice {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a domain: ");
        String domainName = keyboard.next();
        System.out.println("www." + domainName + ".com");
        
    }
}
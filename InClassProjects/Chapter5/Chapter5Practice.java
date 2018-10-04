/*
 * Jonathan Limpus 
 * Chapter 5 In-class Project 
 */

import java.util.Scanner;

public class Chapter5Practice {
    public static void main(String args[]) {

        String correctUserName = "admin";
        String correctPW = "password";

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String userName = input.next();

       
        
        if(userName.equals(correctUserName)) {
            //If the username exists, prompt for password
            System.out.print("Password: ");
            String password = input.next();

            if (password.equals(correctPW)) 
                System.out.println("Logged in");
            else 
                System.out.println("Incorrect Password");
        }
        else {
            System.out.println("Incorrect Username");
        }

        input.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe1;

/**
 *
 * @author Nicollette Bullet
 */
import java.util.Scanner;


public class PROGPOE1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String userName;
        int phoneNumber;
        String passWord;
        
        
        System.out.println("\n====Registration====");
        System.out.println("Enter a Username:");
        userName = scanner.nextLine();
        System.out.println("Enter a password:");
        passWord = scanner.nextLine();
        
        userName = getValidUsername(scanner);
        passWord = getValidPassword(scanner);
        phoneNumber = getValidPhonenumber(scanner);
        
        boolean registered = registerUser();
        if (!registered) {
            System.out.println("Registration failed. Exiting application.");
            return;
        }  
        
        System.out.println("\n====Login====");  
        boolean loginSuccess = false;
        
        while(!loginSuccess){
            System.out.println("Enter username:");
            String loginUsername = scanner.nextLine();
            
            System.out.println("Enter password:");
            String loginPassword = scanner.nextLine();
              
            if (loginUsername.equals(userName) && loginPassword.equals(passWord)){
                System.out.println("Welcome" + userName);
                loginSuccess = true;
            }else{
                System.out.println("Invalid credentials.Please try again");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeparttwo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoePartTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login register = new Login();
        Scanner scan = new Scanner(System.in);
        Messages msg = new Messages();
        
        System.out.println("\n===== Register =====");
        
        System.out.println("Please enter the username");
        String name = scan.nextLine();
        
       
        System.out.println("Enter password");
        String password = scan.nextLine();
        
        
        System.out.println("Enter cellphone");
        String cellphone = scan.nextLine();
        
        System.out.println(register.registerUser(name,password,cellphone));
        
        if(!register.registerStatus(name,password,cellphone)){
            return;
        }
           
        System.out.println("\n=====Login=====");       
                
        System.out.println("Please enter the username to login");
        String userName = scan.nextLine();
        
        System.out.println("Enter password to Login");
        String  passWord = scan.nextLine();
        
        System.out.println(register.LoginUser(userName, passWord));
      boolean status = register.LoginUser(userName,passWord);  
        
    if (status == true) {
    
   int option;
        
        do{
            System.out.println("\n===== Select any of the options below =====");
            System.out.println("1. Send message");
            System.out.println("2. Coming soon");
            System.out.println("3. Exit");
            
            option = scan.nextInt();
            
            switch(option){
                case 1 -> 
                    msg.sendingMessages();
                case 2 -> 
                    System.out.println("Coming soon");
                case 3 -> 
                    System.out.println("Good bye!!");
                default -> 
                    System.out.println("Invalid option!!");
            }
            
        }while(option != 3);
        }
    } 
}

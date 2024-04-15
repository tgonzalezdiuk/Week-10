/*****
 * Tamara Gonzalez 
 * Date : April 15th, 2024 
 * Program : Java
 */

 import java.util.*;

 public class AccountSetup
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a user name");
         String username = input.nextLine();

         System.out.print("Enter a password that is at least 8 charcaters");
         String password = input.nextLine();

         int passwordlength = password.length();

         while (passwordlength <= 8) 
         {
            System.out.print("Enter a password that is at least 8 charcaters");
            password = input.nextLine();
            passwordlength = password.length();

         }
         
         String passwordlowercase = password.toLowerCase();
         System.out.println("Your user name is " + username + " and your password is " + passwordlowercase);
    }
 }

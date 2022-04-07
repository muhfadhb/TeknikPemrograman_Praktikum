/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muhammad Fadhil
 */


// Screen.java
// Represents the screen of the ATM

public class Screen {
   // display a message without a carriage return
   public void displayMessage(String message) {
      System.out.print(message); 
   } 

   // display a message with a carriage return
   public void displayMessageLine(String message) {
      System.out.println(message);   
   } 

   // displays a dollar amount
   public void displayDollarAmount(double amount) {
      System.out.printf("$%,.2f", amount);   
   }
} 

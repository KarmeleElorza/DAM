/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class FiveIntegerProduct {
    public static void main(String[] args) {
      int number1 = 11;  // Declare 5 integer variables and assign a value
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int product;  // Declare an integer variable called sum to hold the sum
      
      product = number1 * number2 * number3 * number4 * number5;  // Compute sum
      producto(product);
   }
    public static void producto(int product){
        System.out.print("The product is ");  // Print a descriptive string
                                        // Cursor stays after the printed string
        System.out.println(product);  // Print the value stored in variable sum
                                // Cursor advances to the beginning of next line
    }
}

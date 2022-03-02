package _5_ExercisesonInputDecisionandLoop;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Declare variables
        final double TAX_1 = 0.1, TAX_2 = 0.2, TAX_3 = 0.3;
        
       double income, result = 0;  

      
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter the taxable income: ");  
        income = in.nextInt();         
        in.close(); 
        
        if(income > 20000 && income <= 40000)
        {
            result = (income - 20000) * TAX_1;
        }
        if(income > 40000 && income <= 60000)
        {
            result = (20000 * TAX_1)+ ((income - 40000)*TAX_2);

        }
        if(income > 60000)
        {
            result = (20000 * TAX_1)+ (20000 * TAX_2) + ((income - 60000)*TAX_3);
        }
        
       
      // Print results
      System.out.printf("The income tax payable is:%.2f\n",result);

    }
}

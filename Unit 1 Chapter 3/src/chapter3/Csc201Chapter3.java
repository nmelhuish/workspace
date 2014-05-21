package chapter3;

import java.io.Console;
import java.text.NumberFormat;
import java.util.Scanner;

/** Pseudocode vending machine*/
/** Deposit money.
 * Loop read the amount of money being deposited until 0 is pressed.
 * Sum up total money 
 * 
 * Selection of product 
 * Loop 1-4 choices 
 *	    Read the selection if 0 is pressed, stop
 * 		Check the price of the item(s)
 *		If enough money continue
 * 		If not enough money display "Not enough money"
 * 		Calculate total
 * 		Save selection 
 * End after 1-4 selections 
 * 
 * Make change 
 * Total deposited subtracted by total purchased= Change
 * Loop figure out change 
 * Print out receipt
 * Give change, if change is necessary  
 * @author NateTheGreat
 *
 */

public class Csc201Chapter3 {

	public static void main(String[] args) {
			
/** Deposit*/ 
		Scanner input=new Scanner(System.in);
		int depositAmount=1;  
		int sumDeposit=0;
		while (depositAmount >0) {
			System.out.print("Put in money:");
			depositAmount=input.nextInt();
			sumDeposit=sumDeposit+depositAmount; 
			 
			
		}
		System.out.println("Thank you for your deposit of $" + sumDeposit*.01);
		
		
		
			
			
		            
		Scanner keyboard = new Scanner(System.in);
		int[] prices = new int[] { 0, 75, 90, 75, 150, };
		int item = 1;
		    
		for (int q=0;q<4;q++)	{
			while(item>0) 	{
				System.out.print("Enter an item number: ");
				item = Integer.parseInt(keyboard.nextLine());
				sumDeposit= (sumDeposit-prices[item]);
		    									
		    	
				 if (sumDeposit <0) {
				System.out.print("You need " + NumberFormat.getCurrencyInstance().format(Math.abs(sumDeposit )) + " more for item " + item); 
					
		        return;        
				}
		        	
			}         
		}                     
		                 /** calculating change*/
		System.out.println("Debug" + sumDeposit);
		System.out. printf("quarter\tdime\tnickle\tpenny\tto make %d\n", sumDeposit);
		               
		                 int combos = 0;

		                 for (int q = 0; q <= sumDeposit / 25; q++){
		                 
		                	 int total_less_q = sumDeposit - q * 25;
		                     for (int d = 0; d <= total_less_q / 10; d++) {
		                    
		                         int total_less_q_d = total_less_q - d * 10;
		                         for (int n = 0; n <= total_less_q_d / 5; n++){
		                         
		                             int p = total_less_q_d - n * 5;
		                             System.out.printf("%d\t%d\t%d\t%d\n", q, d, n, p);
		                             combos++;
		                         }
		                     }
		                 }

		                 System.out.printf("%d combinations\n", combos);

		                 System.out.println("Thank you for buying item " + item + ", your change is " + NumberFormat.getCurrencyInstance().format((sumDeposit - prices[item - 1])) + ". Please come again!");

		                 keyboard.close();
}
	
		}
    






				

//This program has been modified in order to correct it syntactically and semantically
package pooja.ranjan.SQAT.hw2;

import java.util.Scanner;
	public class Change
	{

		public static void main(String[] args)
	  {
	   Scanner scan = new Scanner(System.in);
	   double cost, paidAmount;
	   System.out.println("Please enter the cost:");
	   cost = scan.nextDouble();

	   int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;

	   System.out.println("Please enter the paid amount:");
	   paidAmount = scan.nextDouble();
	   
	   scan.close();//The scanner needs to be closed after input is read

	   int change = (int)((paidAmount - cost)*100.0);


	   if(change > 0)
	   {
		   dollars=change/100;

		   change = change%100;

		   quarters = change/25;

		   change = change%25;

		   dimes = change/10;

		   change = change%10;

		   nickles = change/5;

		   pennies = change%5;
	

	   System.out.println("Dollars =" + dollars);
	   System.out.println("Quarters=" + quarters);
	   System.out.println("Dimes =" + dimes);
	   System.out.println("Nickles =" + nickles);
	   System.out.println("Pennies =" + pennies);
	   //These statements are a part of the valid 'if' condition and must be printed only when valid values exist
	 
	   }
	   else if(change<0)
		   //If the amount paid is less than the actual cost
	   {
		   System.out.println("The amount paid is lesser than the actual cost of the product");
	   
	   }
	   else//If exact change is rendered
	   {
		   System.out.println("There is no change to be returned");
	   }
	  }
	  

	  public static int[] changeCalc(double paid, double cost)
	  {
	//The variable 'paidAmount' does not have scope in this function
	//int change = (int)((paidAmount - cost)*100.0);
	 /*For calculating the number of quarters, dimes, pennies and nickels, typecasting the values as an integer 
		 type will produce incorrect results due to the slicing off of the decimal values */
		  double change = ((paid - cost)*100.0);
	  	 double dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
	  	   int[] changes = new int[5];
	  	   if(change==0)//if there is no change to be rendered
	  	   {
	  		  return new int[] {0,0,0,0,0}; 
	  	  
	  	   }

	  	   if (change<0)//if the paid amount is less than actual price
	  	   {
	  		  return new int[] {-1,-1,-1,-1,-1}; 
	  	   }
	  	   

	  	   if(change > 0)
	  	   {
	  		   dollars=change/100;
	  		   changes[0]=(int)dollars;

	  		   change = change%100;

	  		   quarters = change/25;
	  		   changes[1]=(int)quarters;

	  		   change = change%25;

	  		   dimes = change/10;
	  	       changes[2]=(int)dimes;

	  		   change = change%10;

	  		   nickles = change/5;

	  		   changes[3]=(int)nickles;

	  		   pennies = change%5;
	  	       changes[4]=(int)pennies;

	      }

	     return changes;

	}

}

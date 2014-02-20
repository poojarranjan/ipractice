package shashank.ashtikar.sqat.homework2;

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
   //The scanner was not initially closed, which it has been now
   scan.close();

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
// incude the print statements within the if condition

   System.out.println("Dollars =" + dollars);
   System.out.println("Quarters=" + quarters);
   System.out.println("Dimes =" + dimes);
   System.out.println("Nickles =" + nickles);
   System.out.println("Pennies =" + pennies);
 
   }
   else //add an else condition for invalid cases
   {
	   System.out.println("The amount paid is lesser than or equal to the actual cost of the product");
   
   }
  }

  public static int[] changeCalc(double paid, double cost)
  {
//change paidAmount to paid
//int change = (int)((paidAmount - cost)*100.0);
 /*For calculating the number of quarters, dimes,nickels and pennies, retaining this as an 'int' will round off the 
	 decimal places and the exact values will not be obtained */
	  double change = ((paid - cost)*100.0);
  	 double dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
  	   int[] changes = new int[5];

  	   if (change<=0) //If the amount paid is less than or equal to the actual cost
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
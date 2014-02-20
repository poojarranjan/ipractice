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
   
   //Scanner closed after reading the values.
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

  }

   System.out.println("Dollars =" + dollars);
   System.out.println("Quarters=" + quarters);
   System.out.println("Dimes =" + dimes);
   System.out.println("Nickles =" + nickles);
   System.out.println("Pennies =" + pennies);


  }

  public static int[] changeCalc(double paid, double cost)
  {

  	//paidAmount changed to paid which is already defined
	  int change = (int)((paid - cost)*100.0);
  	 int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
  	   int[] changes = new int[5];


  	   if(change > 0)
  	   {
  		   dollars=change/100;
  		   changes[0]=dollars;

  		   change = change%100;

  		   quarters = change/25;
  		   changes[1]=quarters;

  		   change = change%25;

  		   dimes = change/10;
  	       changes[2]=dimes;

  		   change = change%10;

  		   nickles = change/5;

  		   changes[3]=nickles;

  		   pennies = change%5;
  	       changes[4]=pennies;

      }

     return changes;

}
}
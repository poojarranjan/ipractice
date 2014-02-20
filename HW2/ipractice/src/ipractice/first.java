package ipractice;
import java.util.*;
/*You are given an array of numbers. Find out the array index or position
where sum of numbers preceding the index is equals to sum of numbers
succeeding the index.*/

public class first extends Exception {
	
	
	public static int findMidIndex(int a[]){
		int n= a.length;
		int sumbeg=0;
		int sumend=0;
		

		for(int i=0;i<n;i++)
		{
			sumbeg=0;sumend=0;
			for (int j=0;j<=i;j++)
			{
				sumbeg+=a[j];
			}
			
			for(int p=i+1;p<n;p++)
			{
				sumend+=a[p];
			}
		
			if (sumbeg==sumend)
			{
				return i+1;
			}
			
		}
            return 0;    
	
                
	 
	}
	
	public static void main (String args[])
	{
		int[] num = { 2, 4, 4, 5,4,1 };
System.out.println(findMidIndex(num));

	}

	
    
}
	

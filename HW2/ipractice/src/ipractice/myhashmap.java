package ipractice;

import java.util.*;

public class myhashmap {
	
	public static void dup(int[] arr)
	
	{
		
	HashMap< Integer,Integer> set = new HashMap<Integer,Integer>();
	
 for (int i = 0; i < arr.length; i++) {
     
    	if (set.containsKey(arr[i])){
    		int count = set.get(arr[i]);
    		count++;
    	
    		set.put(arr[i], count);
    		
    	}
    	else{
        set.put(arr[i],1);
        
        }
    }
 
 Iterator it = set.entrySet().iterator();
 while(it.hasNext())
 {
	 Map.Entry pairs = (Map.Entry)it.next();
	 
	 int temp= (int) pairs.getValue();
	 int temp2= (int) pairs.getKey();
	 if(temp>1)
	 {
		 System.out.println("Duplicate value: "+temp2);
	 }
 it.remove();
 }
	}

	
	public static void main(String args[]){
		
		int[]arr={1,2,3,4,4,4,4,5,6,7,2,3,78};
		dup(arr);

	}
}

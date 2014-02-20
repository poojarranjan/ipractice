package ipractice;

import java.util.*;

public class dupusinghash {
	
	public static void dup(int[] arr)
	
	{
		
	HashSet<Integer> set = new HashSet<Integer>();
 
   ArrayList<Integer> result = new ArrayList<Integer>();
    
	for (int i = 0; i < arr.length; i++) {
     
    	if (set.contains(arr[i])){
    		//result.add(arr[i]);
    		System.out.println(arr[i]);
    		
    	}
    	else{
        set.add(arr[i]);}
    }

	}

	
	public static void main(String args[]){
		
		int[]arr={1,2,3,4,4,4,4,5,6,7,2,3,78};
		dup(arr);

	}
}

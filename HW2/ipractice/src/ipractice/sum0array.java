package ipractice;

public class sum0array {
	
	public static void sumto0(int a[]){
		
	int sum=0;
	for(int i=0;i<a.length;i++){
		
		for(int j=i;j<a.length;j++){
			
			sum= sum+ a[j];
			
			if(sum==0){
				for(int p=i;p<j;p++){
					System.out.print(a[p]);
					
				}
				}
		
		}
		
	}
		
	}
public static void main(String args[]){
	int []arr={1,2,3,4,-7};
	
 sumto0(arr);
}
}

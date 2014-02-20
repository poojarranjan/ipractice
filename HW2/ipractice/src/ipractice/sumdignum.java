package ipractice;

public class sumdignum {
	public void sumofdig(int num){
		int sum=0;
		while(num!=0){
		int x= num%10;
		sum=sum+x;
		num=num/10;
		}
		System.out.print(sum);
	}
	
	public static void main(String args[]){
		sumdignum s= new sumdignum();
		System.out.println("The sum of the digits of the number 672 is");
		s.sumofdig(672);
	}

}

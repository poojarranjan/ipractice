package ipractice;

public class Numrev {
	int rev;
	public void reverse(int x){
		while(x!=0){
		rev=x%10;
		System.out.print(rev);
		x=x/10;
	}}
	public static void main (String args[]){
		
		Numrev n= new Numrev();
		n.reverse(47890621);
		
	}

}

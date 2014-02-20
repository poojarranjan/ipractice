package ipractice;

public class strtonum {
	
	
	public static int stringtonum(String str){
		int sum=0;
		char chr[]= str.toCharArray();
		int zascii= (int)'0';
		for (int i=0;i<=chr.length;i++){
			int tempasci= (int)i;
			sum = (sum*10)+(tempasci-zascii);
		}
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println("the string 6789 to be converted to numbers is\n  ");
		System.out.print(stringtonum("6789"));
	}

}

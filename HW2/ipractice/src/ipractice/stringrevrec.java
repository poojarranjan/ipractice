package ipractice;

public class stringrevrec {
	String rev="";
	
	 void reverse(String str){
		 if(str.length() == 1){
	           System.out.print(str);
	        } else {
		// rev= rev+str.charAt(str.(length())-1) + reverse(str.substring(0,str.(length())-10));
		 System.out.print(rev);
	        }
	 }
	
	public static void main(String args[])
	{
		stringrevrec s= new stringrevrec();
		s.reverse("pooja");
	}

}

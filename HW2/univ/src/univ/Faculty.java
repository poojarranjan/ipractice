package univ;



// Added the class name which was missing earlier
public class Faculty{
	private double monthly_salary;
	private boolean hourlyPaid;
	private double hourlyRate;
	
	//Added these variables outside the private scope of the function, making these global data
	
	private String firstName;
	private String lastName;
	private String department;
	private String researchArea;
	
public Faculty(String fName, String lName, String dep, String res, boolean hp, double ms, double hr)
{
 
//Removed the type declarations
	
 firstName= fName;
 lastName = lName;
 department = dep;
 researchArea = res;
 hourlyPaid = hp;
 monthly_salary = ms;
 hourlyRate = hr;

}
public void viewFaculty()
{

  System.out.println();
  System.out.println("First Name:" + firstName);
  System.out.println("Last Name:" + lastName);
  System.out.println("Department:" + department);
  System.out.println("Research Area:" + researchArea);
  if(hourlyPaid)
   System.out.println("Hourly Rate:" + hourlyRate);
  else
   System.out.println("Monthly Salary:" + monthly_salary);


}

}


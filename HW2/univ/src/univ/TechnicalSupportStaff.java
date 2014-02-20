package univ;

public class TechnicalSupportStaff
{

private String firstName;
private String lastName;
private String technicalArea;
private boolean hourlyPaid;
private double hourlyRate;
private double  monthly_salary;

public TechnicalSupportStaff(String fName, String lName, String ta, boolean hp, double ms, double hr)
{

      firstName= fName;
	 lastName = lName;
	 hourlyPaid = hp;
	 monthly_salary = ms;
     hourlyRate = hr;
     technicalArea = ta;

}
public void viewTechnicalSupportStaff()
{
	      System.out.println();
	      System.out.println("First Name:" + firstName);
		  System.out.println("Last Name:" + lastName);
		  System.out.println("Technical Area:" + technicalArea);
		  if(hourlyPaid)
		   System.out.println("Hourly Rate:" + hourlyRate);
		  else
	      System.out.println("Monthly Salary:" + monthly_salary);



}

}


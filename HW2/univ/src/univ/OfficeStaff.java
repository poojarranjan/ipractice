package univ;

public class OfficeStaff
{
private String firstName;
private String lastName;
private boolean hourlyPaid;
private double hourlyRate;
private double  monthly_salary;

public OfficeStaff(String fName, String lName, boolean hp, double ms, double hr)
{
	 firstName= fName;
	 lastName = lName;
	 hourlyPaid = hp;
	 monthly_salary = ms;
     hourlyRate = hr;

}
public void viewOfficeStaff(){

      System.out.println();
	  System.out.println("First Name:" + firstName);
	  System.out.println("Last Name:" + lastName);
	  if(hourlyPaid)
	   System.out.println("Hourly Rate:" + hourlyRate);
	  else
      System.out.println("Monthly Salary:" + monthly_salary);



	}

}

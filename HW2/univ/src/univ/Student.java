package univ;

public class Student
{
private String firstName;
private String lastName;
private String major;
private double gpa;
private String academicLevel;


public Student(String fName, String lName, String al, String m, double gp)
{
  firstName = fName;
  lastName = lName;
  major = m;
  gpa = gp;
  academicLevel = al;

}
public void viewStudent()
{

	System.out.println();
	System.out.println("First Name :" + firstName);
	System.out.println("Last Name :" + lastName);
	System.out.println("Major:" + major);
	System.out.println("GPA :" + gpa);
	System.out.println("academic Level :" + academicLevel);


}


}


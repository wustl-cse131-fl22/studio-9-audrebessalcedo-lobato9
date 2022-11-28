package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName; 
	private String lastName;
	private int studentId;
	private double GPA;
	private int passingCreds;
	private int attempCreds;
	private double totalQualPoints;
	private double bearBucks;
	
	
	public Student (String initFirst, String initLast, int initId) {
		firstName = initFirst;
		lastName = initLast;
		studentId = initId;
		GPA = 0.0;
		passingCreds = 0;
		totalQualPoints = 0.0;
		bearBucks = 0.0;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getId() {
		return studentId;
	}

	public void depositBearBucks(double amount) {
		bearBucks += amount;
	}

	public double getBearBucksBalance() {
		return bearBucks;
	}
}

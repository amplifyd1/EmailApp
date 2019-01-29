package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private int	costOfCourse = 600;
	
	//prompt user to enter students name and grade	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior, Enter Student class level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
	}

}

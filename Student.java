package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses ="";
	private int tuitionBalance = 0;
	private static int costOfCourse = 999;
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
	    
		System.out.print("1.Fresehman\n2.Sophmore\n3.Junior\n4.Senior\nEnter student grade level: ");
        this.gradeYear = in.nextInt();
        
        setStudentID();
    //    System.out.println(firstName+" "+ lastName+" "+ gradeYear+ " "+ studentID);
      
        
	}
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear+""+ id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0 
		do {
			System.out.print("Enter course to enroll (Q/q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if(!course.equals("Q") && !course.equals("q")){
				courses +="\n  " +course;
				tuitionBalance = tuitionBalance + costOfCourse;
				
			}else {
				break;
			}
		}while(true);
		
//		System.out.println("ENROLLED IN: "+ courses);
//		System.out.println("TUITION BALANCE: "+ tuitionBalance);
//		
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your due balance is: Rs "+tuitionBalance);
	}
	
	// Pay Tuition fee
	public void payTuitionFee() {
		viewBalance();
		System.out.print("Enter your payment: Rs ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you "+firstName+" for your payment of Rs "+payment);
		viewBalance();
	}
	// Show status
	public String showInfo() {
		return "Name "+firstName +" "+ lastName+
				"\nGrade Level: "+gradeYear+
				"\nCounrse Enrolled: "+courses+
				"\nDue Balance: Rs "+tuitionBalance;
	}

}

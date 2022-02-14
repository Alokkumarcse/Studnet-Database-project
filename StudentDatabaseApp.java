package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String args[]) {
	
		//for debugging purpose create this
//		Student stu1 = new Student();
//		stu1.enroll();
//		stu1.payTuitionFee();
//		System.out.println(stu1.showInfo());
		
		// Ask how many new users we want to add
		System.out.print("Enter number of new student to enroll: ");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		    // creating object of Student
		Student students[] = new Student[numOfStudents];
		
		
		// Create n number of new students
		// Array of objects
		for( int i =0; i < numOfStudents; i++ ) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuitionFee();
		}
		for(int i =0; i< numOfStudents; i++) {
			System.out.println(students[i].showInfo()+"\n");
		}
	}

}

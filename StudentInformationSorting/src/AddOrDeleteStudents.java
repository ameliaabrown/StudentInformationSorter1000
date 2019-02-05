import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddOrDeleteStudents
	{
		
		public static void printMenu()
		{
			
			Scanner userInput1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			System.out.println("1) Delete a student.");
			System.out.println("2) Add a student.");
			int choice = userInput1.nextInt();
			
			if(choice==1)
				{
					System.out.println("Which student would you like to delete?");
					PrintStudents.printStudents();
					int removal = userInput1.nextInt();
					System.out.println(SISRunner.students.get(removal-1).getFirstName() + " is being removed.");
					SISRunner.students.remove(removal-1);
					PrintStudents.printStudents();
				}
			else 
				{
					System.out.println("Enter the student's first name.");
					String firstName = s2.next();
					System.out.println("Enter the student's last name.");
					String lastName = s2.next();
					System.out.println("Enter the student's first period.");
					String period1 = s2.next();
					System.out.println("Enter the student's first period grade.");
					String grade1 = s2.next();
					System.out.println("Enter the student's second period.");
					String period2 = s2.next();
					System.out.println("Enter the student's second period grade.");
					String grade2 = s2.next();
					System.out.println("Enter the student's third period.");
					String period3 = s2.next();
					System.out.println("Enter the student's third period grade.");
					String grade3 = s2.next();
					
					SISRunner.students.add(new Student (firstName, lastName, 0, period1, period2, period3, grade1, grade2, grade3));
					System.out.println(firstName +" "+ lastName + " has been added to the class.");
					PrintStudents.printStudents();
				
				}
		}
	}

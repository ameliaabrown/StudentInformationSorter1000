import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddOrDeleteStudents
	{
		
		public static void printMenu()
		{
			
			Scanner userInput1 = new Scanner(System.in);
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
					//add student //
				
				}
		}
	}

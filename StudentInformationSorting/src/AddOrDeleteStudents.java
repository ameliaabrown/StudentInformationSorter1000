import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddOrDeleteStudents
	{
		
		public static void printMenu()
		{
			Scanner userInput1 = new Scanner(System.in);
			System.out.println("1) Add a student.");
			System.out.println("2) Delete a student.");
			int choice = userInput1.nextInt();
			
			if(choice==1)
				{
					System.out.println("Which student would you like to delete?");
					//print students
					//delete student
				}
			else 
				{
					//add student 
				
				}
		}
	}

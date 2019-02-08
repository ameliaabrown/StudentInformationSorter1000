
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SISRunner
	{
		static ArrayList<Student> students = new ArrayList <Student>();
		static boolean run = true;
		static Scanner s1 = new Scanner(System.in);
		
		public static void main(String[] args) throws IOException
			{
						readFile();
				while (run)
					{
						SetGPA.setGPA();
						MainMenu.MainMenu();
						
						
						System.out.println("Would you like to use this program again?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						int choiceToRun = s1.nextInt();
						
						if (choiceToRun==1)
							{
								
							}
						else
							{
								run=false;
								System.out.println("Thank you for using the Student Information Sorter 1000!");
							}
					}
				}

		public static void readFile() throws IOException
		{
			
			Scanner file = new Scanner (new File ("studentList"));
			// don't syso anything in while loop
			while(file.hasNext())
			{
				String firstName = file.next();
				String lastName = file.next();
				String period1 = file.next();
				String grade1 = file.next();
				String period2 = file.next();
				String grade2 = file.next();
				String period3 = file.next();
				String grade3 = file.next();
				
				students.add(new Student (firstName, lastName, 0, period1, period2, period3, grade1, grade2, grade3));
			}
		}
		}


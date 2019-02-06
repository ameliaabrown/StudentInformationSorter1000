
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SISRunner
	{
		static ArrayList<Student> students = new ArrayList <Student>();
		
		public static void main(String[] args) throws IOException
			{
				readFile();
				SetGPA.setGPA();
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
				
				//System.out.println(file.next());
				//System.out.println(grade3);

			}
				// this prints out whatever you want to put in the syso
//				for (int i =0; i< students.size(); i++)
//				{
//					System.out.println(students.get(i).getPeriod1());
//				}
//			PrintStudents.printStudents();
			
			AddOrDeleteStudents.printMenu();

			}
		}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddOrDeleteStudents
	{
		static String grade1;
		static String grade2;
		static String grade3;
		static double GPA;
		public static void printMenu()
		{
			
			Scanner userInput1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			System.out.println("1) Delete a student");
			System.out.println("2) Add a student");
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
					grade1 = s2.next();
					System.out.println("Enter the student's second period.");
					String period2 = s2.next();
					System.out.println("Enter the student's second period grade.");
					 grade2 = s2.next();
					System.out.println("Enter the student's third period.");
					String period3 = s2.next();
					System.out.println("Enter the student's third period grade.");
					 grade3 = s2.next();
					
					createGPA();
					
					SISRunner.students.add(new Student (firstName, lastName, GPA, period1, period2, period3, grade1, grade2, grade3));
					System.out.println(firstName +" "+ lastName + " has been added to the class.");
					PrintStudents.printStudents();
				
				}
			
		}
		
		public static void createGPA()
		{
			for(int i = 0; i<1; i++)
				{
					GPA = 0; 
					String[] studentLetterGrades = new String[3];
					studentLetterGrades[0] = grade1;
					studentLetterGrades[1] = grade2;
					studentLetterGrades[2] = grade3;
					for(int j = 0; j<studentLetterGrades.length; j++)
						{
							switch(studentLetterGrades[j])
							{
								case "A+":
									GPA+=4.3;
									break;
								case "A": 
									GPA+=4;
									break;
								case "A-":
									GPA+=3.7;
									break;
								case "B+":
									GPA+=3.3; 
									break;
								case "B":
									GPA+=3.0;
									break;
								case "B-":
									GPA+=2.7; 
									break;
								case "C+":
									GPA+=2.3;
									break;
								case "C": 
									GPA+=2.0;
									break;
								case "C-":
									GPA+=1.7;
									break;
								case "D+": 
									GPA +=1.3;
									break;
								case "D": 
									GPA+=1.0; 
									break;
								case "D-": 
									GPA+=.7; 
									break;
								case "F": 
									GPA+=0;										
							}
						}
					GPA/=3;
					
					
		}
		}
	}

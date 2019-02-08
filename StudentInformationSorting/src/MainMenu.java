import java.util.Collections;
import java.util.Scanner;

public class MainMenu {

	public static void MainMenu ()
	{

		Scanner userInput = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1) Add or delete a student");
		System.out.println("2) Change student grades/schedule");
		System.out.println("3) Sort students");

		int firstChoice = userInput.nextInt();
			if (firstChoice == 1)
			{
				AddOrDeleteStudents.printMenu();
			}
			if (firstChoice == 2)
			{
				
			}
			if (firstChoice == 3)
			{
				Scanner userInput2 = new Scanner (System.in);
				System.out.println("Do you want to sort by...");
				System.out.println("1) Last name");
				System.out.println("2) GPA");
				System.out.println("3) Period");
				int sortingChoice = userInput2.nextInt();
				
				if (sortingChoice == 1)
				{
					Collections.sort(SISRunner.students, new LastNameSorter());
					PrintStudents.printStudents();
				}
				if (sortingChoice == 2)
				{
					Collections.sort(SISRunner.students, new GPASorter());
					PrintStudents.printStudents();
					
				}
				if (sortingChoice == 3)
				{
					Collections.sort(SISRunner.students, new PeriodSorter());
					PrintStudents.printStudents();
				}
			}
			if (firstChoice != 3 && firstChoice != 2 && firstChoice != 1)
			{
				MainMenu();
			}
	
	
	}
	
	

}

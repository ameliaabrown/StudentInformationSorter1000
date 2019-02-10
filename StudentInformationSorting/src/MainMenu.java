import java.util.Collections;
import java.util.Scanner;

public class MainMenu {

	static int periodChoice;
	
	public static void MainMenu ()
	{

		Scanner userInput = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1) Add or delete a student");
		System.out.println("2) Change a student's grade or schedule");
		System.out.println("3) Sort students");

		int firstChoice = userInput.nextInt();
			if (firstChoice == 1)
				{
					AddOrDeleteStudents.printMenu();
				}
			
			if (firstChoice == 2)
				{
					Scanner input = new Scanner (System.in);
					System.out.println("1) Change student's grade");
					System.out.println("2) Change student's schedule");
					int changeChoice = userInput.nextInt();
					
					if (changeChoice == 1)
					{
						GradesChange.GradeChange();
					}
					if (changeChoice == 2)
					{
						
					}
					
				}
			
			if (firstChoice == 3)
				{
					Scanner userInput2 = new Scanner (System.in);
					System.out.println("Do you want to sort by");
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
						
						Scanner userInput4 = new Scanner (System.in);
						System.out.println("Do you want to sort");
						System.out.println("1) Period 1");
						System.out.println("2) Period 2");
						System.out.println("3) Period 3");
						periodChoice = userInput.nextInt();
						
							Collections.sort(SISRunner.students, new LastNameSorter());
							//leave this in ^^ it should be sorted alphabetically first 
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

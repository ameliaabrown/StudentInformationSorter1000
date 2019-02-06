import java.util.Scanner;

public class MainMenu {

	public static void MainMenu ()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
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
				System.out.println("1) last name");
				System.out.println("2) GPA");
				System.out.println("3) period");
				int sortingChoice = userInput2.nextInt();
				
				if (sortingChoice == 1)
				{
					
				}
				if (sortingChoice == 2)
				{
					//GPASorter.GPASorter();
				}
				if (sortingChoice == 3)
				{
					//LastNameSorter.compare();
				}
			}
			if (firstChoice != 3 && firstChoice != 2 && firstChoice != 1)
			{
				MainMenu();
			}
	
	
	}
	
	
}

import java.util.Scanner;

public class MainMenu {

	public static void MainMenu ()
	{
		System.out.println("What would you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		Scanner userChoice = new Scanner (System.in);
		int menuChoice = userChoice.nextInt();
		
		if (menuChoice == 1)
		{
			AddOrDeleteStudents.printMenu();
		}
		if (menuChoice == 2)
		{
			
		}
		if (menuChoice == 3)
		{
			
		}
		if (menuChoice != 1 && menuChoice != 2 && menuChoice != 3)
		{
			System.out.println("not a valid option...");
			MainMenu();
		}
		
	}
}

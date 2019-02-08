import java.util.Collections;
import java.util.Scanner;

public class MainMenu {

	public static void MainMenu()
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
				
				System.out.println();
				System.out.println("Would you like to return to the main menu?");
				System.out.println("1) yes");
				System.out.println("2) no");
				Scanner returnInput = new Scanner (System.in);
				int returnToMainMenu = returnInput.nextInt();
				if (returnToMainMenu == 1)
				{
					MainMenu();
				}
				else
				{
					System.out.println("Okay");
				}
				
			}
			
			if (firstChoice == 2)
			{
			
				
				System.out.println();
				System.out.println("Would you like to return to the main menu?");
				System.out.println("1) yes");
				System.out.println("2) no");
				Scanner returnInput = new Scanner (System.in);
				int returnToMainMenu = returnInput.nextInt();
				if (returnToMainMenu == 1)
				{
					MainMenu();
				}
				else
				{
					System.out.println("Okay");
				}
				
			}
			
			if (firstChoice == 3)
			{
				Scanner userInput2 = new Scanner (System.in);
				System.out.println("Do you want to sort by");
				System.out.println("1) last name");
				System.out.println("2) GPA");
				System.out.println("3) period");
				int sortingChoice = userInput2.nextInt();
				
				if (sortingChoice == 1)
				{
					Collections.sort(SISRunner.students, new LastNameSorter());
					PrintStudents.printStudents();
					
					System.out.println();
					System.out.println("Would you like to return to the main menu?");
					System.out.println("1) yes");
					System.out.println("2) no");
					Scanner returnInput = new Scanner (System.in);
					int returnToMainMenu = returnInput.nextInt();
					if (returnToMainMenu == 1)
					{
						MainMenu();
					}
					else
					{
						System.out.println("Okay");
					}
					
					
				}
				
				if (sortingChoice == 2)
				{
					Collections.sort(SISRunner.students, new GPASorter());
					PrintStudents.printStudents();
					
					System.out.println();
					System.out.println("Would you like to return to the main menu?");
					System.out.println("1) yes");
					System.out.println("2) no");
					Scanner returnInput = new Scanner (System.in);
					int returnToMainMenu = returnInput.nextInt();
					if (returnToMainMenu == 1)
					{
						MainMenu();
					}
					else
					{
						System.out.println("Okay");
					}
					
				}
				
				if (sortingChoice == 3)
				{
					Scanner userInput3 = new Scanner (System.in);
					System.out.println("Do you want to sort by");
					System.out.println("1) period 1");
					System.out.println("2) period 2");
					System.out.println("3) period 3");
					int periodChoice = userInput3.nextInt();
					
					
					if (periodChoice == 1)
					{
						
					}
					if (periodChoice == 2)
					{
						
					}
					if (periodChoice == 3)
					{
						
					}
					
				//	Collections.sort(SISRunner.students, new PeriodSorter());
					PrintStudents.printStudents();
				}
			}
			if (firstChoice != 3 && firstChoice != 2 && firstChoice != 1)
			{
				MainMenu();
			}
	
	
	}
	
	

}

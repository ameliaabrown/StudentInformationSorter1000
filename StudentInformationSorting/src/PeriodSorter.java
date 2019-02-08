import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeriodSorter  implements Comparator <Student>{

	
	public int compare(Student s1, Student s2)
	{
		
		if (MainMenu.periodChoice == 1)
		{
			return s1.getPeriod1().compareTo(s2.getPeriod1());
		}
		if (MainMenu.periodChoice == 2)
		{
			return s1.getPeriod2().compareTo(s2.getPeriod2());
		}
		if (MainMenu.periodChoice == 3)
		{
			return s1.getPeriod3().compareTo(s2.getPeriod3());
		}
		return MainMenu.periodChoice;
		
	}

}

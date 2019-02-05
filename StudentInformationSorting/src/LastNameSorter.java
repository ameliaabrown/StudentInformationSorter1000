import java.util.Comparator;

public class LastNameSorter
	{
		public int compare(Student s1, Student s2)
			{
				return s1.getLastName().compareTo(s2.getLastName());
			}
		
	}

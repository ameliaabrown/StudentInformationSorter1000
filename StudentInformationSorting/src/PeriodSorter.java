
public class PeriodSorter 
{

	public static void printPeriod1()
{
	for (int i =0; i< SISRunner.students.size(); i++)
	{
		if (SISRunner.students.get(i).getPeriod1().equals("Biology"))
		{
			System.out.println(SISRunner.students.get(i).getPeriod1());
		}
	
	}
	
	
}
}

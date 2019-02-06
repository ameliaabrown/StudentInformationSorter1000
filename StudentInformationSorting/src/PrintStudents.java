
public class PrintStudents
	{
		
		public static void printStudents()
		{
			System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", "Num", "First name", "Last Name", "Period 1 ", "Period 2", "Period 3", "GPA");
			for (int i=0; i<SISRunner.students.size();i++)
				{
					System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", (i+1)+")", SISRunner.students.get(i).getFirstName(),SISRunner.students.get(i).getLastName(), SISRunner.students.get(i).getPeriod1() +" " +SISRunner.students.get(i).getGrade1(), SISRunner.students.get(i).getPeriod2()+ " "+ SISRunner.students.get(i).getGrade2(), SISRunner.students.get(i).getPeriod3() + " "+ SISRunner.students.get(i).getGrade3(), SISRunner.students.get(i).getGPA() );
				}
		}
	}



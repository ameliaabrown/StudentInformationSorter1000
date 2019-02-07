import java.util.ArrayList;
import java.util.Arrays;

public class SetGPA
	{
		public static void setGPA()
			{
				for(int i = 0; i<SISRunner.students.size(); i++)
					{
						double GPA = 0; 
						String[] studentLetterGrades = new String[3];
						studentLetterGrades[0] = SISRunner.students.get(i).getGrade1();
						studentLetterGrades[1] = SISRunner.students.get(i).getGrade2();
						studentLetterGrades[2] = SISRunner.students.get(i).getGrade3();
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
						SISRunner.students.get(i).setGPA(GPA);
						GPA=0;
						//System.out.printf("%.2f", SISRunner.students.get(i).getGPA());
						//System.out.println();
						//->>whoever is in charge of printing...lines 63 and 64 are examples of how you need to print the GPA so that it is formatted to 2 decimal places
					}
			}

	}

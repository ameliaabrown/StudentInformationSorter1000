
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SISRunner
	{
		static ArrayList<Student> fullClass = new ArrayList<Student>();
		
		public static void main(String[] args) throws IOException
			{
				//System.out.println("hello");

				Scanner names = new Scanner (new File ("studentList"));
				while(names.hasNext())
				{
					String first = names.next();
					String last = names.next();
					fullClass.add(new Student(first, last, , ));
					System.out.println(names.next());
				}
				
			}

	}


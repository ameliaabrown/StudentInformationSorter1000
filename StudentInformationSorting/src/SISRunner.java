import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SISRunner
	{

		public static void main(String[] args) throws IOException
			{
				//System.out.println("hello");

				Scanner names = new Scanner (new File ("studentList"));
				while(names.hasNext())
				{
					System.out.println(names.next());
				}
				
			}

	}

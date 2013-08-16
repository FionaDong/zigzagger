import java.io.*;

public class Mission1
{

	public static void main(String[] args)throws IOException

	{

		try
		{
//test command line parameters

			System.out.print("Please key in:");

//read from command line one char by one char

//InputStreamReader cin = new InputStreamReader(System.in);
			InputStreamReader cin = new InputStreamReader(System.in);
			int str;
// 			String exit = "";
			System.out.print(exit);
			
			while(exit != "exit")
			{
				str = cin.read();
				exit = exit + (char)str;
				System.out.print(exit);
				
// 				System.out.print((char)str);
				
			}
			cin.close();
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}





	}
	
}


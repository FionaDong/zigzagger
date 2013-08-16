    import java.io.Console;
    import java.io.IOException;
    
    public class Mission1_StandardInput{
    
    	public static void main(String[] args)throws IOException{
    	
    		Console c = System.console();
    		
    		String Keyin = c.readLine("Please Key In:");
    		
//   		char[] password = c.readPassword("Please Enter your password:");
   			
// 			System.out.println(password);
			
			while(Keyin != "exit")
			{
				
			}

			System.out.println(Keyin);
    	}
    }
    
// package com.fiona.test;

import java.io.Console;
import java.io.IOException;
    
public class Mission1_StandardInput{

	public static void main(String[] args)throws IOException{
	
//		Process process = Runtime.getRuntime().exec("");
		
		Console c = System.console();
		
		String keyin = c.readLine("Command:");
		
//   		char[] password = c.readPassword("Please Enter your password:");
		
// 			System.out.println(password);
		
		while(keyin != "exit")
		{
			if(keyin == "config"){
				
				keyin = c.readLine("Please Key In:");
// 				ResponseLine.responseKeyin(keyin);
				System.out.println(keyin);
			}
			
			keyin = c.readLine("Command:");
		}		
	}
}
	    
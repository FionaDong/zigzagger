package com.fiona.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ResponseLine{
	
	public static ArrayList response;
	
	static{
		response = new ArrayList();
		response.add("Hello");
	}
	
	public static String responseGet(int index){
		
		return response.get(index).toString();
	}
	
	public static boolean responseKeyin(String element){
		
		try{
		
			response.add(element);
			return true;
		
		}catch(Error e){
			
			System.out.println(e.getMessage());
			return false;
		}
	}

	public void configResponseLine(BufferedWriter writer,BufferedReader reader) throws IOException{
		
		writer.write("Please keyin answers:");
		writer.flush();
		
		String keyin = reader.readLine();
		
		if(ResponseLine.responseKeyin(keyin)){
			
			System.out.println("Answers were added.");
		}
	}
	
	public void helpReponseLine(){
		
		for(int i=0;i<ResponseLine.response.size();i++){
			
			System.out.println(i+"\t"+ResponseLine.responseGet(i));
			}
	}
	
	public void showCommandLine(BufferedWriter writer,BufferedReader reader) throws IOException{
		
		String keyin = reader.readLine();
		while (!keyin.equals("exit")) 
		{	
			if(keyin.equals("config")){
				new ResponseLine().configResponseLine(writer,reader);
			}
			else if(!Pattern.compile("[0-9]*").matcher(keyin).matches()){
				System.out.println("Please keyin correct command,keyin \"HELP\" for introduction.");
				writer.write("Command:");
				writer.flush();
				
				keyin = reader.readLine();
			}
			else if(Integer.parseInt(keyin) < ResponseLine.response.size()){
				System.out.println(ResponseLine.responseGet(Integer.parseInt(keyin)));
			}

			if(keyin.equals("HELP")){
				new ResponseLine().helpReponseLine();
			}
			writer.write("Command:");
			writer.flush();
			
			keyin = reader.readLine();
		}
	}
	
}
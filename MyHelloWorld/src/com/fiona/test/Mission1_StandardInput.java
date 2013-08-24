package com.fiona.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;

public class Mission1_StandardInput {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("Command:");
		writer.flush();
		
		new ResponseLine().showCommandLine(writer,reader);
	}
	

}

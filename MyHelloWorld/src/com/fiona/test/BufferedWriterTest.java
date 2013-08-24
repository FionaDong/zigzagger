package com.fiona.test;

import java.io.*;



public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter output = new OutputStreamWriter(System.out);
		BufferedWriter writer = new BufferedWriter(output);
		
		writer.write("Command:");
		writer.flush();
	}
}

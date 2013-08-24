package com.fiona.test;

import java.io.IOException;

public class TerminalLauncher {

	public static void main(String[] args) throws IOException {
		// Process process = Runtime.getRuntime().exec("");

		// Console c = System.console();
		//
		// String keyin = c.readLine();
		
//		String commander = "/usr/bin/xterm";
		String commander = System.getenv().get("TERM");
		
		if(commander == null){
			System.out.println("commander is unavailable.");
			return;
		}
		
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec(commander);
		if(process == null){
			System.out.println("process is unavailable.");
			return;
		}
		System.out.println(process);
	}
}

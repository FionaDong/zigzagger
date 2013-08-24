package com.fiona.test;

import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
		
		System.out.println(Pattern.compile("[0-9]").matcher("09").matches());
		
	}
}

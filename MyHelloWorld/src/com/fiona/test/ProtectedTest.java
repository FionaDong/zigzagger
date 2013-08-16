package com.fiona.test;

import com.fiona.A;

public class ProtectedTest {

	public static void main(String[] args) {

		B b = new B();
		String nian = b.nian;
		// Object o = new Object();
		String nian1 = new String("2013");
		System.out.println(nian.equals(nian1));
		System.out.println("-----------------------");

		int[] a = new int[10];
		
		int a1[] = new int[10];

		int[][] a3 = new int[2][3];

		int[][] a4 = new int[3][];

		a4[0] = new int[2];
		a4[1] = new int[3];
		a4[2] = new int[4];

		int[][] a5 = new int[][] { { 3 }, { 4, 5 }, { 67, 0 } };
		
	}

}

class B extends A {
	String nian = year;

	void output() {
		System.out.println(nian);
	}

}

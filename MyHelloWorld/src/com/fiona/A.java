package com.fiona;

public class A {
	
	protected String year = "2013";
	
	public static void main(String[] args){
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		System.out.println(A.isEqual(a,b));
		
	}
	
public static boolean isEqual(int[] a,int[] b){
	
	int i;
	if(a == null||b == null){
		return false;
	}
	if(a.length != b.length){
		
		return false;
	}
		for(i=0;i<a.length;i++){
			
			if(a[i] != b[i])
				
				return false;
		}
			
	return true;

}

}



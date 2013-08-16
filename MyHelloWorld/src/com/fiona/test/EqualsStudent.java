package com.fiona.test;

public class EqualsStudent {

	public static void main(String[] args){
		
		Student s = new Student("lihao");
		Student s2 = new Student("lihao");
		
		System.out.println(s == s2);
		
		System.out.println(s.equals(s2));
		
	}
	
	
}

class Student{
	
	String name;
	
	public Student(String name){
		
		this.name = name;
	}
	
	@Override
	public boolean equals(Object anObject){
		
		if(this == anObject){
		
			return true;
		}
		
		if(anObject instanceof Student){
			
			Student anotherObject = (Student)anObject;
			
			if(anotherObject.name.equals(this.name)){
				
				return true;
			}
				
		}
			
		return false;
	}
}

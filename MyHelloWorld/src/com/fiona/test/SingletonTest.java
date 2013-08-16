package com.fiona.test;

public class SingletonTest {
	
	public static void main(String[] args){
		Singleton singelton1 = Singleton.getSingleton();
		Singleton singelton2 = Singleton.getSingleton();
		
		System.out.println(singelton1 == singelton2);
	}
}

//first way for Singleton
class Singleton{
//	私有构造方法只能被本类使用，且生成对象是私有的，外界没法调用私有成员变量
	private static Singleton singleton = new Singleton();
//	构造函数是私有的，外界没法调用new来生成对象
	private Singleton(){
		
	}
//	静态方法可以使用类名.方法名来调用，不需要new来生成对象，且静态方法只能调用静态变量
	public static Singleton getSingleton(){
		return singleton;
	}
	
}

//the second way for Singleton, not apply to multiprocess 
class Singleton2{
//	私有构造方法只能被本类使用，且生成对象是私有的，外界没法调用私有成员变量
	private static Singleton2 singleton2;
//	构造函数是私有的，外界没法调用new来生成对象
	private Singleton2(){
		
	}
//	静态方法可以使用类名.方法名来调用，不需要new来生成对象，且静态方法只能调用静态变量
	public static Singleton2 getSingleton2(){
		
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
	
}
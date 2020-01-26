package com.akhilesh.logicalprog;

public class Classloader {
	private static int i = 0;

	{
		i = 5;
		System.out.println("Instance block "+i);
	}

	static {
		System.out.println("static "+ i);
	}
	
	
	void m1() {
		System.out.println("M1");
	}


	public static void main(String[] args) {
		
		System.out.println("main "+i);
		
		 Classloader cls= new Classloader(); 
		 
		// cls.m1();
		 
		
	}

}

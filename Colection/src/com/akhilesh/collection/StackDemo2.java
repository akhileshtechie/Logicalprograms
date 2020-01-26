package com.akhilesh.collection;

import java.util.Stack;

public class StackDemo2 {
	public static void main(String[] args) {
		//LIFO
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		s.pop();//LIFO do it will remove C
		System.out.println(s);
		
	}
}

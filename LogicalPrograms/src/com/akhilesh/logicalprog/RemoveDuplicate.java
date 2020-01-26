package com.akhilesh.logicalprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	
public static void main(String[] args) {
	
		/*
		 * ArrayList yourList= new ArrayList<Integer>(Arrays .asList(1, 10, 1, 2, 2, 3,
		 * 3, 10, 3, 4, 5, 5));
		 * 
		 */
	ArrayList  yourList= new ArrayList();
	yourList.add(1);
	yourList.add(10);
	yourList.add(2);
	yourList.add(2);
	
	yourList.add(3);
	yourList.add(3);
	yourList.add(10);
	yourList.add(3);
	
	yourList.add(4);
	yourList.add(5);
	yourList.add(10);
	yourList.add(5);
	System.out.println("With duplicates "+ yourList);
	
	Set<String> set = new HashSet<>(yourList);
	yourList.clear();
	yourList.addAll(set);
	System.out.println("Without List "+ yourList);
}
}

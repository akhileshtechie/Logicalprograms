package com.akhilesh.logicalprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountDuplicates {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    list.add("a");
	    list.add("a");
	    list.add("a");

	int countA=Collections.frequency(list, "a");
	int countB=Collections.frequency(list, "b");
	int countC=Collections.frequency(list, "c");
	
	System.out.println(countA);
	System.out.println(countB);
	System.out.println(countC);
	
	}
}

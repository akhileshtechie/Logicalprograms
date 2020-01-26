package com.akhilesh.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Qtiyapa q= new Qtiyapa(1,"Vipul");
		Qtiyapa q1= new Qtiyapa(1,"Hello");
		HashMap map=new HashMap();
		map.put(q, "Akhilesh");
		map.get(q);
		
		System.out.println(map.get(q));
		System.out.println(map.get(new Qtiyapa(2, "Amit")));
	}
}



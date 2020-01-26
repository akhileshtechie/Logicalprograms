package com.akhilesh.collection;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	Vector v= new Vector();
	v.addElement(new Integer(2));
	v.addElement(new Integer(3));
	v.addElement(new Integer(5));
	v.addElement(new Integer(6));
	v.addElement(new Integer(7));
	v.addElement(new Integer(2));
	v.addElement(new Integer(3));
	v.addElement(new Integer(5));
	v.addElement(new Integer(6));
	v.addElement(new Integer(7));
	v.addElement(new Integer(7));
	System.out.println(v.capacity());
	System.out.println(v.size());
	
}
}

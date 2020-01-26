package com.akhilesh.collection;

import java.util.Vector;

public class VectorDemo3 {
public static void main(String[] args) {
	Vector obj = new Vector(4,2);
    obj.addElement(new Integer(3));//position is 0
    obj.addElement(new Integer(2));//Position is 1
    obj.addElement(new Integer(6));//Position is 2
    //here addind 8 at the place of position 2 so internally it will shift the existing element.
    obj.insertElementAt(new Integer(8), 2);
    System.out.println(obj);//Output  3286
   
}
}

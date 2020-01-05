package com.akhilesh.logicalprog;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicate {

	
	public static void main(String[] args) {
	ArrayList< Integer> list=	new ArrayList<Integer>(Arrays 
            .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
	
	// Print the Arraylist 
    System.out.println("ArrayList with duplicates: "
                       + list);
    
 // Remove duplicates 
    ArrayList<Integer> 
        newList = removeDuplicates(list);
    
 // Print the ArrayList with duplicates removed 
    System.out.println("ArrayList with duplicates removed: "
                       + newList);
	}
	
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		
		ArrayList<T> newList = new ArrayList<T>(); 
		
		
		for (T element : list) { 
			  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 
}

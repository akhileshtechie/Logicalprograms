package com.akhilesh.collection;

public class ArrayDemo5 {
public static void main(String[] args) {
	
        int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j <  3 ; ++j)
                sum = sum + array_variable[i][j];
       //here onething i have to keep in mind that for loop doesn't have curlybraces bcoz 1 statement
        System.out.print(sum / 5);
    } 
}


package introduction;

import java.util.Arrays;
import java.util.Iterator;

public class array {
	
	public static void main(String[] args) {
//		int[] myArray; //array reference
//		myArray = new int[10]; //size of array
		
		
		//Assigning values to array
//		myArray[1] = 100;
//		myArray[2] = 79;
//		
		int myArray[] = {10,5};
		
		System.out.println("first value of array: " + myArray[0]);
		System.out.println("second value of array: " + myArray[1]);
		
		System.out.println();
		
		String[] myStringArray = {"bmw", "honda", "suzuki"};
		System.out.println("first value of string array: " + myStringArray[0]);
		System.out.println("second value of srting array: " + myStringArray[1]);
		
		int len1 = myArray.length;
		int len2 = myStringArray.length;
		
		System.out.println("length of int array= " + len1 + " and length of string array= " + len2);
		
		for(int i= 0; i<len1; i++) {
			System.out.println(myArray[i]);
		}
		
		Arrays.sort(myArray); System.out.println();
		
		for(int i = 0; i<len1; i++) {
			System.out.println(+myArray[i]);
		}
		
	}

}

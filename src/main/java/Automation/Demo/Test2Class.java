package Automation.Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2Class {

	
		public static void main (String[] args) 
	    {  
	        // Given input array 
	        String[] inputArray = {"India","USA","Germany","Australia"}; 
	        // Print array before reverse  
	        System.out.println("Array without reverse : " + 
	                            Arrays.toString(inputArray)); 
	        // Calling method to swap elements 
	        reverseArray(inputArray);
	    }
		
		
	   public static void reverseArray(String[] arr) {
	        // Converting Array to List
	        List<String> list = Arrays.asList(arr);
	        // Reversing the list using Collections.reverse() method
	        Collections.reverse(list);
	        // Converting list back to Array
	        String[] reversedArray = list.toArray(arr);
	        // Printing the reverse Array
	        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
	   }

	

}

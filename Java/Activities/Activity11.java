package activities;

import java.util.*;



/*Create a Map named colours with integer keys and String values.
Add 5 random colours to it and print the Map to the console.
Remove one colour using the remove() method.
Check if the colour green exists in the Map using the containsValue() method.
Print the size of the Map using the size() method.*/


public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> hashmap = new HashMap <Integer,String>();
		hashmap.put(1, "Red");
		hashmap.put(2, "Yellow");
		hashmap.put(3, "Green");
		hashmap.put(4, "White");
		hashmap.put(5, "Black");
		
		System.out.println("The hashmap contains the following colours" + hashmap);
		System.out.print("One colour removed: " + hashmap.remove(4));
		
		System.out.println("The hashmap contains the following colours" + hashmap);
		
		if (hashmap.containsValue("Green")) 
			{System.out.println("Green colour is present");
			}
		else
			{System.out.println("Green colour is not present");
			}
		
		System.out.println("The hashmap contains the colour 'Yellow': " + hashmap.containsValue("Green"));
		System.out.print("Size which is 'Pairs' present in the hashmap: " + hashmap.size());
		
		
	}

}

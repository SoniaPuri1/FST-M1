package activities;

import java.util.*;


/*Create a HashSet named hs.
Add 6 objects using add() method to the HashSet.
Then print the size of the HashSet using the size() method.
Remove an element using the remove() method.
Also try to remove an element that is not present in the Set.
Use the contains() method to check if an item is in the Set or not.
Print the updated set.
*/


public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> hs = new HashSet<String>();
		
		//add 6 objects using add() method to the HashSet
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Banana");
		hs.add("Kiwi");
		hs.add("Pear");
		hs.add("Orange");
		
		System.out.println("The actual items present in HashSet at the beginning are: " + hs);
		System.out.println("the size of the HashSet is: " + hs.size());
		
		//Remove an element using the remove() method.
		System.out.println("the item Mango is removed from the HashSet: " + hs.remove("Mango"));
		
		//Also try to remove an element that is not present in the Set.
		System.out.println("remove an element 'aPPLE' that is not present in the Set: " + hs.remove("aPPLE"));	
		
		
		//Use the contains() method to check if an item is in the Set or not
		System.out.println("To check the presence of item 'Peas' in the HashSet: " + hs.contains("Peas"));
		
		System.out.println("The items present in HashSet at the end are: " + hs);
	}

}

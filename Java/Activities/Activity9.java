package activities;
import java.util.ArrayList;


/*Create an ArrayList named myList of type String.
Add 5 names to the ArrayList using add() method.
Then print all the names using for loop.
Then use get() method to retrieve the 3rd name in the ArrayList.
Use contains() method to check if a name exists in the ArrayList.
Use size() method to print the number of names in the ArrayList.
Use remove() method to remove a name from the list and print the size() of the list again.
*/

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		
		//Add 5 names
		myList.add("Ted");
		myList.add("Zedd");
		myList.add("Keddy");
		
		myList.add(2,"Medhansh");
		myList.add(1,"Devansh");
		
		//print all the names using for loop.
		
		System.out.println("The names in the array are: ");
		for (String s : myList) {
			System.out.println(s);
		}

		//use get() method to retrieve the 3rd name in the ArrayList.
		System.out.println("The 3rd name in the list is: " + myList.get(3));
		
	
		//Use contains() method to check if a name exists in the ArrayList.
		System.out.println("To check if the name Ted is present in the list: " +myList.contains("Ted"));
		
		
		//Use size() method to print the number of names in the ArrayList.
		System.out.println("The total names present in the array are:"+ myList.size());
	
		
		//Use remove() method to remove a name from the list and print the size() of the list again
		System.out.println("The name Ted has been removed from the array :"+ myList.remove("Ted"));
		System.out.println("The total names now present in the array are:"+ myList.size());
	}

}

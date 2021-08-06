package activities;

import java.util.*;

/*In this activity, accept number inputs from the console using Scanner class and store them in an array.
Then use the Random class to generate an index value and print the value in the array at then generated index value.
To start create a class RandomScannerActivity with a main() method with the following objects:
Create a Scanner object named scan.
Create an ArrayList object named list.
Create a Random class object named indexGen.
Add a scan statement with nextInt() to accept only integer values, inside a loop to accept multiple values.
Use the hasNextInt() method with the loop to ensure only integer values are accepted.

*/

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList <Integer>();
		Random indexGen = new Random();
		
		System.out.println ("Enter Integers only: ");
		
		while(scan.hasNextInt()) {
		list.add(scan.nextInt());
		}
		
		 Integer nums[] = list.toArray(new Integer[0]);
	        int index = indexGen.nextInt(nums.length);
	        System.out.println("Index value generated: " + index);
	        System.out.println("Value in arary at generated index: " + nums[index]);
	 
	        scan.close();
		
	        System.out.println("The numbers entered by user are:" + nums);
		
	}

}

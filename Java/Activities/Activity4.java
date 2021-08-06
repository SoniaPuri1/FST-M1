package activities;
import java.util.Arrays;
public class Activity4 {
	
	
	static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In this activity, we will be implementing the Insertion Sort algorithm
		 * Initialize an array with numbers in random order Use the insertion sort logic
		 * to sort the array in ascending order. Display the array before and after
		 * sorting.
		 */
		
		
		int[] numArray = {1,2,5,3,9,7,8};
		
		//Display the array before sorting
		System.out.println("Displaying the array before sorting:" + Arrays.toString(numArray));
		
				ascendingSort(numArray);
        System.out.println("Displaying the array in Ascending Order: ");
        System.out.println(Arrays.toString(numArray));
		
	}

}

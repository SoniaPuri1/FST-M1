import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;




/*Activity 1
In this activity, you will be testing an ArrayList with elements:

Create a JUnit test with the name Activity1.java.
Create a test fixture that declares a static ArrayList named list.
Create a setUp() method with the @BeforeAll annotation. Add the following to the setUp() method:
Create 2 @Test methods, insertTest() and replaceTest().
In insertTest(),
Write an assertion to check the size of the ArrayList. The expected value is 2.
Add a new value to the list and write another assertion to check the size of the new list. The expected values of the list should be 3.
Finally write assertions for checking each of the values in the ArrayList.
*
*/
class Activity1 {

	//Test Fixture that declares a static ArrayList named list.	
	static ArrayList<String> list;
	
	@BeforeEach
	void setUp() throws Exception{
		// Add values to the list
		list=new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
			
	}
	
	
	//Test method to test the Insert operation - 
	@Test
	public void insertTest() {
		//Assertion for checking size
		assertEquals(2,list.size(),"Wrong Size");
	
		//command for insert 
		list.add("charlie");
		
		//Assertion for checking size again
		assertEquals(3,list.size(),"Wrong size");
		
		//Assertion for checking each index value-
		assertEquals("alpha",list.get(0),"Incorrect element - Not alpha");
		assertEquals("beta",list.get(1),"Incorrect element - Not beta");
		assertEquals("charlie",list.get(2),"Incorrect element - Not charlie");
		
		
	
		//Test method to test the Replace operation:
		
	}

	@Test
	public void replaceTest() {
		//Replace operation
		list.set(1, "charlie");
		
		
		//Assert size of the list 
		list.size();
		assertEquals(2,list.size(),"Incorrect size");
		 
		//assert individual element in the list array
		assertEquals("alpha",list.get(0),"Wrong name"); 
		assertEquals("charlie",list.get(1), "Wrong element"); 
				
	}
	
	
	
}

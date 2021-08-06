package seleniumHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;



public class Activity1 {

	//1. Verify the website title
	//Goal: Read the title of the website and verify the text
	//a. Open a browser.
	//b. Navigate to ‘http://alchemy.hguy.co/orangehrm’.
	//c. Get the title of the website.
	//d. Make sure it matches “OrangeHRM” exactly.
	//e. If it matches, close the browser.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		String title = driver.getTitle();
		System.out.println("The title of the website is: " + title);
		
		//Using Assert
		//Assert.assertEquals("OrangeHRM", title))
			
				
		
		if (title.equals("OrangeHRM"));
		System.out.println("The title is matching.");
		driver.close();
		
	}

}

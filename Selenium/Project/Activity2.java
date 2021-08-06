package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//2. Get the url of the header image
//Goal: Print the url of the header image to the console
//a. Open a browser.
//b. Navigate to ‘http://alchemy.hguy.co/orangehrm’
//c. Get the url of the header image.
//d. Print the url to the console.
//e. Close the browser.

public class Activity2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();

	driver.get("http://alchemy.hguy.co/orangehrm");
	
	
	WebElement url = driver.findElement(By.xpath("/html/body/div/div/div/div/img"));
		
	System.out.println("The url of the header image is: " + url.getAttribute("src"));
	
	driver.close();
	
	}
}

package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Activity6 {

	// 6. Verify that the “Directory” menu item is visible and clickable
	// Goal: Verify that the “Directory” menu item is visible and clickable
	// a. Open the OrangeHRM page and login with credentials provided.
	// b. Locate the navigation menu.
	// c. Verify that the “Directory” menu item is visible and clickable.
	// d. If clickable, click on the menu item
	// e. Verify that the heading of the page matches “Search Directory”.
	// f. Close the browser.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		

		driver.get("http://alchemy.hguy.co/orangehrm");

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule"));
		System.out.println("Menu is visible");

	

		
		  //c. Verify that the “Directory” menu item is visible and clickable.
		  WebElement directory =  driver.findElement(By.id("menu_directory_viewDirectory")); 
		  String directoryText = directory.getText(); System.out.println(directoryText);
		  Assert.assertEquals(directoryText,"Directory"); 
		  System.out.println("Passed: True");
		  
		  directory.click(); 
		
		  System.out.println("clicked");	   
		  
		
		// d. If clickable, click on the menu item
		// e. Verify that the heading of the page matches “Search Directory”.

		WebElement searchDir = driver.findElement(By.xpath("//div[@class='head']/h1"));
		System.out.println("SearchDir found");
		
		
	  String searchDir1 = searchDir.getText();
	  String expDir = "Search Directory";
	  
	  Assert.assertEquals(expDir, searchDir1);
	  System.out.println("The title Search Directory is appearing as expected.");
		
		driver.close();
	

	}

}

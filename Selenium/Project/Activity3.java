package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

//Logging into the site
//Goal: Open the site and login with the credentials provided
//a. Open the browser to the login page of OrangeHRM site.
//b. Find and select the username and password fields
//c. Enter login credentials into the respective fields
//d. Click login
//e. Verify that the homepage has opened.
//f. Close the browser

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		WebElement actualLoginVerification = driver.findElement(By.id("welcome"));
		
		String actualLoginVerification1 = actualLoginVerification.getAttribute("id");
		
		//	e. Verify that the homepage has opened.
		Assert.assertEquals("welcome", actualLoginVerification1);
		System.out.println("Verified that the homepage has opened.");
		
		driver.close();
		
		
		
		
	}

}

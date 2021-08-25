package appiumProject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome1_ToDoList {

	WebDriverWait wait = null;
	AppiumDriver<MobileElement> driver = null;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		
		//public void setUp() throws MalformedURLException {
		   
		    //desiredCapabilities.setCapability("deviceName", "pixelEmulator");
		    desiredCapabilities.setCapability("platformName", "android");
		    desiredCapabilities.setCapability("automationName", "UiAutomator2");
		    desiredCapabilities.setCapability("appPackage", "com.android.chrome");
		    desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		    	   
		    
			 //Instantiate Appium driver
		    driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
	 		wait = new WebDriverWait(driver, 100); 
		 	
	}
	
	@Test
	public void toDoListProgram() {
		//Accessing URL
		driver.get("https://www.training-support.net/selenium");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Accessing Chrome
		try {
		driver.findElementById("com.android.chrome:id/terms_accept").click();
		driver.findElementById("com.android.chrome:id/next_button").click();
		driver.findElementById("com.android.chrome:id/positive_button").click();
		driver.findElementById("com.android.chrome:id/promo_secondary_button").click();
		}		
		
		catch (Exception e) {
		}
		//Scroll to end and find the To-Do List card and click it.
		finally {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='Get Started!']")));
		
		MobileElement e1 = driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"To-Do List\"))"));
		e1.click();
		
		List<String> tasks = new ArrayList<String>();
		
		// Add the tasks to be added to a list
		
		tasks.add("Add tasks to list");
		tasks.add("Get number of tasks");
		tasks.add("Clear the list");		
		System.out.println("Added all task names to a list");
				
			// Add task names
			for(String e: tasks)
				wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("taskInput")))
				.sendKeys(e);
			
				
			// Striking the tasks
			for(String e: tasks)
				driver.findElementByXPath("//android.view.View[@text='"+e+"']").click();
			
			// Clear the list
				driver.findElementByXPath("//android.view.View[@text='Clear List']").click();
		
				
			//Add assertions to verify that the test has passed or failed		
			MobileElement ele = driver.findElementsByXPath("//android.view.View[@text='"+tasks[0]+"']");
			Assert.assertTrue(ele.isDisplayed(), "All tasks are Cleared");	
				
			
		}
	}
	
}

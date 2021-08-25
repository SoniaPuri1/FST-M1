package appiumProject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class googleKeepReminder {

	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;
	
  @BeforeTest
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "pixelEmulator");
    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("automationName", "UiAutomator2");
    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appPackage", "com.google.android.keep");
    desiredCapabilities.setCapability("appActivity", ".activities.BrowseActivity");
    
 // Instantiate Appium Driver
 		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
 		wait = new WebDriverWait(driver, 50); 	
  }	
 	
  @Test
  public void titleDescTest() {
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/new_note_button"))).click();
    
   // enter description
   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/edit_note_text")))
   .sendKeys("Description added for Reminder");
   System.out.println("Description is added for Reminder");
   
   //enter title
   driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Title_Reminder");
   System.out.println("send keys done");
   
   
   //Click the reminder icon on the toolbar to add a reminder for Afternoon of the same day.
      driver.findElementByAccessibilityId("Single-column view").click();
   
   
   //click reminder icon
   driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.ImageView").click();
      
   //creating an array so that i can traverse using index value and click through options having same resource-id
   List<MobileElement> multipleElements = driver.findElementsById("com.google.android.keep:id/spinner_inside_error_state");
   multipleElements.get(0).click();
   System.out.println("Date clicked");
	
   //driver.findElementById("com.google.android.keep:id/reminder_date_today").click();
   //System.out.println("Today selected");
   
   driver.findElementById("com.google.android.keep:id/reminder_date_tomorrow").click();
   System.out.println("Tommorrow selected");
   
 
   
  //To select time as Afternoon
   multipleElements.get(1).click();
   System.out.println("Time clicked");
   driver.findElementById("com.google.android.keep:id/reminder_time_afternoon").click();
   
   driver.findElementById("com.google.android.keep:id/save").click();
   System.out.println("Reminder added");
	
   //press back button
   driver.findElementByAccessibilityId("Open navigation drawer").click();
   
   
   
   //Assertion - Make an assertion to ensure that the note was added with a reminder
   
   List<MobileElement> reminder = driver.findElementsById("com.google.android.keep:id/browse_reminder_chip");
   for (MobileElement e1: reminder) {
   Assert.assertTrue(e1.isDisplayed());
   System.out.println("Reminder displayed as: " + e1.getText());
   }
   
   
   List<MobileElement> note = driver.findElementsById("com.google.android.keep:id/index_note_text_description");
   for (MobileElement e2: note) {
	   Assert.assertTrue(e2.isDisplayed());
	   System.out.println("Note is: " + e2.getText());
      
   }
	   
   }

  
  @AfterTest
  public void tearDown() {
    driver.quit();
  }
}

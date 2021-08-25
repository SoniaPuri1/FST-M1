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


public class googleKeep {

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
 		wait = new WebDriverWait(driver, 100);    
    
  }

  @Test
  public void titleDescTest() {
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/new_note_button"))).click();
     
   // enter description
   wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/edit_note_text")))
   .sendKeys("Description added");
   System.out.println("Description is added");
   
   //enter title
   driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Title1");
   System.out.println("send keys done");
   
   
   //press back button
   driver.findElementByAccessibilityId("Open navigation drawer").click();
   
   //Assertion
   List<MobileElement> note = driver.findElementsById("com.google.android.keep:id/index_note_title");
   for (MobileElement e1: note) {
	   Assert.assertTrue(e1.isDisplayed());
	   System.out.println("Note is: " + e1.getText() + "added successfully.");
      
   }
	   
   }

  
  @AfterTest
  public void tearDown() {
    driver.quit();
  }
}

package seleniumHRMProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {

//	Retrieve emergency contacts
//	Goal: Login and retrieve the emergency contacts for the user
//	a. Open the OrangeHRM page and login with credentials provided
//	b. Navigate to the “My Info” page.
//	c. Locate the left hand menu.
//	d. Click on the “Emergency Contacts” menu item
//	e. Retrieve information about all the contacts listed in the table.
//	f. Print all the information to the console.
//	g. Close the browser.
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
				
		
		driver.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(10);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(10);
		
		WebElement myInfo = driver.findElement(By.xpath("//div[@class='menu']/ul/li[6]/a/b"));
		myInfo.click();
		//myInfo.click();
		Thread.sleep(10);
		System.out.println("My Info is clicked.");
		
		
		WebElement emergency = driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewEmergencyContacts/empNumber/1']"));
		System.out.println("Emergency Contacts is selected");
		emergency.click();
		Thread.sleep(10);
		//emergency.click();
		System.out.println("Emergency Contacts is clicked");
		
		
		//For printing all the rows	
		//Use the td
				List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
				//Number of rows
			    System.out.println(rows.size());
			    
		for(int i = 1; i<=rows.size();i++) {
			WebElement rows1 = driver.findElement(By.xpath("//table[@id='emgcontact_list']/tbody/tr[" +i + "]"));
			System.out.println("Row" + i + ":" + rows1.getText());
		}					
		
		
		driver.close();
	}

}

package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7 {

//	Adding qualifications
//	Goal: Add employee qualifications
//	a. Open the OrangeHRM page and login with credentials provided
//	b. Find the “My Info” menu item and click it.
//	c. On the new page, find the Qualification option on the left side menu and click it
//	d. Add Work Experience and click Save.
//	e. Close the browser.
	
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://alchemy.hguy.co/orangehrm");

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();

		
		WebElement info = driver.findElement(By.id("menu_pim_viewMyDetails"));
		info.click();
		Thread.sleep(20);
		//info.click();
		System.out.println("MyInfo is visible");
	
				
		WebElement qual1 = driver.findElement(By.xpath("//li[9]/a[@href='/orangehrm/symfony/web/index.php/pim/viewQualifications/empNumber/1']"));
		qual1.click();
		System.out.println("Qualifications is clicked");
	
		
		WebElement add = driver.findElement(By.xpath("//div[@class='inner']/form/p/input[@id='addWorkExperience']"));
		add.click();
		System.out.println("Add is clicked");
		
			
		WebElement company =driver.findElement(By.xpath("//div/form[@id='frmWorkExperience']/fieldset/ol/li[1]/input"));
		company.click();
		company.sendKeys("IBM");
				
		WebElement jobTitle = driver.findElement(By.xpath("//div/form[@id='frmWorkExperience']/fieldset/ol/li[2]/input"));
		jobTitle.click();
		jobTitle.sendKeys("Test Specialist");
		
		
		WebElement fromDate =driver.findElement(By.xpath("//div/form[@id='frmWorkExperience']/fieldset/ol/li[3]/input"));
		fromDate.click();
		fromDate.sendKeys("2018-08-12");
		
		//the below line is to get rid of date box which appears after entering fromDate above.
		driver.findElement(By.xpath("//li[5]/label")).click();		
	
		WebElement tillDate = driver.findElement(By.xpath("//div/form[@id='frmWorkExperience']/fieldset/ol/li[4]/input"));
		tillDate.click();
		tillDate.sendKeys("2021-08-05");
		
		driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
		System.out.println("Work experience added");
		
		driver.close();
		
		
	}

}

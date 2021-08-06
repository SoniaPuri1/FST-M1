package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Activity5 {
	
	//Edit user information
	//Goal: Edit a user’s information
	//a. Open the OrangeHRM page and login with credentials provided
	//b. Find the “My Info” menu item and click it.
	//c. On the new page, click the Edit button.
	//d. Fill in the Name, Gender, Nationality, and the DOB fields.
	//e. Click Save.
	//f. Close the browser.


	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		System.out.println("My Info clicked");
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Edit button clicked");
		
		
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Tara");
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Sharma");
		WebElement fRadioButton = driver.findElement(By.id("personal_optGender_2"));
		fRadioButton.click();
		
		System.out.println("Female Radio button clicked: " + fRadioButton.isDisplayed());
				
		Select dropdownNationality = new Select (driver.findElement(By.id("personal_cmbNation")));
		dropdownNationality.selectByVisibleText("Nepalese");
		System.out.println("Nationality selected as Nepalese. ");
		
		WebElement dob = driver.findElement(By.name("personal[DOB]"));
		dob.click();
		dob.clear();
		dob.sendKeys("1990-08-10");
				
		System.out.println("Date of Birth is selected as 10th Aug 1990. ");
		
		
		driver.findElement(By.id("btnSave")).click();
		

//		Select dropdownYear = new Select (driver.findElement(By.className("ui-datepicker-year")));
//		dropdownYear.selectByValue("1990");
//		System.out.println("Year selected as 1990. " );
//		
//		driver.findElement(By.className("ui-datepicker-month")).click();
//		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
//		month.sendKeys("Sep");
//		Thread.sleep(10);
//		System.out.println("Month selected is Sep. " );
//		
//			
//		WebElement date = driver.findElement(By.xpath("//table/tbody/tr/tr/td[contains(@href, '7' ]"));
//		date.sendKeys("10");
//		System.out.println("Date selected as 10");
		
		
		
		driver.close();
		
		
	}

}

package seleniumHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;

public class Activity4 {

	
	//4. Add a new employee
	//Goal: Add an employee and their details to the site
	//a. Open the OrangeHRM page and login with credentials provided
	//b. Find the PIM option in the menu and click it.
	//c. Click the Add button to add a new Employee
	//d. Fill in the required fields and click Save.
	//e. Navigate back to the PIM page (Employee List tab) and verify the creation of your employee.
	//f. Close the browser
	
	
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(20);
			
				
				
		//b. Find the PIM option in the menu and click it.
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(20);
		System.out.println("PIM menu clicked.");
		
		
				
		//c. Click the Add button to add a new Employee
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(20);
		System.out.println("ADD button clicked.");
		
		
		
		
		//d. Fill in the required fields and click Save.
		WebElement fName = driver.findElement(By.id("firstName"));
		WebElement lName = driver.findElement(By.id("lastName"));
		fName.sendKeys("Tapsee");
		lName.sendKeys("Pannu");						
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(20);
		System.out.println("Save button clicked.");
		
		
		//e. Navigate back to the PIM page (Employee List tab) and verify the creation of your employee.
		WebElement empId = driver.findElement(By.id("personal_txtEmployeeId"));
		System.out.println("The empid of the new Employee is: " + empId.getAttribute("value"));
		String empNum = empId.getAttribute("value");
		
		
		WebElement idValidation1 = driver.findElement(By.id("menu_pim_viewPimModule"));
		idValidation1.click();
		WebElement idValidation = driver.findElement(By.name("empsearch[id]"));	
		idValidation.click();
		Thread.sleep(20);
		System.out.println("ID text box clicked.");
		
		idValidation.sendKeys(empNum);
		
		System.out.println("Id entered.");
		
		driver.findElement(By.id("searchBtn")).click();
	
				
		WebElement empId1 = driver.findElement(By.name("chkSelectRow[]"));
		String id = empId1.getAttribute("href");
		System.out.println("Id's match");
		
		Assert.assertEquals(empNum, id);
		
		System.out.println("Id's match");	
		
	}
}

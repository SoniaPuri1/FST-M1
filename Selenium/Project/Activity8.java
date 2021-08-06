package seleniumHRMProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Activity8 {

//	Applying for a leave
//	Goal: Login and apply for a leave on the HRM site
//	a. Open the OrangeHRM page and login with credentials provided
//	b. Navigate to the Dashboard page and click on the Apply Leave option
//	c. Select leave type and duration of the leave.
//	d. Click Apply.
//	e. Navigate to the My Leave page to check the status of the leave application.
//	f. Close the browser
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("http://alchemy.hguy.co/orangehrm");

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();

		
		driver.findElement(By.xpath("//div[@class='menu']/ul/li[8]/a/b")).click();
		System.out.println("Dashboard is clicked.");
		
		
		
		driver.findElement(By.xpath("//div[@class='quickLaunge']/a/span[contains(text(),\"Apply Leave\")]")).click();
		System.out.println("ApplyLeave is clicked.");
		
		
		Select leaveType = new Select(driver.findElement(By.xpath("//select[@name=\"applyleave[txtLeaveType]\"]")));
		leaveType.selectByVisibleText("privilege leaves");
		System.out.println("Leave selected as PL. ");
		
		WebElement fromDate = driver.findElement(By.xpath("//input[@name='applyleave[txtFromDate]']"));
		fromDate.clear();
		fromDate.sendKeys("2021-08-18");
		System.out.println("Start date entered. ");
		
		//for removing the calender pop up
		builder.sendKeys(Keys.ENTER);
		Thread.sleep(10);
		
		WebElement toDate = driver.findElement(By.xpath("//input[@name='applyleave[txtToDate]']"));
		toDate.clear();
		Thread.sleep(10);
		
		toDate.sendKeys("2021-08-22");
		Thread.sleep(20);
		
		System.out.println("End Date entered. ");
		Thread.sleep(20);
		
		builder.sendKeys(Keys.ENTER);
		Thread.sleep(10);
		
		driver.findElement(By.xpath("//input[@id='applyBtn']"));
		Thread.sleep(10);
		builder.sendKeys(Keys.ENTER);
		System.out.println("Apply button clicked ");
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
		List<WebElement> cols = driver.findElements(By.xpath("//div/table[@id='resultTable']/thead/tr/th"));
		System.out.println(cols.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//div/table[@id='resultTable']/tbody/tr"));
		System.out.println(row.size());
	
		for (int i=1; i<=row.size(); i++) {
		WebElement row1 = driver.findElement(By.xpath("//div/table[@id='resultTable']/tbody/tr[" +i + "]"));
		System.out.println("Row" + i + ":" + row1.getText());	
		}
		
	
		driver.close();
		}

}

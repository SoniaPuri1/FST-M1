import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Activity 3
		 * Create a Class with a main() method. Create a WebDriver instance, named
		 * driver, with the FirefoxDriver(). Open a browser with
		 * https://training-support.net/selenium/simple-form Get the title of the page
		 * using driver.getTitle() and print out the title. 
		 * 
		 * Use findElement() with name() to find the text fields - firstname and lastname. Use
		 * WebElement.sendKeys() to type in those text fields. Similarly, find and type
		 * into the email and contact number fields. Finally, submit the form by
		 * clicking the Submit button. Close the browser with driver.close() There is a
		 * way to pause the execution to see the result of the execution -
		 * Thread.sleep(). This is rarely used, as it always force the browser to wait
		 * for a specific time. Thread.sleep() is never a good idea. This is used simply
		 * for you to see the test type in the text field. It should not be used in an
		 * actual test script. When adding Thread.sleep(), make sure the main() function
		 * throws InterruptedException.
		 */
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/simple-form");
		String pagetitle = driver.getTitle();
		System.out.println("The title of the page is: " + pagetitle);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		//Enter text
		firstName.sendKeys("Sonia");
		lastName.sendKeys("Puri");
		
		
		driver.findElement(By.id("email")).sendKeys("Test@example.com");
		driver.findElement(By.id("number")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}

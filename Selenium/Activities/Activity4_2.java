import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Class and a main() method
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		//Open a browser with https://www.training-support.net/selenium/simple-form
		//Get the title of the page using driver.getTitle() and print out the title.
		//Use findElement() with xpath() to find all the input fields on the page.
		//Fill in the details in the fields using the sendKeys() method.
		//Click the submit button at the end of the form to submit the form.
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("The Title is: " + driver.getTitle());
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sonia");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Puri");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@example.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("All the above steps completed.");
		
		driver.close();
		
		
		
		
		
	}

}

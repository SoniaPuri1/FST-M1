import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

//	Create a Class and a main() method
//	Create a WebDriver instance, named driver, with the FirefoxDriver().
//	Open a browser with https://training-support.net/selenium/ajax
//	Get the title of the page using driver.getTitle() and print out the title.
//	Find and click the "Change content" button on the page.
//	Wait for the text to say "HELLO!". Print the message that appears on the page.
//	Wait for the text to change to contain "I'm late!". Print the new message on the page.
//	Finally, close the browser.
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        WebDriver driver = new FirefoxDriver();
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        
		        //Open browser
		        driver.get("https://training-support.net/selenium/ajax");
		        System.out.println("The Title is: " + driver.getTitle());
		        
		       driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
		        	        
		        
		        //Wait for the text to say "HELLO!". Print the message that appears on the page.		    	
		        
		        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		        String helloText = driver.findElement(By.id("ajax-content")).getText();
		        System.out.println(helloText);
		        
		        
		        //Wait for the text to change to contain "I'm late!". Print the new message on the page.
		        
		        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		        String lateText = driver.findElement(By.id("ajax-content")).getText();
		        System.out.println(lateText);
		        
		        driver.close();
		        
	}

}

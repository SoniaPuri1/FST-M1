import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Activity 4-3
		//Create a Class and a main() method
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		//Open a browser with https://www.training-support.net/selenium/target-practice
		//Get the title of the page using driver.getTitle() and print out the title.
		
		//Use findElement() with xpath() to
		//Find the third header on the page.
		//Find the fifth header on the page and get it's 'colour' CSS Property.
		//Find the violet button on the page and print all the class attribute values.
		//Find the grey button on the page with Absolute XPath.
		
	WebDriver driver = new FirefoxDriver ();
	driver.get("https://www.training-support.net/selenium/target-practice");
	System.out.println("The Title is: " + driver.getTitle());
	
	
	  WebElement thirdHeader =  driver.findElement(By.xpath("//h3[@id='third-header']"));
	  System.out.println("The Third Header is: " + thirdHeader.getText());
	  
	  WebElement fifthHeader = driver.findElement(By.xpath("//h5[@class='ui green header']"));
	  System.out.println("The Fifth Header color is: " + fifthHeader.getCssValue("color"));
	  
	  WebElement violetButton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
	  System.out.println("The class attribute values of Violet are: " +	  violetButton.getAttribute("class"));
	 
	  String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
      System.out.println("The grey button's text is: " + greyButton);
	  
      driver.close();
	
	
	}

}

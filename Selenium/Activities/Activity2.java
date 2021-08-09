import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		
		//Open a browser with https://www.training-support.net
		
		driver.get("https://www.training-support.net");
		
		//Get the title of the page using driver.getTitle() and print out the title
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
	
	
		/*Use findElement() with the following locators to find the "About Us" link:
			id()
			className()
			linkText()
			cssSelector()
			//Print the text in the WebElement using the getText() method.
		*/
		
		
		WebElement idLocator= driver.findElement(By.id("about-link"));
		System.out.println("Text in element1: " + idLocator.getText());
		
		WebElement classNameLocator = driver.findElement(By.className("green"));
		System.out.println("Text in element2: " + classNameLocator.getText());
		
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element3: "+ linkTextLocator.getText());
		
		WebElement cssSelectorLocator = driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element4: " + cssSelectorLocator.getText());
		
						
		//Close the browser with driver.close()
	
		driver.close();
		
		
	
	}

}

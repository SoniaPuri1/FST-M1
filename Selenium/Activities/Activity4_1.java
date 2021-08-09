import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Class and a main() method Create a WebDriver instance, named driver,
		 * with the FirefoxDriver(). Open a browser with
		 * https://www.training-support.net 
		 * Get the title of the page using driver.getTitle() and print out the title.
		 * Use findElement() with xpath() to find and click the "About Us" link on the page. 
		 * Print the title of the new page that open when the link is clicked.
		 */
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The Title of the page is: " + title);
		
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		
		System.out.println("The title on the next page is: " + driver.getTitle());
		
		driver.close();
		
		
		
	}

}

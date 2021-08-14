import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Create a Package with a Class and a main() method
//For this activity, import java.util.Set
//Create a WebDriver instance, named driver, with the FirefoxDriver().
//Open a browser with https://www.training-support.net/selenium/tab-opener
//Print the Page Title and Handle of that tab.
//Find the button to open a new tab and click it.
//Wait for the new tab to open.
//Print all the handles.
//Switch to the newly opened tab, print it's title and heading.
//Repeat steps 6-8 by clicking the button on the new tab.
//Finally, close both windows using quit().

//Imp Notes:
//In this activity we use getWindowHandle() and getWindowHandles()
//getWindowHandle() - Returns a string value which is the Window handle of current focused browser window.
//getWindowHandles() - Returns a set of all Window handles of all the browsers that were opened in the session.
//We also use driver.switchTo().activeElement(). This switches focus to the window that was opened most recently.

public class Activity11_4 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        //Open browser
        driver.get("https://www.training-support.net/selenium/tab-opener");

        //Print title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());

        //Get parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        //Find link to open new tab and click it
        driver.findElement(By.linkText("Click Me!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //Get Window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through each handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());

        //Wait for page to load completely
        wait.until(ExpectedConditions.titleIs("Newtab"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());

        //Get heading on new page
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        //Open Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        //Make sure the new tab's handle is part of the handles set
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());

        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());

        //Get heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        //Close the browser
        driver.quit();
    }
}
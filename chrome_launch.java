package Selenium_Practice.Selenium_Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_launch {
	
	WebDriver driver;
	WebElement element;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test()
	public void webDriverManagerChrome() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
    	driver.get("https://www.vipcars.com/");
    	Thread.sleep(4000);    	
    	driver.findElement(By.id("suggest_pickup")).sendKeys("Dubai");
    	Thread.sleep(4000);
    	driver.findElement(By.id("loc_701")).click();
    	
    	driver.findElement(By.id("pickdate")).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(By.xpath("//*[contains(@data-value,'1716186600')]")).click();
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[contains(@data-value,'1716618600')]")).click();
    	
    	
    	
       // driver.findElement(By.xpath("//*[@id=\"vc-form\"]/div[1]/div[1]/div/h1/strong")).click();
    	//Thread.sleep(2000);
    	
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,200)");
         Thread.sleep(2000);
         
         driver.findElement(By.id("time_pickup")).click();
        
         js.executeScript("window.scrollBy(0,200)");
         driver.findElement(By.xpath("//*[@id=\"time_dropoff\"]/option[24]")).click();
         
         driver.findElement(By.id("time_dropoff")).click();
         driver.findElement(By.xpath("//*[@id=\"time_dropoff\"]/option[19]")).click();
      
    	driver.findElement(By.xpath("//*[@id=\"sc-box\"]/div/form/div/div[9]/input")).click();
    	
    
        
        Thread.sleep(15000);
	
          js.executeScript("window.scrollBy(0,400)");
          Thread.sleep(3000);
          
         driver.findElement(By.xpath("//*[@id=\"select_btn_12017059\"]")).click();
         String currentHandle = driver.getWindowHandle();
         driver.switchTo().window(currentHandle);
         
       //  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

         // Switch to new tab
        // driver.switchTo().window(tabs.get(1));
         
         
         Thread.sleep(15000);
         
         // Now, you are in the new tab, you can perform actions on the car-related details page
         // For example, scrolling and interacting with elements
         
         // Scroll down
        // js.executeScript("scrollBy(0, 1000)");
         //Thread.sleep(2000);
         
         // Interact with elements on the car-related details page
         // For example, clicking on a button or filling out a form
         
         // After performing actions, close the new tab and switch back to the main window
        // driver.close();
       // driver.switchTo().window(mainWindowHandle);
         
       //  driver.navigate().refresh();
         Thread.sleep(1000);
         
         
         js.executeScript("scrollBy(0, 1000)");  
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//*[@id=\"scv-book_protection\"]/div[2]/div[3]/div[1]/label/strong")).click();
         Thread.sleep(2000);
         
         js.executeScript("scrollBy(0, 300)"); 
         driver.findElement(By.xpath("//*[@id=\"scv-book_protection\"]/div[2]/div/div[2]/div[1]/label")).click();
         
         Thread.sleep(2000);
         js.executeScript("scrollBy(0, 600)");
         driver.findElement(By.xpath("//*[@id=\"book_first_name\"]")).sendKeys("XYZ");
         driver.findElement(By.xpath("//*[@id=\"book_last_name\"]")).sendKeys("XYZ");
         driver.findElement(By.xpath("//*[@id=\"book_email_name\"]")).sendKeys("shalandra.kumar@top-ranks.net");
         driver.findElement(By.xpath("//*[@id=\"book_phone_name\"]")).sendKeys("11111");
         
         Thread.sleep(2000);
         js.executeScript("scrollBy(0, 600)");
         driver.findElement(By.xpath("//*[@id=\"book_tnc_box\"]/label/i")).click();	
	
	
	}	
	
	
	
}
    	
    	

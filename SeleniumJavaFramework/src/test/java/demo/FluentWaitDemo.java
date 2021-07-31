package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;


public class FluentWaitDemo {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https:/google.com");
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("q")).submit();
		
		
		//driver.findElement(By.linkText("ABCD Pediatrics")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement =driver.findElement(By.xpath("//*/text()[normalize-space(.)='ABCD Study']/parent::*"));
		       
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element found !!!!");
		    	   
		       }
		       return linkElement;
		     }
		   });
		   
		   element.click();

	
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		driver.close();
	}
}

package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	
	public static void main(String[] args) {
		SeleniumWaits();
		
	}
	
	public static void SeleniumWaits() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("q")).submit();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		
	}

}

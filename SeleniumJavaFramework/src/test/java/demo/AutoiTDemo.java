package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoiTDemo {
	
	
	public static void main(String[] args) {
		
		test();
		
	}
	
	
	public static void test() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://encodable.com/uploaddemo/");
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("file_upload")));
		
		driver.findElement(By.id("uploadname1")).click();
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\mega-pc\\Documents\\Autoit\\FileUploadScript.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
		
	}

}

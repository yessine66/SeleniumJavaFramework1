package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920,1080");
		
		WebDriver driver = new FirefoxDriver(options);
		

		
		
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("q")).submit();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.close();
		System.out.println("Completed !!");
		
		
	}

}

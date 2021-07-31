package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserDemo {
	
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println(" Browser name is "+browserName+"  Thread id is : "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\iedriver\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		
	}

	
	@Test
	private void test1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://google.com");

		Thread.sleep(4000);
	}
	
	
	@AfterTest
	private void teardown() {
		// TODO Auto-generated method stub
		
		driver.close();
		System.out.println("Test Completed Successfully");

	}
}

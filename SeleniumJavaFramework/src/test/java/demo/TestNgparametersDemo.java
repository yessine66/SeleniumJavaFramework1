package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgparametersDemo {
	
	
	@Test
	@Parameters({"Myname"})
	public void test(@Optional("option") String name) {
		
		System.out.println("Name is : "+name);
		
	}

}

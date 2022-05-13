package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Annotation {
	
	@BeforeMethod
	public void enterAppURL() {
		System.out.println("App URL is entered");
	}
	
	@Test
	public void verifyLogin() {
		System.out.println("Succesfully Login");
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the Application");
	}
	
	@Test
	public void creattask() {
		System.out.println("creat task succesfully");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Browser is opened");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}

}

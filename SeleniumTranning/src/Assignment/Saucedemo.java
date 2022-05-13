package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Saucedemo {
	
	@Test
	public void demoValidation() {
		
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://www.saucedemo.com/");

	    String login_credentials = driver.findElement(By.id("login_credentials")).getText();
		
		String username[]=login_credentials.split("\n");
		
		String login_password = driver.findElement(By.className("login_password")).getText();
				
		String password[] = login_password.split("\n");
		
		driver.findElement(By.cssSelector("input[name=\"user-name\"]")).sendKeys(username[1]);
		
		driver.findElement(By.id("password")).sendKeys(password[1]);
		
		driver.findElement(By.id("login-button")).click();
	}

}

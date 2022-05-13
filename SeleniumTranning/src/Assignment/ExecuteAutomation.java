package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		
		
		

	}

}

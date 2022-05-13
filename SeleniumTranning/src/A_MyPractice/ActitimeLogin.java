package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameinput=driver.findElement(By.id("username"));
		usernameinput.sendKeys("admin");
		
		WebElement passfield = driver.findElement(By.name("pwd"));
		passfield.sendKeys("manager");
		
		WebElement Loginbutton = driver.findElement(By.id("loginButton"));
		Loginbutton.click();

	}

}

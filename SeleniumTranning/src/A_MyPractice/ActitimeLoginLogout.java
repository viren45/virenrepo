package A_MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		
		String expectedTitle = "actiTIME - Login";
		
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login page opened succesfully");
		}
		else {
			System.out.println("Either login page not opened or page title got changed");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click(); 
		
		driver.findElement(By.id("logoutLink")).click();
		
		//driver.close();
		
		
	}

}

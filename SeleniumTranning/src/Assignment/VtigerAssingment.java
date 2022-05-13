package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerAssingment {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://vtiger-demo.it-solutions4you.com/");
		
		driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("username")).sendKeys("standarduser");
		
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("standarduser");
		
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.className("fa-user")).click();

		WebElement logoutButton=driver.findElement(By.className("pull-right"));
		
        WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	}

}

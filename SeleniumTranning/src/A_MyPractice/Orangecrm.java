package A_MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangecrm {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String cred=driver.findElement(By.tagName("span")).getText();
		
		System.out.println(cred);
		
		String []logindetails=cred.split(" ");
		
		driver.findElement(By.id("txtUsername")).sendKeys(logindetails[3]);
		
		driver.findElement(By.id("txtPassword")).sendKeys(logindetails[7]);
		
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}

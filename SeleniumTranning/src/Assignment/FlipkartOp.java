package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartOp {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.className(".VJZDxU")).sendKeys("8668564100");
		
		//driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		//driver.findElement(By.id("container")).click();
		
		driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).sendKeys("8668564100");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("8975050356");
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")).click();
		
		driver.findElement(By.cssSelector("img._396cs4._3exPp9w")).click();
		
		
	}
	
}	
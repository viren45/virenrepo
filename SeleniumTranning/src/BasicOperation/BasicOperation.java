package BasicOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	    
	    //driver.findElement(By.className("s-suggestion-container")).click();
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    driver.findElement(By.className("_bXVsd_tint_M0L-m")).click();

	}

}

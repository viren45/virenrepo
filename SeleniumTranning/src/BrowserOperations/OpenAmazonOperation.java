package BrowserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonOperation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver v1 = new ChromeDriver();
		
		v1.manage().window().maximize();
		
		v1.get("https://www.amazon.in/");
		
		String sourceCode=v1.getPageSource();
		
		System.out.println("Source code length: "+sourceCode.length());
		
		String expectedTitle="Amazon";
		String actualTitle=v1.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("Login page opened sucessfully...");
		}
		else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		v1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		v1.findElement(By.id("Mobile")).click(); //0-30
	}

		
	}

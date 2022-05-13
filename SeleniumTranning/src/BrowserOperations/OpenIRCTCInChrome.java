package BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenIRCTCInChrome {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver v1 = new ChromeDriver();
		
		v1.get("https://www.irctc.co.in/");
		
		String sourceCode=v1.getPageSource();
		
		System.out.println("Source code length: "+sourceCode.length());
		
		
		String expectedTitle="IRCTC - Login";
		String actualTitle=v1.getTitle();//0-30
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		//identify the required element from the UI and perform reqiored action 0-30
		v1.findElement(By.id("username")).sendKeys("vp0045");
		//identify the required element from the UI and perform reqiored action 0-30
		v1.findElement(By.name("pwd")).sendKeys("Vp00452406");
		//identify the required element from the UI and perform reqiored action
		v1.findElement(By.id("loginButton")).click(); //0-30
		
		//driver.findElement(By.linkText("Logout")).click(); //0-30
		//v1.findElement(By.id("logoutLink")).click();
		//close browser
		//driver.close();
	}

		
	}



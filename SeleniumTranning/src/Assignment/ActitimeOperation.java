package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeOperation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		driver.getTitle();
		String titleCode = driver.getTitle();
		System.out.println("Title Lenght is: "+titleCode.length());
		
		String sourceCode = driver.getPageSource();
		System.out.println("Page SourceCode Lenght is: "+sourceCode.length());
		
		driver.getCurrentUrl();
		System.out.println("Current page URL: "+driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().equals("https://demo.actitime.com/")) {
		System.out.println("page is matched or its verify");

	   }else {
		
		System.out.println("page is not matched or its not verify");
		
		driver.close(); 
		

		
	}

}
}

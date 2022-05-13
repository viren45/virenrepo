package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenVtiger {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver v1 = new ChromeDriver();
		
		v1.manage().window().maximize();
		
		v1.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		String sourceCode=v1.getPageSource();
		
		System.out.println("Source code length: "+sourceCode.length());
		
	    
	}

}

package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
	
	String driverPath=System.getProperty("user.dir")+ "\\executables\\geckodriver.exe";
	
	System.setProperty("webdriver.gecko.driver", driverPath);
	
	WebDriver driver = new FirefoxDriver();

	}


}

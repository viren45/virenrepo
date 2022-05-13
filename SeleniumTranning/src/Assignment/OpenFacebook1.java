package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFacebook1 {

	public static void main(String[] args) {
		String geckoDriverPath= System.getProperty("user.dir")+ "\\executables\\geckodriver.exe";	
		String chromeDriverPath= System.getProperty("user.dir")+ "\\executables\\chromedriver.exe";
		openBrowser(geckoDriverPath, "firefox");
		openBrowser(chromeDriverPath, "chrome");
		}
		
		static void openBrowser(String driverPath,String browserName) {
			
			if(browserName.equalsIgnoreCase("Chrome")) {
				//step1: set driver executable path by using System.setProperty(String  key , String value)
				System.setProperty("webdriver.chrome.driver", driverPath);
				//step2: create an instance(non static) of chrome Browser 
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.Facebook.com");
			}
				else if (browserName.equalsIgnoreCase("firefox")) {
				//step1: set driver executable path by using System.setProperty(String  key , String value)	
				System.setProperty("webdriver.gecko.driver", driverPath);
				//step2: create an instance(non static) of Firefox Browser 
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.Facebook.com");
				}
			}
}
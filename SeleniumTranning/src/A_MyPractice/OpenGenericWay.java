package A_MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGenericWay {

	public static void main(String[] args) {
	
		String chromeDriverpath = System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		String geckoDriverpath = System.getProperty("user.dir")+".\\executables\\geckodriver.exe";
		openBrowser(chromeDriverpath, "chrome");
		openBrowser(geckoDriverpath, "firefox");
				

	}

	private static void openBrowser(String Driverpath, String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", Driverpath);
			
			WebDriver d1 = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", Driverpath);
			
			WebDriver d1 = new FirefoxDriver();
			
		}
		
	}

}

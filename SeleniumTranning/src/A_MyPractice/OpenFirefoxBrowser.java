package A_MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver d1 = new FirefoxDriver();
		

	}

}

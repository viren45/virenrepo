package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("get Title: "+driver.getTitle());
		
		if (driver.getTitle().equals("Facebook")) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		driver.close();

	}

}

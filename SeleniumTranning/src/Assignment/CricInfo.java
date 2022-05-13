package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		List<WebElement> option=driver.findElements(By.cssSelector("div.ds-flex.ds-flex-row.ds-items-center.ds-justify-start>div>div.ds-flex.ds-flex-row"));
		
		System.out.println("Option Count: "+option.size());
		
		for(int i=0; i<option.size(); i++) {
			
			System.out.println("All option print: "+option.get(i).getText());
		}
		driver.close();
		
		

	}

}

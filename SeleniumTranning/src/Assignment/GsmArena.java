package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> allMobile = driver.findElements(By.cssSelector(".brandmenu-v2>ul"));
		
		System.out.println("Print all Phone count: "+allMobile.size());
		
		for(int j=0; j<allMobile.size(); j++) {
			
			System.out.println("all brand name " + j + ":" +allMobile.get(j).getText());
		}
		
		List<WebElement> allPhoneName = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li"));
				
	    System.out.println("Print All Phone Name: "+allPhoneName.size());		
		
		driver.findElement(By.cssSelector(".sidebar.col.left>div>ul>li:nth-child(1)")).click();
		
		List<WebElement> allOption=driver.findElements(By.cssSelector(".makers>ul>li"));
		
		System.out.println("Print count of Samsung Phones: "+allOption.size());
		
		for (int i=1; i<allOption.size(); i++) {
			
			System.out.println("Option "+i+": "+allOption.get(i).getText());
						
			}	
		driver.close();
	}
}	
		




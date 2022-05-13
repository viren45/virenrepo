package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GSMArenaPagination {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		driver.findElement(By.cssSelector(".sidebar.col.left>div>ul>li:nth-child(1)")).click();
		
		List<WebElement>pagination =driver.findElements(By.cssSelector("div.nav-pages>a"));
		
		System.out.println("Page count: "+pagination.size());
		
		for(int i=0; i<pagination.size(); i++) {
			
			pagination.get(i).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElements(By.cssSelector("div.nav-pages>a"));
			
		}
		

	}

}

package A_MyPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		WebDriverWait wait = new WebDriverWait (driver,20);
		
		WebElement dropdown=driver.findElement(By.cssSelector("button[id*=\"bsd1-button\"]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		
		dropdown.click();
		
		List<WebElement> option=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a "));
		
		System.out.println("option count: "+option.size());
		
		for(int i=0; i<option.size();i++) {
		
			System.out.println(option.get(i).getText());

	}
		option.get(2).click();

}
}

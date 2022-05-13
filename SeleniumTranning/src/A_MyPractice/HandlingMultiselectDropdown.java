package A_MyPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		//**** Idetify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		Select selectcar = new Select(carDropdown);
		
		System.out.println("is Multiple or not: "+selectcar.isMultiple());
		
		List<WebElement> option = selectcar.getOptions();
		
		System.out.println("option count is: "+option.size());
		
		//Get dropdown option names
		
		for(int i=1; i<option.size(); i++) {
			
			System.out.println("option: "+i+ ":" +option.get(i).getText());
			
		}
		selectcar.selectByIndex(0);
		selectcar.selectByIndex(1);
		selectcar.selectByIndex(2);
		selectcar.selectByIndex(3);
		
		List<WebElement> selectcs=selectcar.getAllSelectedOptions();
		System.out.println("selected option: "+selectcs.size());
		
		selectcar.deselectAll();
		

}
	
}

package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class JqueryAssignment {

	public static void main(String[] args) {
	
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Sortable\"]")).click();
		
		//List<WebElement> frames = driver.findElements(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(0);
		
		List<WebElement> option = driver.findElements(By.id("sortable"));
		
		System.out.println("option count: " + option.size());
		
		for(int i=0; i<option.size(); i++) {
			
			System.out.println("all option count : "+option.get(i).getText());
			
			Actions act = new Actions(driver);
			
			WebElement first = driver.findElement(By.cssSelector("ul#sortable>li:nth-of-type(1)"));
			
			WebElement second = driver.findElement(By.cssSelector("ul#sortable>li:nth-of-type(2)"));
			
			act.dragAndDrop(first, second).build().perform();
		}

	}

}

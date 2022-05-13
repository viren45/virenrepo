package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class RedbusPractice {

	public static void main(String[] args) {
	
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver =s1.setUp("chrome", "https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("input[id=\"src\"]")).sendKeys("raver");

		driver.findElement(By.cssSelector("li[select-id=\"results[0]\"]")).click();
		
		Actions act = new Actions(driver);
		
		
	}

}

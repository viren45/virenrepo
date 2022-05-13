package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOperation {

	public static void main(String[] args) {
	
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		
		username.sendKeys("admin");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement lastname =driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		
		act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}

package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyBoardOpration {

	public static void main(String[] args) {
		
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		
		FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		
		FirstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}

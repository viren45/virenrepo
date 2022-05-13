package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class cssAtributeValidation {

	public static void main(String[] args) {
	
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "http://vtiger-demo.it-solutions4you.com/");
		
		WebElement SignInButton =driver.findElement(By.cssSelector("button.button.buttonBlue"));
		
		String fontSize = SignInButton.getCssValue("font-size");
		
		String fontColor = SignInButton.getCssValue("color");
		
		String fontBackgraoundColor = SignInButton.getCssValue("background-image");
		
		System.out.println("Font Size : "+fontSize);
		
		System.out.println("Font Color : "+fontColor);
		
		System.out.println("Font Backgraound Color : "+fontBackgraoundColor);
		
		driver.close();

	}

}

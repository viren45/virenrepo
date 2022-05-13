package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class RedBusCalenderHandling {

	public static void main(String[] args) {
		
		SeleniumUtility v1 = new SeleniumUtility();
		
		WebDriver driver = v1.setUp("chrome","https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("#src:nth-of-type(1)")).sendKeys("Jalgaon");
		
		driver.findElement(By.cssSelector(".autoFill.homeSearch>li:nth-of-type(1)")).click();
		
		driver.findElement(By.cssSelector("#dest:nth-of-type(1)")).sendKeys("Pune");
		
		driver.findElement(By.cssSelector(".autoFill.homeSearch>li:nth-of-type(1)")).click();
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.cssSelector("td.next>button")).click();
		
		driver.findElement(By.cssSelector("tr:nth-of-type(4)>td:nth-of-type(2)")).click();
		
		driver.findElement(By.cssSelector("button#search_btn")).click();
		
		driver.findElement(By.cssSelector("label[for=\"dtAfter 6 pm\"]")).click();
		
		driver.findElement(By.cssSelector("label[for=\"bt_AC\"]")).click();
		
		WebElement tr=driver.findElement(By.cssSelector("div.travels"));
		
		WebElement pr=driver.findElement(By.cssSelector(".column-seven span"));
		
		System.out.println("Travel Name :" + tr.getText() + "\nPrice :" + pr.getText());
		
		driver.close();
		
		
	}

}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class ActiTimeValidation {

	public static void main(String[] args) {
	
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.className("addNewButton")).click();
		
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
		
		driver.findElement(By.cssSelector("div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div>div")).click();

		
	}

}

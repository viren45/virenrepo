package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example4 extends SeleniumUtility{
  @Test(description= "The Test Case is passed...")
  public void jqueryOpration() {
	  SeleniumUtility s1 = new SeleniumUtility();
	  
	  WebDriver driver = s1.setUp("firefox", "https://jqueryui.com/");
	  
	  driver.findElement(By.xpath("//a[text()=\"Sortable\"]")).click();
	  
	  driver.switchTo().frame(0);
	  
	  Actions act = new Actions(driver);
	  
	  WebElement dragsevenfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropfirsttfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(1)"));
	  
	  act.dragAndDrop(dragsevenfild, dropfirsttfild).build().perform();
	  
	  WebElement dragsexfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropsecondtfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(2)"));
	  
	  act.dragAndDrop(dragsexfild, dropsecondtfild).build().perform();
	  
	  WebElement dragfithfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropthirdtfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(3)"));
	  
	  act.dragAndDrop(dragfithfild, dropthirdtfild).build().perform();
	  
	  WebElement dragfouthfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropfouthfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(4)"));
	  
	  act.dragAndDrop(dragfouthfild, dropfouthfild).build().perform();
	  
	  WebElement dragfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(5)"));
	  
	  act.dragAndDrop(dragfild, dropfild).build().perform();
	  
	  WebElement dragsfild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(7)"));
	  WebElement dropffild=driver.findElement(By.cssSelector("ul[id=\"sortable\"]>li:nth-of-type(6)"));
	  
	  act.dragAndDrop(dragsfild, dropffild).build().perform();
	  
  }
}

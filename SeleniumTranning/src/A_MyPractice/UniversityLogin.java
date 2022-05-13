package A_MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UniversityLogin {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	
	WebDriver v1 = new ChromeDriver();
	
	v1.manage().window().maximize();
	
	v1.get("https://piexamresult.unipune.ac.in/");
	
	v1.findElement(By.id("txtPRN")).sendKeys("2052009745");
	
	v1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	new WebDriverWait(v1, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/Content/Scripts/alertify.min.js')]")));

	v1.findElement(By.id("btnLogin")).click(); //0-30
	
	//driver.findElement(By.linkText("Logout")).click(); //0-30
	//v1.findElement(By.id("logoutLink")).click();
	//close browser
	//driver.close();
	
	
}

	
}

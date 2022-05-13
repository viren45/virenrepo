package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Page validation: "+driver.getTitle());
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		List<WebElement> allOption=driver.findElements(By.cssSelector("._331-kn._2tvxW>div>div div.eFQ30H"));
		
		System.out.println("Total find Element: "+allOption.size());
		
		for (int i = 0; i < allOption.size(); i++) {

			WebElement option = allOption.get(i);

			String name = option.getText();

			System.out.println("option Name: " + name);

			if (name.equals("Electronics")) {
				System.out.println("Element Matched");
				option.click();
				//break;

			} else {
				System.out.println("did not matched...");
			}
		}
		driver.close();
		

	}

	}

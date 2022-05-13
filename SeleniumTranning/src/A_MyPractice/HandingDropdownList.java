package A_MyPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandingDropdownList {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".//executables//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectskill = new Select(skillDropdown);
		
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Selected dropdown multiselect or not: "+selectskill.isMultiple());
		
		//**** get default or already select option
				//WebElement selectedOption=selectSkill.getFirstSelectedOption();
				//String selectedOptionName=selectedOption.getText();
				//System.out.println("Already selected option name: "+selectedOptionName);
							//or
		System.out.println("get already selected option: "+selectskill.getFirstSelectedOption().getText());
		
		//get option count
		List<WebElement> option=selectskill.getOptions();
		System.out.println("option count: "+option.size());
		
		for(int i=0; i<option.size(); i++) {
			System.out.println("Option "+i+": "+option.get(i).getText());
		}
		//select options from dropdown
		selectskill.selectByIndex(4);
		
		selectskill.selectByValue("AutoCAD");
		
		selectskill.selectByVisibleText("Backup Management");

	}

}

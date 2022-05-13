package A_MyPractice;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class IMPVtigerAssignment {

	public static void main(String[] args) {
		
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://demo7.vtexperts.com/vtigercrm7demo/");
		
		

	}

}

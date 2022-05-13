package A_MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com/");
		
		String sourceCode = d1.getPageSource();
		
		System.out.println("Aplication source code: "+sourceCode);
		System.out.println("Aplication source code: "+sourceCode.length());
		
		System.out.println("Aplication source code: "+d1.getCurrentUrl());
		System.out.println("Aplication source code: "+d1.getTitle());
		if(d1.getTitle().equals("Google")) {
			System.out.println("Google search page opened successfully");
		}else {
			System.out.println("Either google search page not opened or its title is changed");
		}
		
		//d1.close();

	}

}

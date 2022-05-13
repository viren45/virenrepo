package A_MyPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	
		String path1 = "E:\\java workspace\\SeleniumTranning\\executables\\chromedriver.exe";
		
		String path2 = ".\\executables\\chromedriver.exe";
		
		String path3 = System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path3);
		
		ChromeDriver cdriver=new ChromeDriver();

	}

}

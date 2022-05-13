import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// Absolute path
		String filePath = System.getProperty("user.dir") + "\\MyData\\ReadMyData.properties";
		System.out.println("Current Dir: " + filePath);
		// file location and filename
		// Absolute path
		FileInputStream fis = new FileInputStream("E:\\java workspace\\newproject\\src\\MyData\\ReadMyData.properties");
				
		// or
		//FileInputStream fis1 = new FileInputStream(filePath);
		// or relative path
		FileInputStream fis2 = new FileInputStream(".\\MyData\\ReadMyData.properties");

		// Create an instance of Properties class
		Properties prop = new Properties();

		// load property file using load() of properties class
		prop.load(fis2);
		
		//read data from property file using getProperty(string key)
		System.out.println("First Name: "+prop.getProperty("MyName"));
		System.out.println("Last Name: "+prop.getProperty("MyAge"));
		System.out.println("Email ID: "+prop.getProperty("MyEmailId"));
		System.out.println("Mobile: "+prop.getProperty("MyMobile"));

	}

}
package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfigExample {	
	
	static WebDriver driver;	
	static Properties properties;
	
	public Properties loadPropertyFile() throws IOException{
		
		  FileInputStream stream=new FileInputStream("config.properties");
		  Properties properties=new Properties();
		  properties.load(stream);
		  return properties;
	}
	@Test()
	public void launchBrowser() throws IOException{
		loadPropertyFile();
	 String browser=properties.getProperty("chrome");
	 String driverLocation=properties.getProperty("DriverLocation");
	 
	   if(browser.equalsIgnoreCase("chrome")){
	 	  System.setProperty("webdriver.chrome.driver",driverLocation );
	 	  driver= new ChromeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox")){
	 	  System.setProperty("webdriver.gecko.driver",driverLocation );
	 	//  driver= new FireFoxDriver();

	  }
	   
	   driver.get("http://www.google.co.in");
}
}

package listeners;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.io.*;
import org.openqa.selenium.chrome.*;


public class DemoForAncortag {
	
	public static void main(String[] args){
		 
	 
		 public static getLoadedData(WebDriver driver) {
		        
		     
	    
	      
	        
	        //Setting webdriver.gecko.driver property
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1.exe");
	        
	        //Instantiating driver object and launching browser
	        driver = new ChromeDriver();
	        
	        //Using get() method to open a webpage
	        driver.get("https://www.testdome.com/resources/media?name=cb8dcf4b-73ba-4ca3-aff4-7ba19d9a6a08/example_case.txt");
	        
	        driver.findElement(By.id("load-button")).click();
	   
	
	
	    
	        //Closing the browser
	       // driver.quit();

}
}
}
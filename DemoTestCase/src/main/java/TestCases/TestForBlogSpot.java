package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.BlogspotExample;
import PageObjects.Login_Poge_object;

public class TestForBlogSpot {
	
 WebDriver driver;
  static Logger logger=Logger.getLogger("log4j.properties"); 
	 @BeforeSuite
	   public void launchBrowser()  { 
  	   PropertyConfigurator.configure("log4j.properties");
	 	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://testautomationpractice.blogspot.com/");
		   driver.manage().window().maximize();
		  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   logger.info("Chrome launched successed");
	 }
	 @Test(priority=0)
	 public void window()
	 {
		 PageFactory.initElements(driver,BlogspotExample.class);
		 BlogspotExample.newWindow.sendKeys("Trichy"+Keys.ENTER);
		 Actions actions=new  Actions(driver);
			WebElement search=BlogspotExample.search;
			actions.moveToElement(search);
			actions.click().build().perform();
	
	 }
}

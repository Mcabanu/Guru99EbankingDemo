package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import PageObjects.IteraPOM;

public class IteraForm {

 WebDriver driver;

 static Logger logger=Logger.getLogger(IteraForm.class);
 

   @BeforeSuite
   public void OpenBrowser(){
	   
   PropertyConfigurator.configure("log4j.properties");
   
   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://itera-qa.azurewebsites.net/home/automation");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
   logger.info("Chrome opened Sucessfully");
}
   
   @Test(priority=0)
   public void TextArea(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   IteraPOM.name.sendKeys("Teddy");
	   IteraPOM.phone.sendKeys("7246057479");
	   IteraPOM.email.sendKeys("dearstud2gmail.com");
	   IteraPOM.password.sendKeys("hello");
	   IteraPOM.address.sendKeys("3-5c,green street,chennai");
	   IteraPOM.submit.click();
	   
	   logger.info("TextArea filled Sucessfully");
   } 
 
   @Test(priority=1)
   public void CheckBox(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   IteraPOM.gender.click();
	   logger.info("Checkbox filled Sucessfully");
   }
   
   @Test(priority=2)
   public void RadioButton(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   IteraPOM.day1.click();
	   
	   IteraPOM.day2.click();
	   logger.info("Radio Button Clicked Sucessfully");
   }
   
   @Test(priority=3)
   public void DropDown(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   Select selectDrop=new Select (IteraPOM.dropdown);
	   selectDrop.selectByValue("1");
	   logger.info("Dropdown choosed Sucessfully");
   }
   
   @Test(priority=4)
   public void CheckxPath(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   IteraPOM.experience.click();
	   logger.info("Checkbox filled Sucessfully");
   }
   @Test(priority=5)
   public void RadioxPath(){
	   PageFactory.initElements(driver,IteraPOM.class);
	   IteraPOM.usetools1.click();
	   IteraPOM.usetools2.click();
	   logger.info("Radiobutton clicked Sucessfully");
   }
   
  @Test(priority=6)
   public void FileLoad() throws AWTException, InterruptedException {
	
	  WebElement uploadfile = driver.findElement(By.xpath("//*[@id='inputGroupFile02']"));
	  
	   Actions actions=new  Actions(driver);
		actions.moveToElement(uploadfile);
		actions.click().build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
        String file="C:\\Users\\NAZEER\\Downloads\\intvq.txt";
		StringSelection selection=new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Thread.sleep(3000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
       
	   logger.info("File loaded Sucessfully");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
   }
  
   @AfterSuite
   public void closeBrowser(){
	   driver.close();
	   logger.info("browser closed successfully");
   }
   
}
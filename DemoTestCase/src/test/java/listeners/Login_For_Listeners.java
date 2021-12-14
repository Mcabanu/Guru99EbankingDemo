package listeners;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Login_Poge_object;
import TestCases.LoginExample;

public class Login_For_Listeners {

	WebDriver driver;
	 static Logger logger=Logger.getLogger(LoginExample.class);
	 
	       @BeforeSuite()
		   public void launchBrowser()  { 
	    	   PropertyConfigurator.configure("log4j.properties");
		 	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			   driver = new ChromeDriver();
			   driver.get("https://opensource-demo.orangehrmlive.com/");
			   driver.manage().window().maximize();
			  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   logger.info("Chrome launched successed");
		}	
		
			public void Login(){
		     PageFactory.initElements(driver,Login_Poge_object.class);
		     Login_Poge_object.username.sendKeys("Admin");
		     Login_Poge_object.password.sendKeys("admin123");
		     Login_Poge_object.submit.click();
			 logger.info("login successed");
		
		}
			public void DashBoard(){
			     PageFactory.initElements(driver,Login_Poge_object.class);
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 String actualMessage=Login_Poge_object.LeaveRequest.getText();
				 //Assert.assertNotEquals(actualMessage, "No Records are Available");
				 logger.fatal("THE MESSAGE IS :" + actualMessage);
				 logger.info("DashBoard Viewed Successfully");
				
			    }
			
			public void RecuirementView(){
				PageFactory.initElements(driver,Login_Poge_object.class);
				Login_Poge_object.recuirement.click();
				 Actions actions=new  Actions(driver);
					WebElement vacancies=Login_Poge_object.vacancies;
					actions.moveToElement(vacancies);
					actions.click().build().perform();
					logger.info("Click the Recuriement");
				
				Select selectJob=new Select(Login_Poge_object.jobTittle);
				selectJob.selectByVisibleText("QA Lead");
				logger.info("Job Selected");
				
				Select selectVacancy=new Select(Login_Poge_object.vacancy);
				selectVacancy.selectByVisibleText("All");
				logger.info("Vacancy Selected");
				
				Select selectHM=new Select(Login_Poge_object.HiringManager);
				selectHM.selectByVisibleText("All");
				logger.info("HiringManager Selected");
				
				Select selectStatus=new Select(Login_Poge_object.status);
				selectStatus.selectByVisibleText("Active");
				logger.info("Status Selected");
			
				Login_Poge_object.search.click();
				logger.info("Search Successfully Completed");
			
			}
		
			public void Validate(){
				PageFactory.initElements(driver,Login_Poge_object.class);
				String actualResult1=Login_Poge_object.result1.getText();
				Assert.assertEquals(actualResult1,"QA Lead");
				logger.info("Job is Find Successfully");
				logger.fatal("JOB IS :" + actualResult1);
				String actualResult2=Login_Poge_object.result2.getText();
				Assert.assertEquals(actualResult2,"Active");
				logger.info("Status is Find Successfully");
				logger.fatal("STATUS IS :" + actualResult2);
			}
			@Test()
			public void OrangeHRMTest()
			{
				Login();
				DashBoard();
				RecuirementView();
				Validate();
			}
			
		   @AfterSuite()
	       public void closeBrowser(){
		     driver.quit();
		     logger.info("Browser closed");
		
		}
		
		 
	}


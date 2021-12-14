package Testcases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.AddAccount;
import Pageobjects.LoginPage;

public class TestCases_003 extends BaseClass {
	
	@Test
	public void AddNewAccount() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username Success");
		lp.setPassword(password);
		logger.info("password success");
		
		lp.clickSubmit();
		logger.info("login success");
		Thread.sleep(3000);
		
		AddAccount aac=new AddAccount(driver);
		aac.NewAccount();
		logger.info("New Account Open Page");
		
		
		aac.CustomerID("10607");
	logger.info("CustomerID Added Successfully");
		
		aac.AccountType("Current");
		logger.info("Savings Account is Selected");
		
		aac.initialDeposite("50000");
		logger.info("initial Amount is given");
		
		aac.Submit();
		logger.info("Submit the form");
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.info("Account created Failed");
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("Account Created success");
		}
		Thread.sleep(3000);
		
		aac.clickLogout();
		logger.info("Logout Success");
		
		
	}
	
	

	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
		return true;
		}
		catch (NoAlertPresentException e) 
		{
		return false;
		}
	}
	

}

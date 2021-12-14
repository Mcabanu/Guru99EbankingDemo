package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.LoginPage;


public class TestCases_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);	
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test failed");
			
		}
		
		
		lp.clickLogout();
		logger.info("logout Sucessed");

	}


}

package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import Pageobjects.AddCustomerPage;
import Pageobjects.LoginPage;


public class TestCases_002 extends BaseClass
{
	

	@Test
	public void addNewCustomer() throws IOException, InterruptedException 
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
	

	Thread.sleep(3000);
	 AddCustomerPage acp=new AddCustomerPage(driver);
	 
	logger.info("Providing Customer Details");
	
	acp.AddNewCustomer();
	
	logger.info("New Customer page found");
	acp.customerName("Hello");
	acp.customergernder("male");
	acp.customerDOB("01", "01", "2001");
	Thread.sleep(3000);
	
	acp.customerAddress("Appartment");
	acp.customerCity("Trichy");
    acp.customerState("TaminNadu");
	acp.customerPin("987654");
	acp.customerPhoneNo("9876543210");
	
	String email=randomstring()+"@gmail.com";
	acp.customerEmail(email);
	acp.customerPassword("qwertr");
	acp.customerSubmit();
	
	Thread.sleep(3000);
	
	logger.info("Validation Started..");
	boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if(result=true)
	{
		Assert.assertTrue(true);
		logger.info("Customer added Successfully ");
	}
	else
	{
		captureScreen(driver,"addNewCustomer");
		Assert.assertTrue(false);
		logger.info("Customer added Failed");
	}
	
	
	
	
}


	


	
	}
	



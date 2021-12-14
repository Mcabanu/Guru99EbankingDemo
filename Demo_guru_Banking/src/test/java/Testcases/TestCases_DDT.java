package Testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.LoginPage;
import Utilities.XLUtils;

public class TestCases_DDT extends BaseClass
{
	@Test(dataProvider="LoginData")
    public void loginDDT(String username,String password) throws InterruptedException
    {
	 LoginPage lp=new LoginPage(driver);
	 lp.setUserName(username);
	 logger.info("usename provided");
	 lp.setPassword(password);
	 logger.info("password provided");
	 lp.clickSubmit();
	 Thread.sleep(3000);
	
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	    Assert.assertTrue(false);
	    logger.warn("Login Failed");
	}
	else
	{
		Assert.assertTrue(true);
		logger.info("Login Passed");
		lp.clickLogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		logger.info("Login success");
	}
		
  }
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
  @DataProvider(name="LoginData")
  public String [][] getData() throws IOException
 {
	 String path=System.getProperty("user.dir")+"/src/test/java/Testdata/DDTSample1.xlsx";
	
	 int rownum=XLUtils.getRowCount(path,"Sheet1");
	 int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
	 
	 String logindata[][]=new String [rownum][colcount];
	 for(int i=1;i<=rownum;i++)
	 {
		 for(int j=0;j<colcount;j++)
		 {
			 logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
		 }
	 }
	 return logindata;
			 
 }
	
}

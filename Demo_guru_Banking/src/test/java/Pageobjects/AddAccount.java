package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAccount {
WebDriver ldriver;

  public AddAccount(WebDriver rdriver)
  {
	  ldriver=rdriver;
	  PageFactory.initElements(rdriver, this);
  }
  
  @FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
  WebElement newaccount;
  
  @FindBy(name="cusid")
  WebElement  custid;
  
  @FindBy(name="selaccount")
  WebElement acctype;
  
  @FindBy(name="inideposit")
  WebElement initdeposit;
  
  @FindBy(name="button2")
  WebElement subbuton;
  
  @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	 WebElement lnklogout;
	 
  
  public void NewAccount()
  {
	  newaccount.click();
  }
  
  public void CustomerID(String cuid)
  {
	  custid.sendKeys(cuid);
  }
  
  public void AccountType(String acType)
  {
	  Select accountType= new Select(acctype);
	  accountType.selectByValue("Current");
  }
  
  public void initialDeposite(String inDeposite)
  {
	  initdeposit.sendKeys(inDeposite);
  }
  
  public void Submit()
  {
	  subbuton.click();
  }
  
  public void clickLogout()
	 {
		 lnklogout.click();
	 }
	 
}

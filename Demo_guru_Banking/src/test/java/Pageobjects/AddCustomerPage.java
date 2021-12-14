package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	

	WebDriver ldriver;
	
	 public AddCustomerPage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 

	 @FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	 WebElement lnkaddCustomer;
    
	
    
	@FindBy(name="name")
	WebElement cuName;
	
	@FindBy(name="rad1")
	WebElement rdGender;
	
	@FindBy(name="dob")
	WebElement cuDob;
	
	@FindBy(name="addr")
	WebElement cuAddress;
	
	@FindBy(name="city")
	WebElement cuCity;
	
	@FindBy(name="state")
    WebElement cuState;
	
	@FindBy(name="pinno")
	WebElement cuAddPinNo;
	
	@FindBy(name="telephoneno")
	WebElement cuPhoneNum;
	
	@FindBy(name="emailid")
	WebElement cuEid;
	
	@FindBy(name="password")
	WebElement cuPassword;
	
	@FindBy(name="sub")
	WebElement Submit;
	
	
	
	 
	public void  AddNewCustomer()
	{
		lnkaddCustomer.click();
	}
	
	
	public void customerName(String cname)
	{
		cuName.sendKeys(cname);
	}
	
	public void customergernder(String cgender)
	{
		rdGender.sendKeys(cgender);
	}
	
	public void customerDOB(String mm, String dd, String yy )
	{
		cuDob.sendKeys(mm);
		cuDob.sendKeys(dd);
		cuDob.sendKeys(yy);
	}
	
	public void customerAddress(String address)
	{
		cuAddress.sendKeys(address);
	}
	
	public void customerCity(String ccity)
	{
		cuCity.sendKeys(ccity);
	}
	
	public void customerState(String cstate)
	{
		cuState.sendKeys(cstate);
	}
	
	public void customerPin(String cpin)
	{
		cuAddPinNo.sendKeys(String.valueOf(cpin));
	}
	
	public void customerPhoneNo(String cphone)
	{
		cuPhoneNum.sendKeys(cphone);
	}
	
	public void customerEmail(String cmaild)
    {
		cuEid.sendKeys(cmaild);
	}
	
	public void customerPassword(String cpassword)
	{
		cuPassword.sendKeys(cpassword);
	}
	
	public void customerSubmit()
	{
		Submit.click();
	}
	
	
	
	 
	
	
	
}
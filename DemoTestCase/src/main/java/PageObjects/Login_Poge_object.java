package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Login_Poge_object {

	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	public static WebElement submit;
	
	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']/table/tbody/tr/td")
	public static WebElement LeaveRequest;
	
	
	@FindBy(linkText="Recruitment")
	public static WebElement recuirement;
	
	@FindBy(linkText="Vacancies")
	public static WebElement vacancies ;
	
	@FindBy(id="vacancySearch_jobTitle")
	public static WebElement jobTittle;
	
	@FindBy(id="vacancySearch_jobVacancy")
	public static WebElement vacancy;

	@FindBy(id="vacancySearch_hiringManager")
	public static WebElement HiringManager;
	
	@FindBy(id="vacancySearch_status")
	public static WebElement status;
	
	@FindBy(id="btnSrch")
	public static WebElement search;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr/td[3]")
	public static WebElement result1;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr/td[5]")
	public static WebElement result2;
	
	
}

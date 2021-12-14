package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IteraPOM {
  @FindBy(id="name")
  public static WebElement name;
 @FindBy(id="phone")
  public static WebElement phone;
  @FindBy(id="email")
  public static WebElement email;
  @FindBy(id="password")
  public static WebElement password;
  @FindBy(id="address")
  public static WebElement address;
  @FindBy(name="submit")
  public static WebElement submit;
  @FindBy(id="female")
  public static WebElement gender;
  @FindBy(id="monday")
  public static WebElement day1;
  @FindBy(id="friday")
  public static WebElement day2;
  @FindBy(className="custom-select")
  public static WebElement dropdown;
  @FindBy(xpath="/html/body/div/div[5]/div[2]/div[1]/div[2]/label")
  public static WebElement experience;
  @FindBy(xpath="/html/body/div/div[5]/div[2]/div[2]/div[1]/label")
  public static WebElement usetools1;
  @FindBy(xpath="/html/body/div/div[5]/div[2]/div[2]/div[3]/label")
  public static WebElement usetools2;
 /* @FindBy(xpath="//*[@id='inputGroupFile02']")
  public static WebElement uploadfile;
*/
  
  
  






}

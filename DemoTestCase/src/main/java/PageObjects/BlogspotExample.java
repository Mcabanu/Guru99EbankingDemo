package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogspotExample {

	@FindBy(id="Wikipedia1_wikipedia-search-input")
	public static WebElement newWindow;
	@FindBy(xpath="//*[@id='wikipedia-search-result-link']/a")
	public static WebElement search;
}

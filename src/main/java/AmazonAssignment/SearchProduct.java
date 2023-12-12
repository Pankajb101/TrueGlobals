package AmazonAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct {

	WebDriver driver;
	public SearchProduct (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement Searchbox;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	public WebElement Search;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	public WebElement find;
			
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	public WebElement add;
	
	@FindBy(xpath="//*[@id=\"attach-sidesheet-view-cart-button\"]")
	public WebElement cartbtn;
	
	  
	
}
	

package AmazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver driver;
	public Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//*[@id=\"nav-link-accountList-nav-line-1\"]"))
			public WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	public WebElement createacct;
	
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")

	public WebElement name;

	@FindBy(xpath="//*[@id=\"ap_phone_number\"]")

	public WebElement mobile;

	@FindBy (xpath="//*[@id=\"ap_email\"]")

	public WebElement email;

	@FindBy(xpath="//*[@id=\"ap_password\"]")

public WebElement password;
	

@FindBy(xpath="//*[@id=\"continue\"]")
public WebElement submit;





}
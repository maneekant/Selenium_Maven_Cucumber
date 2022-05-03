package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(id="loginId")
	public WebElement loginID;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(name="Submit")
	public WebElement submit;
	@FindBy(id="closebutn")
	public WebElement skip;


	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}



	public void login(String un,String pw) throws InterruptedException
		{
		loginID.sendKeys(un);
		password.sendKeys(pw);
		submit.click();
		if(skip.isDisplayed())
		{
			skip.click();
		}
		else
		{
			System.out.println("timesheet popup not available");
			
		}
		}

}//End of class

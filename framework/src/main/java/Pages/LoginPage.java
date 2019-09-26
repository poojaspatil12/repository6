package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	//Page Factory-OR:
		//Page Factory-OR
			@FindBy(xpath="//input[@id='username']")
			WebElement username;
			
			@FindBy(xpath="//input[@id='password']")
			WebElement password;
			
			@FindBy(xpath="//button[@class='btn btn-bordered btn-primary pull-right']")
			WebElement loginBtn;
			
		
		//Initializing the Page Objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public HomePage login(String un, String pwd) throws InterruptedException {

			username.click();
			Thread.sleep(2000);

			password.click();
			Thread.sleep(2000);
			
			loginBtn.click();
			Thread.sleep(2000);
			
			return new HomePage();
			
		}

}

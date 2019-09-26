package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AddFeatures extends TestBase {
	@FindBy(xpath ="//input[@id='add_country']")
	WebElement addcountry;
	
	@FindBy(xpath="//form[1]//div[1]//div[2]//div[1]//input[1]")
	WebElement add;
	
	//@FindBy(xpath="//select[@id='cntry_id']/option[03]")
	//WebElement selectcountry;
	@FindBy(xpath="//select[@id='cntry_id']")
	WebElement selectcountry;
	
	@FindBy(xpath="//input[@id='add_city']")
	WebElement addcity;
	
	@FindBy(xpath="//form[4]//div[1]//div[3]//div[1]//input[1]")
	WebElement add1;
	

//Initializing the Page Objects
public  AddFeatures() {
	PageFactory.initElements(driver, this);
}
  public void pck(String Cntry,String SCntry, String city) throws InterruptedException {

	addcountry.sendKeys(Cntry);
	Thread.sleep(4000);
    add.click();
    Thread.sleep(2000);
//    selectcountry.sendKeys(Selct);
	//Thread.sleep(2000);
//	
    Alert alt = driver.switchTo().alert();
    alt.accept();
    
    Thread.sleep(5000);
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,600)");
	System.out.println("scrolled Down");
	Thread.sleep(5000);
    
//    driver.switchTo().alert().accept();
    
 selectcountry.sendKeys(SCntry);
 Thread.sleep(2000);
	addcity .sendKeys(city);		
    Thread.sleep(2000);
	add1.click();
    Thread.sleep(5000);
    Alert alt1 = driver.switchTo().alert();
    alt1.accept();
    
    Thread.sleep(5000);
    
}
}

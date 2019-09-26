package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Membershipplanpage extends TestBase{
	@FindBy(xpath ="//input[@id='name1']")
	WebElement packagename;
	
	@FindBy(id="price")
	WebElement packageprice;
	
	@FindBy(id="image")
	WebElement chosefile;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit;
	//upload
	
//	chosefile.sendKeys(C:\Users\HP\Pictures\Screenshot);
	

//Initializing the Page Objects
public void MembershipplanPage() {
	PageFactory.initElements(driver, this);
}
  public void pack() throws InterruptedException {

	driver.findElement(By.xpath("//input[@id='name1']")).sendKeys("abc");
	Thread.sleep(2000);
	
	driver.findElement(By.id("price")).sendKeys("2000");
	Thread.sleep(2000);
	
	//upload
	WebElement upload=driver.findElement(By.xpath("//input[@id='image']"));
	upload.sendKeys("C:\\Users\\HP\\Pictures\\Screenshot");
	Thread.sleep(3000);
	//submit.click();
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//Thread.sleep(2000);
	Thread.sleep(3000);
	

}

}


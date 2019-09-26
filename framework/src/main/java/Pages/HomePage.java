package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//li[@class='active']//li[1]//a[1]")
	WebElement membershipplan;
	
	@FindBy(xpath="//span[contains(text(),'Add Features')]")
	WebElement addfeatures;
	@FindBy(xpath="//a[text()='Add Country City']")
	WebElement AddCountryCity;
	@FindBy(xpath="//a[text()='Add Partner']")
	WebElement addpartner;
	@FindBy(xpath="//a[text()='Form Settings']")
	WebElement formsettings;
	@FindBy(xpath="//a[text()='Add Client Testimonial']")
	WebElement addclienttestimonial;
	@FindBy(xpath="//a[text()='Add Latest News']")
	WebElement addlatestnews;
	@FindBy(xpath="//a[text()='News Letter']")
	WebElement newsletter;
	

//Initializing the Page Objects
public HomePage() {
	PageFactory.initElements(driver, this);
}

public HomePage ClickOnMenbershipplan()
{
	membershipplan.click();
return new HomePage();
	
}
public HomePage ClickOnAddFeatures() {
	
addfeatures.click();
return new HomePage();


}
public HomePage ClickOnAddCountryCity() {
	
AddCountryCity.click();
return new HomePage();


}


public HomePage ClickOnAddpartner() {
	addpartner.click();
	return new HomePage();

}
public HomePage ClickOnFormsettings() {
	formsettings.click();
	return new HomePage();
}
public HomePage ClickOnAddclienttestimonial() {
	addclienttestimonial.click();
	return new HomePage();
}	
public HomePage ClickOnAddlatestnews() {
	addlatestnews.click();
	return new HomePage();
}	
public HomePage ClickOnNewsletter() {
	newsletter.click();
	return new HomePage();
}	
}

package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.AddFeatures;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Membershipplanpage;

public class AddFeaturesTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	AddFeatures addfeatures;
	
	
	public AddFeaturesTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void Add() throws InterruptedException {
	
	    homepage=homepage.ClickOnAddFeatures();
	    Thread.sleep(2000);
	    homepage=homepage.ClickOnAddCountryCity();
	    Thread.sleep(2000);
	    addfeatures =new AddFeatures();
	    Thread.sleep(3000);
	    addfeatures.pck("India","India", "banglore");
	    Thread.sleep(8000);
	    
	    
	    
	  
	   
	    
	}
}

	



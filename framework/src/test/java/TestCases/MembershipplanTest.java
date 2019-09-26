package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Membershipplanpage;

public class MembershipplanTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	Membershipplanpage membershipplanpage;
	
	
	public MembershipplanTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void Pack() throws InterruptedException {
	
	    homepage.ClickOnMenbershipplan();
	    Thread.sleep(2000);
    membershipplanpage =new Membershipplanpage();
//	    Thread.sleep(3000);
//	    membershipplanpage.pack(pn, pp, cf);
	    membershipplanpage.pack();
	    Thread.sleep(2000);
	
	    
   
	}
}



	



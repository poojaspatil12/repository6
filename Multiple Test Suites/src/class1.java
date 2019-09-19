



	
		
		import org.openqa.selenium.WebDriver;
		
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
		

		public class class1 {
			@Test
			public void fb() {
				
				System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
			}
			

		}
	



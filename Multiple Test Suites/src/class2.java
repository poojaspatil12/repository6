



	
		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
		

		public class class2 {
			@Test
			public void fb() {
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com");
			}
			

		}
	



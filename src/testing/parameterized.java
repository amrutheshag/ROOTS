package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized {
	WebDriver driver;
		@Test(priority=0)
		@Parameters({"browser"})
		public void parameterizedTest(String browser){
			if(browser.equals("firefox")){
				System.out.println("Open Firefox Driver");
			}else if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();	
		}	
	}
	
		{
		driver.get("https://www.google.co.in");
}
}
package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

 public abstract class BaseTest implements IAutoConst{
	public WebDriver driver;
	
		@BeforeSuite
		public void initDriver()
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		@BeforeMethod
		public void openApplication() throws Exception{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://storefront:root5@dev.roots.com/ca/en/homepage");
		}
		
//		@AfterMethod
//		public void closeApplication(){
//			driver.quit();
//		}
}

 
 
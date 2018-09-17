
//package testing;
//
//import java.util.List;
//
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import generic.Excel;
//
//public class gpmqueue {
//static {
//		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	}
//	@Test()
//	
//	public void order_page1() throws InterruptedException{
//		BasicConfigurator.configure();
//		Logger l=Logger.getLogger("gpmqueue");
////		PropertyConfigurator.configure("./dummy/log4j/log4j.properties");
//		PropertyConfigurator.configure("log4j.properties");
//		WebDriver driver=new ChromeDriver();
//
//		l.info(" ------------Opening the browser------------");
//		
//		driver.manage().window().maximize();
//		l.info(" ------------Entering the url--------------");
//			driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=6DOGWujXBY2jX6_Gp5gH");
//			
//			driver.quit();
		//	Thread.sleep(15000);
			
//	}
//}
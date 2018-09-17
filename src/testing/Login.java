package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sun.glass.events.KeyEvent;



public class Login {
String a= "storefront";
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws FindFailed, AWTException, InterruptedException {
		

		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://storefront:root5@dev.roots.com");

//		Thread.sleep(3000);
//		Robot rd=new Robot();
////	rd.keyPress(KeyEvent.VK_TAB);
////	rd.keyRelease(KeyEvent.VK_TAB);
//	
//	rd.keyPress(KeyEvent.VK_S);
//	rd.keyRelease(KeyEvent.VK_S);
//	
//	rd.keyPress(KeyEvent.VK_T);
//	rd.keyRelease(KeyEvent.VK_T);
//	
//	rd.keyPress(KeyEvent.VK_O);
//	rd.keyRelease(KeyEvent.VK_O);
//	rd.keyPress(KeyEvent.VK_R);
//	rd.keyRelease(KeyEvent.VK_R);
//	rd.keyPress(KeyEvent.VK_E);
//	rd.keyRelease(KeyEvent.VK_E);
//	rd.keyPress(KeyEvent.VK_F);
//	rd.keyRelease(KeyEvent.VK_F);
//	rd.keyPress(KeyEvent.VK_R);
//	rd.keyRelease(KeyEvent.VK_R);
//	rd.keyPress(KeyEvent.VK_O);
//	rd.keyRelease(KeyEvent.VK_O);
//	rd.keyPress(KeyEvent.VK_N);
//	rd.keyRelease(KeyEvent.VK_N);
//	rd.keyPress(KeyEvent.VK_T);
//	rd.keyRelease(KeyEvent.VK_T);
//	
//	rd.keyPress(KeyEvent.VK_TAB);
//	rd.keyRelease(KeyEvent.VK_TAB);
//        
//	rd.keyPress(KeyEvent.VK_R);
//	rd.keyRelease(KeyEvent.VK_R);
//	rd.keyPress(KeyEvent.VK_O);
//	rd.keyRelease(KeyEvent.VK_O);
//	rd.keyPress(KeyEvent.VK_O);
//	rd.keyRelease(KeyEvent.VK_O);
//	rd.keyPress(KeyEvent.VK_T);
//	rd.keyRelease(KeyEvent.VK_T);
//	rd.keyPress(KeyEvent.VK_5);
//	rd.keyPress(KeyEvent.VK_5);
//	
//	rd.keyPress(KeyEvent.VK_5);
//	
//	rd.keyPress(KeyEvent.VK_TAB);
//	rd.keyRelease(KeyEvent.VK_TAB);
//        
//	rd.keyPress(KeyEvent.VK_ENTER);
//	rd.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
      driver.findElement(By.xpath("//span[.='CANADA ENGLISH']")).click();
      
      
	}}
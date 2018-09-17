package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class New_test {

	@Test
	 public void testLogin() throws FindFailed{
		
	 Screen screen = new Screen();
	/* 
	 Pattern Username = new Pattern("C:\\Users\\amruthesh\\Desktop\\sikuli\\roots_sikuli\\un.png");
	 Pattern Password = new Pattern("C:\\Users\\amruthesh\\Desktop\\sikuli\\roots_sikuli\\pwd.png");
	 Pattern login = new Pattern("C:\\Users\\amruthesh\\Desktop\\sikuli\\roots_sikuli\\signup.png");*/
	 
	 Pattern Username = new Pattern("C:\\Users\\amruthesh\\Desktop\\sikuli\\roots_sikuli\\un1.png");
//	 Pattern Password = new Pattern("C:\\Users\\amruthesh\\Desktop\\Pwd.png");
//	 Pattern login = new Pattern("C:\\Users\\amruthesh\\Desktop\\Signin.png");
	 
	 
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 
//	 driver.get("https://dev.roots.com");
	 Reporter.log("success");

	 screen.wait(Username, 10);
	 screen.type(Username, "storefront");
//	 Reporter.log("executed");
//	 screen.type(Password, "root5");
//	 screen.click(login);
	 }
	 
	}
package com.roots.page;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;







import generic.BasePage;
import generic.Excel;

public class Home_Page extends BasePage {
	
	@FindBy(xpath="(//a[@href='https://dev.roots.com/ca/en/homepage'])[2]")
	private WebElement HomePage_BTN;
	
	@FindBy(xpath="(//span[.='U'])[2]")
	private WebElement GlobalSearch_BTN;
	
	@FindBy(id="searchInput")
	private WebElement GlobalSearch_TextBox;
			
	@FindBy(xpath="//span[.='Women']")
	private WebElement Women_Catagory;
	
	@FindBy(xpath="//a[.='Tops']")
	private WebElement Tops;
	
	@FindBy(xpath="//a[contains(text(),'CONTINUE SHOPPING')]")
	private WebElement Wlcm_popup;
	
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	private WebElement Add_to_cart_BTN;
	
	@FindBy(xpath="//h2[.='Original Crew Neck Sweatshirt']")
	private WebElement Product_Desc;
	
	@FindBy(xpath="//a[contains(@href,'pid=04041922')]//..//span[.='L']")
	private WebElement Size_selection;
	
	@FindBy(xpath="//a[@data-pid='51637231']//span[.='Add to Bag']/.")
	private WebElement PLP_Add_to_cart_BTN;
	
	@FindBy(xpath="//div[@class='x-close su-modal-close']")
	private WebElement Close;
	
	@FindBy(xpath="//a[.='PROCEED TO CHECKOUT']")
	private WebElement Proceed_to_Checkout;
	
	public Home_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void Welecome_PopUp(){
		sleep(1);
		Wlcm_popup.click();
	}
	
	
//String E_Product_desc=Product_Desc.getText().toString();
	public void click_HomePagelogo(){
		HomePage_BTN.click();
		Reporter.log("", true);
	}
	public void Women_Catagory_Selection_To_Til_Cartpage(){
		try{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(6, TimeUnit.MINUTES)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		//sleep(1);
		
		Actions a= new Actions(driver);
		a.moveToElement(Women_Catagory).perform();
		Tops.click();
		sleep(3);
		Close.click();
		sleep(3);
		
		wait.until(ExpectedConditions.elementToBeClickable(Product_Desc));
		Product_Desc.click();
		wait.until(ExpectedConditions.elementToBeClickable(Size_selection));
		Size_selection.click();
		wait.until(ExpectedConditions.elementToBeClickable(Add_to_cart_BTN));

		Add_to_cart_BTN.click();
		sleep(3);
		wait.until(ExpectedConditions.elementToBeClickable(Proceed_to_Checkout));
		Proceed_to_Checkout.click();
		sleep(2);
				}	
		catch (Exception e) {
		}
		
		}
}

//span[.='Women']
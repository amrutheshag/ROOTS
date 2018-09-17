package com.VIPS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;
import generic.Excel;

public class Home_Page extends BasePage {
	String un=Excel.getCellValue("./data/input.xlsx","credentials",2,2);
	
	@FindBy(xpath="//a[@data-pid='51637231']//span[.='Add to Bag']/.")
	private WebElement PLP_Add_to_cart_BTN;
	
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
	
	@FindBy(xpath="//div[@class='x-close su-modal-close']")
	private WebElement Close;
	
	@FindBy(xpath="//a[.='PROCEED TO CHECKOUT']")
	private WebElement Proceed_to_Checkout;
	
	@FindBy(xpath="	//a[.='CONTINUE TO CHECKOUT']")
	private WebElement Continue_to_Checkout;
	
	@FindBy(xpath="//span[.='CHECKOUT AS A GUEST']")
	private WebElement Checkout_as_Guest;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_email")
	private WebElement Shipping_Email;
	
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	private WebElement First_Name;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_lastName")
	private WebElement Last_Name;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_address1")
	private WebElement Address1;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_zipcode")
	private WebElement Zipcode;
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_city")
	private WebElement City;
			
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_phone")
	private WebElement Phone_Number;	
			
	@FindBy(id="dwfrm_singleshipping_shippingAddress_addressFields_states_state")
	private WebElement Provinence;
	
	@FindBy(xpath="	//button[.='CONTINUE TO PAYMENT' and @name='dwfrm_singleshipping_shippingAddress_applyShippingAddress']")
	private WebElement Continue_payment;
		
	@FindBy(xpath="	//button[.=' Continue with this address']")
	private WebElement Continue_with_address;
	
	public Home_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void popup(){
		sleep(1);
		Wlcm_popup.click();
	}
	
//String E_Product_desc=Product_Desc.getText().toString();
	public void Women_Catagory(){
		sleep(1);
		Actions a= new Actions(driver);
		a.moveToElement(Women_Catagory).perform();
		Tops.click();
		sleep(3);
		Close.click();
		sleep(3);
//		a.moveToElement(Product_Desc);
		Product_Desc.click();
//		SoftAssert s = new SoftAssert();
//		s.assertEquals(Product_Desc, Product_Desc);
		//Reporter.log(Product_Desc,true);
		Size_selection.click();
		sleep(1);
		Add_to_cart_BTN.click();
		sleep(3);
		Proceed_to_Checkout.click();
		sleep(2);
		Continue_to_Checkout.click();
		Checkout_as_Guest.click();
		Shipping_Email.sendKeys(un);
		First_Name.sendKeys("Amruthesh");
		Last_Name.sendKeys("A G");
		Address1.sendKeys("Banjarahills");
		Zipcode.sendKeys("a1a1a1");
		City.sendKeys("Alabama");
		Phone_Number.sendKeys("313-213-2131");
		Select s= new Select(Provinence);
		s.selectByIndex(1);
		Continue_payment.click();
		Continue_with_address.click();
		sleep(2);
	}
}


//span[.='Women']
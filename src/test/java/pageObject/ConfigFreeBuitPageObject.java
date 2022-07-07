package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigFreeBuitPageObject {

	private static  ConfigFreeBuitPageObject FreeBuildInstance;

	private ConfigFreeBuitPageObject() {

	}

	public static ConfigFreeBuitPageObject getInstance() {

		if(FreeBuildInstance==null) {

			FreeBuildInstance = new ConfigFreeBuitPageObject();
		}

		return FreeBuildInstance;
	}


	@FindBy(linkText = "Ebikes")
	private WebElement EbikeLink;
	
	@FindBy(xpath ="/html/body/header/p/button")
	private WebElement closeicon;

	@FindBy(xpath = "//*[text()='Cargo & utility ']")
	private WebElement SelectEbike;

	@FindBy(linkText = "Shop Now")
	private WebElement ShopNow;

	@FindBy(xpath = "//button[text()='Buy Now - ']")
	private WebElement Buynow;

	@FindBy(xpath = "//button[text()='Skip Step']")
	private WebElement Skipstep;

	@FindBy(xpath = "//div[@class='color-swatch color-swatch--white']/*[@class='color-swatch__item lazyloaded']")
	private WebElement Bikecolor;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement Nextbutton;

	@FindBy(id="add")
	private WebElement Buybutton;

	@FindBy(xpath = "//button[@data-action='increase-quantity']")
	private WebElement increasequat;

	@FindBy(xpath = "//h2[contains(text(),'2 Items')]")
	private WebElement verifyquat;

	@FindBy(xpath = "//*[text()='Begin Checkout']")
	private WebElement beigncheckoutbutton;

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	private WebElement checkoutbutton;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]")
	private WebElement remove;

	@FindBy(xpath = "//a[contains(text(),'Shop Now')]")
	private WebElement shopNowButton;
	

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement EmailBox;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Last name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement Address;

	@FindBy(xpath = "//li[@id='1']")
	private WebElement AddressSelect;

	@FindBy(xpath = "//input[@placeholder='ZIP code']")
	private WebElement Zipcode;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//button[@id='continue_button']")
	private WebElement contiuneToShipping;

	

	public void Ebikelinkclick() {

		EbikeLink.click();
	}
	
	public void closeIconClick() {

		closeicon.click();
	}

	public void Selectbike() {

		SelectEbike.click();
	}

	public void ShopNowButtonclick() {

		ShopNow.click();
	}

	public void buyNowButtonClick() {

		Buynow.click();
	}

	public void skipstepClick() {

		Skipstep.click();
	}

	public void BikeColorselect() {

		Bikecolor.click();
	}

	public void NextButtonClick() {

		Nextbutton.click();
	}

	public void buybuttonclick() {

		Buybutton.click();
	}

	public void increasequatity() {

		increasequat.click();
	}

	public String verifyquatity() {

		return  verifyquat.getText();
	}

	public void beigncheckoutClick() {

		beigncheckoutbutton.click();
	}

	public void checkoutclick() {

		checkoutbutton.click();

	}

	public void removeClick() {

		remove.click();
	}
	
	public void ShopnowClick() {
		
		shopNowButton.click();
	}
	
	public void EmailboxValue() {

		EmailBox.sendKeys("demologin@yopmail.com");
	}

	public void FirstNameValue() {

		FirstName.sendKeys("test");
	}

	public void LastNameValue() {

		lastName.sendKeys("Test53");
	}


	public void Addressvalue() {

		Address.sendKeys("123");

	}

	public void AddressSelected() {

		AddressSelect.click();
	}

	public void ZipcodeValue() {

		Zipcode.sendKeys("20906");
	}
	
	public void cityValue() {
		
		city.sendKeys("Califronia");
	}
	
	public void phonenumberValue() {
		
		phonenumber.sendKeys("4949494040");
	}
	
	public void contiuneToShippingClick() {
		
		contiuneToShipping.click();
	}
	
}

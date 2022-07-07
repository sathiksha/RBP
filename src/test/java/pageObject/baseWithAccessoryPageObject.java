package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class baseWithAccessoryPageObject {
	
	private static baseWithAccessoryPageObject baseWithAccessoryInstance;

	private baseWithAccessoryPageObject() {

	}

	public static baseWithAccessoryPageObject getInstance() {

		if(baseWithAccessoryInstance==null) {

			baseWithAccessoryInstance = new baseWithAccessoryPageObject();
		}

		return baseWithAccessoryInstance;
	}

	@FindBy(linkText = "Ebikes")
	private WebElement EbikeLink;

	@FindBy(xpath = "/html/body/header/p/button")
	private WebElement closeicon;

	@FindBy(xpath = "//*[text()='Cargo & utility ']")
	private WebElement SelectEbike;

	@FindBy(linkText = "Shop Now")
	private WebElement ShopNow;

	@FindBy(xpath="/html/body/div[4]/section/header/nav[2]/div/div/a")
	private WebElement customizeMyOwn;

	@FindBy(xpath = "//span[text()='Start With Base Model']")
	private WebElement StartWithBase;

	@FindBy(xpath = "//span[text()='Next Step']")
	private WebElement NextStep;

	@FindBy(xpath = "/html/body/main/div/section/div/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]")
	private WebElement accessory;

	@FindBy(xpath = "//span[text()='Add Item']")
	private WebElement AddItem;

	@FindBy(xpath = "//span[text()='Select Delivery options']")
	private WebElement selectDeliveryOptions;

	@FindBy(xpath= "//span[text()='Finish']")
	private WebElement finishbutton;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement postalcode;

	@FindBy(xpath = "//button[contains(text(),'View Options')]")
	private WebElement viewoptions;

	@FindBy(id = "saap-velofix-built")
	private WebElement selectdelivery;

	@FindBy(xpath = "//button[@id='add']")
	private WebElement AddToCart;

	@FindBy(xpath = "//*[text()='Begin Checkout']")
	private WebElement beigncheckoutbutton;

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	private WebElement checkoutbutton;

	@FindBy(xpath = "//span[contains(text(),'Pro Built + Delivered by Velofix')]")
	private WebElement verifyDeliveryoption;

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

	public void customizemyOwnclick() {

		customizeMyOwn.click();
	}

	public void starBaseButtonClick() {

		StartWithBase.click();

	}

	public void Nextstepclick() {

		NextStep.click();
	}

	public void Accessoryclick() {

		accessory.click();
	}

	public void AddItemclick() {

		AddItem.click();
	}

	public void FinishButtonClick() {

		finishbutton.click();
	}

	public void selectDeliveryClick() {

		selectDeliveryOptions.click();
	}

	public void postalcodevalue( ) {

		postalcode.sendKeys("92591");
	}

	public void viewOptionclick() {

		viewoptions.click();
	}

	public void deliveryOptionselect() {

		selectdelivery.click();
	}

	public void AddtocartOption() {

		AddToCart.click();
	}

	public String DeliveryOptionVerify() {

		return verifyDeliveryoption.getText();
	}

	public void checkoutclick() {

		checkoutbutton.click();

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

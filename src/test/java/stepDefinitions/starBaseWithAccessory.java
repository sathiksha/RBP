package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.baseWithAccessoryPageObject;
import webdriver_Manager.driverManager;

public class starBaseWithAccessory {

JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
	
	
	@When("user clicking on Ebikelink and selecting on anybike")
	public void user_clicking_on_ebikelink_and_selecting_on_anybike() throws InterruptedException {
		
		Thread.sleep(10000);
		baseWithAccessoryPageObject.getInstance().Ebikelinkclick();
		
		Thread.sleep(10000);
		baseWithAccessoryPageObject.getInstance().closeIconClick();
		
		Thread.sleep(10000);
		baseWithAccessoryPageObject.getInstance().Selectbike();
		
		js.executeScript("window.scrollBy(0,500)", "");
	   
	}
	@And("Clicking on Shopnow and CustomizerMyOwn and Clicking on StarwithBase model")
	public void clicking_on_shopnow_and_customizer_my_own_and_clicking_on_starwith_base_model() throws InterruptedException {
		
		Thread.sleep(10000);
		
		baseWithAccessoryPageObject.getInstance().ShopNowButtonclick();
		
		Thread.sleep(13000);
		baseWithAccessoryPageObject.getInstance().customizemyOwnclick();
		
		Thread.sleep(6000);
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		
		 baseWithAccessoryPageObject.getInstance().starBaseButtonClick();
		
	    
		
	}
	@Then("Clicking on NextStep and select accessories and clicking on Additems")
	public void clicking_on_next_step_and_select_accessories_and_clicking_on_additems() throws InterruptedException {
		
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		
		baseWithAccessoryPageObject.getInstance().Nextstepclick();
		
		Thread.sleep(10000);
		baseWithAccessoryPageObject.getInstance().Accessoryclick();
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)", "");
	   
		Thread.sleep(5000);
		baseWithAccessoryPageObject.getInstance().AddItemclick();
	}
	@And("Clicking on Finshbutton and selectDeliveryOptions")
	public void clicking_on_finshbutton_and_select_delivery_options() throws InterruptedException {
		
		Thread.sleep(10000);
		baseWithAccessoryPageObject.getInstance().FinishButtonClick();
		
		Thread.sleep(5000);
		baseWithAccessoryPageObject.getInstance().selectDeliveryClick();
	    
	}
	@Then("Entering postal code and clicks on viewOption")
	public void entering_postal_code_and_clicks_on_view_option() throws InterruptedException {
		
		Thread.sleep(6000);
		
		baseWithAccessoryPageObject.getInstance().postalcodevalue();
		
		Thread.sleep(6000);
		baseWithAccessoryPageObject.getInstance().viewOptionclick();
	    
	}
	@And("Select delivery options and clicks on AddToCart button")
	public void select_delivery_options_and_clicks_on_add_to_cart_button() throws InterruptedException {
		
		Thread.sleep(6000);
		baseWithAccessoryPageObject.getInstance().deliveryOptionselect();
		
		Thread.sleep(6000);
		baseWithAccessoryPageObject.getInstance().AddtocartOption();
	   
	}
	@And("clicks on checkout and Enter information and clicks on countine shipping")
	public void clicks_on_checkout_and_enter_information_and_clicks_on_countine_shipping() throws InterruptedException {
	
		Thread.sleep(6000);
		
	 String Deliveryname =	baseWithAccessoryPageObject.getInstance().DeliveryOptionVerify();
	 Assert.assertEquals(Deliveryname, "Pro Built + Delivered by Velofix");
	 System.out.println(Deliveryname);
	 
	 Thread.sleep(6000);
	 baseWithAccessoryPageObject.getInstance().checkoutclick();
	 
	 Thread.sleep(10000);
	 baseWithAccessoryPageObject.getInstance().EmailboxValue();
	 
	 baseWithAccessoryPageObject.getInstance().FirstNameValue();
	 
	 baseWithAccessoryPageObject.getInstance().LastNameValue();
	 
	 baseWithAccessoryPageObject.getInstance().Addressvalue();
	 
	 Actions act = new Actions(driverManager.getDriver());
	   act.sendKeys(Keys.TAB).build().perform();
	   act.sendKeys(Keys.RETURN).build().perform();
	   
	 baseWithAccessoryPageObject.getInstance().AddressSelected();
	 
	 baseWithAccessoryPageObject.getInstance().phonenumberValue();
	 
	 baseWithAccessoryPageObject.getInstance().contiuneToShippingClick();
	}


}

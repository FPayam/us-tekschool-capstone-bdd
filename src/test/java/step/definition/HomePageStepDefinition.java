package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homepage = new HomePageObject();
	
	@When("User click on Currency")
	public void User_click_on_Currency() {
		homepage.clickOnCurrencyTab();
		logger.info("user clicked on currency link");
		Utils.hardWait();
		
	}
	@When("User Chose Euro from dropdown")
	public void User_Chose_Euro_from_dropdown() {
		homepage.clickOnEuro();
		logger.info("user selected Euro from dropdwon");
		Utils.hardWait();
	}
	@Then("currency value should change to Euro")
		public void currency_value_should_change_to_Euro() {
		homepage.currencyValuefromUI();
	}
	
	//Steps for empty Shopping cart message.......
	
	@When("User click on shopping cart")
	public void User_click_on_shopping_cart() {
		homepage.clickOnCartButton();
		logger.info("user clicked on shopping cart");
		Utils.hardWait();

	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		homepage.messagefromUI();
		
	}

	

}

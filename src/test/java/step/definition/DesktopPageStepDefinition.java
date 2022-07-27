package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base{

	DesktopPageObject deskTopPageObj = new DesktopPageObject();
	
	
	@When("User click on Desktops tab")
	public void User_click_on_Desktops_tab() {
		Utils.hardWait();
		deskTopPageObj.clickOnDesktopTab();
		logger.info("user clicked on desktops tab");
		
	}
    @And("User click on Show all desktops")
    public void User_click_on_Show_all_desktops() {
    	Utils.hardWait();
    	deskTopPageObj.clickOnShowAllDesktops();
    	logger.info("user clicked on show all desktops");
    
    }
    
    //Steps for verifying all items are present in Desktop tab
    
    
    @Then("User should see all items are present in Desktop page")
    public void User_should_see_all_items_are_present_in_Desktop_page() {
    	
    	List<WebElement> desktopsElements = deskTopPageObj.desktopsItems();
    			
    			for(WebElement element:desktopsElements ) {
    				Assert.assertTrue(element.isDisplayed());
    				logger.info(element.getAttribute("title") + "is present");
    			}
    			Utils.hardWait();
    	}
    
  //Steps for adding HP LP 3065 from Desktop tab to the cart
    
    
    @When("User click ADD TO CART option on HP LP3065 item")
    public void user_click_add_to_cart_option_on_hp_lp3065_item() {
    	deskTopPageObj.clickOnHPLP3065Item();
    	logger.info("user clicked add to cart button");
		Utils.hardWait();
    }
    @When("User select quantity {string}")
    public void user_select_quantity(String string) {
    	deskTopPageObj.selectQuantitynumber(string);
    	logger.info("user selected quantity ");
		Utils.hardWait();
    }
    @When("User click add to Cart buttonn")
    public void user_click_add_to_cart_buttonn() {
    	deskTopPageObj.clickOnaddToCardButton();
    	logger.info("user clicked on add to cart button");
		Utils.hardWait();
    }
    @Then("User should see a message {string}")
    public void User_should_see_a_message(String expectedSuccessMessage) {

    	Assert.assertTrue(deskTopPageObj.validateSucessMessage());
    	Utils.hardWait();
    	
    }
    
    //Steps for adding canon EOS 5D to the cart
    
    @When("User click ADD TO CART option on Canon EOS 5D item")
    public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
    	deskTopPageObj.clickOnCanonEOS5D();
    }

    @When("User select color from dropdown Blue")
    public void user_select_color_from_dropdown_blue() {
    	deskTopPageObj.selectColor();
    }
    
//    	Edited by TekSupport
    
    
    //Steps for add a review to Canon EOS 5D item
    
    @When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws InterruptedException {
    	deskTopPageObj.ClickOnCanon();
		logger.info("User click on Canon EOS 5D item");
		Thread.sleep(2000);

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
		deskTopPageObj.clickOnWriteAReviewLink();
		logger.info("User click on write a review link");
		Thread.sleep(2000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		
		List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		deskTopPageObj.SelectName(infoList.get(0).get("youname"));
		deskTopPageObj.sendReview(infoList.get(0).get("reviewtext"));
		deskTopPageObj.selectRatingRadioButton();
		Thread.sleep(2000);

	}

	@When("User click on Continue Buttonn")
	public void user_click_on_continue_buttonn() throws InterruptedException {
		deskTopPageObj.clickOncontunioButton();
		logger.info("user click on continue Button");
		Thread.sleep(2000);

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws InterruptedException {
		deskTopPageObj.reviewmessageisdisplay();
		logger.info("user can see the message");
		Thread.sleep(2000);
	}


    
}

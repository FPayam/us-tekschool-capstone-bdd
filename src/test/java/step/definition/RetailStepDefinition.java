package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retailPageObject= new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
	   String expectedText = ("TEST ENVIRONMENT");
	   String actualText= retailPageObject.textFromTestEnvironment();
	   Assert.assertEquals(expectedText, actualText);
	   logger.info("Environment successfuly varified");
	   Thread.sleep(3000);
	   
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		retailPageObject.clickOnMyAccountButton();
		logger.info("My account button clicked");
		Thread.sleep(3000);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.clickOnLoginLink();
		logger.info("login link clicked successfully");
	    
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailPageObject.enterEmail(email);
		retailPageObject.enterPassword(password);
		logger.info("email and password entered successfully");
	   
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		
		retailPageObject.clickOnLoginButton();
		logger.info("user clicked on login button successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailPageObject.textFromMyMyAccountDash();
	   
	}
	
	//Steps for Register as an Affiliate user with Cheque...

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailPageObject.clickOnRegisterAffiliatelink();
	logger.info("user successfully clicked on link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map <String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.companyNameField(data.get(0).get("company"));
		retailPageObject.companyWebSite(data.get(0).get("website"));
		retailPageObject.companyTaxID(data.get(0).get("taxID"));
		retailPageObject.companyPayment(data.get(0).get("paymentMethod"));
		logger.info("company information entered accurately");
	  
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.clickOnAboutUsCheckBox();
		logger.info("user clicked on about us check box successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickOnContinueButon();
		logger.info("user clicked on button");
	    
	}

	@Then("User should see a success message1")
	public void user_should_see_a_success_message1() {
		String actualText = ("Success: Your account has been successfully updated.");
		String expectedText= retailPageObject.textFromUserAffiliate();
		Assert.assertEquals(expectedText, actualText);
		
		logger.info("user affiliate account has been successfully updated");
		
	}
	
// Steps for edit your Affiliate account
	
	
	@When("User click on 'Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPageObject.clickOnEditAffiliateInfoLink();
		logger.info("User clicked on affiliate link successfully");
		
	}
	
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.clickOnBankTransferRadioButton();
		logger.info("User clicked on bank transfer radio button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map <String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterBankNameFeild(data.get(0).get("bankName"));
		retailPageObject.enterAbaNumber(data.get(0).get("abaNumber"));
		retailPageObject.enterbankSwiftCodeFeild(data.get(0).get("swiftCode"));
		retailPageObject.enterbankAccountName(data.get(0).get("accountName"));
		retailPageObject.enterBankAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User fill out bank information successfully");
	}
		
	@When("User click on Continue button1")
	public void user_click_on_continue_button1() {
		retailPageObject.clickOnContinueButon();
		logger.info("User clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String actualTextUI= "Success: Your account has been successfully updated.";
		String expectedTextUI=retailPageObject.successMsgAfterBankAccInfo();
		Assert.assertEquals(expectedTextUI, actualTextUI);
	    
	}
	
	//Steps for edit your account info...
	
	
	 @When("User click on 'Edit your account information' linkk")
	 public void  User_click_on_Edit_your_account_information_linkk() {
		 retailPageObject.clickOnEditAccountInfo(); 
	 }
	 @And("User modify below information")
	 public void User_modify_below_information(DataTable dataTable) {
	  List<Map <String, String>> data = dataTable.asMaps(String.class, String.class); 
	  retailPageObject.editAccInfoFirstNameField(data.get(0).get("firstname"));
	  retailPageObject.editAccInfoLastNameField(data.get(0).get("lastName"));
	  retailPageObject.editAccInfoEmailField(data.get(0).get("email"));
	  retailPageObject.editAccInfoTelephoneField(data.get(0).get("telephone"));
	 }
	 @And("User click on continue button2")
	 public void User_click_on_continue_button2() {
		 retailPageObject.clickOnContinueButon();
	 }
	 @Then("User should see a messagee2 {string}")
	 public void User_should_see_a_messagee2(String string) {
		 String actualFromUI =("Success: Your account has been successfully updated.");
		 String expectedTextFromUI=retailPageObject.textFromEditAccInfoSuccessMsg();
		 Assert.assertEquals(expectedTextFromUI, actualFromUI);
		 
	 }
}
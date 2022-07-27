package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{
	
	LaptopNoteBooksPageObject laptopNoteBookObj = new LaptopNoteBooksPageObject();
	

	@When("User click on Laptop &NoteBook tab")
	public void User_click_on_Laptop_NoteBook_tab(){
		laptopNoteBookObj.clickOnlaptopNotebooksTab();
		Utils.hardWait();
		logger.info("user clicked on laptop notebook tab");
	}
	
	
	@When("User click on Show all Laptop NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
    	laptopNoteBookObj.clickOnshowAllLaptopsAndNotebooks();
    	Utils.hardWait();
    	logger.info("user clicked on show all laptop note book link");
    	
    }
    @And("User click on MacBook item")
    public void User_click_on_MacBook_item() {
    	laptopNoteBookObj.clickOnmacBookLink();
    	Utils.hardWait();
    	logger.info("user clicked on MackBook item");
    }
    @And("User click add to Cart button")
    public void User_click_add_to_Cart_button() {
    	laptopNoteBookObj.clickOnmakBookAddToCartButton();
    	Utils.hardWait();
    	logger.info("user clicked on add to cart button successfully");
    }
    
    @Then("User should see a message1 {string}")
   
    public void User_should_see_a_message1 (String string) {
    	laptopNoteBookObj.isSuccessMessageIspresent();
    	Utils.hardWait();
    	logger.info("user sees the success message");
    }
    @And("User should see {string} showed to the cart")
    public void  User_should_see_showed_to_the_cart(String string) {
    	laptopNoteBookObj.isSuccessMessageIsPresent();
    	Utils.hardWait();
    	logger.info("user sees the success message");
    }
    @And("User click on cart option")
    public void User_click_on_cart_option() {
    	laptopNoteBookObj.clickOnCartButton();
    	logger.info("user clicked on cart option button");
    	Utils.hardWait();
    }
    @And("user click on red X button to remove the item from cart")
    public void user_click_on_red_X_button_to_remove_the_item_from_cart() {
    	laptopNoteBookObj.clickOnRedXButton();
    	logger.info("user clicked on red X button successfully");
    	Utils.hardWait();
    }
    
    @Then("item should be removed and cart should show {string}")
    public void item_should_be_removed_and_cart_should_show (String string) {
    	laptopNoteBookObj.isMessageZeroItemsIsDisplayed();
    	logger.info("0 item(s)message is displayed");
    	Utils.hardWait();
    }
    
    //Steps for Product Comparison.......................
    
    @And("User click on product comparison icon on MacBook")
    public void User_click_on_product_comparison_icon_on_MacBook() {
    	laptopNoteBookObj.clickOnMacBookproductComparsionLink();
    	logger.info("user clicked on product comarsion link");
    	Utils.hardWait();
    }
    @And("User click on product comparison icon on MacBook Air")
    public void User_click_on_product_comparison_icon_on_MacBook_Air() {
    	laptopNoteBookObj.clickOnMacBookAirProductComparsionLink();
    	logger.info("user clicked on macbookAir comparison link");
    	Utils.takeScreenShot();
    	Utils.hardWait();
    }
   
    @And("User click on Product comparison link")
    public void User_click_on_Product_comparison_link() {
    	laptopNoteBookObj.clickOnProductComparisonLink();
    	Utils.hardWait();
    	logger.info("user clicked on product comparison link");
    }
    @Then("User should see Product Comparison Chart")
    public void User_should_see_Product_Comparison_Chart() {
    	laptopNoteBookObj.isTextFromproductComparisonChartDisplayed();
    	Utils.hardWait();
    	logger.info("user should see the product comparison chart");
    
    }
    
    //Steps for adding to wish list.................................
    
    
    @And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
    public void  User_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list(){
    	laptopNoteBookObj.clickOnSonyVaioheartIcon();
    	logger.info("user clicked on heart icon successfully");
    	Utils.hardWait();
    }
    @Then("User should get a message {string}")
    public void User_should_get_a_message (String string) {
    	laptopNoteBookObj.messageFromUIyouMustLoginIsDisplayed();
    
    }
    //Steps for validation of price................................
    
    @And("User click on ‘MacBook Pro’ item")
    public void  User_click_on_MacBook_Pro_item() {
    	laptopNoteBookObj.clickOnMacBookProItem();
    	Utils.hardWait();
    	logger.info("user clicked on MacBook pro successfully");
    }
    @Then("User should see {string} price tag is present on UI.")
    public void user_should_see_price_tag_is_present_on_ui(String string) {
    	laptopNoteBookObj.priceTagFromUIisDisplayed();
    	Utils.takeScreenShot();
    	
    }
    
    
}
package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class DesktopPageObject extends Base{

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()= 'Desktops']")
	private WebElement destops;
	
	
	@FindBy (xpath = "//a[text()= 'Show All Desktops']")
	private WebElement allDesktops;
	
	@FindBy (tagName = "imp")
	private List<WebElement> items;
	
	@FindBy (xpath = "//a[text()= 'HP LP3065']")
	private WebElement clickOnHPLP3065;
	
	@FindBy (id = "input-quantity")
	private WebElement inputQuantity;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement addToCardButton;
	
	@FindBy (xpath= "//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPLPsuccessMessage;
	
	// first scenario elements
	
	
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEOS5D;
	@FindBy (id= "input-option226")
	private WebElement DropDown;
	
	@FindBy (xpath = "//option[contains(text(),'Blue')]")
	private WebElement selectColorBlue;
	
	@FindBy (id = "input-quantity")
	private WebElement selectQuantity;
	
	@FindBy (id = "button-cart")
	private WebElement clickOnAddToCardForCanonEOS;
	
	@FindBy (xpath= "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageforCanon;
	
	// second scenario elements
	
	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement addToCartCanon;

	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")
	private WebElement dropdownRed;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement ClickOnCanonEOS5D;

	@FindBy(xpath = "//a[normalize-space()='Write a review']")
	private WebElement clickOnWriteAReviewLink;

	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(xpath = "//*[@id='input-review']")
	private WebElement reviewTextBox;

	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement ratingRadionButton;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOncontunioButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewmessageisdisplay;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart;

	
	//3rd Scenario elements
	
	public void clickOnDesktopTab() {
		destops.click();
	}
	public void clickOnShowAllDesktops() {
		allDesktops.click();
	}
	public List<WebElement> desktopsItems(){
		List<WebElement>itemsDesk = items;
		return itemsDesk;
		
	}
	public void clickOnHPLP3065Item() {
		clickOnHPLP3065.click();
	}
	public void selectQuantitynumber(String quantityValue) {
		inputQuantity.clear();
		inputQuantity.sendKeys(quantityValue);
	}
	public void clickOnaddToCardButton() {
		addToCardButton.click();
	}

	
	public boolean validateSucessMessage() {
		if (HPLPsuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	//first scenario methods are completed
	
	public void clickOnCanonEOS5D() {
		CanonEOS5D.click();
	
	}
	public void selectColor() {
		selectColorBlue.click();
	}
	public void selectQuantity(String quantity) {
		selectQuantity.clear();
		selectQuantity.sendKeys(quantity);
	}
	public void clickOnAddtoCard() {
		clickOnAddToCardForCanonEOS.click();
	}
	
	public String successMessage() {
		String actualResult =  "Success: You have added" + successMessageforCanon.getText() + "to your shopping cart!";
		return actualResult;
	}
	
	//second scenario methods are completed
	
	
	
	public void clickOnCanonAddToCard() {
		addToCartCanon.click();
	}

	public void selectColorr() {
		dropdownRed.click();
	}

	public void ClickOnCanon() {
		ClickOnCanonEOS5D.click();
	}

	public void clickOnWriteAReviewLink() {
		clickOnWriteAReviewLink.click();
	}

	public void SelectName(String string) {
		yourName.sendKeys("ahmad");

	}

	public void sendReview(String review) {
		reviewTextBox.sendKeys(review);
	}

	public void selectRatingRadioButton() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		ratingRadionButton.click();
	}

	public void clickOncontunioButton() {
		clickOncontunioButton.click();
	}

	public void reviewmessageisdisplay() {
		reviewmessageisdisplay.isDisplayed();
	}

	public void addtocart() {
		addtocart.click();
	}
}

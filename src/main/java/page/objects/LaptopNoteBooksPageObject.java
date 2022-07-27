package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath= "//a[text()= 'Laptops & Notebooks']")
	private WebElement laptopNotebooksTab;
	
	@FindBy(xpath= "//a[text()= 'Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy(xpath= "//a[text()= 'MacBook']")
	private WebElement macBookLink;
	
	@FindBy(xpath= "//button[@id='button-cart']")
	private WebElement makBookAddToCartButton;
	
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	private WebElement successMessageforAdding;
	
	@FindBy (xpath= "//span[@id='cart-total']")
	private WebElement successMessageAfterAddingToTheCart;
	
	@FindBy (xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement cartButton;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement redXbutton;
	
	@FindBy (xpath= "//span[@id='cart-total']")
	private WebElement zeroItemShowedMessage;
	
	public void clickOnlaptopNotebooksTab() {
		laptopNotebooksTab.click();
	}
	public void clickOnshowAllLaptopsAndNotebooks() {
		showAllLaptopsAndNotebooks.click();
	}
	public void clickOnmacBookLink() {
		macBookLink.click();
	}
	public void clickOnmakBookAddToCartButton() {
		makBookAddToCartButton.click();
	}
	public boolean isSuccessMessageIspresent() {
		if(successMessageforAdding.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean isSuccessMessageIsPresent() {
		if(successMessageAfterAddingToTheCart.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnCartButton() {
		cartButton.click();
	}
	public void clickOnRedXButton() {
		redXbutton.click();
	}
	public boolean isMessageZeroItemsIsDisplayed() {
		if(zeroItemShowedMessage.isDisplayed())
			return true;
		else
			return false;
   }
	
	//First Scenario Completed
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookproductComparsionLink;
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement macBookAirProductComparsionLink;
	
	@FindBy (xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement successMessageAfterComperison;
	
	@FindBy (xpath= "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	
	@FindBy (xpath = "//h1[contains(text(),'Product Comparison')]")
	private WebElement TextFromproductComparisonChart;
	
	public void clickOnMacBookproductComparsionLink() {
		macBookproductComparsionLink.click();
	}
	public void clickOnMacBookAirProductComparsionLink() {
		macBookAirProductComparsionLink.click();
	}
	public boolean isSuccessMessageAfterCompersionDisplayed() {
		if(successMessageAfterComperison.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}
	public boolean isTextFromproductComparisonChartDisplayed() {
		if(TextFromproductComparisonChart.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	
	//second Scenario Completed
	@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyVaioheartIcon;
	
	@FindBy (xpath= "//body/div[@id='product-category']/div[1]")
	private WebElement messageFromUIyouMustLogin;
	
		
	//completed
	
	public void clickOnSonyVaioheartIcon() {
		sonyVaioheartIcon.click();
	}
	public boolean messageFromUIyouMustLoginIsDisplayed() {
		if(messageFromUIyouMustLogin.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy (xpath= "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookProItem;
	
	@FindBy (xpath= "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTagFromUI;
	
	public void clickOnMacBookProItem() {
		macBookProItem.click();
	}
	public boolean priceTagFromUIisDisplayed() {
		if(priceTagFromUI.isDisplayed())
			return true;
		else
			return false;
			
	}
	
	
	
	
}

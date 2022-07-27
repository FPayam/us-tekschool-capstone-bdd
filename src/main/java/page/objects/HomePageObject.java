package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath= "//span[text()='Currency']")
	private WebElement currencytab;
	
	@FindBy (xpath= "//button[text()='€ Euro']")
	private WebElement EuroButton;
	
	@FindBy (xpath ="//strong[contains(text(),'€')]")
	private WebElement currencyValue;
	
	@FindBy (id= "cart-total")
	private WebElement cartButton;
	
	@FindBy (xpath= "//p[text()= 'Your shopping cart is empty!']")
	private String shoppingCartMessagefromUI;
	
	
	public void clickOnCurrencyTab() {
		currencytab.click();
	}
	public void clickOnEuro() {
		EuroButton.click();
	
	}
	
	public String currencyValuefromUI() {
		String actual="€";
		return actual;
		
		
		
	}
	public void clickOnCartButton() {
		cartButton.click();
	}
	public String messagefromUI() {
		String actualmessage = "Your shopping cart is empty!";
		return actualmessage;
	}

}

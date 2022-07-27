package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utils;

public class RetailPageObject extends Utils {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy (xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(id= "input-email")
	private WebElement emailField;
	
	@FindBy (id = "input-password")
	private WebElement passwordField;
	
	@FindBy ( xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath= "//h2[contains(text(),'My Account')]")
	private WebElement MyAccountDash;
	
			
	//backR elements are completed
	
	
	@FindBy (xpath= "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement RegisterForAffiliateAccountLink;
	
	@FindBy (id = "input-company")
	private WebElement companyName;
	
	@FindBy (id = "input-website")
	private WebElement companyWebSite;
	
	@FindBy (id = "input-tax")
	private WebElement companyTaxID;
	
	@FindBy(id = "input-cheque")
	private WebElement ChequePayeeName;
	
	
	@FindBy (xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement continueButton; 
	
	@FindBy (xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement userAffiliatesuccessMsg;
	
	//First scenario elements are completed
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfoLink;
	
	@FindBy (xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]")
	private WebElement bankTransferRadioButton;
	
	@FindBy (id = "input-bank-name")
	private WebElement bankNameField;
	
	@FindBy (id = "input-bank-branch-number")
	private WebElement abaNumberField;
		
	@FindBy ( id = "input-bank-swift-code")
	private WebElement bankSwiftCodeFeild;
	
	@FindBy (id = "input-bank-account-name")
	private WebElement bankAccountName;
	
	@FindBy (id = "input-bank-account-number")
	private WebElement BankAccountNumber;
	
	@FindBy (xpath = "//input[@value= 'Continue']")
	private WebElement bankAccountContinueButton;
	
	@FindBy (xpath= "//body/div[@id='account-account']/div[1]")
	private WebElement successMsgAfterBankAccountRedioButton;
	
	//Second scenario elements are completed
	
	@FindBy (xpath = "//a[text()= 'Edit your account information']")
	private WebElement editAccountInfo;
	
	@FindBy (xpath = "//input[@value= 'Continue']")
	private WebElement editAccountInfoContinueButton;
	
	@FindBy (id = "input-firstname")
	private WebElement editAccInfoFirstName;
	@FindBy ( id = "input-lastname")
	private WebElement editAccInfoLastName;
	
	@FindBy ( id = "input-email")
	private WebElement editAccInfoEmail;
	@FindBy (id = "input-telephone")
	private WebElement editAccInfoTelephone;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editAccInfoContinueButton;
	
	@FindBy (xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement editAccInfoSuccessMsg;
	
	//Third scenario elements are completed
	
	public String textFromTestEnvironment() {
		String textFromUI= testEnvironmentText.getText();
		return textFromUI;
		
	}
	
	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}
	
	public void clickOnLoginLink() {
		loginLink.click();
		
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword( String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
		
		
	}
	public String textFromMyMyAccountDash() {
		String actualDash=MyAccountDash.getText();
		return actualDash;
		
	//backR methods are completed
		
	}
	public void clickOnRegisterAffiliatelink() {
		RegisterForAffiliateAccountLink.click();
	}
	public void companyNameField(String company) {
		companyName.sendKeys(company);
	}
	
	public void companyWebSite(String website) {
	companyWebSite.sendKeys(website);
	}
	public void companyTaxID (String taxID) {
		companyTaxID.sendKeys(taxID);
	}
	public void companyPayment( String paymentMethod) {
		ChequePayeeName.sendKeys(paymentMethod);
	}
	public void clickOnAboutUsCheckBox() {
		aboutUsCheckBox.click();
	}
	public void clickOnContinueButon() {
		continueButton.click();
	}	
	public String textFromUserAffiliate() {
	String successTextFromUI = userAffiliatesuccessMsg.getText();
	return successTextFromUI;
	
	}
	//First Scenario methods are completed
	
	public void clickOnEditAffiliateInfoLink() {
		editAffiliateInfoLink.click();
	}
	public void clickOnBankTransferRadioButton() {
		bankTransferRadioButton.click();
	}
	public void enterBankNameFeild(String bankName) {
		bankNameField.sendKeys(bankName);
	}
	public void enterAbaNumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
	}
	public void enterbankSwiftCodeFeild(String swiftCode) {
		bankSwiftCodeFeild.sendKeys(swiftCode);
	}
	public void enterbankAccountName(String accountName) {
		bankAccountName.sendKeys(accountName);
	}
	public void enterBankAccountNumber(String accountNumber) {
		BankAccountNumber.sendKeys(accountNumber);
	}
	public void clickBankAccountContinueButton() {
		bankAccountContinueButton.click();
	}
	
	public String successMsgAfterBankAccInfo() {
		String successMsgAfterBankAccInfo = successMsgAfterBankAccountRedioButton.getText();
		return 	successMsgAfterBankAccInfo;	
	}
	
	//Second Scenario methods are completed
	
	
	public void clickOnEditAccountInfo() {
		editAccountInfo.click();
	}
	public void editAccInfoFirstNameField(String firstname) {
		editAccInfoFirstName.clear();
		editAccInfoFirstName.sendKeys(firstname);
	}
	public void editAccInfoLastNameField(String lastName) {
		editAccInfoLastName.clear();
		editAccInfoLastName.sendKeys(lastName);
	}
	public void editAccInfoEmailField(String email) {
		editAccInfoEmail.clear();
		editAccInfoEmail.sendKeys(email);
		
	}
	public void editAccInfoTelephoneField(String telephone) {
		editAccInfoTelephone.clear();
		editAccInfoTelephone.sendKeys(telephone);
	}
	public void clickOnEditAccInfoContinueButton(){
		editAccInfoContinueButton.click();
	}
	
	public String textFromEditAccInfoSuccessMsg() {
		String textFromEditAccUI=editAccInfoSuccessMsg.getText();
		return textFromEditAccUI;
		
	}


	
	
} 

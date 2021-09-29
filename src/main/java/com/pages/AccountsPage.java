package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Constants;
import com.qa.util.ElementUtil;

public class AccountsPage {

	private WebDriver driver;

	//OR
	private By XPATH_EMAILID              = By.xpath("//input[@id='email_create']");
	private By ID_CREATEANACCOUNTBUTTON   = By.xpath("//span[normalize-space()='Create an account']");
	private By ID_CUSTOMERTITLE           = By.xpath("//div[@id='uniform-id_gender1']");
	private By ID_CUSTOMERFIRSTNAME       = By.id("customer_firstname");
	private By ID_CUSTOMERLASTNAME        = By.id("customer_lastname");
	private By ID_CUSTOMERPASSWORD        = By.id("passwd");
	private By ID_CUSTOMERDOBDAYS         = By.id("days");
	private By ID_CUSTOMERDOBMONTHS       = By.id("months");
	private By ID_CUSTOMERDOBYEARS        = By.id("years");
	private By ID_CUSTOMERCOMPANY         = By.id("company");
	private By ID_CUSTOMERADDRESS         = By.id("address1");
	private By ID_CUSTOMERCITY            = By.id("city");
	private By ID_CUSTOMERSTATE           = By.id("id_state");
	private By ID_CUSTOMERPOSTCODE        = By.id("postcode");
	private By ID_CUSTOMERPHONENUMBER     = By.id("phone_mobile");
	private By ID_CUSTOMERALAISADDRESS    = By.id("alias");
	private By ID_REGISTERBUTTON          = By.id("submitAccount");
	private By XPATH_CUSTOMERACCOUNT      = By.xpath("//a[@class=\"account\"]");
	private By XPATH_SIGNOUT              = By.linkText("Sign out");
	private By XPATH_IDEXIST              = By.xpath("//li[contains(text(),'An account using this email address has already be')]");



	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public void enterTheEmailID(String emailID) {

		ElementUtil.sendKeys(driver, driver.findElement(XPATH_EMAILID), Constants.EXPLICIT_WAIT, emailID);
	}

	public void clickOnCreateAnAccount() throws InterruptedException {

		ElementUtil.clickElementByJavaScript(driver.findElement(ID_CREATEANACCOUNTBUTTON), driver);
		
		Thread.sleep(10000);
	}

	public void clickOnTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ID_CUSTOMERTITLE)).click();
	}

	public void enterFirstName(String firstName) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERFIRSTNAME), Constants.EXPLICIT_WAIT, firstName);
	}

	public void enterLastName(String LastName) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERLASTNAME), Constants.EXPLICIT_WAIT, LastName);
	}

	public void enterPassword(String Password) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERPASSWORD), Constants.EXPLICIT_WAIT, Password);
	}

	public void selectDaysInDateOfBirth(int day) {

		ElementUtil.selectValueFromDropDownByText(driver.findElement(ID_CUSTOMERDOBDAYS), String.valueOf(day));
	}

	public void selectMonthInDateOfBirth(String month) {

		ElementUtil.selectValueFromDropDownByText(driver.findElement(ID_CUSTOMERDOBMONTHS), month);
	}

	public void selectYearsInDateOfBirth(int year) {

		ElementUtil.selectValueFromDropDownByText(driver.findElement(ID_CUSTOMERDOBYEARS), String.valueOf(year));
	}

	public void enterCompanyName(String companyName) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERCOMPANY), Constants.EXPLICIT_WAIT, companyName);
	}

	public void enterAddress(String companyAdress) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERADDRESS), Constants.EXPLICIT_WAIT, companyAdress);
	}

	public void enterCity(String city) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERCITY), Constants.EXPLICIT_WAIT, city);
	}

	public void selectState(String State) {

		ElementUtil.selectValueFromDropDownByText(driver.findElement(ID_CUSTOMERSTATE), State);
	}

	public void enterPostCode(int Postcode) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERPOSTCODE), Constants.EXPLICIT_WAIT, String.valueOf(Postcode));
	}

	public void enterCustomerPhoneNumber(String phonenumber) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERPHONENUMBER), Constants.EXPLICIT_WAIT, phonenumber);
	}

	public void enterAliasAddress(String AliasAddress) {

		ElementUtil.sendKeys(driver, driver.findElement(ID_CUSTOMERALAISADDRESS), Constants.EXPLICIT_WAIT, AliasAddress);
	}

	public void clickOnRegisterButton() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ID_REGISTERBUTTON)).click();
	}
	
	public String checkAccountName() {
		String text = ElementUtil.waitForElementToBeVisible(driver, XPATH_CUSTOMERACCOUNT, Constants.EXPLICIT_WAIT).getText();
		System.out.println(text);
		return text;	
	}
	
	public void clickOnSignOutButton() {

		ElementUtil.clickElementByJavaScript(driver.findElement(XPATH_SIGNOUT), driver);
	}
	
	public String checkAlreadyRegisteredEmailID() {
		String text = ElementUtil.waitForElementToBeVisible(driver, XPATH_IDEXIST, Constants.EXPLICIT_WAIT).getText();
		System.out.println(text);
		return text;	
	}
	

}

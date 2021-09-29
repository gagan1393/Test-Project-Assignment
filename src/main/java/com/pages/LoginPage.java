package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Constants;
import com.qa.util.ElementUtil;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR 
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return ElementUtil.waitForElementToBeVisible(driver, forgotPwdLink, Constants.EXPLICIT_WAIT).isDisplayed();
	}

	public void enterUserName(String username) {
		ElementUtil.sendKeys(driver, driver.findElement(emailId), Constants.EXPLICIT_WAIT, username);
	}

	public void enterPassword(String pwd) {
		ElementUtil.sendKeys(driver, driver.findElement(password), Constants.EXPLICIT_WAIT, pwd);
	}

	public void clickOnLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signInButton)).click();
	}

}

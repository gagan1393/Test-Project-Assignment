package stepdefinitions;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountsPageSteps {
	
	private AccountsPage accountsPage = new AccountsPage(DriverFactory.getDriver());
	
	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		
		DriverFactory.getDriver()
				.get(Constants.BASEURL);
		String currentUrl = DriverFactory.getDriver().getCurrentUrl();
		System.out.println("The Cuurent URL is : " + currentUrl);
		Assert.assertTrue(currentUrl.contains(Constants.BASEURL));
	  
	}

	@When("user enters the emailID {string}")
	public void user_enters_the_email_id(String emailID) {
		
		accountsPage.enterTheEmailID(emailID);
	}

	@Then("user click on create an account")
	public void user_click_on_create_an_account() throws InterruptedException {
		accountsPage.clickOnCreateAnAccount();
	   
	}

	@Then("user enter the title in personal information")
	public void user_enter_the_title_in_personal_information() {
		accountsPage.clickOnTitle();

	}

	@Then("user enter the first Name {string}")
	public void user_enter_the_first_name(String firstName) {
		accountsPage.enterFirstName(firstName);
	}

	@Then("user enter the last Name {string}")
	public void user_enter_the_last_name(String LastName) {
		accountsPage.enterLastName(LastName);
	}

	@Then("user enter the password {string}")
	public void user_enter_the_password(String Password) {
		accountsPage.enterPassword(Password);
	}

	@Then("user enter the company {string}")
	public void user_enter_the_company(String companyName) {
		accountsPage.enterCompanyName(companyName);
	}

	@Then("user enter the Address {string}")
	public void user_enter_the_address(String companyAdress) {
		accountsPage.enterAddress(companyAdress);
	}

	@Then("user enter the city {string}")
	public void user_enter_the_city(String city) {
		accountsPage.enterCity(city);
	}

	@Then("user enter the state {string}")
	public void user_enter_the_state(String State) {
		accountsPage.selectState(State);
	}

	@Then("user enter the pincode {int}")
	public void user_enter_the_pincode(Integer Postcode) {
		accountsPage.enterPostCode(Postcode);
	}

	@Then("user enter the Phone Number {string}")
	public void user_enter_the_phone_number(String phonenumber) {
		accountsPage.enterCustomerPhoneNumber(phonenumber);
	}

	@Then("user enter the address of an alias {string}")
	public void user_enter_the_address_of_an_alias(String AliasAddress) {
		accountsPage.enterAliasAddress(AliasAddress);
	}

	@Then("user click on Register button")
	public void user_click_on_register_button() {
		accountsPage.clickOnRegisterButton();
	}
	
	@Then("user verify the FirstName and LastName {string} showing correct")
	public void user_verify_the_first_name_and_last_name_showing_correct(String ExpectedAccountName) {
		String ActualAccountName = accountsPage.checkAccountName();
		Assert.assertTrue(ActualAccountName.contains(ExpectedAccountName));
	}

	@Then("user click on signout button")
	public void user_click_on_signout_button() {
		accountsPage.clickOnSignOutButton();
	}

	@Then("verify the title after signout {string}")
	public void verify_the_title_after_signout(String ExpectedTitle) {
		String accountsPageTitle = accountsPage.getAccountsPageTitle();
		System.out.println("The Title of the page is :" + accountsPageTitle);
		Assert.assertTrue(accountsPageTitle.contains(ExpectedTitle));
	}
	
	@Then("user should get the message of Registered Email ID {string}")
	public void user_should_get_the_message_of_registered_email_id(String ExpectedMessage) {
		String ActualMessage = accountsPage.checkAlreadyRegisteredEmailID();
		Assert.assertTrue(ActualMessage.contains(ExpectedMessage));
	}
}

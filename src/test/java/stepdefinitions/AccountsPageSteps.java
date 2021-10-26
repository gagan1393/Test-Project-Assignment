package stepdefinitions;

import com.pages.PersonalInformation;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import com.pages.AccountsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;


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

    @Then("user enter following user details")
    public void user_enter_following_user_details(DataTable dataTable) {

        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
        System.out.println(userList);
        PersonalInformation personalinfo = new PersonalInformation(userList.get(0).get("FirstName"), userList.get(0).get("LastName"),
                userList.get(0).get("Password"), userList.get(0).get("Company"),
                userList.get(0).get("Address"), userList.get(0).get("City"),
                userList.get(0).get("State"), userList.get(0).get("Pincode"),
                userList.get(0).get("PhoneNumber"), userList.get(0).get("AddressAlias"));

        accountsPage.getPersonalInformationData(personalinfo);
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

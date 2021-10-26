Feature: Account Page Feature

Background:
Given user is on Accounts page
When user enters the emailID "testingworld99677@gmail.com"
Then user click on create an account


Scenario: Accounts page creation
Then user enter the title in personal information
And user enter following user details
  | FirstName | LastName | Password| Company | Address | City | State | Pincode | PhoneNumber | AddressAlias |
  | sam | peter | peter@12345| javaworld | street2 opposite park | Newyork | Alaska | 12345 | 9999999999 | hellworld |
Then user click on Register button
And user verify the FirstName and LastName "sam peter" showing correct
Then user click on signout button
And verify the title after signout "Login - My Store"


Scenario: verifying Registered Account EmailID after creation
Then user should get the message of Registered Email ID "An account using this email address has already be"
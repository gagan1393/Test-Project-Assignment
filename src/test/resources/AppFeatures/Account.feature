Feature: Account Page Feature

Background:
Given user is on Accounts page
When user enters the emailID "testingworld99888@gmail.com"
Then user click on create an account


Scenario: Accounts page creation
Then user enter the title in personal information
And user enter the first Name "sam"
And user enter the last Name "peter"
And user enter the password "peter@12345"
And user enter the company "javaworld"
And user enter the Address "street2 opposite park"
And user enter the city "Newyork"
And user enter the state "Alaska"
And user enter the pincode 12345
And user enter the Phone Number "9999999999"
And user enter the address of an alias "hellworld" 
Then user click on Register button
And user verify the FirstName and LastName "sam peter" showing correct
Then user click on signout button
And verify the title after signout "Login - My Store"


Scenario: verifying Registered Account EmailID after creation
Then user should get the message of Registered Email ID "An account using this email address has already be"
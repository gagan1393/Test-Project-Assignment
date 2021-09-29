# Test-Project-Assignment

@Author: Gagan Deep Prashar

#About Framework!!!

This is BDD framework using Selenium - Cucumber : Automation Testing Using Java

BDD Framework created using cucumber with Selenium with Java Language. Using Maven build tool to maintain all the libraries in one place under pom.xml file. And for unit test, using JUnit framework and for reporting, i am using Extent Reports to publish the extent report in HTML and PDF format.

#How the framework works?

In the Framework, I have created Features files for writing all the features, available inside src/test/resources/AppFeature folder for Features file, I have used Gherkin Language

Feature
Background
Scenario
Given
When
Then
And
Then i have created Steps Definition files, available under src/test/java/stepdefinitions package For Step definition, i have used junit framework.

I am using page object model (POM), all the locators and web element are under src/main/java folder Under this folder, I have created some utilities namely:

com.pages - All the locators, constructors and page actions for features(behavior) of the page the form of methods are created.
com.qa.factory - Driver Factory: Driver factory, where i am initializing the driver. In This method i have used to initialize the thread local driver on the basis of given browser.
com.qa.util - ConfigProperty - This method is used to load the properties from config.properties file, In properties file, i am calling the browser
com.qa.util - Constants - This is final static constant file, where all the Path, timeouts and BaseURL is wriiten
com.qa.util - ElementUtil - Here i have created the utilities for click, sendkeys, element tobe visible, selectavalue from dropdown and javascript excutor
Then under src/test/java - these are folder i have created

ApplicationHooks - in this class, i am calling the driverfactoryclass and webdriver. Here i have given the Hooks also using @Before(order = ) and @After(order = )
In the same class i have created a method for screenshot also, if any scenario failed, the screenshot will be taken and paste it in the extent report
StepDefinition - I have written the testcases for the feature file and verifying using Junit Assertion. I have created an object for page class and calling all the methods.
TestRunner - Here i am calling the path of feature file and step definitions files. And from here we have to run the testcases.
Under src.test.resources -

App feature: All the feature file using Gherkin language, is available inside that folder
config folder - the properties files, where i am calling the browser is written inside that file
extent.properties - These are the properties which will be published inside the extent report, anything need to change regarding the app name or anything, should be change from here
extent.comfig.xml - this is the deafalt xml file which we need to publish the extent report
For Extent Report, I am using - Grasshopper Report library for generating the extent report
After running the Testcases, the extent report will be saved inside the test-output folder (PDF and HTML report)

pom.xml - These are the Libraries i am using for the Framework and TestRunner class

<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>${cucumber.version}</version>
		<scope>test</scope>
	</dependency>

	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>${cucumber.version}</version>
		<scope>test</scope>
	</dependency>

	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>${junit.version}</version>
		<scope>test</scope>
	</dependency>

	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>3.141.59</version>
	</dependency>

	<dependency>
		<groupId>io.github.bonigarcia</groupId>
		<artifactId>webdrivermanager</artifactId>
		<version>4.2.2</version>
	</dependency>

	<dependency>
		<groupId>tech.grasshopper</groupId>
		<artifactId>extentreports-cucumber6-adapter</artifactId>
		<version>2.6.0</version>
		<scope>test</scope>
	</dependency>

Run Test Suite

# This is the Test Runner File

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/AppFeatures"},
	glue = {"stepdefinitions", "AppHooks"},
	plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
	)
  
  # If you have to run on Parallel Mode
  Just we have make a true in maven-failsafe-plugin in pom.xml
  Then it will run on parellel mode, right now its false
  <!-- UNCOMMENT BELOW 3 LINES - To execute using parallel or combination 
								option -->
							<parallel>methods</parallel>
							<threadCount>1</threadCount>
							<perCoreThreadCount>false</perCoreThreadCount>

  
#How to use this framework?

1. Clone the repository to your workspace.
2. Open the command prompt and change the directory to workspace
3. Run this command - git clone https://github.com/gagan1393/Test-Project-Assignment.git
4. It will save it in your workspace directory
5. Now from command prompt run this command - mvn verify
6. It will start running the Tests
7. After the Tests are over, the extent report will be available inside the test-output folder
8. if anycase got failed, the screenshot will also be pasted inside the extent reports. (for demo purpose: i have delibrately failed 2 cases earlier. the reports are avialable inside the testout folder).

Please feel free to give the feedback :)

Regards

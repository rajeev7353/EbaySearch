# **EbaySearch**
TechChallange


**Codes and Test Prepared by:**

Rajeev Dahal

Software QA Engineer

rajeev.dahal17@gmail.com

https://www.linkedin.com/in/rajeevdahal/

**Build Tool**: Maven

**Test Framework**: Cucumber BBD (with JUnit Assertions)

**Environments:**

https://www.ebay.co.uk

http://localhost:8080/get/all

http://localhost:8080/post

**Installation (pre-requisites)**

JACA 12 +JDK (make sure Java class path is set)

Maven 

Intellij IDEA

Maven

Cucumber plugin

IntelliJ Gherkin Plugin

Browser driver (make sure you have your desired browser driver and class path is set)

**Test RUN**

*Note*: To run the scenarios, use @wip tag for all feature test

in the CukesRunner class/Cucumber Options.

**Way 1:** 

Clone the projects

Import maven dependencies from POM

Go src -> test > java > Runners > CukesRunner and Run

To generate "HTML Maven Cucumber Report" ;

Open Maven right side panel Double Click Project's Lifecycle Click "verify"

**Way 2:**

Run from command line invoke mvn clean verify

**Test Reports Locations**

1- Cucumber HTML Plugin Reports target -> cucumber-html-reports > overview-features.html (Right Click and Open in any Browser )

2- When you run my project, Cucumber will create automatically online report link. You can click the link and check 
the all test steps and status.


**The Page Object Design Pattern**
Within your web app's UI there are areas that your tests interact with. A Page Object simply models these as objects within the test code.
This reduces the amount of duplicated code and means that if the UI changes, the fix need only be applied in one place. In other wards one 
of the challenges of writing test automation is keeping your [selectors] ( classes, id's, or xpath' etc.) up to date with the latest version 
of your code. The next challenge is to keep the code you write nice and DRY (Don't Repeat Yourself). The page object pattern helps us accomplish 
this in one solution. Instead of including our selectors in our step definitions(in cucumber) we instead place them in a .java file where we can
manage all these selectors and methods together. Your test file should only call the test methods.
You can also place reusable methods or logic inside of these pages and call them from your step java files. The page object serves as a layer of 
abstraction between tests and code. When A test fails, it fails on a individual step. That step may call a selector that is no longer valid, but 
that selector may be used by many other steps. By having a single source of truth of what the selector is supposed to be, fixing one selector on 
the page object could repair a number of failing tests that were affected by the same selector.

**Rest API testing using Rest-Assured Java Framework**

This repository is based on cucumber REST API testing framework.
The public API used for this example is - https:http://localhost:8080/get/all, http://localhost:8080/post
This framework is developed using Rest-Assured library for Rest API testing.



**To Run API Tests**

To run the API the Wiremock server must be up and runnign.Follow the below step to run the API.
1. Download the mocked API endpoints provided in email(directory will be provided in email)
2.locate the Wiremock dirctory from terminal.
3. run the following command: java -jar wiremock-jre8-standalone-2.33.2.jar --port=8080 --verbose from commandline(standalone sever jar file is provided in the same Wmock directory)
4. once the server is up and running ; run the scenarios, use @wip tag for all feature test
in the CukesRunner class/Cucumber Options


**Additional Information**
All the test are passed in my Machine. 



August 2022 

https://github.com/rajeev7353/EbaySearch


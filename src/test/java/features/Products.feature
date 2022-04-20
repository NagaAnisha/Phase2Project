@product_feature
Feature: Product Feature

Background: Login of application
		Given user have opened the Swag Labs application in browser
    When user enter username "problem_user"
    And user enter password "secret_sauce"
    And user click on the login button
    Then user should be landed on home page
    
   
	 
  @Sanity	
  Scenario:Datatable Validate the product costs
    When user have the following product list for price validation
    |Sauce Labs Backpack|$29.99|   
    |Sauce Labs Bike Light|$9.99|
    |Sauce Labs Bolt T-Shirt|$15.99|
    |Sauce Labs Fleece Jacket|$49.99|
    |Sauce Labs Onesie|$7.99|
    |Test.allTheThings() T-Shirt (Red)|$15.99| 
    Then user validate the all the products price
    
    
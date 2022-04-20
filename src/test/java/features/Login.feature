@login_feature
Feature: Login Feature

	 
  @Regression	
  Scenario Outline: Validate the successful Login
    Given user have opened the Swag Labs application in browser
    When user enter username "<username>"
    And user enter password "<password>"
    And user click on the login button
    Then user should be landed on home page
    
    Examples:
    	| username    | password |
    	| standard_user | secret_sauce |
    	
  @Regression	
  Scenario Outline: Validate the Unsuccessful Login
    Given user have opened the Swag Labs application in browser
    When user enter username "<username>"
    And user enter password "<password>"
    And user click on the login button
    Then user should get an error message "<err_msg>"
    
    Examples:
    	| username    | password |err_msg|
    	| dynamic_user | secret_sauce |Epic sadface: Username and password do not match any user in this service|
	    	

	
		     
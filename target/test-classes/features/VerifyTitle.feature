Feature: Home Page Validation

  @home_page
  Scenario: Check Title and elements
  	Given User Launches the application
  	Then Verify for Title
  	And Verify for elements
  	
  	@home_page
  	Scenario: Tap On EnButton and Verify for Home Page
  	Given User Launches the application
  	Then Clicks on ENButton
  	Then Selects Option NoNo
  	Then Home Page should be displayed
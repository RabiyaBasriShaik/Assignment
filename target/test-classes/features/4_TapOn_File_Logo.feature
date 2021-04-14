Feature: tap on File Logo	

  	
	@home_page
  	Scenario: Tap On File Logo and Verify for Elements
  	 Given User Launches the application
  	And Clicks on FileLogo
  	Then Verify for Title
  	And Text Welcome to register is displayed
  	And File Page elements are displayed
  	And Default Name and launguage are Prepopulated
  	When user enters values in Fields
  	And Check I Accept Ads
  	And Tap on Register User
  	Then user details should be displayed on RegistrationScreen
  	When Tap on Register User to Navigate to HomePage
  	Then Home Screen is displayed
		
  	
 
  
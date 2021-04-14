Feature: tap on Chrome Logo	

  	
	@chrome_page
  	Scenario: Tap On Chrome Logo and Verify for Elements
  	 Given User Launches the application
  	And Clicks on ChromeLogo
  	Then Title WebViewInteraction is displayed
  	And Text Hello,Can.. is displayed
  	When user enters name in textbox
  	And selects a car 
  	And Tap on send me your name
  	Then Text This is My... is displayed
  	And Selected Name and Car are displayed
  	When Click on Link here
  	Then Default Preferred car is displayed
		
  	
 
  
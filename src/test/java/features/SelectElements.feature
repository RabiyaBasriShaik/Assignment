Feature: Select elemtns 

  	
	@selectelements
  	Scenario: Verify Select Multiple Items
  	 Given User Navigates to URL
  	When Cicks on Selectable
  	
  	And Selects Items
  	 
  	 @selectelements
  	Scenario: Select options from control group
  	 Given User Navigates to URL
  	When Cicks on ControlGroup
  	
  Then Selects Items from ControlGroup
  	
  	
 
  
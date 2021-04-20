Feature: Display Toast Text	Display Pop UP

  Background: 
    Given User Launches the application

  @Elements_test
  Scenario: Tap On Dsiplay Toast
    When Clicks on Dsiplay Toast
    Then Toast Message should appear

  @Elements_test
  Scenario: Tap On Dsiplay popUP
    When Clicks on Dsiplay Popup
    Then Tap On Dismiss

  @Elements_test
  Scenario: Press to throw Exception
    When Clicks on Press to throw exception
    Then Application should be crashed

  @Elements_test
  Scenario: Type to throw Exception
    When Enters Text to throw exception
    Then Application should be crashed

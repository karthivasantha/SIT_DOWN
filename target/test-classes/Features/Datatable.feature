

Feature: To validate the login functionality.
  Scenario: To validate login with invalid crendentials.
    Given user is in facebook login page
    When user enter invalid name and passsword
   	|username|password|
   	|java|java@123|
   	|	MadhanGovind|Madhan@21|
   		
   
    And use click login button
    When user enter location and no of rooms and "<checkin>" and "<checkout>" and adults.
    And user click search button
    And user select the available hotel by radiobutton and click continue.
    When user enter "<firstname>" and "<lastname>" and "<address>" and "<creditcard>" and creditcardtype and ccexpirymonth and ccexpiryyear and "<cvv>"
    And user click book now.

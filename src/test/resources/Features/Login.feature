Feature: To validate the login functionality.

  Scenario Outline: To validate login with invalid crendentials.
    Given user is in facebook login page
    When user enter invalid "<name>" and "<passsword>"
    And use click login button
    When user enter location and no of rooms and "<checkin>" and "<checkout>" and adults.
    And user click search button
    And user select the available hotel by radiobutton and click continue.
    When user enter "<firstname>" and "<lastname>" and "<address>" and "<creditcard>" and creditcardtype and ccexpirymonth and ccexpiryyear and "<cvv>"
    And user click book now.
    Then user check the order no print or not

    Examples: 
      | name         | passsword | checkin    | checkout   | firstname | lastname | address     | creditcard       | cvv |
      | MadhanGovind | Madhan@21 | 09/03/2021 | 10/03/2021 | karthi    | g        | krishnagiri | 1234567891234567 | 123 |

Feature: To validate the Adactin Page

  Scenario: To validate the user details
    Given User is on the Adactin homepage
    When User enters his details
      | userName | Rock12345 |
      | password | Rock12345 |
    And User clicks the login button
    And User should verify the message
    And User should search hotel
      | location | Hotels         | roomtypes    | numberofrooms | adultsperroom | childrenperroom |
      | London   | Hotel Sunshine | Super Deluxe | 3 - Three     | 2 - Two       | 1 - One         |
    And User enters payment
      | firstname | lastname | billingaddress | creditcardnumber | creditcardtype | expirymonth | expiryyear | cvvnumber |
      | vickey    | vijay    | Sydney         | 9765432112345678 | VISA           | April       |       2022 |       234 |
    Then User gets orderid

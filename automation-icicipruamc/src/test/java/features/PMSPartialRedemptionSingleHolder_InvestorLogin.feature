@PartialSingleHolder
Feature: Investor Login PMS Partial Redemption for Single Holder

Scenario: Successful login with PAN and password
   Given the user is on the login page
   When User login into application with <Username> and password <Password>
   Then dashboard page should be display

 Examples:
   |Username | Password |
   |XXXXX2229X|Reset@123|

  Scenario: Investor navigates to the redemption page
    Given the investor is on the dashboard page
    When the investor clicks on the Redemption Module from the side menu
    Then the investor should be on the redemption page

  Scenario: Investor selects PMS redemption option
    Given the investor is on the redemption Page
    When the investor selects <holderName> from the dropdown
    And the investor selects the Strategy checkbox
    And the investor clicks on the Partial radio button

   Examples:
    | holderName               | amount
    | Mahadev Haridas Gavhane  |100000

  Scenario: Investor enters invalid and valid amounts and verifies error validation messages
    Given the investor is on the redemption page
    When the investor enters an amount <amount> less than 2 Lakhs in the amount field
    Then the investor should see a validation message for the minimum amount requirement
    When the investor enters an amount equal to the AUM amount
    Then the investor should see a validation message for the maximum amount
    When the investor does not enter an amount and clicks on the redeem button
    Then the redeem button should be disabled

  Scenario: Investor redeems investment and verifies details
    Given the investor is on the PMS redemption page
    When the investor enters partial amount
    And the investor is click on Redeem button
    Then the L2 screen is displayed
    And the investor clicks on the T&C checkbox 
    And the investor clicks on redeem amount button
    And the investor enters the OTP

  Scenario: Investor verifies transaction in recent transactions page
    Given the investor is on the dashboard page
    When the investor clicks on the recent transaction option from the side menu
    Then the investor should see the entry in the transaction list
    And the status of the transaction should be displayed correctly
    
 
   
   
   
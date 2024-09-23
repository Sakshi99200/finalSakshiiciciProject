#Feature: Distributor login and Partial redemption process for single holder with Investor approval
#
  #Scenario: Distributor logs in and navigates to the redemption page
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the redemption option
    #Then the redemption page should be displayed
#
  #Scenario: Distributor selects PAN number and initiates partial redemption
    #Given the distributor is on the redemption page
    #When the distributor selects "PAN Number" from the dropdown
    #And the distributor selects the "Single Holder" name
    #And the distributor selects the strategy checkbox
    #And the distributor clicks on the partial redemption radio button
    #Then no error validation should be displayed
#
  #Scenario: Distributor enters amount for redemption and checks validation
    #Given the distributor is on the partial redemption screen
    #When the distributor enters an amount less than 2L in the amount field
    #Then a validation message should be displayed
    #When the distributor enters the amount equal to the AUM amount
    #Then no validation message should be displayed
    #When the distributor does not enter any amount and clicks on the redeem button
    #Then the redeem button should remain disabled
#
  #Scenario: Distributor redeems the full AUM amount
    #Given the distributor is on the partial redemption screen
    #When the distributor enters the AUM amount and clicks on the redeem button
    #Then the L2 screen should be displayed
    #And the entered amount should be displayed on the L2 screen
    #When the distributor clicks on the confirmation checkbox
    #And the distributor clicks on the redeem amount button
    #And the distributor enters the OTP
    #Then a success validation message should be displayed
#
  #Scenario: Distributor verifies the transaction in recent transactions
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the recent transaction option from the side menu
    #Then the transaction entry should be displayed
    #And the status of the transaction should be displayed correctly
#
  #Scenario: Investor logs in and approves the distributor's redemption request
    #Given the investor is logged in
    #And the dashboard page is displayed
    #When the investor clicks on the Distributor transaction request option from the side menu
    #Then the request entry should be displayed
    #When the investor clicks on the proceed button for the request
    #Then the L2 screen should be displayed
    #When the investor clicks on the approve button
    #And the investor clicks on the recent transaction page from the side menu
    #Then the status of the entry should be updated and displayed correctly
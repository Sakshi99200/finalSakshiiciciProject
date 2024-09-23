#Feature: Distributor Full Redemption for single holder and Investor Approval
#
  #Scenario: Distributor logs in and navigates to the redemption page
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the redemption option
    #Then the redemption page should be displayed
#
  #Scenario: Distributor selects PAN and single holder for full redemption
    #Given the distributor is on the redemption page
    #When the distributor selects "PAN Number" from the dropdown
    #And the distributor selects "Single Holder Name" from the dropdown
    #And the distributor selects the strategy checkbox
    #And the distributor clicks on the full redemption radio button
    #And the distributor clicks on the redeem button
    #Then the L2 screen should be displayed
#
  #Scenario: Distributor confirms the redemption on L2 screen
    #Given the distributor is on the L2 screen
    #Then the entered amount should be displayed on the L2 screen
    #When the distributor clicks on the confirmation checkbox
    #And the distributor clicks on the redeem amount button
    #And the distributor enters the OTP
    #Then the distributor should see a success validation message
#
  #Scenario: Distributor verifies recent transaction
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the recent transaction option from the side menu
    #Then the distributor should see the entry in the transaction list
    #And the status of the transaction should be displayed correctly
#
  #Scenario: Investor logs in and checks distributor's transaction request
    #Given the investor is logged in
    #And the dashboard page is displayed
    #When the investor clicks on the Distributor transaction request option from the side menu
    #Then the request entry should be displayed
#
  #Scenario: Investor proceeds and approves the distributor’s request
    #Given the investor is on the Distributor transaction request page
    #When the investor clicks on the proceed button for the request
    #Then the L2 screen should be displayed
    #When the investor clicks on the approve button
    #Then the transaction status should be updated to "Payment is in progress"
#
  #Scenario: Investor verifies transaction status after approval
    #Given the investor is logged in
    #And the dashboard page is displayed
    #When the investor clicks on the recent transaction page from the side menu
    #Then the status of the transaction should be displayed as "Payment is in progress"

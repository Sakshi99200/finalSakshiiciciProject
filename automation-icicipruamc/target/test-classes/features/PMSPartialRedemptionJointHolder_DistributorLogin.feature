#Feature: Distributor partial Redemption for Joint holder and Approval Flow
#
  #Scenario: Distributor logs in and navigates to the redemption page
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the redemption option
    #Then the redemption page should be displayed
#
  #Scenario: Distributor selects joint holder and strategy
    #Given the distributor is on the redemption page
    #When the distributor selects the PAN number from the dropdown
    #And the distributor selects the joint holder name
    #And the distributor selects the strategy checkbox
    #And the distributor clicks on the partial radio button
    #Then the error validation should be checked
#
  #Scenario: Distributor validates amount fields
    #Given the distributor is on the redemption page
    #When the distributor enters an amount less than 2L in the amount field
    #Then the validation message should be displayed
    #When the distributor enters an amount equal to the AUM amount
    #Then the validation message should be displayed
    #When the distributor does not enter an amount and clicks on the redeem button
    #Then the redeem button should be disabled
#
  #Scenario: Distributor completes redemption process
    #Given the distributor is on the redemption page
    #When the distributor enters the AUM amount in the amount field
    #And the distributor clicks on the redeem button
    #Then the L2 screen should be displayed
    #And the entered amount should be displayed on the screen
#
  #Scenario: Distributor confirms redemption with OTP
    #Given the distributor is on the L2 screen
    #When the distributor clicks on the confirmation checkbox
    #And the distributor clicks on the redeem amount button
    #And the distributor enters the OTP
    #Then a success validation message should be displayed
#
  #Scenario: Distributor verifies recent transaction
    #Given the distributor is on the dashboard page
    #When the distributor clicks on the recent transaction option from the side menu
    #Then the transaction entry should be displayed in the list
    #And the status of the transaction should be correctly displayed
#
  #Scenario: Investor logs in and approves distributor's request
    #Given the investor is logged in
    #And the dashboard page is displayed
    #When the investor clicks on the Distributor transaction request option from the side menu
    #Then the request entry should be displayed
    #When the investor clicks on the proceed button for the request
    #Then the L2 screen should be displayed
    #When the investor clicks on the approve button
    #Then the transaction status should be updated to "Payment is in progress"
#
  #Scenario: Joint Holder logs in and approves the transaction
    #Given the Joint Holder is logged in
    #And the dashboard page is displayed
    #When the Joint Holder clicks on the JH request tab
    #Then the placed transaction should be displayed
    #When the Joint Holder clicks on the approve button for the transaction
    #Then the transaction status should show as "Payment is in progress"
#
  #Scenario: Investor verifies transaction status after Joint Holder approval
    #Given the investor is logged in
    #And the dashboard page is displayed
    #When the investor clicks on the recent transaction page from the side menu
    #Then the status of the transaction should be displayed as "Payment is in progress"

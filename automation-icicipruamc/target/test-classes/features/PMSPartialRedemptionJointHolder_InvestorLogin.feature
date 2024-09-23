#Feature: Investor Login PMS Partial Redemption for Joint Holder
#
#Scenario: Investor logs in and navigates to the redemption page
 #Given the investor is logged in
 #And the dashboard page is displayed
 #When the investor clicks on the redemption option
 #Then the redemption page should be displayed
 #
#Scenario: Investor selects redemption options
 #Given the investor selects "<Joint Holder>" from the dropdown
 #And the investor selects the strategy checkbox
 #And the investor clicks on the partial radio button
 #
#Scenario: Verify AUM Amount for partial redemption
 #Given the investor is on the redemption page
 #When the investor verifies that selected strategy cards' total AUM amount is greater than 2L
 #Then no error validation should be displayed for the selected card
 #
#Scenario: Verify error validation for AUM amount field
 #Given the investor is on the redemption page
 #When the investor enters an amount less than 2L in the amount field
 #Then the investor should see an error validation message for the minimum amount requirement
 #
#Scenario: Verify error validation message for entering AUM amount equal to selected strategy cards' total AUM Amount
 #Given the investor is on the redemption page
 #When the investor enters an AUM amount equal to the selected strategy cards' total AUM amount
 #Then the investor should see an error validation message for the minimum amount requirement
 #
#Scenario: Verify flow for attempt redemption without entering AUM Amount
 #Given the investor is on the redemption page
 #When the investor does not enter an AUM amount and clicks on the redeem button
 #Then the investor should see the redeem button is disabled
 #
#Scenario: Verify investor enters valid AUM amount and clicks on Redeem Button
 #Given the investor is on the redemption page
 #When the investor enters an AUM amount greater than or equal to 2L
 #And clicks on the Redeem button
 #Then the investor should see the L2 screen 
 #
#Scenario: Complete redemption process
 #Given the investor is on the L2 screen
 #When the investor clicks on the T&C checkbox button 
 #And clicks on the Redeem Amount button
 #And enters OTP and clicks on the proceed button
 #Then the redemption process should be completed
 #
#Scenario: Verify placed transaction entry on Recent Transaction Page
 #Given the investor is on the dashboard page
 #When the investor clicks on Recent transaction page from side menu
 #Then the investor should see the placed transaction entry on the recent transaction page
 #And the status of the transaction should be displayed correctly
  #
#Scenario: Joint holder logs in and navigates to JH approval request tab
 #Given the Joint holder is logged in 
 #And the dashboard page is displayed
 #When the Joint holder clicks on JH approval request tab
 #Then the JH request page should be displayed
#
#Scenario: Investor verifies the status of the approved transaction
 #Given the investor is logged in
 #When the investor is on the recent transactions page
 #And the investor finds the relevant transaction
 #Then the status of the transaction should be displayed as "Payment is in progress"
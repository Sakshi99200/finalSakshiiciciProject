#Feature: Investor login Full Redemption with Joint Holder Approval
#
#Scenario: Investor logs in and navigates to the redemption page
  #Given the investor is logged in
  #And the dashboard page is displayed
  #When the investor clicks on the redemption option
  #Then the redemption page should be displayed
#
  #Scenario: Investor selects joint holder and initiates full redemption
  #Given the investor is on the redemption page
  #When the investor selects "Joint Holder" from the dropdown
  #And the investor selects the strategy checkbox
  #And the investor clicks on the full redemption radio button
  #And the investor clicks on the redeem button
  #Then the L2 screen should be displayed
  #And the entered amount should be displayed on the L2 screen
  #
  #Scenario: Investor confirms the redemption with OTP
  #Given the investor is on the L2 screen
  #When the investor clicks on the confirmation checkbox
  #And the investor clicks on the redeem amount button
  #And the investor enters the OTP
  #Then the investor should see a success validation message
  #
  #Scenario: Investor verifies the transaction in recent transactions
  #Given the investor is logged in
  #And the dashboard page is displayed
  #When the investor clicks on the recent transaction option from the side menu
  #Then the investor should see the entry in the transaction list
  #And the status of the transaction should be displayed correctly
#
  #Scenario: Joint holder logs in and approves the transaction
  #Given the joint holder is logged in
  #And the dashboard page is displayed
  #When the joint holder clicks on the JH request tab
  #Then the placed transaction should be displayed
  #When the joint holder clicks on the approve button for the transaction
  #Then the transaction status should be updated to "Payment is in progress"
  #
  #Scenario: Investor verifies transaction status after joint holder approval
  #Given the investor is logged in
  #And the dashboard page is displayed
  #When the investor clicks on the recent transaction option from the side menu
  #Then the status of the transaction should be displayed as "Payment is in progress"
  #
  
#Feature: Investor Login PMS Full Redemption for Single Holder 
#
#Scenario: Investor logs in and navigates to redemption page
  #Given The investor is logged in 
  #And the dashboard page is displayed
  #When the investor clicks on the Redemption Module from the side menu
  #Then the PMS Redemption page should be displayed on screen
  #
#Scenario: Investor selects PMS redemption option and verifies selected strategy card AUM amount is greater than 15L
  #Given the investor is on the redemption page
  #When the investor selects "Single Holder" from the dropdown
  #And the investor selects the Strategy checkbox 
  #And the investor verifies that the selected strategy card AUM amount is greater than 15L 
  #And the investor clicks on the redeem button
  #Then the L2 screen should be displayed  
  #
#Scenario: Investor redeems investment and verifies details
  #Given the investor is on the L2 Screen
  #When the investor clicks on the T&C checkbox 
  #And the investor clicks on the redeem amount button
  #And the investor enters the OTP
  #Then the investor should see a success validation message
   #
#Scenario: Investor verifies transaction in recent transactions page 
  #Given the investor is on the dashboard page
  #When the investor clicks on the recent transaction option from the side menu
  #Then the investor should see the entry in the transaction list
  #And the status of the transaction should be displayed correctly

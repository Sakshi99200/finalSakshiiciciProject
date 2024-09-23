#Feature: Distributor Redemption and Approval Workflow
#
  #Scenario: Distributor logs in and navigates to the redemption page
    #Given the distributor is logged in
    #And the dashboard page is displayed
    #When the distributor clicks on the redemption option
    #Then the redemption page should be displayed
#
  #Scenario: Distributor initiates full redemption
    #Given the distributor is on the redemption page
    #When the distributor selects the PAN number from the dropdown
    #And the distributor selects the joint holder name
    #And the distributor selects the strategy checkbox
    #And the distributor clicks on the full radio button
    #And the distributor clicks on the redeem button
    #Then the L2 screen should be displayed
#
  #Scenario: Distributor verifies L2 screen details
    #Given the distributor is on the L2 screen
    #Then the entered amount should be displayed on the screen
#
  #Scenario: Distributor completes redemption with OTP
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
  #Scenario: Investor logs in and reviews distributor's transaction request
    #Given the investor is logged in to verify distributor trsanction request
    #And the dashboard page is displayed
    #When the investor clicks on the dashboard from the side menu
    #And the investor clicks on the Distributor transaction request option
    #Then the request entry should be displayed
#
  #Scenario: Investor approves distributor's transaction request
    #Given the investor is on the Distributor transaction request page
    #When the investor clicks on the proceed button for the request
    #Then the L2 screen should be displayed
    #When the investor clicks on the approve button
    #And the investor clicks on the recent transaction page from the side menu
    #Then the transaction entry status should be correctly displayed
#
  #Scenario: Joint Holder Investor logs in and reviews transaction
    #Given the Joint Holder Investor is logged in
    #And the dashboard page is displayed
    #When the Joint Holder Investor clicks on the JH request tab
    #Then the placed transaction should be displayed
#
  #Scenario: Joint Holder Investor approves the transaction
    #Given the Joint Holder Investor is on the JH request tab
    #When the Joint Holder Investor clicks on the approve button for the transaction
    #Then the status of the transaction should show as "Payment is in progress"

#Feature: Investor Additional Purchase Workflow
#
  #Scenario: Investor logs in and navigates to the Additional Purchase page
    #Given the investor is logged in to the portal
    #And the dashboard page is displayed on the screen
    #When the investor clicks on the Additional Purchase option from the side menu
    #Then the Additional Purchase page should be displayed
#
  #Scenario: Investor selects single holder and enters amount for existing strategy
    #Given the investor is on the Additional Purchase page1
    #When the investor selects "<Single Holder>" from the dropdown for existing strategy
    #And the investor clicks on the strategy checkbox
    #And the investor enters an amount for the existing strategy
    #Then the amount should be entered correctly
#
  #Scenario: Investor completes the purchase process
    #When the investor clicks on the Purchase button
    #Then the L2 screen should be displayed on the screen
#
  #Scenario: Investor selects payment mode and proceeds to payment
    #Given the investor is on the L2 screen
    #When the investor selects "Online Payment" as the mode of payment
    #And the investor clicks on "Net Banking"
    #And the investor clicks on the T&C checkbox
    #And the investor clicks on the "Proceed to Payment" button
    #Then the OTP entry screen should be displayed
#
  #Scenario: Investor completes payment process
    #Given the investor is on the OTP entry screen
    #When the investor enters the OTP
    #And the investor clicks on the "Confirm" button
    #Then the payment link should be displayed on the screen
#
  #Scenario: Investor closes the payment link and verifies the recent transaction
    #When the investor clicks on the "Close" button
    #And the investor clicks on the Recent Transactions option from the side menu
    #Then the placed transaction entry should be displayed on the Recent Transactions page
    #And the status of the transaction should be "Payment link sent"
#

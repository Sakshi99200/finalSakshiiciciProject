@LoginPage
Feature: login functionality

Scenario: Successful login with PAN and password
   Given The user is on the login page
   When User Login into application with <Username> and password <Password>
   Then Dashboard page should be display
   
   Examples:
   |Username | Password |
   |XXXXX2229X|Reset@123|
   


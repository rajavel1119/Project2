Feature: Validation of Adactin Web Application 

Scenario: Validation of Adactin Web Application Booking Page

Given User Launch Adactin Web Apllication 
Then User Verify Adactin Home Page is Displayed
When User Enters Valid Username and Valid Password 
And User Clicks Login button
Then User Verify Adactin Home Page is Displayed
When User Select Valid Location, Hotel ,Roomtype
And User Click Search button 
Then User Verify Search Hotel is Displayed
And User Clicks Radio button and Clicks Continue button
Then User Verify Book Hotel Page is Displayed
When User Enter Valid Firstname,Lastname and Billing Address
When User Enter Valid Credit Card No and Select Valid Card Type,Expiry Month and Expiry Year and Enter Valid CVV No
And User Clicks Book Now button
Then User Verify Booking No is Displayed

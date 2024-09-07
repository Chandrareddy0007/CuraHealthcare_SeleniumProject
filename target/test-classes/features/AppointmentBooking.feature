Feature: Book the Appointment For the vist

Background: 
Given user is on login page
And User click on Book appointment
And  User login with valid credentials
@firstBooking
Scenario: 
When user enter all data for booking
Then user should seee appointment confirmeation
@secondBooking
Scenario: 
When user enter all data for bookings
Then user should seee appointment confirmation
@thirdBooking
Scenario: 
When user enter all the data for booking
Then user should see appointment confirmation

    

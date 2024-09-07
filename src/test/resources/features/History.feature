Feature: History Page

  Scenario: User views appointment history
    Given I am on the home page
    When I click on Make Appointment
    And I log in with username John Doe and password ThisIsNotAPassword
    And I make an appointment with different facility  and program 
    And I view appointment history
    Then I should see the appointment details in history
    And I log out

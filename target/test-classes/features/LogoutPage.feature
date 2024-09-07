Feature: I need to logout from CuraHealthCare

  Scenario: I Login and Logout
    Given I am on login page
    When i click on Bookappointment
    Then i click login after adding valid credentials
    And I  book three different slots with different data
    Then i click on menutoggle and history to see History of bookings
    And i click on logout after validating history

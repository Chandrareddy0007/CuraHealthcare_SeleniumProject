Feature: to login into Cura HealthCare page

  Background: 
    Given user is on login page
    When user Clicks on make Appointment

 Scenario Outline: Invalid userName Valid Password
  And user enters details <usnamee> <passwor>
  Then click on submit button

  Examples: 
    | usnamee | passwor               |
    | "Doe"   | "ThisIsNotAPassword"  |
    | "teddy" | "ThisIsNotAPassword"  |
    | "john"  | "ThisIsNotAPassword"  |


  Scenario Outline: Invalid Password  Valid UserName
    And User enter Detailss <uname><passwordd>
    Then click On Submit buttonn

    Examples: 
      | uname      | passwordd       |
      | "John Doe" | " ThisIsNotAPa" |
      | "John Doe" | "ThisIassword"  |
      | "John Doe" | "ThisPassword"  |

  Scenario: Valid Username password
    When User clicks on Make Appointment
    And user enter name and password
    Then click on submit buttonnn

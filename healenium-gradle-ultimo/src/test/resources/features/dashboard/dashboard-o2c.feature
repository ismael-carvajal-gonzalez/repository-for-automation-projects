Feature: O2C Dashsboard Access
  As a user
  I want to access the o2c dashboard
  To validate its operation

  @Dashboard-O2C
  Scenario: Enter to O2C Dashsboard
    Given Ismael is in the portal
    When he logs on with your username and password
    Then he can see the dashboar of o2c
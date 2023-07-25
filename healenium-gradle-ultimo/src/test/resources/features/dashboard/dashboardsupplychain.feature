Feature: Supply Chain Dashsboard Access
  As a user
  I want to access the supply chain dashboard
  To validate its operation

  @Dashboard-SupplyChain
  Scenario: Enter to Supply Chain Dashsboard
    Given Ismael is in the portal and he want to enter in dashboard in supply chain
    When he logs on with your username and password and want to navigate
    Then he can see the dashboar of supply chain
Feature: O2C Sales Order Inquiries
  As a user
  I want to access the report module
  To view sales reports

  @SalesOrder-Inquiries
  Scenario: Enter to Sales Order Inquiries
    Given Ismael is in the portal and he want to view sales order reports
    When he logs on with your username and password and wants to navigate to reports
    Then he can view the reports in sales order
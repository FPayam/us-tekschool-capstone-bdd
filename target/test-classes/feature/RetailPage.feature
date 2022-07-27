@RetailPage
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'fawad.payam2135@tekschool.us' and password '1234'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company | website    | taxID  | paymentMethod |
      | Tek     | www.tek.us | 012345 | check         |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message1

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber   | swiftCode    | accountName | accountNumber |
      | AIB      | 12345333333 | 012324444123 | Tekshcool   |        123890 |
    And User click on Continue button1
    Then User should see a success message

  @edityouraccount
  Scenario: Edit your account Information
    When User click on 'Edit your account information' linkk
    And User modify below information
      | firstname | lastName | email                            | telephone  |
      | Ahmad     | Payam    | fawad.payammm123563@tekschool.us | 7023405699 |
    And User click on continue button2
    Then User should see a messagee2 'Success: Your account has been successfully updated.'

Feature: Allow client to enter personal information and upload a file

  As a client
  I would to enter personal information
  So that i can submit my information

  Scenario: Insert personal information

    Given i am on the home page
    When i want to insert personal information
    And upload files
    Then  should be able to press the select button
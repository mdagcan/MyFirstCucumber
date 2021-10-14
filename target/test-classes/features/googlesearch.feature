@Start
Feature: user should find the related pruducts when google it
  Background:
    Given user is on the google page
  @Smoke
  Scenario: Test_01_iphone_search
    When user search for iphone
    Then verify the result has iphone

  Scenario: Test_02_teapot search
    When user search for teapot
    Then verify the result has teapot
  @Smoke
  Scenario: Test_03_flower search
    When user search for flower
    Then verify the result has flower

  Scenario: Test_04_BMW search
    When user search for BMW
    Then verify the result has BMW
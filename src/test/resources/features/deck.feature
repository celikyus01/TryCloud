@deck
Feature:Deck Page settings

  Background: login and navigate to Deck page
    Given the user is in Login page
    When the user logs in with the  valid credentals
    Then the user navigates to "Deck" page

  Scenario: Deck page assertion
    Then the user should see the title as "Deck - Trycloud"






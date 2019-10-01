Feature: As a user, I want to validate news article from guardian news website
  on similar resources, so that I can confirm that the news article is not FAKE news

  Scenario: Launch guardian news website
    Given I navigate to the guardian news website
    When I click on the news link from the menu
    And I select the headlines news
    Then I should be able to see the news page of that headline
    And I should be able to copy and save to file the headline of the news

  Scenario: To validate the headline news retrieved from guardian news with other resources on google
    Given I navigate to google website
    When I search for the headline news from the guardian site
    Then I should see a list of other sources with similar news details
    And I am able to confirm that the news article Fake or not
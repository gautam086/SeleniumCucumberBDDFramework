Feature: This talks about registring user and also signup to the site

  @RunFirst
  Scenario: Validate user is able to register on the site
    Given user is on landing page for tools QA
    And user navigates to book store application
    And user clicks on login button
    And user selects new user
    When user enters below details
    |FirstName|LastName|UserName|Password|
    |a3   |b3 |g1@gmail.com|Test101!|
    And clicks on register button

  Scenario Outline: Validate user is able to register on the site
    Given user is on landing page for tools QA
    And user navigates to book store application
    And user clicks on login button
    And user selects new user
    When user enters below details
      |FirstName|LastName|UserName|Password|
      |<FirstName>|<LastName>|<UserName>|<Password>|
    And clicks on register button
    Examples:
    |FirstName|LastName|UserName|Password|
    |a4       |b4      |a4@gmail.com|Test101!|
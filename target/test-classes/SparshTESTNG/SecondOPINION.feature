@tag
Feature: second opinion
  

  @tag1
  Scenario: To validate the second opinion funtionality
    Given open the browser, enter the sparsh hospital url
    And select Yashwanthpur hospital from the hospital dropdown
    When user clicks the second opinion link 
    And user enters the Firstname Lastname Phonenumber Email 
    And Uploads the report and Enters a message and clicks the send button
    Then Thankyou message should be displayed
    And bank info should be available in the page



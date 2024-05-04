#Reporter : Hümeyra Tayfun
#US Priority : MEDIUM
  Feature: As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

    Scenario: A registered user should be able to return products

      * User logs in "humeyraEmail".
      * User clicks on profile button.
      * User clicks on order history page
      * User clicks on action button
      * User displays return request button and clicks on it
      * User chooses her product
      * User clicks on return reason and chooses other
      * User clicks on return note and enter "it is too small"
      * User clicks on reguest return
      * Verify that the return process has been started





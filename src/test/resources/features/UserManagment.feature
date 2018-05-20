Feature: Managing users

Scenario: User logging into system with correct credentials
Given user goes to login page
When user types "jnowak" login
And user types "jnowak1234" password
And user clicks "Login" button
Then it should be logged as "Jan Nowak (jnowak)"

Scenario: User logging into system with incorrect credentials
Given user goes to login page
When user types "jkowalski" login
And user types "jkowalski1234" password
And user clicks "Login" button
Then it should show error message stating that "Cannot login"


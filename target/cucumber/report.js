$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UserManagment.feature");
formatter.feature({
  "name": "Managing users",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User logging into system with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserManagmentSteps.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"jnowak\" login",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagmentSteps.user_types_login(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"jnowak1234\" password",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagmentSteps.user_types_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagmentSteps.user_clicks_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should be logged as \"Jan Nowak (jnowak)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserManagmentSteps.user_should_be_logged_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User logging into system with incorrect credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserManagmentSteps.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"jkowalski\" login",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagmentSteps.user_types_login(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"jkowalski1234\" password",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagmentSteps.user_types_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagmentSteps.user_clicks_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should show error message stating that \"Cannot login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserManagmentSteps.logging_error_message_is_displayed(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat pl.edu.agh.guitests.bdd.steps.UserManagmentSteps.logging_error_message_is_displayed(UserManagmentSteps.java:63)\r\n\tat ✽.it should show error message stating that \"Cannot login\"(src/test/resources/features/UserManagment.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});
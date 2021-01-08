$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber/shops.feature");
formatter.feature({
  "line": 1,
  "name": "Search for Dress",
  "description": "",
  "id": "search-for-dress",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3412440757,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search a dress",
  "description": "",
  "id": "search-for-dress;search-a-dress",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search for Dress",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Printed summer dress will be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "shop.open_the_page()"
});
formatter.result({
  "duration": 2292619314,
  "status": "passed"
});
formatter.match({
  "location": "shop.search_for_Dress()"
});
formatter.result({
  "duration": 1078985318,
  "status": "passed"
});
formatter.match({
  "location": "shop.printed_summer_dress_will_be_shown()"
});
formatter.result({
  "duration": 25215356,
  "status": "passed"
});
formatter.after({
  "duration": 17390,
  "status": "passed"
});
formatter.before({
  "duration": 3021129012,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Create a user",
  "description": "",
  "id": "search-for-dress;create-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Can enter email and rest of info",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "login details entered",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user can login",
  "keyword": "Then "
});
formatter.match({
  "location": "shop.can_enter_email_and_rest_of_info()"
});
formatter.result({
  "duration": 5192847973,
  "status": "passed"
});
formatter.match({
  "location": "shop.login_details_entered()"
});
formatter.result({
  "duration": 18717,
  "status": "passed"
});
formatter.match({
  "location": "shop.user_can_login()"
});
formatter.result({
  "duration": 14108,
  "status": "passed"
});
formatter.after({
  "duration": 9149,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber/shop.feature");
formatter.feature({
  "line": 1,
  "name": "Search for Dress",
  "description": "",
  "id": "search-for-dress",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3451122908,
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
  "duration": 2716777272,
  "status": "passed"
});
formatter.match({
  "location": "shop.search_for_Dress()"
});
formatter.result({
  "duration": 1046846317,
  "status": "passed"
});
formatter.match({
  "location": "shop.printed_summer_dress_will_be_shown()"
});
formatter.result({
  "duration": 27468086,
  "status": "passed"
});
formatter.after({
  "duration": 601213143,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ebaySearch.feature");
formatter.feature({
  "name": "ebay search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search and verify results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a non-registered customer",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_am_a_non_registered_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to www.ebay.co.uk",
  "keyword": "And "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_navigate_to_www_ebay_co_uk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for an item",
  "keyword": "When "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_search_for_an_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of matching results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_get_a_list_of_matching_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the resulting items cards show: postage price, No of bids, price or show BuyItNow tag",
  "keyword": "And "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.the_resulting_items_cards_show_postage_price_No_of_bids_price_or_show_BuyItNow_tag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I sort the results by Lowest Price",
  "keyword": "When "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_sort_the_results_by_Lowest_Price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.the_results_are_listed_in_the_page_in_the_correct_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I sort the results by Highest Price",
  "keyword": "When "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_sort_the_results_by_Highest_Price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results are listed in the page in the highest order",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.the_results_are_listed_in_the_page_in_the_highest_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search and navigate through results pages",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a non-registered customer",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_am_a_non_registered_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to www.ebay.co.uk",
  "keyword": "And "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_navigate_to_www_ebay_co_uk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for an item",
  "keyword": "When "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_search_for_an_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a list of matching results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.step_definitions.searchAndVerify.i_get_a_list_of_matching_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results show more than one page",
  "keyword": "And "
});
formatter.match({
  "location": "com.ebay.step_definitions.NavigateResultPages.the_results_show_more_than_one_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user can navigate through the pages to continue looking at the items",
  "keyword": "And "
});
formatter.match({
  "location": "com.ebay.step_definitions.NavigateResultPages.the_user_can_navigate_through_the_pages_to_continue_looking_at_the_items()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertTrue(Assert.java:53)\n\tat com.ebay.step_definitions.NavigateResultPages.the_user_can_navigate_through_the_pages_to_continue_looking_at_the_items(NavigateResultPages.java:50)\n\tat ???.the user can navigate through the pages to continue looking at the items(file:///Users/riyanshrajeev/Desktop/EbaySearch/src/test/resources/features/ebaySearch.feature:21)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});
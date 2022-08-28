package com.ebay.step_definitions;

import com.ebay.pages.ProductPage;
import com.ebay.utilities.BrowserUtils;
import com.ebay.utilities.ConfigurationReader;
import com.ebay.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.*;

public class searchAndVerify {

    @Given("I am a non-registered customer")
    public void i_am_a_non_registered_customer() {
        Driver.get().get(ConfigurationReader.get("url"));

        String expectedUrl ="https://www.ebay.co.uk";
                String ActualUrl = Driver.get().getCurrentUrl();


        ProductPage productPage = new ProductPage();
        String singInLinkText = productPage.signInLink.getText();
        System.out.println("Sign in Link Text = " + singInLinkText);

        Assert.assertTrue(productPage.signInLink.isDisplayed());//verifies the use is non registered costumer

        if(singInLinkText.equals("Sign in")){
            System.out.println("Test Passed");

        }else{
            System.out.println("Test Failed");
        }



    }





    @Given("I navigate to www.ebay.co.uk")
    public void i_navigate_to_www_ebay_co_uk() {
        String expectedUrl ="https://www.ebay.co.uk/";
        String ActualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,ActualUrl);//Verifies the user is in the ebay home page
    }

    @When("I search for an item")
    public void i_search_for_an_item() {
     ProductPage productPage = new ProductPage();
       productPage.searchInputBox.sendKeys("selenium");
       productPage.searchButton.click();//user clicks search button
    }

    @Then("I get a list of matching results")
    public void i_get_a_list_of_matching_results() {
        ProductPage productPage = new ProductPage();
        WebElement matchingResult = productPage.searchResult;
        System.out.println(matchingResult.getText());

        Assert.assertTrue(matchingResult.getText().contains("results for selenium"));//Verifies the search results



        //to see the list of search result in the console
        System.out.println("productPage.productList.size() = " + productPage.productList.size());
        for (WebElement ProductLists: productPage.productList){
            //System.out.println("ProductLists.getText() = " + ProductLists.getText());

        }

       System.out.println("searcResults.get(5).getText() = " + productPage.productList.get(5).getText());/*Checking the-
        5th product on product card*/
      // productPage.productList.get(5).click();


    }

    @Then("the resulting items cards show: postage price, No of bids, price or show BuyItNow tag")
    public void the_resulting_items_cards_show_postage_price_No_of_bids_price_or_show_BuyItNow_tag() throws InterruptedException {

        ProductPage productPage = new ProductPage();
        System.out.println("productPage.getPostagecost.size() = " + productPage.getfreePostageCost.size());

        for (WebElement getPostageCosts: productPage.getfreePostageCost){
            System.out.println("getPostageCosts.getText() = " + getPostageCosts.getText());

            Assert.assertTrue(getPostageCosts.getText().contains("postage"));/*Checks with all cards if it contains postage details */

        }

        Assert.assertTrue(productPage.productList.get(8).getText().contains("postage"));//Checks spefici result card


        System.out.println("productPage.getPostagecost.size() = " + productPage.getPostagecost.size());
        for (WebElement getFreePostageCosts: productPage.getPostagecost){
            System.out.println("getFreePostageCosts.getText() = " + getFreePostageCosts.getText());

            Assert.assertTrue(getFreePostageCosts.getText().contains("postage"));


        }

                   //verifying no of bids
            productPage.clickOnAuction.click();
        System.out.println("productPage.noOfBidsCounts.size() = " + productPage.noOfBidsCounts.size());
        for(WebElement noOfBids: productPage.noOfBidsCounts){
              //System.out.println("noOfBids = " + noOfBids.getText());


            }
        Assert.assertTrue(productPage.noOfBidsCounts.get(6).getText().contains("bids"));


        //Verifying buy it now Tag

       System.out.println("productPage.buyItNowTag.getText() = " + productPage.buyItNowTag.getText());

        Assert.assertTrue(productPage.buyItNowTag.isDisplayed());//verifies buy it now tag is displayed



    }

    @When("I sort the results by Lowest Price")
    public void i_sort_the_results_by_Lowest_Price()  {

        ProductPage productPage = new ProductPage();
        productPage.bestMatchButton.click();


            //getting Lowest price list sorted
            productPage.selectLowerPrice.click();

            System.out.println("productPage.getPriceList.size() = " + productPage.getPriceList.size());

            for(WebElement getPriceLists: productPage.getPriceList){
                String getLowestPriceOrder = getPriceLists.getText().replace("£","");
               // System.out.println("getLowestPriceOrder = " + getLowestPriceOrder);


            }




        }

    @Then("the results are listed in the page in the correct order")
    public void the_results_are_listed_in_the_page_in_the_correct_order() {
        ProductPage productPage = new ProductPage();

        Assert.assertTrue(productPage.lowestPriceBtn.isDisplayed());//verifies that page is in lowest price order

        //or
        List<String> priceInLowestOrder = BrowserUtils.getElementsText(productPage.getPriceList);
        System.out.println("priceInLowestOrder = " + priceInLowestOrder);

        productPage.lowestPriceBtn.click();
        productPage.selectHigestPrice.click();

        List<String> priceInHighestOrder = BrowserUtils.getElementsText(productPage.getPriceList);
        System.out.println("priceInHighestOrder = " + priceInHighestOrder);


        if(!priceInHighestOrder.equals(priceInLowestOrder)){
            System.out.println("The page is in correct order");
        }else{
            System.out.println("test fail");

        }

     productPage.highestPriceBtn.click();
        productPage.selectLowerPrice.click();



    }

    @When("I sort the results by Highest Price")
    public void i_sort_the_results_by_Highest_Price() throws InterruptedException {
      ProductPage productPage = new ProductPage();
          productPage.lowestPriceBtn.click();
          productPage.selectHigestPrice.click();

          for(WebElement getInHighestPriceOrder:productPage.getPriceList){
              String actualpriceOrderList = getInHighestPriceOrder.getText().replace("£","");
              //System.out.println("ActualpriceOrderList = " + ActualpriceOrderList);

          }



    }
    @Then("the results are listed in the page in the highest order")
    public void the_results_are_listed_in_the_page_in_the_highest_order() {
        ProductPage productPage = new ProductPage();
        productPage.highestPriceBtn.isDisplayed();

        //and

       List<String> priceInHighestOrder = BrowserUtils.getElementsText(productPage.getPriceList);
        System.out.println("priceInHighestOrder = " + priceInHighestOrder);

        productPage.highestPriceBtn.click();
        productPage.selectLowerPrice.click();

        List<String> priceInLowestOrder = BrowserUtils.getElementsText(productPage.getPriceList);
        System.out.println("priceInLowestOrder = " + priceInLowestOrder);

        if(!priceInHighestOrder.equals(priceInLowestOrder)){
            System.out.println("The page is in correct order");
        }else{
            System.out.println("test fail");

        }







    }





}


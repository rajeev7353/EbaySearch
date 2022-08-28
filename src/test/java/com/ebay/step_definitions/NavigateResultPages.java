package com.ebay.step_definitions;

import com.ebay.pages.ProductPage;
import com.ebay.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NavigateResultPages {


    @Then("the results show more than one page")
    public void the_results_show_more_than_one_page() {

        ProductPage productPage = new ProductPage();
       int noOfActualPage = productPage.pageNumberCount.size();
        System.out.println("noOfActualPage = " + noOfActualPage);

        for(WebElement pagenoCount:productPage.pageNumberCount){
            System.out.println("pagenoCount.getText() = " + pagenoCount.getText());


            }
       if(noOfActualPage>1){
           System.out.println("The result has more than one page");
       }else{
           System.out.println("This result doesnt have multiple page  ");
       }


    }

    @Then("the user can navigate through the pages to continue looking at the items")
    public void the_user_can_navigate_through_the_pages_to_continue_looking_at_the_items() {
        ProductPage productPage = new ProductPage();
        String firstPageUrl = Driver.get().getCurrentUrl();
        System.out.println("firstPageUrl = " + firstPageUrl);
            for(int i=0; i<10; i++){
                productPage.pageNumberCount.get(i).click();

               Assert.assertTrue(productPage.pageNumberCount.get(i).isEnabled());




            }
        String urlBeforeNavigation= Driver.get().getCurrentUrl();

            productPage.pageNumberCount.get(1).click();

        String urlAfternavigation= Driver.get().getCurrentUrl();

       if(!urlBeforeNavigation.equals(urlAfternavigation)){
           System.out.println("user is in next page");

       }else{
           System.out.println("test failed");
       }


    }

}

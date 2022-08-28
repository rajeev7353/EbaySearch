package com.ebay.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;



import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import java.net.URISyntaxException;




public class postReqStepDefn {
    Response response;
    @When("the user sends a POST request to post")
    public void the_user_sends_a_POST_request_to_post() throws URISyntaxException {

        RestAssured.baseURI = "http://localhost:8080";
        String jsonBody = "{\n" +
                "    \"id\": \"1842347-1560779940\",\n" +
                "    \"cost\": \"£829.99\",\n" +
                "    \"location\": \"PAC\"\n" +
                "}";

        RequestSpecification request = RestAssured.given();
        request.header("Content-type","application/json");
            response =   request.body(jsonBody).post("/post");



    }

    @Then("response should return all the items")
    public void response_should_return_all_the_items() {
        int statuscode =response.getStatusCode();
        System.out.println("statuscode = " + statuscode);

        Assert.assertEquals(statuscode,201);

        String responseBody = response.getBody().prettyPrint();
        String expectedBody = "{\n" +
                "    \"id\": \"1842347-1560779940\",\n" +
                "    \"cost\": \"£829.99\",\n" +
                "    \"location\": \"PAC\"\n" +
                "}";

        Assert.assertEquals(expectedBody,responseBody);//Verifies api returns as expected  

    }

}



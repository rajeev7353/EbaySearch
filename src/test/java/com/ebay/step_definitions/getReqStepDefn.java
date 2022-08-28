package com.ebay.step_definitions;


import com.ebay.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.junit.Assert;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;


import java.net.URI;
import java.net.URISyntaxException;

;
import java.util.List;

import static io.restassured.RestAssured.given;

public class getReqStepDefn {

    Response response;


    @When("user sends a get request to the given URI")
    public void user_sends_a_get_request_to_the_given_URI() throws URISyntaxException {

        response = given().accept(ContentType.JSON)
                .when()
                .get(new URI(ConfigurationReader.get("api_url")+"/get/all"));
        response.prettyPrint();


    }

    @Then("the status code should be {int}")
    public void the_status_code_should_be(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());

        System.out.println("response.statusCode() = " + response.statusCode());


    }

    @Then("response playload matches the location- Lon, Man, Cam, LCS")
    public void response_playload_matches_the_location_Lon_Man_Cam_LCS()  throws URISyntaxException {


        List<String> allLocation = response.jsonPath().getList("items.location");
        System.out.println("allLocation = " + allLocation);




        String[] expectedResponse = new String[]{"LON", "MAN", "CAM", "LCS"};


      assertThatJson(allLocation).isEqualTo(expectedResponse);





    }


}
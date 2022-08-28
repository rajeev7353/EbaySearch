package com.ebay.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //format = {"pretty", "html:target/Destination"},
     plugin = {"json:target/cucumber.json",
               "html:target/cucumber-reports",
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features",
        glue = "com/ebay/step_definitions",
       dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}
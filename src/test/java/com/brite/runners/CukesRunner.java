package com.brite.runners;
import com.brite.utilities.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/brite/step_definitions"
        , dryRun = true
        , tags = "@wip"
)
public class CukesRunner {



}
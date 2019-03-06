package com.brite.step_definitions;


import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.DBUtils;
import com.brite.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {


        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Driver.getDriver().manage().window().maximize();

        DBUtils.createConnection();
    }

    @After
    public void tearDown(Scenario scenario) {


        if (scenario.isFailed()) {
            // this line is for taking screenshot
            // final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // this line is adding the screenshot to the report
            // scenario.embed(screenshot, "image/png");
        }

        DBUtils.destroy();
        // Driver.closeDriver();

    }


}
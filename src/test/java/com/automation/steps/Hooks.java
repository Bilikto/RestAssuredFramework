package com.automation.steps;

import com.automation.utils.ConfigReaderUtils;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

    @Before
    public void setup() {
        ConfigReaderUtils.initConfig();
        RestAssured.baseURI = ConfigReaderUtils.getProperty("api.url");
    }

}

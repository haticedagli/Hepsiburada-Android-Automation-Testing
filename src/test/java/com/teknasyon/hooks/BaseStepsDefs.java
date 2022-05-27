package com.teknasyon.hooks;

import com.teknasyon.Context;
import com.teknasyon.base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

public class BaseStepsDefs extends TestBase {

    @Before
    public void setupDefs(Scenario scenario) throws MalformedURLException {
        String platformName = String.valueOf(scenario.getSourceTagNames());
        if (platformName.contains("Android")) {
            androidSetUp();
        } else if (platformName.contains("Ios")) {
            throw new UnsupportedOperationException();
        } else if (platformName.contains("BrowserStack")) {
            browserStackAndroid(scenario);
        } else if (platformName.contains("Browser Stack Ios")) {
            throw new UnsupportedOperationException();
        } else {
            System.out.println("Platform name error!!");
        }
    }

    @Before
    public void createEmptyContext() {
        context = new Context();
    }

    @After
    public void closeApp(Scenario scenario) {
        tearDown();
    }
}

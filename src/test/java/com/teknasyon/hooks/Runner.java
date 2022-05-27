package com.teknasyon.hooks;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.teknasyon"},
        //tags = "@Browser",
        monochrome=true,
        plugin = {"pretty", "html:target/cucumber"}
)
public class Runner extends AbstractTestNGCucumberTests {

}





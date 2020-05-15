package com.techyworks.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.techyworks.steps"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"}
        , monochrome = true
        , tags = {"@book"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}

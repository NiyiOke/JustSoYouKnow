package com.Jpmc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html: target/test-report/report-html",
        "json: target/test-report/report/report-json.json",
        "junit: target/test-report/report-xml.xml",},
        features = {"src/test/resources"})



public class TestRunner {
}



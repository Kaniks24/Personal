package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(plugin = { "pretty", "html:target/cucumberHtmlReport", "html:target/cucumberHtmlReport", 	
"pretty:target/cucumber-json-report.json" }, 

features = "src/main/java/features", 
glue = {"stepDefinitions"}
)
public class RunnerTest {

}

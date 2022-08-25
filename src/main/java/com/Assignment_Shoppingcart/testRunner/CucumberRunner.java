package com.assesment.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "com.assesment.stepDefinition",
plugin = {"pretty",	"html:target/cucumber-reports/cucumber-pretty"},
monochrome = true,
dryRun = false)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}

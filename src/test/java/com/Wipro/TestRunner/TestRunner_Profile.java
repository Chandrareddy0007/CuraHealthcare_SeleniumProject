package com.Wipro.TestRunner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(features = {"src/test/resources/features/Profile.feature"}
,glue = {"com.Wipro.Steps"},
	
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish=true,
plugin={"pretty","html:target/CucumberReport_Logout.html"})
@Listeners(com.Wipro.Listeners.ListenersTestNG_Profile.class)
public class TestRunner_Profile extends AbstractTestNGCucumberTests {

}

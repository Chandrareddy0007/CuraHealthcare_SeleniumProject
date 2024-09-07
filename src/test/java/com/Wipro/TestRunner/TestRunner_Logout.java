package com.Wipro.TestRunner;



	import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

	@io.cucumber.testng.CucumberOptions(features = {"src/test/resources/features/LogoutPage.feature"}
			,glue = {"com.Wipro.Steps"},
				
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	publish=true,
	plugin={"pretty","html:target/CucumberReport_Logout.html"})
	@Listeners(com.Wipro.Listeners.ListenersTestNG_Logout.class)
	public class TestRunner_Logout extends AbstractTestNGCucumberTests {
		

	}
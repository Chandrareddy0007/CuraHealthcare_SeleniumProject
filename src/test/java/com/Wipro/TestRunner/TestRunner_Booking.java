package com.Wipro.TestRunner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(features = {"src\\test\\resources\\features\\AppointmentBooking.feature"}
		,glue = {"com.Wipro.Steps"},
				publish=true,
			
						plugin = {"pretty","html:target/CucumberReport_Booking.html"}
			)
		
@Listeners(com.Wipro.Listeners.ListenersTestNG_Booking.class)
public class TestRunner_Booking extends AbstractTestNGCucumberTests {
	

}

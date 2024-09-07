package com.Wipro.Listeners;





import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTestNG_Booking implements ITestListener  {
	WebDriver webdriver;
	static int count;
	static {
		count=0;
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		webdriver=new EdgeDriver();
		count++;
		System.out.println("onTestSuccessMethod:"+result.getMethod());
		TakesScreenshot screenshot=(TakesScreenshot)webdriver;
		File path=screenshot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(path, new File("C:\\Users\\Administrator\\eclipse-\\CuraHealthCare_Cucumber_Selenium\\target\\Success\\ssHistory"+count+".png"));
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestCaseFailureMethod:"+result.getMethod());
		TakesScreenshot screenshot=(TakesScreenshot)webdriver;
		File path=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(path, new File("C:\\Users\\Administrator\\eclipse-\\CuraHealthCare_Cucumber_Selenium\\target\\Failure\\ssHistory"+count+".png"));
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}



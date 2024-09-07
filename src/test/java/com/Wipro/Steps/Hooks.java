/*Name:Agile Bhuvana Chandra Reddy
 * Description:it is commonyly used to setup browser
 * */

package com.Wipro.Steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
static WebDriver webdriver;
//execute before each test
@Before
public void setup() {
	webdriver=new EdgeDriver();
	webdriver.manage().window().maximize();
}
//execute after each test
@After
public void teardown() {
	webdriver.close();}

	public static WebDriver getWebDriver() {
		return webdriver;
	}

}

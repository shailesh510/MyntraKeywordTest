package com.testingshastra.CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/resources/Features",glue="stepsDefination",tags={"@smoke"})
public class Runner extends AbstractTestNGCucumberTests {
	//Empty

}

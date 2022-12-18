package com.runner.oragnehrm;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/featurefile",
		glue = "comoragnehrmstep",
		dryRun = false,
		monochrome  =true	
		)
public class runner {

}

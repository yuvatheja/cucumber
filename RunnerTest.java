package com.cucumber.mavencucumberprototype;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty","html:target/html/"}, 
		features = "src/test/resources",
		tags = {"@Application,@Server"}     //or case
		//tags = {"@Application","@Server"}		// and Case
		)
public class RunnerTest {

}
 
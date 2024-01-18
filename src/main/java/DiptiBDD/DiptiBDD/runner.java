package DiptiBDD.DiptiBDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_File", glue = {
		"StepsDefinations" }, monochrome = true, plugin = { "pretty",
				"html:target/myreport.html" }, tags = "@testcaseone"

)

public class runner {

}

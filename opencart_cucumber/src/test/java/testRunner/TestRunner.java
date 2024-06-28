package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"}, // Run all the feature file
					//features= {".//Features/Login.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},
		            //features= {".//Features/Registration.feature"},
				    features= {".//Features/Login.feature",".//Features/Registration.feature"}, // Run multiple feature file 
					//features= {"@target/rerun.txt"},  // run only failure test cases
					glue={"stepDefinitions","hooks"},
					plugin= {"pretty", "html:reports/myreport.html", // this is for cucumber junit report
							 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // this is for extent report
							 "rerun:target/rerun.txt",
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
				    monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server(only for cucumber report)
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

		}

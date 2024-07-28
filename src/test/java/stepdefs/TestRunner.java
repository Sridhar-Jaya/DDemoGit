package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"stepdefs"},monochrome = true,
plugin= {"pretty","junit:target/JunitReport/report.xml",
		"json:target/JsonReports/reports.json",
		"html:target/HtmlReports/reports.html"}, tags="@testdemo")
public class TestRunner {

}

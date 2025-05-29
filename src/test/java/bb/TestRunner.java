package bb;
//import io.cucumber.junit.CucumberOptions;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
//import org.junit.runner.RunWith;
//
//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(
//        features = "src/test/resources/features/",
//        plugin = {
//                "pretty",
//                "json:target/serenity-reports/cucumber_report.json"
//        },
//        glue = {"bb.defs", ""},
//        snippets = CucumberOptions.SnippetType.CAMELCASE,
//        tags = "@All"
//)
//public class TestRunner {
//}
//
import org.junit.platform.suite.api.*;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/MoneyTransfer")
@ConfigurationParameter(key = "cucumber.glue", value = "bb.defs") // package step defs
//@ConfigurationParameter(key = "cucumber.filter.tags", value = "@TC_2")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, io.cucumber.core.plugin.SerenityReporter")
//@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, io.cucumber.core.plugin.SerenityReporterParallel")

public class TestRunner {

}

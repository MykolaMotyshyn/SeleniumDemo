package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * #Summary:
 * #Author: Mykola Motyshyn
 * #Author's Email:
 * #Created: 25/06/2024 - 11:40
 * #Comments:
 */
@CucumberOptions(
        plugin = {"pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "json:target/cucumber-results/main/SeleniumDemo.json",
                "rerun:target/cucumber-results/rerun/rerun.txt"},
        tags = "@Demo",
        features = {"src/test/resources/ie/aib/bbap/features/regression"},
        glue = "ie.aib.bbap.stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

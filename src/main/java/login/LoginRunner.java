package main.java.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/login/Login.feature",
        glue = { "main.java.login"},
       // plugin = { "html:reports/Login-Report.html"},
        monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}

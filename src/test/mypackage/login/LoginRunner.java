package test.mypackage.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/mypackage/login/Login.feature",
        //glue = { "test.mypackage.login"},
       // plugin = { "html:reports/Login-Report.html"},
        monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}

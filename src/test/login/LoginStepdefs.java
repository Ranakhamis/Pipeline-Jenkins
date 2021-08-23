package test.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginStepdefs {


    @Given("App opened in English and we need to run it in {string}")
    public void appOpenedInEnglishAndWeNeedToRunItIn(String arg0) {
        System.out.println("helloo aliiii");

    }

    @When("User login using {string} and {string}")
    public void userLoginUsingAnd(String arg0, String arg1) {
        System.out.println("helloo Ranroon");

    }
}

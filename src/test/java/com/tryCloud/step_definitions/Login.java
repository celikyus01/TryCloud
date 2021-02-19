package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {
    @Given("the user is in Login page")
    public void the_user_is_in_Login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user logs in with the  valid credentials")
    public void the_user_logs_in_with_the_valid_credentials() {
        new LoginPage().login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    @When("the user logs in with the  invalid credentials")
    public void the_user_logs_in_with_the_invalid_credentials() {
        new LoginPage().login("invalid_username", "invalid_password");
    }

    @Then("the user should see the title as {string}")
    public void the_user_should_see_the_title_as(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(3);
        Assert.assertEquals("Verify title as Files - Trycloud",expectedTitle,actualTitle );

    }
}

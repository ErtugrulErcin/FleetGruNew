package com.fleetApp.step_definitions;

import com.fleetApp.pages.LoginPage;
import com.fleetApp.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("fleetgru.url");
        Driver.getDriver().get(url);
    }


    @When("The user logs in as a {string}")
    public void userEntersToUsername(String string) {
        loginPage.usernameInput.sendKeys(string);

    }

    @And("The user is on the {string}")
    public void userEntersToPassword(String string) {
        loginPage.passwordInput.sendKeys(string);

    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        BrowserUtils.verifyElementDisplayed(loginPage.submitButton,15);
        loginPage.submitButton.click();

    }

    @Then("user should see {string}")
    public void userShouldSee(String string) {
        // Assert.assertTrue(loginPage.dashboardHeader.isDisplayed());

        Assert.assertTrue(loginPage.header.getText().equals(string));
    }
}

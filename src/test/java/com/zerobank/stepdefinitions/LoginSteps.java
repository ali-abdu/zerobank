package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    @Given("user is on login page for ZeroBank")
    public void user_is_on_login_page_for_ZeroBank() {
        Driver.get().get("http://zero.webappsecurity.com/login.html");

    }

    @When("user login with username {string} and  password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        BrowserUtils.waitFor(3);
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("verify page title is {string}")
    public void verify_page_title_is(String title) {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        Assert.assertTrue(accountSummaryPage.pageTitle.isDisplayed());
        System.out.println(accountSummaryPage.pageTitle.getText());

    }


    @When("user login with wrong username {string} and password {string}")
    public void user_login_with_wrong_username_and_password(String wrongUsername, String wrongPassword) {
        BrowserUtils.waitFor(3);
      LoginPage loginPage=new LoginPage();
      loginPage.login(wrongUsername,wrongPassword);

    }

    @Then("error message should be displayed {string}")
    public void error_message_should_be_displayed(String string)  {
        BrowserUtils.waitFor(3);
      LoginPage loginPage=new LoginPage();
      Assert.assertTrue(loginPage.WrongLogin.isDisplayed());
        System.out.println(loginPage.WrongLogin.getText());

    }

    @Then("user with blank username {string} and password {string} should not be able to login")
    public void user_with_blank_username_and_password_should_not_be_able_to_login(String username, String password) {
        BrowserUtils.waitFor(3);
       LoginPage loginPage=new LoginPage();
       loginPage.login(username,password);

    }


}

package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AcountSummarySteps {

    @When("user on Account Summary Page")
    public void user_on_Account_Summary_Page() {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
    }

    @Then("verify that following Account types are displayed")
    public void verify_that_following_Account_types_are_displayed(io.cucumber.datatable.DataTable dataTable) {

        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
       // Assert.assertTrue(accountSummaryPage.AccountTypes.is);
    }
}

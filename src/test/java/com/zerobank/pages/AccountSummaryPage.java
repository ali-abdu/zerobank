package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Zero Bank')]")
    public WebElement pageTitle;

    @FindBy(xpath = "//div[@class='offset2 span8']/h2")
    public List<WebElement> AccountTypes;

}

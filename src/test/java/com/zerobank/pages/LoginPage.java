package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage {


    @FindBy(id="user_login")
    public WebElement Username;

    @FindBy(id="user_password")
    public WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement SignIn;

    @FindBy(xpath = "//div[contains(text(),'Login and/or password are wrong.')]")
    public WebElement WrongLogin;

public void login(String username,String password){
    Username.sendKeys(username);
    Password.sendKeys(password);
    SignIn.click();

}

public  void  WrongLogin(String wrongUser,String wrongPass){
    Username.sendKeys(wrongUser);
    Password.sendKeys(wrongPass);
    SignIn.click();
}


}

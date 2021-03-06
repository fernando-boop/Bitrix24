package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//input[@class='login-inp'])[1]")
    public WebElement username;

    @FindBy (xpath = "(//input[@class='login-inp'])[2]")
    public WebElement password;

    @FindBy (xpath = "//*[@*='submit']")
    public WebElement loginButton;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

}


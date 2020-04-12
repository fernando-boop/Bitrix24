package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActivityStream {
    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")
    public WebElement message;

    @FindBy(xpath = "//span[@title='Upload files']")
    public WebElement uploadFile;

}

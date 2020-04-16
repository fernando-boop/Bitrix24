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

    @FindBy(id = "blog-submit-button-save")
    public WebElement send;

    @FindBy(xpath = "//span[@class='bx-file-dialog-column-row bx-file-dialog-column-name']//a")
    public WebElement fileToAttach;

    @FindBy (xpath = "//div[@class='popup-window-buttons']//span[1]")
    public WebElement selectSend;

    @FindBy (xpath = "//span[@title='Click to insert file']")
    public WebElement confirmFile;
    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement desktopApps;


    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement messageInput;

    @FindBy(tagName = "iframe")
    public WebElement iframeMessage;

    @FindBy(tagName = "body")
    public WebElement messageBody;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadButton;

    @FindBy(xpath="//div[@class='feed-add-post-form-wrap']//div[starts-with(@id,'diskuf-selectdialog')]//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main']")
    public WebElement uploadFileAndImage;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//div[starts-with(@id,'diskuf-selectdialog')]//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement selectDocumentFromBitrix;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//div[starts-with(@id,'diskuf-selectdialog')]//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']")
    public WebElement downloadFromExternal;

    @FindBy(xpath = "//div[@id='popup-window-titlebar-DiskFileDialog']")
    public WebElement popUpWindow;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//div[starts-with(@id,'diskuf-selectdialog')]//span[@onclick='DiskOpenMenuCreateService(this); return false;']")
    public WebElement createUsingDesktop;



}

package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {
    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMore;

    @FindBy(linkText = "Recent")
    public WebElement recent;

    @FindBy(xpath = "//a[starts-with(@id, 'destination')]")
    public WebElement userFromRecent;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-info'])[1]")
    public WebElement userFromEmployeesAndDepartments;

    @FindBy(linkText = "E-mail users")
    public WebElement emailUsers;

    @FindBy(xpath = "//div[@id='bx-lm-box-email-content']/a[starts-with(@id,'destination')]")
    public WebElement userFromEmailUsers;














}

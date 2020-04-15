package com.Bitrix24.base;

import com.Bitrix24.pages.ActivityStream;
import com.Bitrix24.pages.FilterAndSearch;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected ActivityStream activityStream;
    protected FilterAndSearch filterAndSearch;



    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        loginPage = new LoginPage();
        activityStream = new ActivityStream();
        filterAndSearch = new FilterAndSearch();


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }


}

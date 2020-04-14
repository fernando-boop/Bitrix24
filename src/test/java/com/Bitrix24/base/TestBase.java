package com.Bitrix24.base;

import com.Bitrix24.pages.ActivityStream;
import com.Bitrix24.pages.AikasPage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected ActivityStream dashboardPage;
    protected AikasPage aika;



    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        loginPage = new LoginPage();
        dashboardPage = new ActivityStream();
        aika = new AikasPage();


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        //Driver.closeDriver();
    }
}

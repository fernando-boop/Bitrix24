package com.Bitrix24.base;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setUpMethod(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }
}

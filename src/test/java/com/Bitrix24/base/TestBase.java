package com.Bitrix24.base;

import com.Bitrix24.pages.ActivityStream;
import com.Bitrix24.pages.FilterAndSearch;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;


public abstract class TestBase {
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest test;

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LoginPage loginPage;
    protected ActivityStream activityStream;
    protected FilterAndSearch filterAndSearch;

    @BeforeSuite
    public void setUpSuite(){
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        htmlReporter.config().setReportName("Bitrix24 Automated Tests");
        report.attachReporter(htmlReporter);
        report.setSystemInfo("Environment", ConfigurationReader.getProperty("url"));
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
    }

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
    public void tearDownMethod(ITestResult iTestResult) throws IOException {
        if(iTestResult.getStatus() == ITestResult.FAILURE){
            test.fail(iTestResult.getName());

            String screenshot = BrowserUtils.getScreenshot(iTestResult.getName());
            test.addScreenCaptureFromPath(screenshot);
        }

        Driver.closeDriver();
    }


    @AfterSuite
    public void tearDownSuite(){
        report.flush();
    }

}

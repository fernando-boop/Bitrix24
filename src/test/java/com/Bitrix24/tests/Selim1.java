package com.Bitrix24.tests;

import com.Bitrix24.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
//author Selim US4/AC3
//4. As a user, I should be able to create a poll by clicking on Poll tab under Active Stream
//3. User should be able to attach link by clicking on the link icon.
//UserName: hr9@cybertekschool.com, password: UserUser, environment: https://login2.nextbasecrm.com/


public class Selim1 {
    WebDriver driver;
    WebDriverWait wait;
    ExtentReports report;
    ExtentHtmlReporter htmlReporter;
    ExtentTest test;

    @BeforeTest
    public void uploadFile() {
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/Pollreport.html";
        htmlReporter = new ExtentHtmlReporter(path);
        htmlReporter.config().setReportName("Vytrack Automated Tests");
        report.attachReporter(htmlReporter);
        report.setSystemInfo("Environment 2", "QA");
        report.setSystemInfo("Browser", "Chrome");

        driver = Driver.getDriver();
        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr9@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser" + Keys.ENTER);
        //to log-in to stream page as User
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void titleCheck() {
        String title = driver.getTitle();
        System.out.println(title);
        //confirm it is in stream Page
        Assert.assertEquals("(26) Portal", title);
    }

    @Test
    public void clickPoll() throws InterruptedException {
        //click on Poll
        driver.findElement(By.id("feed-add-post-form-tab-vote")).click();       // xpath//span[.='Poll']//span
        Thread.sleep(3000);
        test = report.createTest("Bitrix24 Poll verification test");
        test.info("Environment2 is active");
        //click on attachlink
        driver.findElement(By.xpath("//span[@title='Link']/i")).click();
        test.info("Poll link button is active");
        String message = "GoodBye1";
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys(message);
        driver.findElement(By.id("linkidPostFormLHE_blogPostForm-href")).sendKeys("www.goodbye123.com" + Keys.ENTER);
        driver.findElement(By.id("blog-submit-button-save")).click();
        test.info("Message is Posted");
        //verify the link is posted
        WebElement post = driver.findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner']/a[1]"));
        String actual = post.getText();
        Assert.assertEquals(actual, message);
        test.pass("Bitrix24 Poll verification test PASS");
    }


    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        report.flush();
        driver.quit();
    }
}

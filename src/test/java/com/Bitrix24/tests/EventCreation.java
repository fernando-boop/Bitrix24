package com.Bitrix24.tests;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 Author: Yana
 UserStory: 3
 */

public class EventCreation extends TestBase {

    /**
     * AC - 2 (Positive)
     * 1. user logs in with valid username and password
     * 2. user clicks on event tab under activity stream
     * 3. user clicks on upload link
     * 4. user enters link text
     * 5. user enters link URL
     * 6. user clicks save
     * 7. verify that user was able to add a link --> actual link text equals expected link text
     */

    @Test
    public void uploadingLinkPositiveTest() throws InterruptedException {
        test = report.createTest("UploadingLinkPositiveTest");

        test.info("Logging in");
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"), ConfigurationReader.getProperty("passwordHelpdesk9"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.event));

        test.info("Clicking on event");
        activityStream.event.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.uploadLinkBtn));

        test.info("Clicking on upload link button");
        activityStream.uploadLinkBtn.click();

        test.info("Entering text");
        Thread.sleep(500);
        activityStream.linkText.sendKeys("Hello Hello");

        test.info("Entering link");
        activityStream.linkURL.sendKeys("https://www.google.com/");

        test.info("Clinking on save button");
        activityStream.saveBtn.click();

        driver.switchTo().frame(activityStream.iframe);

        test.info("Verifying that a link was added ");
        Assert.assertEquals(activityStream.link.getText(), "Hello Hello");
        test.pass("PASS");


    }

    /**
     * AC - 2 (Negative)
     * 1. user logs in with valid username and password
     * 2. user clicks on event tab under activity stream
     * 3. user clicks on upload link
     * 4. user clicks save without entering link text & link URL
     * 6. user clicks save
     * 7. verify that user not able to save / add a link --> save button is still displayed
     */

    @Test
    public void uploadingLinkNegativeTest()  {
        test = report.createTest("UploadingLinkNegative");

        test.info("Logging in");
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"), ConfigurationReader.getProperty("passwordHelpdesk9"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.event));

        test.info("Clicking on event");
        activityStream.event.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.uploadLinkBtn));

        test.info("Clicking on upload link button");
        activityStream.uploadLinkBtn.click();

        test.info("Clicking on save button");
        activityStream.saveBtn.click();

        test.info("Verifying that user was not able to save without adding text and URL");
        Assert.assertTrue(activityStream.saveBtn.isDisplayed());
    }
}


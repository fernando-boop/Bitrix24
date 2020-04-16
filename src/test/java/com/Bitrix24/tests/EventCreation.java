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

//    @Test
//    public void uploadingLinkPositiveTest() throws InterruptedException {
//        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"), ConfigurationReader.getProperty("passwordHelpdesk9"));
//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.event));
//        dashboardPage.event.click();
//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.uploadLinkBtn));
//        dashboardPage.uploadLinkBtn.click();
//        Thread.sleep(500);
//        dashboardPage.linkText.sendKeys("Hello Hello");
//        dashboardPage.linkURL.sendKeys("https://www.google.com/");
//        dashboardPage.saveBtn.click();
//        driver.switchTo().frame(dashboardPage.iframe);
//        Assert.assertEquals(dashboardPage.link.getText(), "Hello Hello");
//    }

    /**
     * AC - 2 (Negative)
     * 1. user logs in with valid username and password
     * 2. user clicks on event tab under activity stream
     * 3. user clicks on upload link
     * 4. user clicks save without entering link text & link URL
     * 6. user clicks save
     * 7. verify that user not able to save / add a link --> save button is still displayed
     */

//    @Test
//    public void uploadingLinkNegativeTest()  {
//        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"), ConfigurationReader.getProperty("passwordHelpdesk9"));
//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.event));
//        dashboardPage.event.click();
//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.uploadLinkBtn));
//        dashboardPage.uploadLinkBtn.click();
//        dashboardPage.saveBtn.click();
//        Assert.assertTrue(dashboardPage.saveBtn.isDisplayed());
//    }
}


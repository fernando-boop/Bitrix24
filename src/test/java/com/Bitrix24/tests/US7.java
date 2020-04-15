package com.Bitrix24.tests;
/*
Author: Jacob
7. As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
    AC5. User should be able to create a quote by clicking on the Comma icon.
 */
import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US7 extends TestBase {

    @Test
    public void testAC5(){

        //Login
        loginPage.login(ConfigurationReader.getProperty("usernameHr9"), ConfigurationReader.getProperty("passwordHr9"));

        //Navigate to More > Announcement
        wait.until(ExpectedConditions.elementToBeClickable(activityStream.moreLink));
        activityStream.moreLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(activityStream.announcementLink));
        activityStream.announcementLink.click();

        //Click quote icon to add quote
        wait.until(ExpectedConditions.elementToBeClickable(activityStream.quoteIcon));
        activityStream.quoteIcon.click();

        //Type your quote
        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));
        activityStream.blockquote.sendKeys("Hello World!");
        driver.switchTo().defaultContent();

        //Send your quote
        activityStream.sendButton.click();

    }

    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
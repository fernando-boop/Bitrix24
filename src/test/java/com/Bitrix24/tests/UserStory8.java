package com.Bitrix24.tests;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class UserStory8 extends TestBase {

    String username = ConfigurationReader.getProperty("usernameHelpdesk9");
    String password = ConfigurationReader.getProperty("passwordHelpdesk9");

    @Test
    public void filtersTest() throws InterruptedException {
        loginPage.login(username, password);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement moreDropD = driver.findElement(By.id("feed-add-post-form-link-text"));
        moreDropD.click();
        Thread.sleep(1500);

        WebElement workflow = driver.findElement(By.xpath("//span[@class='menu-popup-item-text'][.='Workflow']"));
        workflow.click();
        Thread.sleep(1500);

        WebElement workflowDir = driver.findElement(By.xpath("//span[@class='menu-popup-item-text'][.='Workflows Directory']"));
        workflowDir.click();

        Thread.sleep(1500);


    }
}
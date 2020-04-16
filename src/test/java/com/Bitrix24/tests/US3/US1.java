package com.Bitrix24.tests.US3;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Alona

public class US1 extends TestBase {
    //As a user, I should be able to send messages by clicking on Message tab under Active Stream.
//1. User should be able to click on upload files icon to upload files
// and pictures from local disks,
// download from external drive, select documents from bixtrix24,
// and create files to upload.
@Test
public void AC1SendMessage() {
    loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"),
            ConfigurationReader.getProperty("passwordHelpdesk9"));
    dashboardPage.message.click();

    wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.send));


   dashboardPage.send.click();

    Assert.assertTrue(dashboardPage.uploadFileAndImage.isEnabled());
    Assert.assertTrue(dashboardPage.uploadFileAndImage.isDisplayed());

}
    @Test
    public void AC1uploadFiles()  {

        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"),
                ConfigurationReader.getProperty("passwordHelpdesk9"));
        dashboardPage.message.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.uploadButton)).click();
        dashboardPage.uploadFileAndImage.click();

        Assert.assertTrue(dashboardPage.uploadFileAndImage.isEnabled());
        Assert.assertTrue(dashboardPage.uploadFileAndImage.isDisplayed());


    }
    @Test
    public void AC1selectImages(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String JavaScript="arguments[0].click();";
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"),
                ConfigurationReader.getProperty("passwordHelpdesk9"));
        dashboardPage.message.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.uploadButton)).click();
        dashboardPage.selectDocumentFromBitrix.click();
        Assert.assertTrue(dashboardPage.selectDocumentFromBitrix.isEnabled());
        Assert.assertTrue(dashboardPage.selectDocumentFromBitrix.isDisplayed());
        Assert.assertTrue(dashboardPage.popUpWindow.isDisplayed());
        js.executeScript(JavaScript,dashboardPage.fileToAttach);
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.selectSend));
        js.executeScript(JavaScript,dashboardPage.selectSend);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title='Click to insert file']")));
        Assert.assertTrue(dashboardPage.confirmFile.isDisplayed());

    }

    @Test
    public void AC1DownloadExternalDrive(){
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"),
                ConfigurationReader.getProperty("passwordHelpdesk9"));
        dashboardPage.message.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.uploadButton)).click();
        dashboardPage.downloadFromExternal.click();
        Assert.assertTrue(dashboardPage.downloadFromExternal.isEnabled());
        Assert.assertTrue(dashboardPage.downloadFromExternal.isDisplayed());
        Assert.assertTrue(dashboardPage.popUpWindow.isDisplayed());


    }
    @Test
    public void AC1createUsingDesktop(){
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"),
                ConfigurationReader.getProperty("passwordHelpdesk9"));
        dashboardPage.message.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.uploadButton)).click();
        dashboardPage.createUsingDesktop.click();
        Assert.assertTrue(dashboardPage.createUsingDesktop.isEnabled());
        Assert.assertTrue(dashboardPage.createUsingDesktop.isDisplayed());
        List<WebElement> desktop=driver.findElements(By.xpath("//span[@class='menu-popup-item-text']"));
        List<String>expected=new ArrayList<>(Arrays.asList("Desktop applications","Google Docs","Office 365","MS Office Online"));
        Assert.assertTrue(BrowserUtils.getElementsText(desktop).containsAll(expected));

    }
}

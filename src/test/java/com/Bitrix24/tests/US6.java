package com.Bitrix24.tests;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.pages.AppreciationPage;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US6 extends TestBase {

    /*
    Author: Daria
     */
    AppreciationPage appreciationPage;

    @BeforeMethod
    public void setUp(){
        appreciationPage = new AppreciationPage();
        loginPage.login(ConfigurationReader.getProperty("usernameMarketing9"), ConfigurationReader.getProperty("passwordMarketing9"));
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement moreDropdown = driver.findElement(By.id("feed-add-post-form-link-more"));
        moreDropdown.click();
        //With given xpath we will be able to write method in the future to switch to
        //others headers of "More" module dropdown just by changing text it contains
        WebElement appreciation = driver.findElement(By.xpath("//span[.='Appreciation'][@class='menu-popup-item-text']"));
        appreciation.click();

    }

    /*
    AC1: User should be able to click on upload files icon to upload files and pictures from local disks,
         download from external drive, select documents from bixtrix24, and create files to upload.

    TestCase:
       1. login into bixtrix24
       2. click "MORE" button
       3. click "Appreciation"
       4. click on upload files icon

     */

    @Test
    public void testAC1(){
          appreciationPage.uploadFilesIcon.click();
    }

    /*
    AC2: User should be able to add users and recipients from selecting contact from E-mail users,
         Employees and departments and Recent contact lists.

         TestCase:
       1. login into bixtrix24
       2. click "MORE" button
       3. click "Appreciation"
       4. click on "Add more" option in "To:" tab window
       5. Click on "E-mail users" button
       6. Choose E-mail user from given options and click
       7. Click on "Employees and departments" button
       8. Choose one user and click
       9. Click on "Recent" button
       10. Choose one user and click

     */

    @Test
    public void testAC2(){
        appreciationPage.addMore.click();
        appreciationPage.emailUsers.click();
        appreciationPage.userFromEmailUsers.click();
        appreciationPage.employeesAndDepartments.click();
        appreciationPage.userFromEmployeesAndDepartments.click();
        appreciationPage.recent.click();
        appreciationPage.userFromRecent.click();

    }
}

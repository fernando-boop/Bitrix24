package com.Bitrix24.tests.US3;
//  AUTHOR: A_I_K_A

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class US9_AC1 extends TestBase {

    @Test
    public void ac1() throws InterruptedException {

        // In this line, I have logged as helpdesk user
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9")
                , ConfigurationReader.getProperty("passwordHelpdesk9"));

        // waiting that the page has successfully loaded, and title contains "Portal"
        wait.until(ExpectedConditions.titleContains("Portal"));

        // Click Filter and Search -> Work -> Verified the page by tag "Work"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(aika.work));
        aika.work.click();
        assertEquals(aika.workVerify.getText(), "Work");
        wait.until(ExpectedConditions.elementToBeClickable(aika.x));
        aika.x.click();

        // Click Filter and Search -> Favorites -> Verified the page by tag "Favorites"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(aika.favorites));
        aika.favorites.click();
        assertEquals(aika.favoritesVerify.getText(), "Favorites");
        aika.x.click();

        // Click Filter and Search -> My Activities -> Verified the page by tag "My Activity"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(aika.myActivities));
        aika.myActivities.click();
        assertEquals(aika.myActivityVerify.getText(), "My Activity");
        aika.x.click();

        // Click Filter and Search -> Announcements -> Verified the page by tag "Announcements"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(aika.announcements));
        aika.announcements.click();
        assertEquals(aika.announcementsVerify.getText(), "Announcements");
        aika.x.click();

        // Click Filter and Search -> WorkFlow -> Verified the page by tag "Workflows"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(aika.workFlow));
        aika.workFlow.click();
        assertEquals(aika.workFlowsVerify.getText(), "Workflows");
        aika.x.click();

    }

    @Test
    public void ac2() throws InterruptedException {
        /*
        // In this line, I have logged as helpdesk user
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9")
                , ConfigurationReader.getProperty("passwordHelpdesk9"));

        // waiting that the page has successfully loaded, and title contains "Portal"
        wait.until(ExpectedConditions.titleContains("Portal"));

        // Click Filter and Search -> Work -> Verified the page by tag "Work"
        wait.until(ExpectedConditions.elementToBeClickable(aika.filterAndSearch));
        aika.filterAndSearch.click();

        wait.until(ExpectedConditions.elementToBeClickable(aika.dropdown));
        aika.dropdown.click();
        */


//        actions.moveToElement(aika.dropdown).click().pause(3000).moveToElement(aika.currentDay).pause(2000).click().build().perform();
//
//        actions.moveToElement(aika.dropdown).build().perform();
//        Thread.sleep(3000);
//         select.selectByVisibleText("Current day");
    }
}

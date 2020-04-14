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
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.filterAndSearch));
        filterAndSearch.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.work));
        filterAndSearch.work.click();
        assertEquals(filterAndSearch.workVerify.getText(), "Work");
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.x));
        filterAndSearch.x.click();

        // Click Filter and Search -> Favorites -> Verified the page by tag "Favorites"
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.filterAndSearch));
        filterAndSearch.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.favorites));
        filterAndSearch.favorites.click();
        assertEquals(filterAndSearch.favoritesVerify.getText(), "Favorites");
        filterAndSearch.x.click();

        // Click Filter and Search -> My Activities -> Verified the page by tag "My Activity"
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.filterAndSearch));
        filterAndSearch.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.myActivities));
        filterAndSearch.myActivities.click();
        assertEquals(filterAndSearch.myActivityVerify.getText(), "My Activity");
        filterAndSearch.x.click();

        // Click Filter and Search -> Announcements -> Verified the page by tag "Announcements"
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.filterAndSearch));
        filterAndSearch.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.announcements));
        filterAndSearch.announcements.click();
        assertEquals(filterAndSearch.announcementsVerify.getText(), "Announcements");
        filterAndSearch.x.click();

        // Click Filter and Search -> WorkFlow -> Verified the page by tag "Workflows"
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.filterAndSearch));
        filterAndSearch.filterAndSearch.click();
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch.workFlow));
        filterAndSearch.workFlow.click();
        assertEquals(filterAndSearch.workFlowsVerify.getText(), "Workflows");
        filterAndSearch.x.click();

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

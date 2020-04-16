package com.Bitrix24.pages;
//  AUTHOR: A_I_K_A

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearch {

    public FilterAndSearch() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Don't judge me, I was scared to make any changes to ActivityStream class :)
    /*
      In this class, I am locating WebElements for all my Acceptance Criteria's under my:
      "USER STORY #9.
         AC #1 "As a user, I should be able to use "Filter and search" functionality on Active Stream."

              1. User should be able to search by clicking on default filters. (work, favorites, my activity, announcements, and workflow's)
              2. User should be able to search by selecting Date, Type, Author, To and more default dropdown's.
              3. User should be able to type-in keyword to search previous posts.
              4. User should be able to use Save Filter functionality on search bar.
     */


    // Here I am locating WebElements for Acceptance Criteria #1

    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement filterAndSearch;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[1]")
    public WebElement work;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][.='Favorites']")
    public WebElement favorites;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][contains(text(), 'My')]")
    public WebElement myActivities;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'] [.='Announcements']")
    public WebElement announcements;

    ////*[@id="popup-window-content-LIVEFEED_search_container"]/div/div/div[1]/div[2]/div[5]/span[2]/span[1]
    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text']) [5]")
    public WebElement workFlow;

    @FindBy(xpath = "(//div[@class='main-ui-item-icon main-ui-square-delete'])[1]")
    public WebElement x;


    // here I have located elements for "VERIFYING"

    @FindBy(xpath = "//div[@class='main-ui-square-item'] [.='Work']")
    public WebElement workVerify;

    @FindBy(xpath = "//div[@class='main-ui-square-item'] [.='Favorites']")
    public WebElement favoritesVerify;

    @FindBy(xpath = "//div[@id='LIVEFEED_search_container']/div/div[.='My Activity']")
    public WebElement myActivityVerify;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'][.='Announcements'])[1]")
    public WebElement announcementsVerify;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'][contains(text(),'Workflows')]) [1]")
    public WebElement workFlowsVerify;

    /**
     *       AC #2 " User should be able to search by selecting Date, Type, Author, To and more default dropdowns."
     */
//(//span[@class='main-ui-square-search'])[1]/input
    @FindBy (xpath = "(//span[@class='main-ui-square-search'])[1]/input")
    public WebElement dropdown;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']/span[.='Current day']")
    public WebElement currentDay;


}

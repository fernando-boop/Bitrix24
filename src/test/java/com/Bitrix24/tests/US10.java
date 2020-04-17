package com.Bitrix24.tests;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

/*
   Author: Imad
                */
/**
 * -------------------------
 * TEST BASE HAVE AN ERROR
 * -------------------------
 */

 // - 10. As a user, I should be able to interact with employees on the posts that I have access to.

public class US10 extends TestBase {
    @BeforeMethod
    public void login(){

        loginPage.login(ConfigurationReader.getProperty("usernameHr9"), ConfigurationReader.getProperty("passwordHr9"));

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
    @Test
    public void visibility() {
        // Go see if  Popular Posts is there
        WebElement popularPosts = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[4]/div/div"));
        System.out.println("Popular Posts is Displayed = " + popularPosts.isDisplayed());
        // check if all the posts are there under  Popular Posts
        List<WebElement> posts = driver.findElements(By.xpath("//a[contains(@class,'sidebar-widget-item')]"));
        System.out.println("I can see all the following posts which I have access to :");
        for (int i = 0; i < posts.size(); i++) {

            System.out.println("Post "+(i+1)+"\n"+posts.get(i).getText());
            System.out.println("---------------------------------------");

        }
    }
     @Test
     public void enabled () {
         List<WebElement> posts = driver.findElements(By.xpath("//a[contains(@class,'sidebar-widget-item')]"));
         for (int i = 0; i < posts.size(); i++) {
             // checking if posts are enabled
             System.out.println("Post "+(i+1)+" is enabled = "+posts.get(i).isEnabled());

         }
     }
     @Test
    public void accessibility() throws InterruptedException {
        // Did not start yet on it
         // Should visit each page and check as a user i can interact with employees
         List<WebElement> posts = driver.findElements(By.xpath("//a[contains(@class,'sidebar-widget-item')]"));






         }
     }





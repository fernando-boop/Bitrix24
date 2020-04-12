package com.Bitrix24.tests.US3;

import com.Bitrix24.base.TestBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class RenameMe extends TestBase {
    @Test
    public void test(){
        loginPage.login(ConfigurationReader.getProperty("usernameHelpdesk9"), ConfigurationReader.getProperty("passwordHelpdesk9"));






    }
}

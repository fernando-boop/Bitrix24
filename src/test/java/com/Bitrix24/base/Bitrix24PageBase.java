package com.Bitrix24.base;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Bitrix24PageBase {
    public Bitrix24PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

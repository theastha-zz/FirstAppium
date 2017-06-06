package com.utilities;

import io.appium.java_client.MobileElement;

/**
 * Created by astha on 06/06/17.
 */
public class Common {

    public void clearandentertext(MobileElement element, String text){

        element.clear();
        element.sendKeys(text);
    }

    public void clickonloginbutton()
}

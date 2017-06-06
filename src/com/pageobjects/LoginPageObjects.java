package com.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by astha on 06/06/17.
 */
public class LoginPageObjects {

    @AndroidFindBy(accessibility = "username")
    public MobileElement useraname;

    @AndroidFindBy(accessibility = "password")
    public MobileElement password;

    
}
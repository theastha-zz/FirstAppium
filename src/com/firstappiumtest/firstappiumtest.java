package com.firstappiumtest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by astha on 02/06/17.
 */

public class firstappiumtest {

    //Create an instance for Appium Driver
    AppiumDriver<WebElement> appiumDriver;

    @BeforeClass

    public void Setup() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAUTOMATOR2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_5X_API_24");
        cap.setCapability(MobileCapabilityType.APP,"/Users/astha/Documents/workspace/VodQaAdvancedAppium/VodQA.apk");
        appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    @Test
    public void SimpleTest() throws InterruptedException {
        String displaytext = null;
        WebElement username = appiumDriver.findElementByAccessibilityId("username");
        username.clear();
        username.sendKeys("admin");
        appiumDriver.hideKeyboard();

        WebElement password = appiumDriver.findElementByAccessibilityId("password");
        password.sendKeys("admin");
        WebElement loginbutton = appiumDriver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[4]//*[1]//*[1]\n"));
        loginbutton.click();
        WebDriverWait webDriverWait = new WebDriverWait(appiumDriver,200);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("chainedView"))).click();

    }

}
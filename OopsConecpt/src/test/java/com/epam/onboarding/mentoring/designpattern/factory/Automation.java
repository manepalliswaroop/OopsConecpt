package com.epam.onboarding.mentoring.designpattern.factory;

import com.epam.onboarding.mentoring.designpattern.Factory.DriverManager;
import com.epam.onboarding.mentoring.designpattern.Factory.DriverManagerFactory;
import com.epam.onboarding.mentoring.designpattern.Factory.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("https://mvnrepository.com/");
        Assert.assertEquals(driver.getTitle(),"Maven Repository: Search/Browse/Explore");
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test
    public void launchYahooTest() {
        driver.get("https://www.yahoo.com");
        Assert.assertEquals(driver.getTitle(),"Yahoo");
    }
}

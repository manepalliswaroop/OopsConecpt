package com.epam.onboarding.mentoring.designpattern.Factory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

public class FirefoxDriverManager extends  DriverManager{

    private GeckoDriverService ffService;

    @Override
    public void startService() {
        if (null == ffService) {
            try {
                ffService = new GeckoDriverService.Builder()
                        .usingDriverExecutable(new File("chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                ffService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != ffService && ffService.isRunning())
            ffService.stop();
    }

    @Override
    public void createDriver() {
        driver = new FirefoxDriver();
    }
}
